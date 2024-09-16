// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/maps.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.conformance.cases;

/**
 * Protobuf type {@code buf.validate.conformance.cases.MultipleMaps}
 */
public final class MultipleMaps extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:buf.validate.conformance.cases.MultipleMaps)
    MultipleMapsOrBuilder {
private static final long serialVersionUID = 0L;
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      MultipleMaps.class.getName());
  }
  // Use MultipleMaps.newBuilder() to construct.
  private MultipleMaps(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private MultipleMaps() {
  }

  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetFirst();
      case 2:
        return internalGetSecond();
      case 3:
        return internalGetThird();
      default:
        throw new RuntimeException(
            "Invalid map field number: " + number);
    }
  }
  @java.lang.Override
  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            build.buf.validate.conformance.cases.MultipleMaps.class, build.buf.validate.conformance.cases.MultipleMaps.Builder.class);
  }

  public static final int FIRST_FIELD_NUMBER = 1;
  private static final class FirstDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.String> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.String>newDefaultInstance(
                build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_FirstEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.UINT32,
                0,
                com.google.protobuf.WireFormat.FieldType.STRING,
                "");
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.String> first_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
  internalGetFirst() {
    if (first_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          FirstDefaultEntryHolder.defaultEntry);
    }
    return first_;
  }
  public int getFirstCount() {
    return internalGetFirst().getMap().size();
  }
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean containsFirst(
      int key) {

    return internalGetFirst().getMap().containsKey(key);
  }
  /**
   * Use {@link #getFirstMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.String> getFirst() {
    return getFirstMap();
  }
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.String> getFirstMap() {
    return internalGetFirst().getMap();
  }
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public /* nullable */
java.lang.String getFirstOrDefault(
      int key,
      /* nullable */
java.lang.String defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.String> map =
        internalGetFirst().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.lang.String getFirstOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.String> map =
        internalGetFirst().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int SECOND_FIELD_NUMBER = 2;
  private static final class SecondDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Boolean> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Boolean>newDefaultInstance(
                build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_SecondEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.BOOL,
                false);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Boolean> second_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
  internalGetSecond() {
    if (second_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          SecondDefaultEntryHolder.defaultEntry);
    }
    return second_;
  }
  public int getSecondCount() {
    return internalGetSecond().getMap().size();
  }
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean containsSecond(
      int key) {

    return internalGetSecond().getMap().containsKey(key);
  }
  /**
   * Use {@link #getSecondMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Boolean> getSecond() {
    return getSecondMap();
  }
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Boolean> getSecondMap() {
    return internalGetSecond().getMap();
  }
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean getSecondOrDefault(
      int key,
      boolean defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Boolean> map =
        internalGetSecond().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean getSecondOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.Boolean> map =
        internalGetSecond().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int THIRD_FIELD_NUMBER = 3;
  private static final class ThirdDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<
        java.lang.Integer, java.lang.Boolean> defaultEntry =
            com.google.protobuf.MapEntry
            .<java.lang.Integer, java.lang.Boolean>newDefaultInstance(
                build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_ThirdEntry_descriptor, 
                com.google.protobuf.WireFormat.FieldType.INT32,
                0,
                com.google.protobuf.WireFormat.FieldType.BOOL,
                false);
  }
  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<
      java.lang.Integer, java.lang.Boolean> third_;
  private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
  internalGetThird() {
    if (third_ == null) {
      return com.google.protobuf.MapField.emptyMapField(
          ThirdDefaultEntryHolder.defaultEntry);
    }
    return third_;
  }
  public int getThirdCount() {
    return internalGetThird().getMap().size();
  }
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean containsThird(
      int key) {

    return internalGetThird().getMap().containsKey(key);
  }
  /**
   * Use {@link #getThirdMap()} instead.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.Integer, java.lang.Boolean> getThird() {
    return getThirdMap();
  }
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.Integer, java.lang.Boolean> getThirdMap() {
    return internalGetThird().getMap();
  }
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean getThirdOrDefault(
      int key,
      boolean defaultValue) {

    java.util.Map<java.lang.Integer, java.lang.Boolean> map =
        internalGetThird().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
   */
  @java.lang.Override
  public boolean getThirdOrThrow(
      int key) {

    java.util.Map<java.lang.Integer, java.lang.Boolean> map =
        internalGetThird().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
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
    com.google.protobuf.GeneratedMessage
      .serializeIntegerMapTo(
        output,
        internalGetFirst(),
        FirstDefaultEntryHolder.defaultEntry,
        1);
    com.google.protobuf.GeneratedMessage
      .serializeIntegerMapTo(
        output,
        internalGetSecond(),
        SecondDefaultEntryHolder.defaultEntry,
        2);
    com.google.protobuf.GeneratedMessage
      .serializeIntegerMapTo(
        output,
        internalGetThird(),
        ThirdDefaultEntryHolder.defaultEntry,
        3);
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.Integer, java.lang.String> entry
         : internalGetFirst().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
      first__ = FirstDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, first__);
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Boolean> entry
         : internalGetSecond().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Boolean>
      second__ = SecondDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, second__);
    }
    for (java.util.Map.Entry<java.lang.Integer, java.lang.Boolean> entry
         : internalGetThird().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Boolean>
      third__ = ThirdDefaultEntryHolder.defaultEntry.newBuilderForType()
          .setKey(entry.getKey())
          .setValue(entry.getValue())
          .build();
      size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(3, third__);
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
    if (!(obj instanceof build.buf.validate.conformance.cases.MultipleMaps)) {
      return super.equals(obj);
    }
    build.buf.validate.conformance.cases.MultipleMaps other = (build.buf.validate.conformance.cases.MultipleMaps) obj;

    if (!internalGetFirst().equals(
        other.internalGetFirst())) return false;
    if (!internalGetSecond().equals(
        other.internalGetSecond())) return false;
    if (!internalGetThird().equals(
        other.internalGetThird())) return false;
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
    if (!internalGetFirst().getMap().isEmpty()) {
      hash = (37 * hash) + FIRST_FIELD_NUMBER;
      hash = (53 * hash) + internalGetFirst().hashCode();
    }
    if (!internalGetSecond().getMap().isEmpty()) {
      hash = (37 * hash) + SECOND_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSecond().hashCode();
    }
    if (!internalGetThird().getMap().isEmpty()) {
      hash = (37 * hash) + THIRD_FIELD_NUMBER;
      hash = (53 * hash) + internalGetThird().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public static build.buf.validate.conformance.cases.MultipleMaps parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input);
  }

  public static build.buf.validate.conformance.cases.MultipleMaps parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessage
        .parseWithIOException(PARSER, input);
  }
  public static build.buf.validate.conformance.cases.MultipleMaps parseFrom(
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
  public static Builder newBuilder(build.buf.validate.conformance.cases.MultipleMaps prototype) {
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
   * Protobuf type {@code buf.validate.conformance.cases.MultipleMaps}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:buf.validate.conformance.cases.MultipleMaps)
      build.buf.validate.conformance.cases.MultipleMapsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetFirst();
        case 2:
          return internalGetSecond();
        case 3:
          return internalGetThird();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableFirst();
        case 2:
          return internalGetMutableSecond();
        case 3:
          return internalGetMutableThird();
        default:
          throw new RuntimeException(
              "Invalid map field number: " + number);
      }
    }
    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              build.buf.validate.conformance.cases.MultipleMaps.class, build.buf.validate.conformance.cases.MultipleMaps.Builder.class);
    }

    // Construct using build.buf.validate.conformance.cases.MultipleMaps.newBuilder()
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
      internalGetMutableFirst().clear();
      internalGetMutableSecond().clear();
      internalGetMutableThird().clear();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return build.buf.validate.conformance.cases.MapsProto.internal_static_buf_validate_conformance_cases_MultipleMaps_descriptor;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.MultipleMaps getDefaultInstanceForType() {
      return build.buf.validate.conformance.cases.MultipleMaps.getDefaultInstance();
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.MultipleMaps build() {
      build.buf.validate.conformance.cases.MultipleMaps result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public build.buf.validate.conformance.cases.MultipleMaps buildPartial() {
      build.buf.validate.conformance.cases.MultipleMaps result = new build.buf.validate.conformance.cases.MultipleMaps(this);
      if (bitField0_ != 0) { buildPartial0(result); }
      onBuilt();
      return result;
    }

    private void buildPartial0(build.buf.validate.conformance.cases.MultipleMaps result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.first_ = internalGetFirst();
        result.first_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.second_ = internalGetSecond();
        result.second_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.third_ = internalGetThird();
        result.third_.makeImmutable();
      }
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof build.buf.validate.conformance.cases.MultipleMaps) {
        return mergeFrom((build.buf.validate.conformance.cases.MultipleMaps)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(build.buf.validate.conformance.cases.MultipleMaps other) {
      if (other == build.buf.validate.conformance.cases.MultipleMaps.getDefaultInstance()) return this;
      internalGetMutableFirst().mergeFrom(
          other.internalGetFirst());
      bitField0_ |= 0x00000001;
      internalGetMutableSecond().mergeFrom(
          other.internalGetSecond());
      bitField0_ |= 0x00000002;
      internalGetMutableThird().mergeFrom(
          other.internalGetThird());
      bitField0_ |= 0x00000004;
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
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.String>
              first__ = input.readMessage(
                  FirstDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableFirst().getMutableMap().put(
                  first__.getKey(), first__.getValue());
              bitField0_ |= 0x00000001;
              break;
            } // case 10
            case 18: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Boolean>
              second__ = input.readMessage(
                  SecondDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableSecond().getMutableMap().put(
                  second__.getKey(), second__.getValue());
              bitField0_ |= 0x00000002;
              break;
            } // case 18
            case 26: {
              com.google.protobuf.MapEntry<java.lang.Integer, java.lang.Boolean>
              third__ = input.readMessage(
                  ThirdDefaultEntryHolder.defaultEntry.getParserForType(), extensionRegistry);
              internalGetMutableThird().getMutableMap().put(
                  third__.getKey(), third__.getValue());
              bitField0_ |= 0x00000004;
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

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.String> first_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
        internalGetFirst() {
      if (first_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            FirstDefaultEntryHolder.defaultEntry);
      }
      return first_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.String>
        internalGetMutableFirst() {
      if (first_ == null) {
        first_ = com.google.protobuf.MapField.newMapField(
            FirstDefaultEntryHolder.defaultEntry);
      }
      if (!first_.isMutable()) {
        first_ = first_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return first_;
    }
    public int getFirstCount() {
      return internalGetFirst().getMap().size();
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean containsFirst(
        int key) {

      return internalGetFirst().getMap().containsKey(key);
    }
    /**
     * Use {@link #getFirstMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String> getFirst() {
      return getFirstMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.String> getFirstMap() {
      return internalGetFirst().getMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public /* nullable */
java.lang.String getFirstOrDefault(
        int key,
        /* nullable */
java.lang.String defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetFirst().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public java.lang.String getFirstOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.String> map =
          internalGetFirst().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearFirst() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableFirst().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeFirst(
        int key) {

      internalGetMutableFirst().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.String>
        getMutableFirst() {
      bitField0_ |= 0x00000001;
      return internalGetMutableFirst().getMutableMap();
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    public Builder putFirst(
        int key,
        java.lang.String value) {

      if (value == null) { throw new NullPointerException("map value"); }
      internalGetMutableFirst().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     * <code>map&lt;uint32, string&gt; first = 1 [json_name = "first", (.buf.validate.field) = { ... }</code>
     */
    public Builder putAllFirst(
        java.util.Map<java.lang.Integer, java.lang.String> values) {
      internalGetMutableFirst().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Boolean> second_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
        internalGetSecond() {
      if (second_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            SecondDefaultEntryHolder.defaultEntry);
      }
      return second_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
        internalGetMutableSecond() {
      if (second_ == null) {
        second_ = com.google.protobuf.MapField.newMapField(
            SecondDefaultEntryHolder.defaultEntry);
      }
      if (!second_.isMutable()) {
        second_ = second_.copy();
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return second_;
    }
    public int getSecondCount() {
      return internalGetSecond().getMap().size();
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean containsSecond(
        int key) {

      return internalGetSecond().getMap().containsKey(key);
    }
    /**
     * Use {@link #getSecondMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getSecond() {
      return getSecondMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getSecondMap() {
      return internalGetSecond().getMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean getSecondOrDefault(
        int key,
        boolean defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Boolean> map =
          internalGetSecond().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean getSecondOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Boolean> map =
          internalGetSecond().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearSecond() {
      bitField0_ = (bitField0_ & ~0x00000002);
      internalGetMutableSecond().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeSecond(
        int key) {

      internalGetMutableSecond().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Boolean>
        getMutableSecond() {
      bitField0_ |= 0x00000002;
      return internalGetMutableSecond().getMutableMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    public Builder putSecond(
        int key,
        boolean value) {


      internalGetMutableSecond().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000002;
      return this;
    }
    /**
     * <code>map&lt;int32, bool&gt; second = 2 [json_name = "second", (.buf.validate.field) = { ... }</code>
     */
    public Builder putAllSecond(
        java.util.Map<java.lang.Integer, java.lang.Boolean> values) {
      internalGetMutableSecond().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000002;
      return this;
    }

    private com.google.protobuf.MapField<
        java.lang.Integer, java.lang.Boolean> third_;
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
        internalGetThird() {
      if (third_ == null) {
        return com.google.protobuf.MapField.emptyMapField(
            ThirdDefaultEntryHolder.defaultEntry);
      }
      return third_;
    }
    private com.google.protobuf.MapField<java.lang.Integer, java.lang.Boolean>
        internalGetMutableThird() {
      if (third_ == null) {
        third_ = com.google.protobuf.MapField.newMapField(
            ThirdDefaultEntryHolder.defaultEntry);
      }
      if (!third_.isMutable()) {
        third_ = third_.copy();
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return third_;
    }
    public int getThirdCount() {
      return internalGetThird().getMap().size();
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean containsThird(
        int key) {

      return internalGetThird().getMap().containsKey(key);
    }
    /**
     * Use {@link #getThirdMap()} instead.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getThird() {
      return getThirdMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.Integer, java.lang.Boolean> getThirdMap() {
      return internalGetThird().getMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean getThirdOrDefault(
        int key,
        boolean defaultValue) {

      java.util.Map<java.lang.Integer, java.lang.Boolean> map =
          internalGetThird().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    @java.lang.Override
    public boolean getThirdOrThrow(
        int key) {

      java.util.Map<java.lang.Integer, java.lang.Boolean> map =
          internalGetThird().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }
    public Builder clearThird() {
      bitField0_ = (bitField0_ & ~0x00000004);
      internalGetMutableThird().getMutableMap()
          .clear();
      return this;
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    public Builder removeThird(
        int key) {

      internalGetMutableThird().getMutableMap()
          .remove(key);
      return this;
    }
    /**
     * Use alternate mutation accessors instead.
     */
    @java.lang.Deprecated
    public java.util.Map<java.lang.Integer, java.lang.Boolean>
        getMutableThird() {
      bitField0_ |= 0x00000004;
      return internalGetMutableThird().getMutableMap();
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    public Builder putThird(
        int key,
        boolean value) {


      internalGetMutableThird().getMutableMap()
          .put(key, value);
      bitField0_ |= 0x00000004;
      return this;
    }
    /**
     * <code>map&lt;int32, bool&gt; third = 3 [json_name = "third", (.buf.validate.field) = { ... }</code>
     */
    public Builder putAllThird(
        java.util.Map<java.lang.Integer, java.lang.Boolean> values) {
      internalGetMutableThird().getMutableMap()
          .putAll(values);
      bitField0_ |= 0x00000004;
      return this;
    }

    // @@protoc_insertion_point(builder_scope:buf.validate.conformance.cases.MultipleMaps)
  }

  // @@protoc_insertion_point(class_scope:buf.validate.conformance.cases.MultipleMaps)
  private static final build.buf.validate.conformance.cases.MultipleMaps DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new build.buf.validate.conformance.cases.MultipleMaps();
  }

  public static build.buf.validate.conformance.cases.MultipleMaps getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultipleMaps>
      PARSER = new com.google.protobuf.AbstractParser<MultipleMaps>() {
    @java.lang.Override
    public MultipleMaps parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultipleMaps> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultipleMaps> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public build.buf.validate.conformance.cases.MultipleMaps getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

