package emu.grasscutter.server.packet.recv;

import emu.grasscutter.game.quest.enums.QuestTrigger;
import emu.grasscutter.net.packet.Opcodes;
import emu.grasscutter.net.packet.PacketHandler;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.EvtDoSkillSuccNotifyOuterClass.EvtDoSkillSuccNotify;
import emu.grasscutter.server.game.GameSession;
import emu.grasscutter.utils.GrassLogger;

@Opcodes(PacketOpcodes.EvtDoSkillSuccNotify)
public class HandlerEvtDoSkillSuccNotify extends PacketHandler {

    @Override
    public void handle(GameSession session, byte[] header, byte[] payload) throws Exception {
        EvtDoSkillSuccNotify notify = EvtDoSkillSuccNotify.parseFrom(payload);

        var player = session.getPlayer();
        int skillId = notify.getSkillId();
        int casterId = notify.getCasterId();

        GrassLogger.logSkillCast(skillId, casterId);

        // Call skill perform in the player's ability manager.
        player.getAbilityManager().onSkillStart(session.getPlayer(), skillId, casterId);

        // Handle skill notify in other managers.
        player.getStaminaManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
        player.getEnergyManager().handleEvtDoSkillSuccNotify(session, skillId, casterId);
        player.getQuestManager().triggerEvent(QuestTrigger.QUEST_CONTENT_SKILL, skillId, 0);
    }
}
