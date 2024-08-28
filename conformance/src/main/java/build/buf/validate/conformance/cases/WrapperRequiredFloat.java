// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/wkt_wrappers.proto
// Protobuf Java Version: 4.27.4

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.WrapperRequiredFloat}
 */
public final class WrapperRequiredFloat extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.WrapperRequiredFloat)
    WrapperRequiredFloatOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 27,
      /* patch= */ 4,
      /* suffix= */ "",
      WrapperRequiredFloat.class.getName());
  }
  // Use WrapperRequiredFloat.newBuilder() to construct.
  private WrapperRequiredFloat(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private WrapperRequiredFloat() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperRequiredFloat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperRequiredFloat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.WrapperRequiredFloat.class, build.buf.validate.conformance.cases.WrapperRequiredFloat.Builder.class);
  }

  private int bitField0_;
  public static final int VAL_FIELD_NUMBER = 1;
  private com.google.protobuf.FloatValue val_;
  /**
   * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override
  public com.google.protobuf.FloatValue getVal() {
    return val_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : val_;
  }
  /**
   * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public com.google.protobuf.FloatValueOrBuilder getValOrBuilder() {
    return val_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : val_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getVal());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, getVal());
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof build.buf.validate.conformance.cases.WrapperRequiredFloat)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.WrapperRequiredFloat other = (build.buf.validate.conformance.cases.WrapperRequiredFloat) obj;

    if (hasVal() != other.hasVal()) return false;
    if (hasVal()) {
      if (!getVal()
          .equals(other.getVal())) return false;
    }
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (hasVal()) {
      hash = (37 * hash) + VAL_FIELD_NUMBER;
      hash = (53 * hash) + getVal().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.WrapperRequiredFloat parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(build.buf.validate.conformance.cases.WrapperRequiredFloat prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code buf.validate.conformance.cases.WrapperRequiredFloat}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.WrapperRequiredFloat)
      build.buf.validate.conformance.cases.WrapperRequiredFloatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperRequiredFloat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperRequiredFloat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.WrapperRequiredFloat.class, build.buf.validate.conformance.cases.WrapperRequiredFloat.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.WrapperRequiredFloat.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage
              .alwaysUseFieldBuilders) {
        getValFieldBuilder();
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.WktWrappersProto.internal_static_buf_validate_conformance_cases_WrapperRequiredFloat_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperRequiredFloat getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.WrapperRequiredFloat.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperRequiredFloat build() {
      build.buf.validate.conformance.cases.WrapperRequiredFloat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.WrapperRequiredFloat buildPartial() {
      build.buf.validate.conformance.cases.WrapperRequiredFloat result = new build.buf.validate.conformance.cases.WrapperRequiredFloat(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.WrapperRequiredFloat result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.val_ = valBuilder_ == null
            ? val_
            : valBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.WrapperRequiredFloat) {
        return mergeFrom((build.buf.validate.conformance.cases.WrapperRequiredFloat)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.WrapperRequiredFloat other) {
      if (other == build.buf.validate.conformance.cases.WrapperRequiredFloat.getDefaultInstance()) return this;
      if (other.hasVal()) {
        mergeVal(other.getVal());
      }
      this.mergeUnknownFields(other.getUnknownFields());
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
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              input.readMessage(
                  getValFieldBuilder().getBuilder(),
                  extensionRegistry);
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            default: {
              if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                done = true; // was an endgroup tag
              }
              break;
            } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.FloatValue val_;
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> valBuilder_;
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    public com.google.protobuf.FloatValue getVal() {
      if (valBuilder_ == null) {
        return val_ == null ? com.google.protobuf.FloatValue.getDefaultInstance() : val_;
      } else {
        return valBuilder_.getMessage();
      }
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(com.google.protobuf.FloatValue value) {
      if (valBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        val_ = value;
      } else {
        valBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder setVal(
        com.google.protobuf.FloatValue.Builder builderForValue) {
      if (valBuilder_ == null) {
        val_ = builderForValue.build();
      } else {
        valBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder mergeVal(com.google.protobuf.FloatValue value) {
      if (valBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0) &&
          val_ != null &&
          val_ != com.google.protobuf.FloatValue.getDefaultInstance()) {
          getValBuilder().mergeFrom(value);
        } else {
          val_ = value;
        }
      } else {
        valBuilder_.mergeFrom(value);
      }
      if (val_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public Builder clearVal() {
      bitField0_ = (bitField0_ & ~0x00000001);
      val_ = null;
      if (valBuilder_ != null) {
        valBuilder_.dispose();
        valBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.FloatValue.Builder getValBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getValFieldBuilder().getBuilder();
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    public com.google.protobuf.FloatValueOrBuilder getValOrBuilder() {
      if (valBuilder_ != null) {
        return valBuilder_.getMessageOrBuilder();
      } else {
        return val_ == null ?
            com.google.protobuf.FloatValue.getDefaultInstance() : val_;
      }
    }
    /**
     * <code>.google.protobuf.FloatValue val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
     */
    private com.google.protobuf.SingleFieldBuilder<
        com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder> 
        getValFieldBuilder() {
      if (valBuilder_ == null) {
        valBuilder_ = new com.google.protobuf.SingleFieldBuilder<
            com.google.protobuf.FloatValue, com.google.protobuf.FloatValue.Builder, com.google.protobuf.FloatValueOrBuilder>(
                getVal(),
                getParentForChildren(),
                isClean());
        val_ = null;
      }
      return valBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.WrapperRequiredFloat)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.WrapperRequiredFloat)
  private static final build.buf.validate.conformance.cases.WrapperRequiredFloat DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.WrapperRequiredFloat();
  }

  public static build.buf.validate.conformance.cases.WrapperRequiredFloat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WrapperRequiredFloat>
      PARSER = new com.google.protobuf.AbstractParser<WrapperRequiredFloat>() {
    @java.lang.Override
    public WrapperRequiredFloat parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      Builder builder = newBuilder();
      try {
        builder.mergeFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(builder.buildPartial());
      } catch (com.google.protobuf.UninitializedMessageException e) {
        throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(e)
            .setUnfinishedMessage(builder.buildPartial());
      }
      return builder.buildPartial();
    }
  };

  public static com.google.protobuf.Parser<WrapperRequiredFloat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WrapperRequiredFloat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.WrapperRequiredFloat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

