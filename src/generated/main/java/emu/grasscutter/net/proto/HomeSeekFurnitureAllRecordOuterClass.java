// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: HomeSeekFurnitureAllRecord.proto

package emu.grasscutter.net.proto;

public final class HomeSeekFurnitureAllRecordOuterClass {
  private HomeSeekFurnitureAllRecordOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface HomeSeekFurnitureAllRecordOrBuilder extends
      // @@protoc_insertion_point(interface_extends:HomeSeekFurnitureAllRecord)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> 
        getRecordListList();
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index);
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    int getRecordListCount();
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    java.util.List<? extends emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
        getRecordListOrBuilderList();
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordListOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code HomeSeekFurnitureAllRecord}
   */
  public static final class HomeSeekFurnitureAllRecord extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:HomeSeekFurnitureAllRecord)
      HomeSeekFurnitureAllRecordOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use HomeSeekFurnitureAllRecord.newBuilder() to construct.
    private HomeSeekFurnitureAllRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private HomeSeekFurnitureAllRecord() {
      recordList_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new HomeSeekFurnitureAllRecord();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private HomeSeekFurnitureAllRecord(
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
            case 42: {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                recordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord>();
                mutable_bitField0_ |= 0x00000001;
              }
              recordList_.add(
                  input.readMessage(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.parser(), extensionRegistry));
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
          recordList_ = java.util.Collections.unmodifiableList(recordList_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.class, emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.Builder.class);
    }

    public static final int RECORDLIST_FIELD_NUMBER = 5;
    private java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> recordList_;
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> getRecordListList() {
      return recordList_;
    }
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    @java.lang.Override
    public java.util.List<? extends emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
        getRecordListOrBuilderList() {
      return recordList_;
    }
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    @java.lang.Override
    public int getRecordListCount() {
      return recordList_.size();
    }
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index) {
      return recordList_.get(index);
    }
    /**
     * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
     */
    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordListOrBuilder(
        int index) {
      return recordList_.get(index);
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
      for (int i = 0; i < recordList_.size(); i++) {
        output.writeMessage(5, recordList_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < recordList_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(5, recordList_.get(i));
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
      if (!(obj instanceof emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord)) {
        return super.equals(obj);
      }
      emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord other = (emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord) obj;

      if (!getRecordListList()
          .equals(other.getRecordListList())) return false;
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
      if (getRecordListCount() > 0) {
        hash = (37 * hash) + RECORDLIST_FIELD_NUMBER;
        hash = (53 * hash) + getRecordListList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parseFrom(
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
    public static Builder newBuilder(emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord prototype) {
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
     * Protobuf type {@code HomeSeekFurnitureAllRecord}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:HomeSeekFurnitureAllRecord)
        emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecordOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.class, emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.Builder.class);
      }

      // Construct using emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.newBuilder()
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
          getRecordListFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (recordListBuilder_ == null) {
          recordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          recordListBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.internal_static_HomeSeekFurnitureAllRecord_descriptor;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord getDefaultInstanceForType() {
        return emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.getDefaultInstance();
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord build() {
        emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord buildPartial() {
        emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord result = new emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord(this);
        int from_bitField0_ = bitField0_;
        if (recordListBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0)) {
            recordList_ = java.util.Collections.unmodifiableList(recordList_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.recordList_ = recordList_;
        } else {
          result.recordList_ = recordListBuilder_.build();
        }
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
        if (other instanceof emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord) {
          return mergeFrom((emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord other) {
        if (other == emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord.getDefaultInstance()) return this;
        if (recordListBuilder_ == null) {
          if (!other.recordList_.isEmpty()) {
            if (recordList_.isEmpty()) {
              recordList_ = other.recordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureRecordListIsMutable();
              recordList_.addAll(other.recordList_);
            }
            onChanged();
          }
        } else {
          if (!other.recordList_.isEmpty()) {
            if (recordListBuilder_.isEmpty()) {
              recordListBuilder_.dispose();
              recordListBuilder_ = null;
              recordList_ = other.recordList_;
              bitField0_ = (bitField0_ & ~0x00000001);
              recordListBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getRecordListFieldBuilder() : null;
            } else {
              recordListBuilder_.addAllMessages(other.recordList_);
            }
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
        emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> recordList_ =
        java.util.Collections.emptyList();
      private void ensureRecordListIsMutable() {
        if (!((bitField0_ & 0x00000001) != 0)) {
          recordList_ = new java.util.ArrayList<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord>(recordList_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> recordListBuilder_;

      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> getRecordListList() {
        if (recordListBuilder_ == null) {
          return java.util.Collections.unmodifiableList(recordList_);
        } else {
          return recordListBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public int getRecordListCount() {
        if (recordListBuilder_ == null) {
          return recordList_.size();
        } else {
          return recordListBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord getRecordList(int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);
        } else {
          return recordListBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.set(index, value);
          onChanged();
        } else {
          recordListBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder setRecordList(
          int index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.set(index, builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder addRecordList(emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.add(value);
          onChanged();
        } else {
          recordListBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord value) {
        if (recordListBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureRecordListIsMutable();
          recordList_.add(index, value);
          onChanged();
        } else {
          recordListBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder addRecordList(
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.add(builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder addRecordList(
          int index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder builderForValue) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.add(index, builderForValue.build());
          onChanged();
        } else {
          recordListBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder addAllRecordList(
          java.lang.Iterable<? extends emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord> values) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, recordList_);
          onChanged();
        } else {
          recordListBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder clearRecordList() {
        if (recordListBuilder_ == null) {
          recordList_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          recordListBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public Builder removeRecordList(int index) {
        if (recordListBuilder_ == null) {
          ensureRecordListIsMutable();
          recordList_.remove(index);
          onChanged();
        } else {
          recordListBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder getRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder getRecordListOrBuilder(
          int index) {
        if (recordListBuilder_ == null) {
          return recordList_.get(index);  } else {
          return recordListBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public java.util.List<? extends emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
           getRecordListOrBuilderList() {
        if (recordListBuilder_ != null) {
          return recordListBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(recordList_);
        }
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder addRecordListBuilder() {
        return getRecordListFieldBuilder().addBuilder(
            emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder addRecordListBuilder(
          int index) {
        return getRecordListFieldBuilder().addBuilder(
            index, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.getDefaultInstance());
      }
      /**
       * <code>repeated .HomeSeekFurnitureOneRecord recordList = 5;</code>
       */
      public java.util.List<emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder> 
           getRecordListBuilderList() {
        return getRecordListFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder> 
          getRecordListFieldBuilder() {
        if (recordListBuilder_ == null) {
          recordListBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecord.Builder, emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.HomeSeekFurnitureOneRecordOrBuilder>(
                  recordList_,
                  ((bitField0_ & 0x00000001) != 0),
                  getParentForChildren(),
                  isClean());
          recordList_ = null;
        }
        return recordListBuilder_;
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


      // @@protoc_insertion_point(builder_scope:HomeSeekFurnitureAllRecord)
    }

    // @@protoc_insertion_point(class_scope:HomeSeekFurnitureAllRecord)
    private static final emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord();
    }

    public static emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<HomeSeekFurnitureAllRecord>
        PARSER = new com.google.protobuf.AbstractParser<HomeSeekFurnitureAllRecord>() {
      @java.lang.Override
      public HomeSeekFurnitureAllRecord parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new HomeSeekFurnitureAllRecord(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<HomeSeekFurnitureAllRecord> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<HomeSeekFurnitureAllRecord> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public emu.grasscutter.net.proto.HomeSeekFurnitureAllRecordOuterClass.HomeSeekFurnitureAllRecord getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_HomeSeekFurnitureAllRecord_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n HomeSeekFurnitureAllRecord.proto\032 Home" +
      "SeekFurnitureOneRecord.proto\"M\n\032HomeSeek" +
      "FurnitureAllRecord\022/\n\nrecordList\030\005 \003(\0132\033" +
      ".HomeSeekFurnitureOneRecordB\033\n\031emu.grass" +
      "cutter.net.protob\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.getDescriptor(),
        });
    internal_static_HomeSeekFurnitureAllRecord_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_HomeSeekFurnitureAllRecord_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_HomeSeekFurnitureAllRecord_descriptor,
        new java.lang.String[] { "RecordList", });
    emu.grasscutter.net.proto.HomeSeekFurnitureOneRecordOuterClass.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
