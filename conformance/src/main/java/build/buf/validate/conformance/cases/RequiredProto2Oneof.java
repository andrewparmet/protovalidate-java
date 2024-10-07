// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/required_field_proto2.proto
// Protobuf Java Version: 4.28.2

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.RequiredProto2Oneof}
 */
public final class RequiredProto2Oneof extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.RequiredProto2Oneof)
    RequiredProto2OneofOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      RequiredProto2Oneof.class.getName());
  }
  // Use RequiredProto2Oneof.newBuilder() to construct.
  private RequiredProto2Oneof(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private RequiredProto2Oneof() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RequiredFieldProto2Proto.internal_static_buf_validate_conformance_cases_RequiredProto2Oneof_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.RequiredFieldProto2Proto.internal_static_buf_validate_conformance_cases_RequiredProto2Oneof_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.RequiredProto2Oneof.class, build.buf.validate.conformance.cases.RequiredProto2Oneof.Builder.class);
  }

  private int valCase_ = 0;
  @SuppressWarnings("serial")
  private java.lang.Object val_;
  public enum ValCase
      implements com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    A(1),
    B(2),
    VAL_NOT_SET(0);
    private final int value;
    private ValCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ValCase valueOf(int value) {
      return forNumber(value);
    }

    public static ValCase forNumber(int value) {
      switch (value) {
        case 1: return A;
        case 2: return B;
        case 0: return VAL_NOT_SET;
        default: return null;
      }
    }
    public int getNumber() {
      return this.value;
    }
  };

  public ValCase
  getValCase() {
    return ValCase.forNumber(
        valCase_);
  }

  public static final int A_FIELD_NUMBER = 1;
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return Whether the a field is set.
   */
  public boolean hasA() {
    return valCase_ == 1;
  }
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The a.
   */
  public java.lang.String getA() {
    java.lang.Object ref = "";
    if (valCase_ == 1) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8() && (valCase_ == 1)) {
        val_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The bytes for a.
   */
  public com.google.protobuf.ByteString
      getABytes() {
    java.lang.Object ref = "";
    if (valCase_ == 1) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valCase_ == 1) {
        val_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int B_FIELD_NUMBER = 2;
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return Whether the b field is set.
   */
  public boolean hasB() {
    return valCase_ == 2;
  }
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  public java.lang.String getB() {
    java.lang.Object ref = "";
    if (valCase_ == 2) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (bs.isValidUtf8() && (valCase_ == 2)) {
        val_ = s;
      }
      return s;
    }
  }
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The bytes for b.
   */
  public com.google.protobuf.ByteString
      getBBytes() {
    java.lang.Object ref = "";
    if (valCase_ == 2) {
      ref = val_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      if (valCase_ == 2) {
        val_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (valCase_ == 1) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, val_);
    }
    if (valCase_ == 2) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, val_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (valCase_ == 1) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, val_);
    }
    if (valCase_ == 2) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, val_);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.RequiredProto2Oneof)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.RequiredProto2Oneof other = (build.buf.validate.conformance.cases.RequiredProto2Oneof) obj;

    if (!getValCase().equals(other.getValCase())) return false;
    switch (valCase_) {
      case 1:
        if (!getA()
            .equals(other.getA())) return false;
        break;
      case 2:
        if (!getB()
            .equals(other.getB())) return false;
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
    switch (valCase_) {
      case 1:
        hash = (37 * hash) + A_FIELD_NUMBER;
        hash = (53 * hash) + getA().hashCode();
        break;
      case 2:
        hash = (37 * hash) + B_FIELD_NUMBER;
        hash = (53 * hash) + getB().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.RequiredProto2Oneof parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.RequiredProto2Oneof prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.RequiredProto2Oneof}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.RequiredProto2Oneof)
      build.buf.validate.conformance.cases.RequiredProto2OneofOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.RequiredFieldProto2Proto.internal_static_buf_validate_conformance_cases_RequiredProto2Oneof_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.RequiredFieldProto2Proto.internal_static_buf_validate_conformance_cases_RequiredProto2Oneof_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.RequiredProto2Oneof.class, build.buf.validate.conformance.cases.RequiredProto2Oneof.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.RequiredProto2Oneof.newBuilder()
    private Builder() {

    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);

    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      valCase_ = 0;
      val_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.RequiredFieldProto2Proto.internal_static_buf_validate_conformance_cases_RequiredProto2Oneof_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredProto2Oneof getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.RequiredProto2Oneof.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredProto2Oneof build() {
      build.buf.validate.conformance.cases.RequiredProto2Oneof result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.RequiredProto2Oneof buildPartial() {
      build.buf.validate.conformance.cases.RequiredProto2Oneof result = new build.buf.validate.conformance.cases.RequiredProto2Oneof(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.RequiredProto2Oneof result) {
      int from_bitField0_ = bitField0_;
    }

    private void buildPartialOneofs(build.buf.validate.conformance.cases.RequiredProto2Oneof result) {
      result.valCase_ = valCase_;
      result.val_ = this.val_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.RequiredProto2Oneof) {
        return mergeFrom((build.buf.validate.conformance.cases.RequiredProto2Oneof)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.RequiredProto2Oneof other) {
      if (other == build.buf.validate.conformance.cases.RequiredProto2Oneof.getDefaultInstance()) return this;
      switch (other.getValCase()) {
        case A: {
          valCase_ = 1;
          val_ = other.val_;
          onChanged();
          break;
        }
        case B: {
          valCase_ = 2;
          val_ = other.val_;
          onChanged();
          break;
        }
        case VAL_NOT_SET: {
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
            case 10: {
              com.google.protobuf.ByteString bs = input.readBytes();
              valCase_ = 1;
              val_ = bs;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              valCase_ = 2;
              val_ = bs;
              break;
            } // case 18
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
    private int valCase_ = 0;
    private java.lang.Object val_;
    public ValCase
        getValCase() {
      return ValCase.forNumber(
          valCase_);
    }

    public Builder clearVal() {
      valCase_ = 0;
      val_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @return Whether the a field is set.
     */
    @java.lang.Override
    public boolean hasA() {
      return valCase_ == 1;
    }
    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @return The a.
     */
    @java.lang.Override
    public java.lang.String getA() {
      java.lang.Object ref = "";
      if (valCase_ == 1) {
        ref = val_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valCase_ == 1) {
          if (bs.isValidUtf8()) {
            val_ = s;
          }
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @return The bytes for a.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getABytes() {
      java.lang.Object ref = "";
      if (valCase_ == 1) {
        ref = val_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valCase_ == 1) {
          val_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @param value The a to set.
     * @return This builder for chaining.
     */
    public Builder setA(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 1;
      val_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @return This builder for chaining.
     */
    public Builder clearA() {
      if (valCase_ == 1) {
        valCase_ = 0;
        val_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
     * @param value The bytes for a to set.
     * @return This builder for chaining.
     */
    public Builder setABytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 1;
      val_ = value;
      onChanged();
      return this;
    }

    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @return Whether the b field is set.
     */
    @java.lang.Override
    public boolean hasB() {
      return valCase_ == 2;
    }
    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @return The b.
     */
    @java.lang.Override
    public java.lang.String getB() {
      java.lang.Object ref = "";
      if (valCase_ == 2) {
        ref = val_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (valCase_ == 2) {
          if (bs.isValidUtf8()) {
            val_ = s;
          }
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @return The bytes for b.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getBBytes() {
      java.lang.Object ref = "";
      if (valCase_ == 2) {
        ref = val_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        if (valCase_ == 2) {
          val_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @param value The b to set.
     * @return This builder for chaining.
     */
    public Builder setB(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 2;
      val_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @return This builder for chaining.
     */
    public Builder clearB() {
      if (valCase_ == 2) {
        valCase_ = 0;
        val_ = null;
        onChanged();
      }
      return this;
    }
    /**
     * <code>string b = 2 [json_name = "b"];</code>
     * @param value The bytes for b to set.
     * @return This builder for chaining.
     */
    public Builder setBBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      valCase_ = 2;
      val_ = value;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.RequiredProto2Oneof)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.RequiredProto2Oneof)
  private static final build.buf.validate.conformance.cases.RequiredProto2Oneof DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.RequiredProto2Oneof();
  }

  public static build.buf.validate.conformance.cases.RequiredProto2Oneof getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RequiredProto2Oneof>
      PARSER = new com.google.protobuf.AbstractParser<RequiredProto2Oneof>() {
    @java.lang.Override
    public RequiredProto2Oneof parsePartialFrom(
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

  public static com.google.protobuf.Parser<RequiredProto2Oneof> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RequiredProto2Oneof> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.RequiredProto2Oneof getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

