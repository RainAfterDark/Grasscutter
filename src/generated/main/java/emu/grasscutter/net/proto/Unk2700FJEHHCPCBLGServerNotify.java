// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Unk2700_FJEHHCPCBLG_ServerNotify.proto

package emu.grasscutter.net.proto;

public final class Unk2700FJEHHCPCBLGServerNotify {
  private Unk2700FJEHHCPCBLGServerNotify() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface Unk2700_FJEHHCPCBLG_ServerNotifyOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Unk2700_FJEHHCPCBLG_ServerNotify)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint32 Unk2700_BJHAMKKECEI = 12;</code>
     * @return The unk2700BJHAMKKECEI.
     */
    int getUnk2700BJHAMKKECEI();
  }
  /**
   * <pre>
   * CmdId: 4872
   * EnetChannelId: 0
   * EnetIsReliable: true
   * </pre>
   *
   * Protobuf type {@code Unk2700_FJEHHCPCBLG_ServerNotify}
   */
  public static final class Unk2700_FJEHHCPCBLG_ServerNotify extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Unk2700_FJEHHCPCBLG_ServerNotify)
      Unk2700_FJEHHCPCBLG_ServerNotifyOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Unk2700_FJEHHCPCBLG_ServerNotify.newBuilder() to construct.
    private Unk2700_FJEHHCPCBLG_ServerNotify(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Unk2700_FJEHHCPCBLG_ServerNotify() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Unk2700_FJEHHCPCBLG_ServerNotify();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Unk2700_FJEHHCPCBLG_ServerNotify(
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
            case 96: {

              unk2700BJHAMKKECEI_ = input.readUInt32();
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
      return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.class, emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.Builder.class);
    }

    public static final int UNK2700_BJHAMKKECEI_FIELD_NUMBER = 12;
    private int unk2700BJHAMKKECEI_;
    /**
     * <code>uint32 Unk2700_BJHAMKKECEI = 12;</code>
     * @return The unk2700BJHAMKKECEI.
     */
    @java.lang.Override
    public int getUnk2700BJHAMKKECEI() {
      return unk2700BJHAMKKECEI_;
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
      if (unk2700BJHAMKKECEI_ != 0) {
        output.writeUInt32(12, unk2700BJHAMKKECEI_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (unk2700BJHAMKKECEI_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(12, unk2700BJHAMKKECEI_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify other = (emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify) obj;

      if (getUnk2700BJHAMKKECEI()
          != other.getUnk2700BJHAMKKECEI()) return false;
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
      hash = (37 * hash) + UNK2700_BJHAMKKECEI_FIELD_NUMBER;
      hash = (53 * hash) + getUnk2700BJHAMKKECEI();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify prototype) {
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
     * CmdId: 4872
     * EnetChannelId: 0
     * EnetIsReliable: true
     * </pre>
     *
     * Protobuf type {@code Unk2700_FJEHHCPCBLG_ServerNotify}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Unk2700_FJEHHCPCBLG_ServerNotify)
        emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotifyOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.class, emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.newBuilder()
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
        unk2700BJHAMKKECEI_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify build() {
        emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify buildPartial() {
        emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify result = new emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify(this);
        result.unk2700BJHAMKKECEI_ = unk2700BJHAMKKECEI_;
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
        if (other instanceof emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify) {
          return mergeFrom((emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify other) {
        if (other == emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify.getDefaultInstance()) return this;
        if (other.getUnk2700BJHAMKKECEI() != 0) {
          setUnk2700BJHAMKKECEI(other.getUnk2700BJHAMKKECEI());
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
        emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private int unk2700BJHAMKKECEI_ ;
      /**
       * <code>uint32 Unk2700_BJHAMKKECEI = 12;</code>
       * @return The unk2700BJHAMKKECEI.
       */
      @java.lang.Override
      public int getUnk2700BJHAMKKECEI() {
        return unk2700BJHAMKKECEI_;
      }
      /**
       * <code>uint32 Unk2700_BJHAMKKECEI = 12;</code>
       * @param value The unk2700BJHAMKKECEI to set.
       * @return This builder for chaining.
       */
      public Builder setUnk2700BJHAMKKECEI(int value) {
        
        unk2700BJHAMKKECEI_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 Unk2700_BJHAMKKECEI = 12;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnk2700BJHAMKKECEI() {
        
        unk2700BJHAMKKECEI_ = 0;
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


      // @@protoc_insertion_point(builder_scope:Unk2700_FJEHHCPCBLG_ServerNotify)
    }

    // @@protoc_insertion_point(class_scope:Unk2700_FJEHHCPCBLG_ServerNotify)
    private static final emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify();
    }

    public static emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Unk2700_FJEHHCPCBLG_ServerNotify>
        PARSER = new com.google.protobuf.AbstractParser<Unk2700_FJEHHCPCBLG_ServerNotify>() {
      @java.lang.Override
      public Unk2700_FJEHHCPCBLG_ServerNotify parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Unk2700_FJEHHCPCBLG_ServerNotify(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Unk2700_FJEHHCPCBLG_ServerNotify> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Unk2700_FJEHHCPCBLG_ServerNotify> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.Unk2700FJEHHCPCBLGServerNotify.Unk2700_FJEHHCPCBLG_ServerNotify getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n&Unk2700_FJEHHCPCBLG_ServerNotify.proto" +
      "\"?\n Unk2700_FJEHHCPCBLG_ServerNotify\022\033\n\023" +
      "Unk2700_BJHAMKKECEI\030\014 \001(\rB\033\n\031emu.grasscu" +
      "tter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Unk2700_FJEHHCPCBLG_ServerNotify_descriptor,
        new java.lang.String[] { "Unk2700BJHAMKKECEI", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
