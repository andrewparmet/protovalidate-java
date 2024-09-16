// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

/**
 * <pre>
 * AnyRules describe constraints applied exclusively to the `google.protobuf.Any` well-known type.
 * </pre>
 *
 * Protobuf type {@code buf.validate.AnyRules}
 */
public final class AnyRules extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.AnyRules)
    AnyRulesOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      AnyRules.class.getName());
  }
  // Use AnyRules.newBuilder() to construct.
  private AnyRules(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private AnyRules() {
    in_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    notIn_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_AnyRules_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.ValidateProto.internal_static_buf_validate_AnyRules_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.AnyRules.class, build.buf.validate.AnyRules.Builder.class);
  }

  public static final int IN_FIELD_NUMBER = 2;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList in_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   * specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   * //  The `value` field must have a `type_url` equal to one of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @return A list containing the in.
   */
  public com.google.protobuf.ProtocolStringList
      getInList() {
    return in_;
  }
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   * specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   * //  The `value` field must have a `type_url` equal to one of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @return The count of in.
   */
  public int getInCount() {
    return in_.size();
  }
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   * specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   * //  The `value` field must have a `type_url` equal to one of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  public java.lang.String getIn(int index) {
    return in_.get(index);
  }
  /**
   * <pre>
   * `in` requires the field's `type_url` to be equal to one of the
   * specified values. If it doesn't match any of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyAny {
   * //  The `value` field must have a `type_url` equal to one of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string in = 2 [json_name = "in"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the in at the given index.
   */
  public com.google.protobuf.ByteString
      getInBytes(int index) {
    return in_.getByteString(index);
  }

  public static final int NOT_IN_FIELD_NUMBER = 3;
  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList notIn_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   * // The field `value` must not have a `type_url` equal to any of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @return A list containing the notIn.
   */
  public com.google.protobuf.ProtocolStringList
      getNotInList() {
    return notIn_;
  }
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   * // The field `value` must not have a `type_url` equal to any of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @return The count of notIn.
   */
  public int getNotInCount() {
    return notIn_.size();
  }
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   * // The field `value` must not have a `type_url` equal to any of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  public java.lang.String getNotIn(int index) {
    return notIn_.get(index);
  }
  /**
   * <pre>
   * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
   *
   * ```proto
   * message MyAny {
   * // The field `value` must not have a `type_url` equal to any of the specified values.
   * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
   * @param index The index of the value to return.
   * @return The bytes of the notIn at the given index.
   */
  public com.google.protobuf.ByteString
      getNotInBytes(int index) {
    return notIn_.getByteString(index);
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
    for (int i = 0; i < in_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, in_.getRaw(i));
    }
    for (int i = 0; i < notIn_.size(); i++) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, notIn_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < in_.size(); i++) {
        dataSize += computeStringSizeNoTag(in_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getInList().size();
    }
    {
      int dataSize = 0;
      for (int i = 0; i < notIn_.size(); i++) {
        dataSize += computeStringSizeNoTag(notIn_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getNotInList().size();
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
    if (!(obj instanceof build.buf.validate.AnyRules)) {
      return super.equals(obj);
    }
    build.buf.validate.AnyRules other = (build.buf.validate.AnyRules) obj;

    if (!getInList()
        .equals(other.getInList())) return false;
    if (!getNotInList()
        .equals(other.getNotInList())) return false;
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
    if (getInCount() > 0) {
      hash = (37 * hash) + IN_FIELD_NUMBER;
      hash = (53 * hash) + getInList().hashCode();
    }
    if (getNotInCount() > 0) {
      hash = (37 * hash) + NOT_IN_FIELD_NUMBER;
      hash = (53 * hash) + getNotInList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.AnyRules parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.AnyRules parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.AnyRules parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.AnyRules parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.AnyRules parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.AnyRules parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.AnyRules parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.AnyRules parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.AnyRules parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.AnyRules parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.AnyRules parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.AnyRules parseFrom(
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
  public static Builder newBuilder(build.buf.validate.AnyRules prototype) {
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
   * AnyRules describe constraints applied exclusively to the `google.protobuf.Any` well-known type.
   * </pre>
   *
   * Protobuf type {@code buf.validate.AnyRules}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.AnyRules)
      build.buf.validate.AnyRulesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_AnyRules_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_AnyRules_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.AnyRules.class, build.buf.validate.AnyRules.Builder.class);
    }

    // Construct using build.buf.validate.AnyRules.newBuilder()
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
      in_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      notIn_ =
          com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.ValidateProto.internal_static_buf_validate_AnyRules_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.AnyRules getDefaultInstanceForType() {
      return build.buf.validate.AnyRules.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.AnyRules build() {
      build.buf.validate.AnyRules result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.AnyRules buildPartial() {
      build.buf.validate.AnyRules result = new build.buf.validate.AnyRules(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.AnyRules result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        in_.makeImmutable();
        result.in_ = in_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        notIn_.makeImmutable();
        result.notIn_ = notIn_;
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.AnyRules) {
        return mergeFrom((build.buf.validate.AnyRules)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.AnyRules other) {
      if (other == build.buf.validate.AnyRules.getDefaultInstance()) return this;
      if (!other.in_.isEmpty()) {
        if (in_.isEmpty()) {
          in_ = other.in_;
          bitField0_ |= 0x00000001;
        } else {
          ensureInIsMutable();
          in_.addAll(other.in_);
        }
        onChanged();
      }
      if (!other.notIn_.isEmpty()) {
        if (notIn_.isEmpty()) {
          notIn_ = other.notIn_;
          bitField0_ |= 0x00000002;
        } else {
          ensureNotInIsMutable();
          notIn_.addAll(other.notIn_);
        }
        onChanged();
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
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureInIsMutable();
              in_.add(s);
              break;
            } // case 18
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();
              ensureNotInIsMutable();
              notIn_.add(s);
              break;
            } // case 26
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

    private com.google.protobuf.LazyStringArrayList in_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureInIsMutable() {
      if (!in_.isModifiable()) {
        in_ = new com.google.protobuf.LazyStringArrayList(in_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @return A list containing the in.
     */
    public com.google.protobuf.ProtocolStringList
        getInList() {
      in_.makeImmutable();
      return in_;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @return The count of in.
     */
    public int getInCount() {
      return in_.size();
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param index The index of the element to return.
     * @return The in at the given index.
     */
    public java.lang.String getIn(int index) {
      return in_.get(index);
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the in at the given index.
     */
    public com.google.protobuf.ByteString
        getInBytes(int index) {
      return in_.getByteString(index);
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param index The index to set the value at.
     * @param value The in to set.
     * @return This builder for chaining.
     */
    public Builder setIn(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInIsMutable();
      in_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param value The in to add.
     * @return This builder for chaining.
     */
    public Builder addIn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureInIsMutable();
      in_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param values The in to add.
     * @return This builder for chaining.
     */
    public Builder addAllIn(
        java.lang.Iterable<java.lang.String> values) {
      ensureInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, in_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @return This builder for chaining.
     */
    public Builder clearIn() {
      in_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * `in` requires the field's `type_url` to be equal to one of the
     * specified values. If it doesn't match any of the specified values, an error
     * message is generated.
     *
     * ```proto
     * message MyAny {
     * //  The `value` field must have a `type_url` equal to one of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.in = ["type.googleapis.com/MyType1", "type.googleapis.com/MyType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string in = 2 [json_name = "in"];</code>
     * @param value The bytes of the in to add.
     * @return This builder for chaining.
     */
    public Builder addInBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureInIsMutable();
      in_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList notIn_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
    private void ensureNotInIsMutable() {
      if (!notIn_.isModifiable()) {
        notIn_ = new com.google.protobuf.LazyStringArrayList(notIn_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @return A list containing the notIn.
     */
    public com.google.protobuf.ProtocolStringList
        getNotInList() {
      notIn_.makeImmutable();
      return notIn_;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @return The count of notIn.
     */
    public int getNotInCount() {
      return notIn_.size();
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param index The index of the element to return.
     * @return The notIn at the given index.
     */
    public java.lang.String getNotIn(int index) {
      return notIn_.get(index);
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param index The index of the value to return.
     * @return The bytes of the notIn at the given index.
     */
    public com.google.protobuf.ByteString
        getNotInBytes(int index) {
      return notIn_.getByteString(index);
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param index The index to set the value at.
     * @param value The notIn to set.
     * @return This builder for chaining.
     */
    public Builder setNotIn(
        int index, java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNotInIsMutable();
      notIn_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param value The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addNotIn(
        java.lang.String value) {
      if (value == null) { throw new NullPointerException(); }
      ensureNotInIsMutable();
      notIn_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param values The notIn to add.
     * @return This builder for chaining.
     */
    public Builder addAllNotIn(
        java.lang.Iterable<java.lang.String> values) {
      ensureNotInIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, notIn_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @return This builder for chaining.
     */
    public Builder clearNotIn() {
      notIn_ =
        com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);;
      onChanged();
      return this;
    }
    /**
     * <pre>
     * requires the field's type_url to be not equal to any of the specified values. If it matches any of the specified values, an error message is generated.
     *
     * ```proto
     * message MyAny {
     * // The field `value` must not have a `type_url` equal to any of the specified values.
     * google.protobuf.Any value = 1 [(buf.validate.field).any.not_in = ["type.googleapis.com/ForbiddenType1", "type.googleapis.com/ForbiddenType2"]];
     * }
     * ```
     * </pre>
     *
     * <code>repeated string not_in = 3 [json_name = "notIn"];</code>
     * @param value The bytes of the notIn to add.
     * @return This builder for chaining.
     */
    public Builder addNotInBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) { throw new NullPointerException(); }
      checkByteStringIsUtf8(value);
      ensureNotInIsMutable();
      notIn_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.AnyRules)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.AnyRules)
  private static final build.buf.validate.AnyRules DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.AnyRules();
  }

  public static build.buf.validate.AnyRules getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AnyRules>
      PARSER = new com.google.protobuf.AbstractParser<AnyRules>() {
    @java.lang.Override
    public AnyRules parsePartialFrom(
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

  public static com.google.protobuf.Parser<AnyRules> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AnyRules> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.AnyRules getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

