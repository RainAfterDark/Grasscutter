// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MusicGameSearchBeatmapRsp.proto

package emu.grasscutter.net.proto;

public final class MusicGameSearchBeatmapRspOuterClass {
  private MusicGameSearchBeatmapRspOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface MusicGameSearchBeatmapRspOrBuilder extends
      // @@protoc_insertion_point(interface_extends:MusicGameSearchBeatmapRsp)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    int getRetcode();

    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
     * @return The enum numeric value on the wire for unknownEnum1.
     */
    int getUnknownEnum1Value();
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
     * @return The unknownEnum1.
     */
    emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1();

    /**
     * <code>uint64 music_share_id = 4;</code>
     * @return The musicShareId.
     */
    long getMusicShareId();

    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    boolean hasMusicBriefInfo();
    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     * @return The musicBriefInfo.
     */
    emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo();
    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     */
    emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder();

    public emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.ELBEIFGDBMMCase getELBEIFGDBMMCase();
  }
  /**
   * Protobuf type {@code MusicGameSearchBeatmapRsp}
   */
  public static final class MusicGameSearchBeatmapRsp extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:MusicGameSearchBeatmapRsp)
      MusicGameSearchBeatmapRspOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use MusicGameSearchBeatmapRsp.newBuilder() to construct.
    private MusicGameSearchBeatmapRsp(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private MusicGameSearchBeatmapRsp() {
      unknownEnum1_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new MusicGameSearchBeatmapRsp();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private MusicGameSearchBeatmapRsp(
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
            case 24: {
              int rawValue = input.readEnum();

              unknownEnum1_ = rawValue;
              break;
            }
            case 32: {

              musicShareId_ = input.readUInt64();
              break;
            }
            case 72: {

              retcode_ = input.readInt32();
              break;
            }
            case 90: {
              emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder subBuilder = null;
              if (eLBEIFGDBMMCase_ == 11) {
                subBuilder = ((emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_).toBuilder();
              }
              eLBEIFGDBMM_ =
                  input.readMessage(emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.parser(), extensionRegistry);
              if (subBuilder != null) {
                subBuilder.mergeFrom((emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_);
                eLBEIFGDBMM_ = subBuilder.buildPartial();
              }
              eLBEIFGDBMMCase_ = 11;
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
      return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.class, emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.Builder.class);
    }

    private int eLBEIFGDBMMCase_ = 0;
    private java.lang.Object eLBEIFGDBMM_;
    public enum ELBEIFGDBMMCase
        implements com.google.protobuf.Internal.EnumLite,
            com.google.protobuf.AbstractMessage.InternalOneOfEnum {
      MUSIC_BRIEF_INFO(11),
      ELBEIFGDBMM_NOT_SET(0);
      private final int value;
      private ELBEIFGDBMMCase(int value) {
        this.value = value;
      }
      /**
       * @param value The number of the enum to look for.
       * @return The enum associated with the given number.
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static ELBEIFGDBMMCase valueOf(int value) {
        return forNumber(value);
      }

      public static ELBEIFGDBMMCase forNumber(int value) {
        switch (value) {
          case 11: return MUSIC_BRIEF_INFO;
          case 0: return ELBEIFGDBMM_NOT_SET;
          default: return null;
        }
      }
      public int getNumber() {
        return this.value;
      }
    };

    public ELBEIFGDBMMCase
    getELBEIFGDBMMCase() {
      return ELBEIFGDBMMCase.forNumber(
          eLBEIFGDBMMCase_);
    }

    public static final int RETCODE_FIELD_NUMBER = 9;
    private int retcode_;
    /**
     * <code>int32 retcode = 9;</code>
     * @return The retcode.
     */
    @java.lang.Override
    public int getRetcode() {
      return retcode_;
    }

    public static final int UNKNOWN_ENUM1_FIELD_NUMBER = 3;
    private int unknownEnum1_;
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
     * @return The enum numeric value on the wire for unknownEnum1.
     */
    @java.lang.Override public int getUnknownEnum1Value() {
      return unknownEnum1_;
    }
    /**
     * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
     * @return The unknownEnum1.
     */
    @java.lang.Override public emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
      @SuppressWarnings("deprecation")
      emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(unknownEnum1_);
      return result == null ? emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
    }

    public static final int MUSIC_SHARE_ID_FIELD_NUMBER = 4;
    private long musicShareId_;
    /**
     * <code>uint64 music_share_id = 4;</code>
     * @return The musicShareId.
     */
    @java.lang.Override
    public long getMusicShareId() {
      return musicShareId_;
    }

    public static final int MUSIC_BRIEF_INFO_FIELD_NUMBER = 11;
    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     * @return Whether the musicBriefInfo field is set.
     */
    @java.lang.Override
    public boolean hasMusicBriefInfo() {
      return eLBEIFGDBMMCase_ == 11;
    }
    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     * @return The musicBriefInfo.
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
      if (eLBEIFGDBMMCase_ == 11) {
         return (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_;
      }
      return emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
    }
    /**
     * <code>.MusicBriefInfo music_brief_info = 11;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
      if (eLBEIFGDBMMCase_ == 11) {
         return (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_;
      }
      return emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
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
      if (unknownEnum1_ != emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
        output.writeEnum(3, unknownEnum1_);
      }
      if (musicShareId_ != 0L) {
        output.writeUInt64(4, musicShareId_);
      }
      if (retcode_ != 0) {
        output.writeInt32(9, retcode_);
      }
      if (eLBEIFGDBMMCase_ == 11) {
        output.writeMessage(11, (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unknownEnum1_ != emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.MusicGameUnknown1Enum_NONE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, unknownEnum1_);
      }
      if (musicShareId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, musicShareId_);
      }
      if (retcode_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(9, retcode_);
      }
      if (eLBEIFGDBMMCase_ == 11) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(11, (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp other = (emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp) obj;

      if (getRetcode()
          != other.getRetcode()) return false;
      if (unknownEnum1_ != other.unknownEnum1_) return false;
      if (getMusicShareId()
          != other.getMusicShareId()) return false;
      if (!getELBEIFGDBMMCase().equals(other.getELBEIFGDBMMCase())) return false;
      switch (eLBEIFGDBMMCase_) {
        case 11:
          if (!getMusicBriefInfo()
              .equals(other.getMusicBriefInfo())) return false;
          break;
        case 0:
        default:
      }
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
      hash = (37 * hash) + RETCODE_FIELD_NUMBER;
      hash = (53 * hash) + getRetcode();
      hash = (37 * hash) + UNKNOWN_ENUM1_FIELD_NUMBER;
      hash = (53 * hash) + unknownEnum1_;
      hash = (37 * hash) + MUSIC_SHARE_ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getMusicShareId());
      switch (eLBEIFGDBMMCase_) {
        case 11:
          hash = (37 * hash) + MUSIC_BRIEF_INFO_FIELD_NUMBER;
          hash = (53 * hash) + getMusicBriefInfo().hashCode();
          break;
        case 0:
        default:
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp prototype) {
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
     * Protobuf type {@code MusicGameSearchBeatmapRsp}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:MusicGameSearchBeatmapRsp)
        emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRspOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.class, emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.newBuilder()
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
        retcode_ = 0;

        unknownEnum1_ = 0;

        musicShareId_ = 0L;

        eLBEIFGDBMMCase_ = 0;
        eLBEIFGDBMM_ = null;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.internal_static_MusicGameSearchBeatmapRsp_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp build() {
        emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp buildPartial() {
        emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp result = new emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp(this);
        result.retcode_ = retcode_;
        result.unknownEnum1_ = unknownEnum1_;
        result.musicShareId_ = musicShareId_;
        if (eLBEIFGDBMMCase_ == 11) {
          if (musicBriefInfoBuilder_ == null) {
            result.eLBEIFGDBMM_ = eLBEIFGDBMM_;
          } else {
            result.eLBEIFGDBMM_ = musicBriefInfoBuilder_.build();
          }
        }
        result.eLBEIFGDBMMCase_ = eLBEIFGDBMMCase_;
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
        if (other instanceof emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp) {
          return mergeFrom((emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp other) {
        if (other == emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp.getDefaultInstance()) return this;
        if (other.getRetcode() != 0) {
          setRetcode(other.getRetcode());
        }
        if (other.unknownEnum1_ != 0) {
          setUnknownEnum1Value(other.getUnknownEnum1Value());
        }
        if (other.getMusicShareId() != 0L) {
          setMusicShareId(other.getMusicShareId());
        }
        switch (other.getELBEIFGDBMMCase()) {
          case MUSIC_BRIEF_INFO: {
            mergeMusicBriefInfo(other.getMusicBriefInfo());
            break;
          }
          case ELBEIFGDBMM_NOT_SET: {
            break;
          }
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
        emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int eLBEIFGDBMMCase_ = 0;
      private java.lang.Object eLBEIFGDBMM_;
      public ELBEIFGDBMMCase
          getELBEIFGDBMMCase() {
        return ELBEIFGDBMMCase.forNumber(
            eLBEIFGDBMMCase_);
      }

      public Builder clearELBEIFGDBMM() {
        eLBEIFGDBMMCase_ = 0;
        eLBEIFGDBMM_ = null;
        onChanged();
        return this;
      }


      private int retcode_ ;
      /**
       * <code>int32 retcode = 9;</code>
       * @return The retcode.
       */
      @java.lang.Override
      public int getRetcode() {
        return retcode_;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @param value The retcode to set.
       * @return This builder for chaining.
       */
      public Builder setRetcode(int value) {
        
        retcode_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>int32 retcode = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearRetcode() {
        
        retcode_ = 0;
        onChanged();
        return this;
      }

      private int unknownEnum1_ = 0;
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
       * @return The enum numeric value on the wire for unknownEnum1.
       */
      @java.lang.Override public int getUnknownEnum1Value() {
        return unknownEnum1_;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
       * @param value The enum numeric value on the wire for unknownEnum1 to set.
       * @return This builder for chaining.
       */
      public Builder setUnknownEnum1Value(int value) {
        
        unknownEnum1_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
       * @return The unknownEnum1.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum getUnknownEnum1() {
        @SuppressWarnings("deprecation")
        emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum result = emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.valueOf(unknownEnum1_);
        return result == null ? emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum.UNRECOGNIZED : result;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
       * @param value The unknownEnum1 to set.
       * @return This builder for chaining.
       */
      public Builder setUnknownEnum1(emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.MusicGameUnknown1Enum value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unknownEnum1_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.MusicGameUnknown1Enum unknown_enum1 = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnknownEnum1() {
        
        unknownEnum1_ = 0;
        onChanged();
        return this;
      }

      private long musicShareId_ ;
      /**
       * <code>uint64 music_share_id = 4;</code>
       * @return The musicShareId.
       */
      @java.lang.Override
      public long getMusicShareId() {
        return musicShareId_;
      }
      /**
       * <code>uint64 music_share_id = 4;</code>
       * @param value The musicShareId to set.
       * @return This builder for chaining.
       */
      public Builder setMusicShareId(long value) {
        
        musicShareId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 music_share_id = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearMusicShareId() {
        
        musicShareId_ = 0L;
        onChanged();
        return this;
      }

      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> musicBriefInfoBuilder_;
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       * @return Whether the musicBriefInfo field is set.
       */
      @java.lang.Override
      public boolean hasMusicBriefInfo() {
        return eLBEIFGDBMMCase_ == 11;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       * @return The musicBriefInfo.
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo getMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (eLBEIFGDBMMCase_ == 11) {
            return (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_;
          }
          return emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        } else {
          if (eLBEIFGDBMMCase_ == 11) {
            return musicBriefInfoBuilder_.getMessage();
          }
          return emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      public Builder setMusicBriefInfo(emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          eLBEIFGDBMM_ = value;
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(value);
        }
        eLBEIFGDBMMCase_ = 11;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      public Builder setMusicBriefInfo(
          emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder builderForValue) {
        if (musicBriefInfoBuilder_ == null) {
          eLBEIFGDBMM_ = builderForValue.build();
          onChanged();
        } else {
          musicBriefInfoBuilder_.setMessage(builderForValue.build());
        }
        eLBEIFGDBMMCase_ = 11;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      public Builder mergeMusicBriefInfo(emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo value) {
        if (musicBriefInfoBuilder_ == null) {
          if (eLBEIFGDBMMCase_ == 11 &&
              eLBEIFGDBMM_ != emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance()) {
            eLBEIFGDBMM_ = emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.newBuilder((emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_)
                .mergeFrom(value).buildPartial();
          } else {
            eLBEIFGDBMM_ = value;
          }
          onChanged();
        } else {
          if (eLBEIFGDBMMCase_ == 11) {
            musicBriefInfoBuilder_.mergeFrom(value);
          }
          musicBriefInfoBuilder_.setMessage(value);
        }
        eLBEIFGDBMMCase_ = 11;
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      public Builder clearMusicBriefInfo() {
        if (musicBriefInfoBuilder_ == null) {
          if (eLBEIFGDBMMCase_ == 11) {
            eLBEIFGDBMMCase_ = 0;
            eLBEIFGDBMM_ = null;
            onChanged();
          }
        } else {
          if (eLBEIFGDBMMCase_ == 11) {
            eLBEIFGDBMMCase_ = 0;
            eLBEIFGDBMM_ = null;
          }
          musicBriefInfoBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      public emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder getMusicBriefInfoBuilder() {
        return getMusicBriefInfoFieldBuilder().getBuilder();
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      @java.lang.Override
      public emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder getMusicBriefInfoOrBuilder() {
        if ((eLBEIFGDBMMCase_ == 11) && (musicBriefInfoBuilder_ != null)) {
          return musicBriefInfoBuilder_.getMessageOrBuilder();
        } else {
          if (eLBEIFGDBMMCase_ == 11) {
            return (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_;
          }
          return emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
        }
      }
      /**
       * <code>.MusicBriefInfo music_brief_info = 11;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder> 
          getMusicBriefInfoFieldBuilder() {
        if (musicBriefInfoBuilder_ == null) {
          if (!(eLBEIFGDBMMCase_ == 11)) {
            eLBEIFGDBMM_ = emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.getDefaultInstance();
          }
          musicBriefInfoBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo.Builder, emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfoOrBuilder>(
                  (emu.grasscutter.net.proto.MusicBriefInfoOuterClass.MusicBriefInfo) eLBEIFGDBMM_,
                  getParentForChildren(),
                  isClean());
          eLBEIFGDBMM_ = null;
        }
        eLBEIFGDBMMCase_ = 11;
        onChanged();;
        return musicBriefInfoBuilder_;
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


      // @@protoc_insertion_point(builder_scope:MusicGameSearchBeatmapRsp)
    }

    // @@protoc_insertion_point(class_scope:MusicGameSearchBeatmapRsp)
    private static final emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp();
    }

    public static emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<MusicGameSearchBeatmapRsp>
        PARSER = new com.google.protobuf.AbstractParser<MusicGameSearchBeatmapRsp>() {
      @java.lang.Override
      public MusicGameSearchBeatmapRsp parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new MusicGameSearchBeatmapRsp(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<MusicGameSearchBeatmapRsp> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<MusicGameSearchBeatmapRsp> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.MusicGameSearchBeatmapRspOuterClass.MusicGameSearchBeatmapRsp getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_MusicGameSearchBeatmapRsp_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\037MusicGameSearchBeatmapRsp.proto\032\024Music" +
      "BriefInfo.proto\032\033MusicGameUnknown1Enum.p" +
      "roto\"\257\001\n\031MusicGameSearchBeatmapRsp\022\017\n\007re" +
      "tcode\030\t \001(\005\022-\n\runknown_enum1\030\003 \001(\0162\026.Mus" +
      "icGameUnknown1Enum\022\026\n\016music_share_id\030\004 \001" +
      "(\004\022+\n\020music_brief_info\030\013 \001(\0132\017.MusicBrie" +
      "fInfoH\000B\r\n\013ELBEIFGDBMMB\033\n\031emu.grasscutte" +
      "r.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.MusicBriefInfoOuterClass.getDescriptor(),
          emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.getDescriptor(),
        });
    internal_static_MusicGameSearchBeatmapRsp_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_MusicGameSearchBeatmapRsp_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_MusicGameSearchBeatmapRsp_descriptor,
        new java.lang.String[] { "Retcode", "UnknownEnum1", "MusicShareId", "MusicBriefInfo", "ELBEIFGDBMM", });
    emu.grasscutter.net.proto.MusicBriefInfoOuterClass.getDescriptor();
    emu.grasscutter.net.proto.MusicGameUnknown1EnumOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
