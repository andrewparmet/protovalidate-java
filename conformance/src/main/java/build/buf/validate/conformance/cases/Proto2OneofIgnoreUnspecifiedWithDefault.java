// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/ignore_proto2.proto

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault}
 */
public final class Proto2OneofIgnoreUnspecifiedWithDefault extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)
    Proto2OneofIgnoreUnspecifiedWithDefaultOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Proto2OneofIgnoreUnspecifiedWithDefault.newBuilder() to construct.
  private Proto2OneofIgnoreUnspecifiedWithDefault(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Proto2OneofIgnoreUnspecifiedWithDefault() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Proto2OneofIgnoreUnspecifiedWithDefault();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2OneofIgnoreUnspecifiedWithDefault_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2OneofIgnoreUnspecifiedWithDefault_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.class, build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.Builder.class);
  }

  private int oCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object o_;
  public enum OCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    VAL(1),
    O_NOT_SET(0);
    private final int value;
    private OCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static OCase valueOf(int value) {
      return forNumber(value);
    }

    public static OCase forNumber(int value) {
      switch (value) {
        case 1: return VAL;
        case 0: return O_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public OCase
  getOCase() {
    return OCase.forNumber(
        oCase_);
  }

  public static final int VAL_FIELD_NUMBER = 1;
  /**
   * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return Whether the val field is set.
   */
  @java.lang.Override
  public boolean hasVal() {
    return oCase_ == 1;
  }
  /**
   * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The val.
   */
  @java.lang.Override
  public int getVal() {
    if (oCase_ == 1) {
      return (java.lang.Integer) o_;
    }
    return -42;
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
    if (oCase_ == 1) {
      output.writeInt32(
          1, (int)((java.lang.Integer) o_));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (oCase_ == 1) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(
            1, (int)((java.lang.Integer) o_));
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
    if (!(obj instanceof build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault other = (build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault) obj;

    if (!getOCase().equals(other.getOCase())) return false;
    switch (oCase_) {
      case 1:
        if (getVal()
            != other.getVal()) return false;
        break;
      case 0:
      default:
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
    switch (oCase_) {
      case 1:
        hash = (37 * hash) + VAL_FIELD_NUMBER;
        hash = (53 * hash) + getVal();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)
      build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefaultOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2OneofIgnoreUnspecifiedWithDefault_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2OneofIgnoreUnspecifiedWithDefault_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.class, build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      oCase_ = 0;
      o_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.IgnoreProto2Proto.internal_static_buf_validate_conformance_cases_Proto2OneofIgnoreUnspecifiedWithDefault_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault build() {
      build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault buildPartial() {
      build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault result = new build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault result) {
      result.oCase_ = oCase_;
      result.o_ = this.o_;
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
      if (other instanceof build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault) {
        return mergeFrom((build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault other) {
      if (other == build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault.getDefaultInstance()) return this;
      switch (other.getOCase()) {
        case VAL: {
          setVal(other.getVal());
          break;
        }
        case O_NOT_SET: {
          break;
        }
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
            case 8: {
              o_ = input.readInt32();
              oCase_ = 1;
              break;
            } // case 8
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
    private int oCase_ = 0;
    private java.lang.Object o_;
    public OCase
        getOCase() {
      return OCase.forNumber(
          oCase_);
    }

    public Builder clearO() {
      oCase_ = 0;
      o_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return Whether the val field is set.
     */
    public boolean hasVal() {
      return oCase_ == 1;
    }
    /**
     * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return The val.
     */
    public int getVal() {
      if (oCase_ == 1) {
        return (java.lang.Integer) o_;
      }
      return -42;
    }
    /**
     * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
     * @param value The val to set.
     * @return This builder for chaining.
     */
    public Builder setVal(int value) {

      oCase_ = 1;
      o_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 val = 1 [default = -42, json_name = "val", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearVal() {
      if (oCase_ == 1) {
        oCase_ = 0;
        o_ = null;
        onChanged();
      }
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


    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault)
  private static final build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault();
  }

  public static build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  @java.lang.Deprecated public static final com.google.protobuf.Parser<Proto2OneofIgnoreUnspecifiedWithDefault>
      PARSER = new com.google.protobuf.AbstractParser<Proto2OneofIgnoreUnspecifiedWithDefault>() {
    @java.lang.Override
    public Proto2OneofIgnoreUnspecifiedWithDefault parsePartialFrom(
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

  public static com.google.protobuf.Parser<Proto2OneofIgnoreUnspecifiedWithDefault> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Proto2OneofIgnoreUnspecifiedWithDefault> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.Proto2OneofIgnoreUnspecifiedWithDefault getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
