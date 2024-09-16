// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/repeated.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.conformance.cases;

/**
 * Protobuf enum {@code buf.validate.conformance.cases.AnEnum}
 */
public enum AnEnum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>AN_ENUM_UNSPECIFIED = 0;</code>
   */
  AN_ENUM_UNSPECIFIED(0),
  /**
   * <code>AN_ENUM_X = 1;</code>
   */
  AN_ENUM_X(1),
  /**
   * <code>AN_ENUM_Y = 2;</code>
   */
  AN_ENUM_Y(2),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      AnEnum.class.getName());
  }
  /**
   * <code>AN_ENUM_UNSPECIFIED = 0;</code>
   */
  public static final int AN_ENUM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>AN_ENUM_X = 1;</code>
   */
  public static final int AN_ENUM_X_VALUE = 1;
  /**
   * <code>AN_ENUM_Y = 2;</code>
   */
  public static final int AN_ENUM_Y_VALUE = 2;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static AnEnum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static AnEnum forNumber(int value) {
    switch (value) {
      case 0: return AN_ENUM_UNSPECIFIED;
      case 1: return AN_ENUM_X;
      case 2: return AN_ENUM_Y;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<AnEnum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      AnEnum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<AnEnum>() {
          public AnEnum findValueByNumber(int number) {
            return AnEnum.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return build.buf.validate.conformance.cases.RepeatedProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final AnEnum[] VALUES = values();

  public static AnEnum valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private AnEnum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:buf.validate.conformance.cases.AnEnum)
}

