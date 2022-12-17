// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: VehicleInteractRsp.proto

package emu.grasscutter.net.proto;

public final class VehicleInteractRspOuterClass {
  private VehicleInteractRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface VehicleInteractRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:VehicleInteractRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    int getEntityId();

    /**
     * <code>.VehicleMember member = 11;</code>
     * @return Whether the member field is set.
     */
    boolean hasMember();
    /**
     * <code>.VehicleMember member = 11;</code>
     * @return The member.
     */
    emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMember();
    /**
     * <code>.VehicleMember member = 11;</code>
     */
    emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder();

    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.VehicleInteractType interact_type = 7;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    int getInteractTypeValue();
    /**
     * <code>.VehicleInteractType interact_type = 7;</code>
     * @return The interactType.
     */
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType();
  }
  /**
   * <pre>
   * enum CmdId {
   *   option allow_alias = true;
   *   NONE = 0;
   *   CMD_ID = 844;
   *   ENET_CHANNEL_ID = 0;
   *   ENET_IS_RELIABLE = 1;
   * }
   * </pre>
   *
   * Protobuf type {@code VehicleInteractRsp}
   */
  public static final class VehicleInteractRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:VehicleInteractRsp)
      VehicleInteractRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use VehicleInteractRsp.newBuilder() to construct.
    private VehicleInteractRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private VehicleInteractRsp() {
      interactType_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new VehicleInteractRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private VehicleInteractRsp(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 32: {

              entityId_ = input.readUInt32();
              break;
            }
            case 48: {

              retcode_ = input.readInt32();
              break;
            }
            case 56: {
              int rawValue = input.readEnum();

              interactType_ = rawValue;
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder subBuilder = null;
              if (member_ != null) {
                subBuilder = member_.toBuilder();
              }
              member_ = input.readMessage(emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom(member_);
                member_ = subBuilder.buildPartial();
              }

              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.class, emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.Builder.class);
    }

    public static final int ENTITY_ID_FIELD_NUMBER = 4;
    private int entityId_;
    /**
     * <code>uint32 entity_id = 4;</code>
     * @return The entityId.
     */
    @java.lang.Override
    public int getEntityId() {
      return entityId_;
    }

    public static final int MEMBER_FIELD_NUMBER = 11;
    private emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember member_;
    /**
     * <code>.VehicleMember member = 11;</code>
     * @return Whether the member field is set.
     */
    @java.lang.Override
    public boolean hasMember() {
      return member_ != null;
    }
    /**
     * <code>.VehicleMember member = 11;</code>
     * @return The member.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMember() {
      return member_ == null ? emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : member_;
    }
    /**
     * <code>.VehicleMember member = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder() {
      return getMember();
    }

    public static final int RETCODE_FIELD_NUMBER = 6;
    private int retcode_;
    /**
     * <code>int32 retcode = 6;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int INTERACT_TYPE_FIELD_NUMBER = 7;
    private int interactType_;
    /**
     * <code>.VehicleInteractType interact_type = 7;</code>
     * @return The enum numeric value on the wire for interactType.
     */
    @java.lang.Override public int getInteractTypeValue() {
      return interactType_;
    }
    /**
     * <code>.VehicleInteractType interact_type = 7;</code>
     * @return The interactType.
     */
    @java.lang.Override public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(interactType_);
      return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (entityId_ != 0) {
        output.writeUInt32(4, entityId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(6, retcode_);
      }
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        output.writeEnum(7, interactType_);
      }
      if (member_ != null) {
        output.writeMessage(11, getMember());
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (entityId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(4, entityId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(6, retcode_);
      }
      if (interactType_ != emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.VEHICLE_INTERACT_TYPE_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, interactType_);
      }
      if (member_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, getMember());
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp other = (emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp) obj;

      if (getEntityId()
          != other.getEntityId()) return false;
      if (hasMember() != other.hasMember()) return false;
      if (hasMember()) {
        if (!getMember()
            .equals(other.getMember())) return false;
      }
      if (getRetcode()
          != other.getRetcode()) return false;
      if (interactType_ != other.interactType_) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + ENTITY_ID_FIELD_NUMBER;
      hash = (53 * hash) + getEntityId();
      if (hasMember()) {
        hash = (37 * hash) + MEMBER_FIELD_NUMBER;
        hash = (53 * hash) + getMember().hashCode();
      }
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + INTERACT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + interactType_;
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * enum CmdId {
     *   option allow_alias = true;
     *   NONE = 0;
     *   CMD_ID = 844;
     *   ENET_CHANNEL_ID = 0;
     *   ENET_IS_RELIABLE = 1;
     * }
     * </pre>
     *
     * Protobuf type {@code VehicleInteractRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:VehicleInteractRsp)
        emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.class, emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        entityId_ = 0;

        if (memberBuilder_ == null) {
          member_ = null;
        } else {
          member_ = null;
          memberBuilder_ = null;
        }
        retcode_ = 0;

        interactType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.internal_static_VehicleInteractRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp build() {
        emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp buildPartial() {
        emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp result = new emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp(this);
        result.entityId_ = entityId_;
        if (memberBuilder_ == null) {
          result.member_ = member_;
        } else {
          result.member_ = memberBuilder_.build();
        }
        result.retcode_ = retcode_;
        result.interactType_ = interactType_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp) {
          return mergeFrom((emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp other) {
        if (other == emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp.getDefaultInstance()) return this;
        if (other.getEntityId() != 0) {
          setEntityId(other.getEntityId());
        }
        if (other.hasMember()) {
          mergeMember(other.getMember());
        }
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.interactType_ != 0) {
          setInteractTypeValue(other.getInteractTypeValue());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int entityId_ ;
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return The entityId.
       */
      @java.lang.Override
      public int getEntityId() {
        return entityId_;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @param value The entityId to set.
       * @return This builder for chaining.
       */
      public Builder setEntityId(int value) {
        
        entityId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 entity_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearEntityId() {
        
        entityId_ = 0;
        onChanged();
        return this;
      }

      private emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember member_;
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> memberBuilder_;
      /**
       * <code>.VehicleMember member = 11;</code>
       * @return Whether the member field is set.
       */
      public boolean hasMember() {
        return memberBuilder_ != null || member_ != null;
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       * @return The member.
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember getMember() {
        if (memberBuilder_ == null) {
          return member_ == null ? emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : member_;
        } else {
          return memberBuilder_.getMessage();
        }
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public Builder setMember(emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember value) {
        if (memberBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          member_ = value;
          onChanged();
        } else {
          memberBuilder_.setMessage(value);
        }

        return this;
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public Builder setMember(
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder builderForValue) {
        if (memberBuilder_ == null) {
          member_ = builderForValue.build();
          onChanged();
        } else {
          memberBuilder_.setMessage(builderForValue.build());
        }

        return this;
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public Builder mergeMember(emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember value) {
        if (memberBuilder_ == null) {
          if (member_ != null) {
            member_ =
              emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.newBuilder(member_).mergeFrom(value).buildPartial();
          } else {
            member_ = value;
          }
          onChanged();
        } else {
          memberBuilder_.mergeFrom(value);
        }

        return this;
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public Builder clearMember() {
        if (memberBuilder_ == null) {
          member_ = null;
          onChanged();
        } else {
          member_ = null;
          memberBuilder_ = null;
        }

        return this;
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder getMemberBuilder() {
        
        onChanged();
        return getMemberFieldBuilder().getBuilder();
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      public emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder getMemberOrBuilder() {
        if (memberBuilder_ != null) {
          return memberBuilder_.getMessageOrBuilder();
        } else {
          return member_ == null ?
              emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.getDefaultInstance() : member_;
        }
      }
      /**
       * <code>.VehicleMember member = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder> 
          getMemberFieldBuilder() {
        if (memberBuilder_ == null) {
          memberBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMember.Builder, emu.grasscutter.net.proto.VehicleMemberOuterClass.VehicleMemberOrBuilder>(
                  getMember(),
                  getParentForChildren(),
                  isClean());
          member_ = null;
        }
        return memberBuilder_;
      }

      private int retcode_ ;
      /**
       * <code>int32 retcode = 6;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int interactType_ = 0;
      /**
       * <code>.VehicleInteractType interact_type = 7;</code>
       * @return The enum numeric value on the wire for interactType.
       */
      @java.lang.Override public int getInteractTypeValue() {
        return interactType_;
      }
      /**
       * <code>.VehicleInteractType interact_type = 7;</code>
       * @param value The enum numeric value on the wire for interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractTypeValue(int value) {
        
        interactType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interact_type = 7;</code>
       * @return The interactType.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType getInteractType() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType result = emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.valueOf(interactType_);
        return result == null ? emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType.UNRECOGNIZED : result;
      }
      /**
       * <code>.VehicleInteractType interact_type = 7;</code>
       * @param value The interactType to set.
       * @return This builder for chaining.
       */
      public Builder setInteractType(emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.VehicleInteractType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        interactType_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.VehicleInteractType interact_type = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearInteractType() {
        
        interactType_ = 0;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:VehicleInteractRsp)
    }

    // @@protoc_insertion_point(class_scope:VehicleInteractRsp)
    private static final emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp();
    }

    public static emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<VehicleInteractRsp>
        PARSER = new com.google.protobuf.AbstractParser<VehicleInteractRsp>() {
      @java.lang.Override
      public VehicleInteractRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new VehicleInteractRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<VehicleInteractRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<VehicleInteractRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.VehicleInteractRspOuterClass.VehicleInteractRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_VehicleInteractRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_VehicleInteractRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\030VehicleInteractRsp.proto\032\031VehicleInter" +
      "actType.proto\032\023VehicleMember.proto\"\205\001\n\022V" +
      "ehicleInteractRsp\022\021\n\tentity_id\030\004 \001(\r\022\036\n\006" +
      "member\030\013 \001(\0132\016.VehicleMember\022\017\n\007retcode\030" +
      "\006 \001(\005\022+\n\rinteract_type\030\007 \001(\0162\024.VehicleIn" +
      "teractTypeB\033\n\031emu.grasscutter.net.protob" +
      "\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.VehicleMemberOuterClass.getDescriptor(),
        });
    internal_static_VehicleInteractRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_VehicleInteractRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_VehicleInteractRsp_descriptor,
        new java.lang.String[] { "EntityId", "Member", "Retcode", "InteractType", });
    emu.grasscutter.net.proto.VehicleInteractTypeOuterClass.getDescriptor();
    emu.grasscutter.net.proto.VehicleMemberOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
