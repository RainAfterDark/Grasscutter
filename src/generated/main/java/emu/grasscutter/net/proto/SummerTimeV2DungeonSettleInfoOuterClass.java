// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: SummerTimeV2DungeonSettleInfo.proto

package emu.grasscutter.net.proto;

public final class SummerTimeV2DungeonSettleInfoOuterClass {
  private SummerTimeV2DungeonSettleInfoOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface SummerTimeV2DungeonSettleInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:SummerTimeV2DungeonSettleInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk3300_JHBCHFHAGFO = 10;</code>
     * @return The unk3300JHBCHFHAGFO.
     */
    int getUnk3300JHBCHFHAGFO();

    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    boolean getIsSuccess();

    /**
     * <code>uint32 Unk3300_BNNMNCKEHHO = 11;</code>
     * @return The unk3300BNNMNCKEHHO.
     */
    int getUnk3300BNNMNCKEHHO();
  }
  /**
   * Protobuf type {@code SummerTimeV2DungeonSettleInfo}
   */
  public static final class SummerTimeV2DungeonSettleInfo extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:SummerTimeV2DungeonSettleInfo)
      SummerTimeV2DungeonSettleInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use SummerTimeV2DungeonSettleInfo.newBuilder() to construct.
    private SummerTimeV2DungeonSettleInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private SummerTimeV2DungeonSettleInfo() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new SummerTimeV2DungeonSettleInfo();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private SummerTimeV2DungeonSettleInfo(
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
            case 8: {

              isSuccess_ = input.readBool();
              break;
            }
            case 80: {

              unk3300JHBCHFHAGFO_ = input.readUInt32();
              break;
            }
            case 88: {

              unk3300BNNMNCKEHHO_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.class, emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder.class);
    }

    public static final int UNK3300_JHBCHFHAGFO_FIELD_NUMBER = 10;
    private int unk3300JHBCHFHAGFO_;
    /**
     * <code>uint32 Unk3300_JHBCHFHAGFO = 10;</code>
     * @return The unk3300JHBCHFHAGFO.
     */
    @java.lang.Override
    public int getUnk3300JHBCHFHAGFO() {
      return unk3300JHBCHFHAGFO_;
    }

    public static final int IS_SUCCESS_FIELD_NUMBER = 1;
    private boolean isSuccess_;
    /**
     * <code>bool is_success = 1;</code>
     * @return The isSuccess.
     */
    @java.lang.Override
    public boolean getIsSuccess() {
      return isSuccess_;
    }

    public static final int UNK3300_BNNMNCKEHHO_FIELD_NUMBER = 11;
    private int unk3300BNNMNCKEHHO_;
    /**
     * <code>uint32 Unk3300_BNNMNCKEHHO = 11;</code>
     * @return The unk3300BNNMNCKEHHO.
     */
    @java.lang.Override
    public int getUnk3300BNNMNCKEHHO() {
      return unk3300BNNMNCKEHHO_;
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
      if (isSuccess_ != false) {
        output.writeBool(1, isSuccess_);
      }
      if (unk3300JHBCHFHAGFO_ != 0) {
        output.writeUInt32(10, unk3300JHBCHFHAGFO_);
      }
      if (unk3300BNNMNCKEHHO_ != 0) {
        output.writeUInt32(11, unk3300BNNMNCKEHHO_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (isSuccess_ != false) {
        size += com.google.protobuf.CodedOutputStream
          .computeBoolSize(1, isSuccess_);
      }
      if (unk3300JHBCHFHAGFO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(10, unk3300JHBCHFHAGFO_);
      }
      if (unk3300BNNMNCKEHHO_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(11, unk3300BNNMNCKEHHO_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo other = (emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo) obj;

      if (getUnk3300JHBCHFHAGFO()
          != other.getUnk3300JHBCHFHAGFO()) return false;
      if (getIsSuccess()
          != other.getIsSuccess()) return false;
      if (getUnk3300BNNMNCKEHHO()
          != other.getUnk3300BNNMNCKEHHO()) return false;
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
      hash = (37 * hash) + UNK3300_JHBCHFHAGFO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300JHBCHFHAGFO();
      hash = (37 * hash) + IS_SUCCESS_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
          getIsSuccess());
      hash = (37 * hash) + UNK3300_BNNMNCKEHHO_FIELD_NUMBER;
      hash = (53 * hash) + getUnk3300BNNMNCKEHHO();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo prototype) {
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
     * Protobuf type {@code SummerTimeV2DungeonSettleInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:SummerTimeV2DungeonSettleInfo)
        emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.class, emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.newBuilder()
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
        unk3300JHBCHFHAGFO_ = 0;

        isSuccess_ = false;

        unk3300BNNMNCKEHHO_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo build() {
        emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo buildPartial() {
        emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo result = new emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo(this);
        result.unk3300JHBCHFHAGFO_ = unk3300JHBCHFHAGFO_;
        result.isSuccess_ = isSuccess_;
        result.unk3300BNNMNCKEHHO_ = unk3300BNNMNCKEHHO_;
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
        if (other instanceof emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo) {
          return mergeFrom((emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo other) {
        if (other == emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo.getDefaultInstance()) return this;
        if (other.getUnk3300JHBCHFHAGFO() != 0) {
          setUnk3300JHBCHFHAGFO(other.getUnk3300JHBCHFHAGFO());
        }
        if (other.getIsSuccess() != false) {
          setIsSuccess(other.getIsSuccess());
        }
        if (other.getUnk3300BNNMNCKEHHO() != 0) {
          setUnk3300BNNMNCKEHHO(other.getUnk3300BNNMNCKEHHO());
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
        emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk3300JHBCHFHAGFO_ ;
      /**
       * <code>uint32 Unk3300_JHBCHFHAGFO = 10;</code>
       * @return The unk3300JHBCHFHAGFO.
       */
      @java.lang.Override
      public int getUnk3300JHBCHFHAGFO() {
        return unk3300JHBCHFHAGFO_;
      }
      /**
       * <code>uint32 Unk3300_JHBCHFHAGFO = 10;</code>
       * @param value The unk3300JHBCHFHAGFO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300JHBCHFHAGFO(int value) {
        
        unk3300JHBCHFHAGFO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_JHBCHFHAGFO = 10;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300JHBCHFHAGFO() {
        
        unk3300JHBCHFHAGFO_ = 0;
        onChanged();
        return this;
      }

      private boolean isSuccess_ ;
      /**
       * <code>bool is_success = 1;</code>
       * @return The isSuccess.
       */
      @java.lang.Override
      public boolean getIsSuccess() {
        return isSuccess_;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @param value The isSuccess to set.
       * @return This builder for chaining.
       */
      public Builder setIsSuccess(boolean value) {
        
        isSuccess_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>bool is_success = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearIsSuccess() {
        
        isSuccess_ = false;
        onChanged();
        return this;
      }

      private int unk3300BNNMNCKEHHO_ ;
      /**
       * <code>uint32 Unk3300_BNNMNCKEHHO = 11;</code>
       * @return The unk3300BNNMNCKEHHO.
       */
      @java.lang.Override
      public int getUnk3300BNNMNCKEHHO() {
        return unk3300BNNMNCKEHHO_;
      }
      /**
       * <code>uint32 Unk3300_BNNMNCKEHHO = 11;</code>
       * @param value The unk3300BNNMNCKEHHO to set.
       * @return This builder for chaining.
       */
      public Builder setUnk3300BNNMNCKEHHO(int value) {
        
        unk3300BNNMNCKEHHO_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk3300_BNNMNCKEHHO = 11;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk3300BNNMNCKEHHO() {
        
        unk3300BNNMNCKEHHO_ = 0;
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


      // @@protoc_insertion_point(builder_scope:SummerTimeV2DungeonSettleInfo)
    }

    // @@protoc_insertion_point(class_scope:SummerTimeV2DungeonSettleInfo)
    private static final emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo();
    }

    public static emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<SummerTimeV2DungeonSettleInfo>
        PARSER = new com.google.protobuf.AbstractParser<SummerTimeV2DungeonSettleInfo>() {
      @java.lang.Override
      public SummerTimeV2DungeonSettleInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new SummerTimeV2DungeonSettleInfo(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<SummerTimeV2DungeonSettleInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<SummerTimeV2DungeonSettleInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.SummerTimeV2DungeonSettleInfoOuterClass.SummerTimeV2DungeonSettleInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_SummerTimeV2DungeonSettleInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#SummerTimeV2DungeonSettleInfo.proto\"m\n" +
      "\035SummerTimeV2DungeonSettleInfo\022\033\n\023Unk330" +
      "0_JHBCHFHAGFO\030\n \001(\r\022\022\n\nis_success\030\001 \001(\010\022" +
      "\033\n\023Unk3300_BNNMNCKEHHO\030\013 \001(\rB\033\n\031emu.gras" +
      "scutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_SummerTimeV2DungeonSettleInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_SummerTimeV2DungeonSettleInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_SummerTimeV2DungeonSettleInfo_descriptor,
        new java.lang.String[] { "Unk3300JHBCHFHAGFO", "IsSuccess", "Unk3300BNNMNCKEHHO", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
