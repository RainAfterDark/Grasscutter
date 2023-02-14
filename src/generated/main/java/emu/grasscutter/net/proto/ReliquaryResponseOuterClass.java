// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ReliquaryResponse.proto

package emu.grasscutter.net.proto;

public final class ReliquaryResponseOuterClass {
  private ReliquaryResponseOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ReliquaryResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ReliquaryResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> 
        getNbbpegfkpacList();
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData getNbbpegfkpac(int index);
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    int getNbbpegfkpacCount();
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder> 
        getNbbpegfkpacOrBuilderList();
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder getNbbpegfkpacOrBuilder(
        int index);

    /**
     * <code>uint32 equipType = 15;</code>
     * @return The equipType.
     */
    int getEquipType();
  }
  /**
   * Protobuf type {@code ReliquaryResponse}
   */
  public static final class ReliquaryResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ReliquaryResponse)
      ReliquaryResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ReliquaryResponse.newBuilder() to construct.
    private ReliquaryResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ReliquaryResponse() {
      nbbpegfkpac_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new ReliquaryResponse();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ReliquaryResponse(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
            case 98: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                nbbpegfkpac_ = new java.util.ArrayList<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData>();
                mutable_bitField0_ |= 0x00000001;
              }
              nbbpegfkpac_.add(
                  input.readMessage(emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.parser(), extensionRegistry));
              break;
            }
            case 120: {

              equipType_ = input.readUInt32();
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
        if (((mutable_bitField0_ & 0x00000001) != 0)) {
          nbbpegfkpac_ = java.util.Collections.unmodifiableList(nbbpegfkpac_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.class, emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.Builder.class);
    }

    public static final int NBBPEGFKPAC_FIELD_NUMBER = 12;
    private java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> nbbpegfkpac_;
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> getNbbpegfkpacList() {
      return nbbpegfkpac_;
    }
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder> 
        getNbbpegfkpacOrBuilderList() {
      return nbbpegfkpac_;
    }
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    @java.lang.Override
    public int getNbbpegfkpacCount() {
      return nbbpegfkpac_.size();
    }
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData getNbbpegfkpac(int index) {
      return nbbpegfkpac_.get(index);
    }
    /**
     * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder getNbbpegfkpacOrBuilder(
        int index) {
      return nbbpegfkpac_.get(index);
    }

    public static final int EQUIPTYPE_FIELD_NUMBER = 15;
    private int equipType_;
    /**
     * <code>uint32 equipType = 15;</code>
     * @return The equipType.
     */
    @java.lang.Override
    public int getEquipType() {
      return equipType_;
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
      for (int i = 0; i < nbbpegfkpac_.size(); i++) {
        output.writeMessage(12, nbbpegfkpac_.get(i));
      }
      if (equipType_ != 0) {
        output.writeUInt32(15, equipType_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < nbbpegfkpac_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(12, nbbpegfkpac_.get(i));
      }
      if (equipType_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(15, equipType_);
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
      if (!(obj instanceof emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse other = (emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse) obj;

      if (!getNbbpegfkpacList()
          .equals(other.getNbbpegfkpacList())) return false;
      if (getEquipType()
          != other.getEquipType()) return false;
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
      if (getNbbpegfkpacCount() > 0) {
        hash = (37 * hash) + NBBPEGFKPAC_FIELD_NUMBER;
        hash = (53 * hash) + getNbbpegfkpacList().hashCode();
      }
      hash = (37 * hash) + EQUIPTYPE_FIELD_NUMBER;
      hash = (53 * hash) + getEquipType();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse prototype) {
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
     * Protobuf type {@code ReliquaryResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ReliquaryResponse)
        emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.class, emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.newBuilder()
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
          getNbbpegfkpacFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (nbbpegfkpacBuilder_ == null) {
          nbbpegfkpac_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          nbbpegfkpacBuilder_.clear();
        }
        equipType_ = 0;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.internal_static_ReliquaryResponse_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse build() {
        emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse buildPartial() {
        emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse result = new emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse(this);
        int from_bitField0_ = bitField0_;
        if (nbbpegfkpacBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            nbbpegfkpac_ = java.util.Collections.unmodifiableList(nbbpegfkpac_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.nbbpegfkpac_ = nbbpegfkpac_;
        } else {
          result.nbbpegfkpac_ = nbbpegfkpacBuilder_.build();
        }
        result.equipType_ = equipType_;
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
        if (other instanceof emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse) {
          return mergeFrom((emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse other) {
        if (other == emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse.getDefaultInstance()) return this;
        if (nbbpegfkpacBuilder_ == null) {
          if (!other.nbbpegfkpac_.isEmpty()) {
            if (nbbpegfkpac_.isEmpty()) {
              nbbpegfkpac_ = other.nbbpegfkpac_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureNbbpegfkpacIsMutable();
              nbbpegfkpac_.addAll(other.nbbpegfkpac_);
            }
            onChanged();
          }
        } else {
          if (!other.nbbpegfkpac_.isEmpty()) {
            if (nbbpegfkpacBuilder_.isEmpty()) {
              nbbpegfkpacBuilder_.dispose();
              nbbpegfkpacBuilder_ = null;
              nbbpegfkpac_ = other.nbbpegfkpac_;
              bitField0_ = (bitField0_ & ~0x00000001);
              nbbpegfkpacBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getNbbpegfkpacFieldBuilder() : null;
            } else {
              nbbpegfkpacBuilder_.addAllMessages(other.nbbpegfkpac_);
            }
          }
        }
        if (other.getEquipType() != 0) {
          setEquipType(other.getEquipType());
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
        emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> nbbpegfkpac_ =
        java.util.Collections.emptyList();
      private void ensureNbbpegfkpacIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          nbbpegfkpac_ = new java.util.ArrayList<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData>(nbbpegfkpac_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder> nbbpegfkpacBuilder_;

      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> getNbbpegfkpacList() {
        if (nbbpegfkpacBuilder_ == null) {
          return java.util.Collections.unmodifiableList(nbbpegfkpac_);
        } else {
          return nbbpegfkpacBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public int getNbbpegfkpacCount() {
        if (nbbpegfkpacBuilder_ == null) {
          return nbbpegfkpac_.size();
        } else {
          return nbbpegfkpacBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData getNbbpegfkpac(int index) {
        if (nbbpegfkpacBuilder_ == null) {
          return nbbpegfkpac_.get(index);
        } else {
          return nbbpegfkpacBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder setNbbpegfkpac(
          int index, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData value) {
        if (nbbpegfkpacBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.set(index, value);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder setNbbpegfkpac(
          int index, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder builderForValue) {
        if (nbbpegfkpacBuilder_ == null) {
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.set(index, builderForValue.build());
          onChanged();
        } else {
          nbbpegfkpacBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder addNbbpegfkpac(emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData value) {
        if (nbbpegfkpacBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.add(value);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder addNbbpegfkpac(
          int index, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData value) {
        if (nbbpegfkpacBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.add(index, value);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder addNbbpegfkpac(
          emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder builderForValue) {
        if (nbbpegfkpacBuilder_ == null) {
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.add(builderForValue.build());
          onChanged();
        } else {
          nbbpegfkpacBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder addNbbpegfkpac(
          int index, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder builderForValue) {
        if (nbbpegfkpacBuilder_ == null) {
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.add(index, builderForValue.build());
          onChanged();
        } else {
          nbbpegfkpacBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder addAllNbbpegfkpac(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData> values) {
        if (nbbpegfkpacBuilder_ == null) {
          ensureNbbpegfkpacIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, nbbpegfkpac_);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder clearNbbpegfkpac() {
        if (nbbpegfkpacBuilder_ == null) {
          nbbpegfkpac_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public Builder removeNbbpegfkpac(int index) {
        if (nbbpegfkpacBuilder_ == null) {
          ensureNbbpegfkpacIsMutable();
          nbbpegfkpac_.remove(index);
          onChanged();
        } else {
          nbbpegfkpacBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder getNbbpegfkpacBuilder(
          int index) {
        return getNbbpegfkpacFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder getNbbpegfkpacOrBuilder(
          int index) {
        if (nbbpegfkpacBuilder_ == null) {
          return nbbpegfkpac_.get(index);  } else {
          return nbbpegfkpacBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder> 
           getNbbpegfkpacOrBuilderList() {
        if (nbbpegfkpacBuilder_ != null) {
          return nbbpegfkpacBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(nbbpegfkpac_);
        }
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder addNbbpegfkpacBuilder() {
        return getNbbpegfkpacFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.getDefaultInstance());
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder addNbbpegfkpacBuilder(
          int index) {
        return getNbbpegfkpacFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.getDefaultInstance());
      }
      /**
       * <code>repeated .GameplayRecommendationReliquaryMainPropData nbbpegfkpac = 12;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder> 
           getNbbpegfkpacBuilderList() {
        return getNbbpegfkpacFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder> 
          getNbbpegfkpacFieldBuilder() {
        if (nbbpegfkpacBuilder_ == null) {
          nbbpegfkpacBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropData.Builder, emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.GameplayRecommendationReliquaryMainPropDataOrBuilder>(
                  nbbpegfkpac_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          nbbpegfkpac_ = null;
        }
        return nbbpegfkpacBuilder_;
      }

      private int equipType_ ;
      /**
       * <code>uint32 equipType = 15;</code>
       * @return The equipType.
       */
      @java.lang.Override
      public int getEquipType() {
        return equipType_;
      }
      /**
       * <code>uint32 equipType = 15;</code>
       * @param value The equipType to set.
       * @return This builder for chaining.
       */
      public Builder setEquipType(int value) {
        
        equipType_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint32 equipType = 15;</code>
       * @return This builder for chaining.
       */
      public Builder clearEquipType() {
        
        equipType_ = 0;
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


      // @@protoc_insertion_point(builder_scope:ReliquaryResponse)
    }

    // @@protoc_insertion_point(class_scope:ReliquaryResponse)
    private static final emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse();
    }

    public static emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ReliquaryResponse>
        PARSER = new com.google.protobuf.AbstractParser<ReliquaryResponse>() {
      @java.lang.Override
      public ReliquaryResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ReliquaryResponse(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ReliquaryResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ReliquaryResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.ReliquaryResponseOuterClass.ReliquaryResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ReliquaryResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ReliquaryResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027ReliquaryResponse.proto\0321GameplayRecom" +
      "mendationReliquaryMainPropData.proto\"i\n\021" +
      "ReliquaryResponse\022A\n\013nbbpegfkpac\030\014 \003(\0132," +
      ".GameplayRecommendationReliquaryMainProp" +
      "Data\022\021\n\tequipType\030\017 \001(\rB\033\n\031emu.grasscutt" +
      "er.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.getDescriptor(),
        });
    internal_static_ReliquaryResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ReliquaryResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ReliquaryResponse_descriptor,
        new java.lang.String[] { "Nbbpegfkpac", "EquipType", });
    emu.grasscutter.net.proto.GameplayRecommendationReliquaryMainPropDataOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
