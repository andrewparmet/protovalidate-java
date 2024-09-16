// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/priv/private.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.priv;

/**
 * <pre>
 * Do not use. Internal to protovalidate library
 * </pre>
 *
 * Protobuf type {@code buf.validate.priv.FieldConstraints}
 */
public final class FieldConstraints extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.priv.FieldConstraints)
    FieldConstraintsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      FieldConstraints.class.getName());
  }
  // Use FieldConstraints.newBuilder() to construct.
  private FieldConstraints(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private FieldConstraints() {
    cel_ = java.util.Collections.emptyList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.priv.FieldConstraints.class, build.buf.validate.priv.FieldConstraints.Builder.class);
  }

  public static final int CEL_FIELD_NUMBER = 1;
  @SuppressWarnings("serial")
  private java.util.List<build.buf.validate.priv.Constraint> cel_;
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<build.buf.validate.priv.Constraint> getCelList() {
    return cel_;
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public java.util.List<? extends build.buf.validate.priv.ConstraintOrBuilder> 
      getCelOrBuilderList() {
    return cel_;
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public int getCelCount() {
    return cel_.size();
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public build.buf.validate.priv.Constraint getCel(int index) {
    return cel_.get(index);
  }
  /**
   * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
   */
  @java.lang.Override
  public build.buf.validate.priv.ConstraintOrBuilder getCelOrBuilder(
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
    if (!(obj instanceof build.buf.validate.priv.FieldConstraints)) {
      return super.equals(obj);
    }
    build.buf.validate.priv.FieldConstraints other = (build.buf.validate.priv.FieldConstraints) obj;

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

  public static build.buf.validate.priv.FieldConstraints parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.priv.FieldConstraints parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.priv.FieldConstraints parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.priv.FieldConstraints parseFrom(
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
  public static Builder newBuilder(build.buf.validate.priv.FieldConstraints prototype) {
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
   * Do not use. Internal to protovalidate library
   * </pre>
   *
   * Protobuf type {@code buf.validate.priv.FieldConstraints}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.priv.FieldConstraints)
      build.buf.validate.priv.FieldConstraintsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.priv.FieldConstraints.class, build.buf.validate.priv.FieldConstraints.Builder.class);
    }

    // Construct using build.buf.validate.priv.FieldConstraints.newBuilder()
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
      return build.buf.validate.priv.PrivateProto.internal_static_buf_validate_priv_FieldConstraints_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.priv.FieldConstraints getDefaultInstanceForType() {
      return build.buf.validate.priv.FieldConstraints.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.priv.FieldConstraints build() {
      build.buf.validate.priv.FieldConstraints result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.priv.FieldConstraints buildPartial() {
      build.buf.validate.priv.FieldConstraints result = new build.buf.validate.priv.FieldConstraints(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(build.buf.validate.priv.FieldConstraints result) {
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

    private void buildPartial0(build.buf.validate.priv.FieldConstraints result) {
      int from_bitField0_ = bitField0_;
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.priv.FieldConstraints) {
        return mergeFrom((build.buf.validate.priv.FieldConstraints)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.priv.FieldConstraints other) {
      if (other == build.buf.validate.priv.FieldConstraints.getDefaultInstance()) return this;
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
              build.buf.validate.priv.Constraint m =
                  input.readMessage(
                      build.buf.validate.priv.Constraint.parser(),
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

    private java.util.List<build.buf.validate.priv.Constraint> cel_ =
      java.util.Collections.emptyList();
    private void ensureCelIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        cel_ = new java.util.ArrayList<build.buf.validate.priv.Constraint>(cel_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.priv.Constraint, build.buf.validate.priv.Constraint.Builder, build.buf.validate.priv.ConstraintOrBuilder> celBuilder_;

    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<build.buf.validate.priv.Constraint> getCelList() {
      if (celBuilder_ == null) {
        return java.util.Collections.unmodifiableList(cel_);
      } else {
        return celBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public int getCelCount() {
      if (celBuilder_ == null) {
        return cel_.size();
      } else {
        return celBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.priv.Constraint getCel(int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);
      } else {
        return celBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, build.buf.validate.priv.Constraint value) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder setCel(
        int index, build.buf.validate.priv.Constraint.Builder builderForValue) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(build.buf.validate.priv.Constraint value) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, build.buf.validate.priv.Constraint value) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        build.buf.validate.priv.Constraint.Builder builderForValue) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addCel(
        int index, build.buf.validate.priv.Constraint.Builder builderForValue) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public Builder addAllCel(
        java.lang.Iterable<? extends build.buf.validate.priv.Constraint> values) {
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
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
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.priv.Constraint.Builder getCelBuilder(
        int index) {
      return getCelFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.priv.ConstraintOrBuilder getCelOrBuilder(
        int index) {
      if (celBuilder_ == null) {
        return cel_.get(index);  } else {
        return celBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<? extends build.buf.validate.priv.ConstraintOrBuilder> 
         getCelOrBuilderList() {
      if (celBuilder_ != null) {
        return celBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(cel_);
      }
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.priv.Constraint.Builder addCelBuilder() {
      return getCelFieldBuilder().addBuilder(
          build.buf.validate.priv.Constraint.getDefaultInstance());
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public build.buf.validate.priv.Constraint.Builder addCelBuilder(
        int index) {
      return getCelFieldBuilder().addBuilder(
          index, build.buf.validate.priv.Constraint.getDefaultInstance());
    }
    /**
     * <code>repeated .buf.validate.priv.Constraint cel = 1 [json_name = "cel"];</code>
     */
    public java.util.List<build.buf.validate.priv.Constraint.Builder> 
         getCelBuilderList() {
      return getCelFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilder<
        build.buf.validate.priv.Constraint, build.buf.validate.priv.Constraint.Builder, build.buf.validate.priv.ConstraintOrBuilder> 
        getCelFieldBuilder() {
      if (celBuilder_ == null) {
        celBuilder_ = new com.google.protobuf.RepeatedFieldBuilder<
            build.buf.validate.priv.Constraint, build.buf.validate.priv.Constraint.Builder, build.buf.validate.priv.ConstraintOrBuilder>(
                cel_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        cel_ = null;
      }
      return celBuilder_;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.priv.FieldConstraints)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.priv.FieldConstraints)
  private static final build.buf.validate.priv.FieldConstraints DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.priv.FieldConstraints();
  }

  public static build.buf.validate.priv.FieldConstraints getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FieldConstraints>
      PARSER = new com.google.protobuf.AbstractParser<FieldConstraints>() {
    @java.lang.Override
    public FieldConstraints parsePartialFrom(
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

  public static com.google.protobuf.Parser<FieldConstraints> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FieldConstraints> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.priv.FieldConstraints getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

