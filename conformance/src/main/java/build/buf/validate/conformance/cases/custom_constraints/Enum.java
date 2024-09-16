// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.conformance.cases.custom_constraints;

/**
 * Protobuf enum {@code buf.validate.conformance.cases.custom_constraints.Enum}
 */
public enum Enum
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>ENUM_UNSPECIFIED = 0;</code>
   */
  ENUM_UNSPECIFIED(0),
  /**
   * <code>ENUM_ONE = 1;</code>
   */
  ENUM_ONE(1),
  UNRECOGNIZED(-1),
  ;

  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      Enum.class.getName());
  }
  /**
   * <code>ENUM_UNSPECIFIED = 0;</code>
   */
  public static final int ENUM_UNSPECIFIED_VALUE = 0;
  /**
   * <code>ENUM_ONE = 1;</code>
   */
  public static final int ENUM_ONE_VALUE = 1;


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
  public static Enum valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static Enum forNumber(int value) {
    switch (value) {
      case 0: return ENUM_UNSPECIFIED;
      case 1: return ENUM_ONE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<Enum>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      Enum> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Enum>() {
          public Enum findValueByNumber(int number) {
            return Enum.forNumber(number);
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
    return build.buf.validate.conformance.cases.custom_constraints.CustomConstraintsProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final Enum[] VALUES = values();

  public static Enum valueOf(
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

  private Enum(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:buf.validate.conformance.cases.custom_constraints.Enum)
}

