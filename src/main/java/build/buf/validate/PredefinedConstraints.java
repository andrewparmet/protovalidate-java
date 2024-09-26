// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

/**
 * <pre>
 * PredefinedConstraints are custom constraints that can be re-used with
 * multiple fields.
 * </pre>
 *
 * Protobuf type {@code buf.validate.PredefinedConstraints}
 */
public final class PredefinedConstraints extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.PredefinedConstraints)
    PredefinedConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      PredefinedConstraints.class.getName());
  }
  // Use PredefinedConstraints.newBuilder() to construct.
  private PredefinedConstraints(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private PredefinedConstraints() {
    cel_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_PredefinedConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_PredefinedConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.PredefinedConstraints.class, build.buf.validate.PredefinedConstraints.Builder.class);
  }

  public static final int CEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<build.buf.validate.Constraint> cel_;
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   * // The field `value` must be greater than 42.
   * optional int32 value = 1 [(buf.validate.predefined).cel = {
   * id: "my_message.value",
   * message: "value must be greater than 42",
   * expression: "this &gt; 42",
   * }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<build.buf.validate.Constraint> getCelList() {
    return cel_;
  }
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   * // The field `value` must be greater than 42.
   * optional int32 value = 1 [(buf.validate.predefined).cel = {
   * id: "my_message.value",
   * message: "value must be greater than 42",
   * expression: "this &gt; 42",
   * }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends build.buf.validate.ConstraintOrBuilder> 
      getCelOrBuilderList() {
    return cel_;
  }
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   * // The field `value` must be greater than 42.
   * optional int32 value = 1 [(buf.validate.predefined).cel = {
   * id: "my_message.value",
   * message: "value must be greater than 42",
   * expression: "this &gt; 42",
   * }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public int getCelCount() {
    return cel_.size();
  }
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   * // The field `value` must be greater than 42.
   * optional int32 value = 1 [(buf.validate.predefined).cel = {
   * id: "my_message.value",
   * message: "value must be greater than 42",
   * expression: "this &gt; 42",
   * }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public build.buf.validate.Constraint getCel(int index) {
    return cel_.get(index);
  }
  /**
   * <pre>
   * `cel` is a repeated field used to represent a textual expression
   * in the Common Expression Language (CEL) syntax. For more information on
   * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
   *
   * ```proto
   * message MyMessage {
   * // The field `value` must be greater than 42.
   * optional int32 value = 1 [(buf.validate.predefined).cel = {
   * id: "my_message.value",
   * message: "value must be greater than 42",
   * expression: "this &gt; 42",
   * }];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public build.buf.validate.ConstraintOrBuilder getCelOrBuilder(
      int index) {
    return cel_.get(index);
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
    for (int i = 0; i < cel_.size(); i++) {
      output.writeMessage(1, cel_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < cel_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, cel_.get(i));
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
    if (!(obj instanceof build.buf.validate.PredefinedConstraints)) {
      return super.equals(obj);
    }
    build.buf.validate.PredefinedConstraints other = (build.buf.validate.PredefinedConstraints) obj;

    if (!getCelList()
        .equals(other.getCelList())) return false;
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
    if (getCelCount() > 0) {
      hash = (37 * hash) + CEL_FIELD_NUMBER;
      hash = (53 * hash) + getCelList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.PredefinedConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.PredefinedConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.PredefinedConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.PredefinedConstraints parseFrom(
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
  public static Builder newBuilder(build.buf.validate.PredefinedConstraints prototype) {
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
   * <pre>
   * PredefinedConstraints are custom constraints that can be re-used with
   * multiple fields.
   * </pre>
   *
   * Protobuf type {@code buf.validate.PredefinedConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.PredefinedConstraints)
      build.buf.validate.PredefinedConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_PredefinedConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_PredefinedConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.PredefinedConstraints.class, build.buf.validate.PredefinedConstraints.Builder.class);
    }

    // Construct using build.buf.validate.PredefinedConstraints.newBuilder()
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
      if (celBuilder_ == null) {
        cel_ = java.util.Collections.emptyList();
      } else {
        cel_ = null;
        celBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_PredefinedConstraints_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.PredefinedConstraints getDefaultInstanceForType() {
      return build.buf.validate.PredefinedConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.PredefinedConstraints build() {
      build.buf.validate.PredefinedConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.PredefinedConstraints buildPartial() {
      build.buf.validate.PredefinedConstraints result = new build.buf.validate.PredefinedConstraints(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.PredefinedConstraints result) {
      if (celBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          cel_ = java.util.Collections.unmodifiableList(cel_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.cel_ = cel_;
      } else {
        result.cel_ = celBuilder_.build();
      }
    }

    private void buildPartial0(build.buf.validate.PredefinedConstraints result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.PredefinedConstraints) {
        return mergeFrom((build.buf.validate.PredefinedConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.PredefinedConstraints other) {
      if (other == build.buf.validate.PredefinedConstraints.getDefaultInstance()) return this;
      if (celBuilder_ == null) {
        if (!other.cel_.isEmpty()) {
          if (cel_.isEmpty()) {
            cel_ = other.cel_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureCelIsMutable();
            cel_.addAll(other.cel_);
          }
          onChanged();
        }
      } else {
        if (!other.cel_.isEmpty()) {
          if (celBuilder_.isEmpty()) {
            celBuilder_.dispose();
            celBuilder_ = null;
            cel_ = other.cel_;
            bitField0_ = (bitField0_ & ~0x00000001);
            celBuilder_ = 
              com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders ?
                 getCelFieldBuilder() : null;
          } else {
            celBuilder_.addAllMessages(other.cel_);
          }
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
              build.buf.validate.Constraint m =
                  input.readMessage(
                      build.buf.validate.Constraint.parser(),
                      extensionRegistry);
              if (celBuilder_ == null) {
                ensureCelIsMutable();
                cel_.add(m);
              } else {
                celBuilder_.addMessage(m);
              }
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

    private java.util.List<build.buf.validate.Constraint> cel_ =
      java.util.Collections.emptyList();
    private void ensureCelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cel_ = new java.util.ArrayList<build.buf.validate.Constraint>(cel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.Constraint, build.buf.validate.Constraint.Builder, build.buf.validate.ConstraintOrBuilder> celBuilder_;

    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<build.buf.validate.Constraint> getCelList() {
      if (celBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cel_);
      } else {
        return celBuilder_.getMessageList();
      }
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public int getCelCount() {
      if (celBuilder_ == null) {
        return cel_.size();
      } else {
        return celBuilder_.getCount();
      }
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.Constraint getCel(int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);
      } else {
        return celBuilder_.getMessage(index);
      }
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, build.buf.validate.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.set(index, value);
        onChanged();
      } else {
        celBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, build.buf.validate.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.set(index, builderForValue.build());
        onChanged();
      } else {
        celBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(build.buf.validate.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.add(value);
        onChanged();
      } else {
        celBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, build.buf.validate.Constraint value) {
      if (celBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureCelIsMutable();
        cel_.add(index, value);
        onChanged();
      } else {
        celBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        build.buf.validate.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.add(builderForValue.build());
        onChanged();
      } else {
        celBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, build.buf.validate.Constraint.Builder builderForValue) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.add(index, builderForValue.build());
        onChanged();
      } else {
        celBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addAllCel(
        java.lang.Iterable<? extends build.buf.validate.Constraint> values) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, cel_);
        onChanged();
      } else {
        celBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder clearCel() {
      if (celBuilder_ == null) {
        cel_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        celBuilder_.clear();
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder removeCel(int index) {
      if (celBuilder_ == null) {
        ensureCelIsMutable();
        cel_.remove(index);
        onChanged();
      } else {
        celBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.Constraint.Builder getCelBuilder(
        int index) {
      return getCelFieldBuilder().getBuilder(index);
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.ConstraintOrBuilder getCelOrBuilder(
        int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);  } else {
        return celBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<? extends build.buf.validate.ConstraintOrBuilder> 
         getCelOrBuilderList() {
      if (celBuilder_ != null) {
        return celBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cel_);
      }
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.Constraint.Builder addCelBuilder() {
      return getCelFieldBuilder().addBuilder(
          build.buf.validate.Constraint.getDefaultInstance());
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.Constraint.Builder addCelBuilder(
        int index) {
      return getCelFieldBuilder().addBuilder(
          index, build.buf.validate.Constraint.getDefaultInstance());
    }
    /**
     * <pre>
     * `cel` is a repeated field used to represent a textual expression
     * in the Common Expression Language (CEL) syntax. For more information on
     * CEL, [see our documentation](https://github.com/bufbuild/protovalidate/blob/main/docs/cel.md).
     *
     * ```proto
     * message MyMessage {
     * // The field `value` must be greater than 42.
     * optional int32 value = 1 [(buf.validate.predefined).cel = {
     * id: "my_message.value",
     * message: "value must be greater than 42",
     * expression: "this &gt; 42",
     * }];
     * }
     * ```
     * </pre>
     *
     * <code>repeated .buf.validate.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<build.buf.validate.Constraint.Builder> 
         getCelBuilderList() {
      return getCelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.Constraint, build.buf.validate.Constraint.Builder, build.buf.validate.ConstraintOrBuilder> 
        getCelFieldBuilder() {
      if (celBuilder_ == null) {
        celBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            build.buf.validate.Constraint, build.buf.validate.Constraint.Builder, build.buf.validate.ConstraintOrBuilder>(
                cel_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cel_ = null;
      }
      return celBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.PredefinedConstraints)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.PredefinedConstraints)
  private static final build.buf.validate.PredefinedConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.PredefinedConstraints();
  }

  public static build.buf.validate.PredefinedConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<PredefinedConstraints>
      PARSER = new com.google.protobuf.AbstractParser<PredefinedConstraints>() {
    @java.lang.Override
    public PredefinedConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<PredefinedConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<PredefinedConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.PredefinedConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

