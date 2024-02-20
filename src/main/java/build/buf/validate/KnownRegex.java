// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/validate.proto

// Protobuf Java Version: 3.25.3
package build.buf.validate;

/**
 * <pre>
 * WellKnownRegex contain some well-known patterns.
 * </pre>
 *
 * Protobuf enum {@code buf.validate.KnownRegex}
 */
public enum KnownRegex
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>KNOWN_REGEX_UNSPECIFIED = 0;</code>
   */
  KNOWN_REGEX_UNSPECIFIED(0),
  /**
   * <pre>
   * HTTP header name as defined by [RFC 7230](https://tools.ietf.org/html/rfc7230#section-3.2).
   * </pre>
   *
   * <code>KNOWN_REGEX_HTTP_HEADER_NAME = 1;</code>
   */
  KNOWN_REGEX_HTTP_HEADER_NAME(1),
  /**
   * <pre>
   * HTTP header value as defined by [RFC 7230](https://tools.ietf.org/html/rfc7230#section-3.2.4).
   * </pre>
   *
   * <code>KNOWN_REGEX_HTTP_HEADER_VALUE = 2;</code>
   */
  KNOWN_REGEX_HTTP_HEADER_VALUE(2),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>KNOWN_REGEX_UNSPECIFIED = 0;</code>
   */
  public static final int KNOWN_REGEX_UNSPECIFIED_VALUE = 0;
  /**
   * <pre>
   * HTTP header name as defined by [RFC 7230](https://tools.ietf.org/html/rfc7230#section-3.2).
   * </pre>
   *
   * <code>KNOWN_REGEX_HTTP_HEADER_NAME = 1;</code>
   */
  public static final int KNOWN_REGEX_HTTP_HEADER_NAME_VALUE = 1;
  /**
   * <pre>
   * HTTP header value as defined by [RFC 7230](https://tools.ietf.org/html/rfc7230#section-3.2.4).
   * </pre>
   *
   * <code>KNOWN_REGEX_HTTP_HEADER_VALUE = 2;</code>
   */
  public static final int KNOWN_REGEX_HTTP_HEADER_VALUE_VALUE = 2;


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
  public static KnownRegex valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static KnownRegex forNumber(int value) {
    switch (value) {
      case 0: return KNOWN_REGEX_UNSPECIFIED;
      case 1: return KNOWN_REGEX_HTTP_HEADER_NAME;
      case 2: return KNOWN_REGEX_HTTP_HEADER_VALUE;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<KnownRegex>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      KnownRegex> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<KnownRegex>() {
          public KnownRegex findValueByNumber(int number) {
            return KnownRegex.forNumber(number);
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
    return build.buf.validate.ValidateProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final KnownRegex[] VALUES = values();

  public static KnownRegex valueOf(
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

  private KnownRegex(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:buf.validate.KnownRegex)
}

