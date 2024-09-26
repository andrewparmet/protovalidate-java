// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

public interface BytesRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.BytesRules)
    com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<BytesRules> {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified bytes
   * value. If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be "&#92;x01&#92;x02&#92;x03&#92;x04"
   * bytes value = 1 [(buf.validate.field).bytes.const = "&#92;x01&#92;x02&#92;x03&#92;x04"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified bytes
   * value. If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be "&#92;x01&#92;x02&#92;x03&#92;x04"
   * bytes value = 1 [(buf.validate.field).bytes.const = "&#92;x01&#92;x02&#92;x03&#92;x04"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return The const.
   */
  com.google.protobuf.ByteString getConst();

  /**
   * <pre>
   * `len` requires the field value to have the specified length in bytes.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value length must be 4 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.len = 4];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 len = 13 [json_name = "len", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the len field is set.
   */
  boolean hasLen();
  /**
   * <pre>
   * `len` requires the field value to have the specified length in bytes.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value length must be 4 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.len = 4];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 len = 13 [json_name = "len", (.buf.validate.predefined) = { ... }</code>
   * @return The len.
   */
  long getLen();

  /**
   * <pre>
   * `min_len` requires the field value to have at least the specified minimum
   * length in bytes.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value length must be at least 2 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.min_len = 2];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 min_len = 2 [json_name = "minLen", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the minLen field is set.
   */
  boolean hasMinLen();
  /**
   * <pre>
   * `min_len` requires the field value to have at least the specified minimum
   * length in bytes.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value length must be at least 2 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.min_len = 2];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 min_len = 2 [json_name = "minLen", (.buf.validate.predefined) = { ... }</code>
   * @return The minLen.
   */
  long getMinLen();

  /**
   * <pre>
   * `max_len` requires the field value to have at most the specified maximum
   * length in bytes.
   * If the field value exceeds the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be at most 6 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.max_len = 6];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 max_len = 3 [json_name = "maxLen", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the maxLen field is set.
   */
  boolean hasMaxLen();
  /**
   * <pre>
   * `max_len` requires the field value to have at most the specified maximum
   * length in bytes.
   * If the field value exceeds the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be at most 6 bytes.
   * optional bytes value = 1 [(buf.validate.field).bytes.max_len = 6];
   * }
   * ```
   * </pre>
   *
   * <code>optional uint64 max_len = 3 [json_name = "maxLen", (.buf.validate.predefined) = { ... }</code>
   * @return The maxLen.
   */
  long getMaxLen();

  /**
   * <pre>
   * `pattern` requires the field value to match the specified regular
   * expression ([RE2 syntax](https://github.com/google/re2/wiki/Syntax)).
   * The value of the field must be valid UTF-8 or validation will fail with a
   * runtime error.
   * If the field value doesn't match the pattern, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must match regex pattern "^[a-zA-Z0-9]+$".
   * optional bytes value = 1 [(buf.validate.field).bytes.pattern = "^[a-zA-Z0-9]+$"];
   * }
   * ```
   * </pre>
   *
   * <code>optional string pattern = 4 [json_name = "pattern", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the pattern field is set.
   */
  boolean hasPattern();
  /**
   * <pre>
   * `pattern` requires the field value to match the specified regular
   * expression ([RE2 syntax](https://github.com/google/re2/wiki/Syntax)).
   * The value of the field must be valid UTF-8 or validation will fail with a
   * runtime error.
   * If the field value doesn't match the pattern, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must match regex pattern "^[a-zA-Z0-9]+$".
   * optional bytes value = 1 [(buf.validate.field).bytes.pattern = "^[a-zA-Z0-9]+$"];
   * }
   * ```
   * </pre>
   *
   * <code>optional string pattern = 4 [json_name = "pattern", (.buf.validate.predefined) = { ... }</code>
   * @return The pattern.
   */
  java.lang.String getPattern();
  /**
   * <pre>
   * `pattern` requires the field value to match the specified regular
   * expression ([RE2 syntax](https://github.com/google/re2/wiki/Syntax)).
   * The value of the field must be valid UTF-8 or validation will fail with a
   * runtime error.
   * If the field value doesn't match the pattern, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must match regex pattern "^[a-zA-Z0-9]+$".
   * optional bytes value = 1 [(buf.validate.field).bytes.pattern = "^[a-zA-Z0-9]+$"];
   * }
   * ```
   * </pre>
   *
   * <code>optional string pattern = 4 [json_name = "pattern", (.buf.validate.predefined) = { ... }</code>
   * @return The bytes for pattern.
   */
  com.google.protobuf.ByteString
      getPatternBytes();

  /**
   * <pre>
   * `prefix` requires the field value to have the specified bytes at the
   * beginning of the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value does not have prefix &#92;x01&#92;x02
   * optional bytes value = 1 [(buf.validate.field).bytes.prefix = "&#92;x01&#92;x02"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes prefix = 5 [json_name = "prefix", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the prefix field is set.
   */
  boolean hasPrefix();
  /**
   * <pre>
   * `prefix` requires the field value to have the specified bytes at the
   * beginning of the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value does not have prefix &#92;x01&#92;x02
   * optional bytes value = 1 [(buf.validate.field).bytes.prefix = "&#92;x01&#92;x02"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes prefix = 5 [json_name = "prefix", (.buf.validate.predefined) = { ... }</code>
   * @return The prefix.
   */
  com.google.protobuf.ByteString getPrefix();

  /**
   * <pre>
   * `suffix` requires the field value to have the specified bytes at the end
   * of the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value does not have suffix &#92;x03&#92;x04
   * optional bytes value = 1 [(buf.validate.field).bytes.suffix = "&#92;x03&#92;x04"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes suffix = 6 [json_name = "suffix", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the suffix field is set.
   */
  boolean hasSuffix();
  /**
   * <pre>
   * `suffix` requires the field value to have the specified bytes at the end
   * of the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value does not have suffix &#92;x03&#92;x04
   * optional bytes value = 1 [(buf.validate.field).bytes.suffix = "&#92;x03&#92;x04"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes suffix = 6 [json_name = "suffix", (.buf.validate.predefined) = { ... }</code>
   * @return The suffix.
   */
  com.google.protobuf.ByteString getSuffix();

  /**
   * <pre>
   * `contains` requires the field value to have the specified bytes anywhere in
   * the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```protobuf
   * message MyBytes {
   * // value does not contain &#92;x02&#92;x03
   * optional bytes value = 1 [(buf.validate.field).bytes.contains = "&#92;x02&#92;x03"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes contains = 7 [json_name = "contains", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the contains field is set.
   */
  boolean hasContains();
  /**
   * <pre>
   * `contains` requires the field value to have the specified bytes anywhere in
   * the string.
   * If the field value doesn't meet the requirement, an error message is generated.
   *
   * ```protobuf
   * message MyBytes {
   * // value does not contain &#92;x02&#92;x03
   * optional bytes value = 1 [(buf.validate.field).bytes.contains = "&#92;x02&#92;x03"];
   * }
   * ```
   * </pre>
   *
   * <code>optional bytes contains = 7 [json_name = "contains", (.buf.validate.predefined) = { ... }</code>
   * @return The contains.
   */
  com.google.protobuf.ByteString getContains();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified
   * values. If the field value doesn't match any of the specified values, an
   * error message is generated.
   *
   * ```protobuf
   * message MyBytes {
   * // value must in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes in = 8 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<com.google.protobuf.ByteString> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified
   * values. If the field value doesn't match any of the specified values, an
   * error message is generated.
   *
   * ```protobuf
   * message MyBytes {
   * // value must in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes in = 8 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified
   * values. If the field value doesn't match any of the specified values, an
   * error message is generated.
   *
   * ```protobuf
   * message MyBytes {
   * // value must in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes in = 8 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  com.google.protobuf.ByteString getIn(int index);

  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the specified
   * values.
   * If the field value matches any of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyBytes {
   * // value must not in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.not_in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes not_in = 9 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<com.google.protobuf.ByteString> getNotInList();
  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the specified
   * values.
   * If the field value matches any of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyBytes {
   * // value must not in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.not_in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes not_in = 9 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the specified
   * values.
   * If the field value matches any of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MyBytes {
   * // value must not in ["&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"]
   * optional bytes value = 1 [(buf.validate.field).bytes.not_in = {"&#92;x01&#92;x02", "&#92;x02&#92;x03", "&#92;x03&#92;x04"}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes not_in = 9 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  com.google.protobuf.ByteString getNotIn(int index);

  /**
   * <pre>
   * `ip` ensures that the field `value` is a valid IP address (v4 or v6) in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be a valid IP address
   * optional bytes value = 1 [(buf.validate.field).bytes.ip = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ip = 10 [json_name = "ip", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the ip field is set.
   */
  boolean hasIp();
  /**
   * <pre>
   * `ip` ensures that the field `value` is a valid IP address (v4 or v6) in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be a valid IP address
   * optional bytes value = 1 [(buf.validate.field).bytes.ip = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ip = 10 [json_name = "ip", (.buf.validate.predefined) = { ... }</code>
   * @return The ip.
   */
  boolean getIp();

  /**
   * <pre>
   * `ipv4` ensures that the field `value` is a valid IPv4 address in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be a valid IPv4 address
   * optional bytes value = 1 [(buf.validate.field).bytes.ipv4 = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ipv4 = 11 [json_name = "ipv4", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the ipv4 field is set.
   */
  boolean hasIpv4();
  /**
   * <pre>
   * `ipv4` ensures that the field `value` is a valid IPv4 address in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   *
   * ```proto
   * message MyBytes {
   * // value must be a valid IPv4 address
   * optional bytes value = 1 [(buf.validate.field).bytes.ipv4 = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ipv4 = 11 [json_name = "ipv4", (.buf.validate.predefined) = { ... }</code>
   * @return The ipv4.
   */
  boolean getIpv4();

  /**
   * <pre>
   * `ipv6` ensures that the field `value` is a valid IPv6 address in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   * ```proto
   * message MyBytes {
   * // value must be a valid IPv6 address
   * optional bytes value = 1 [(buf.validate.field).bytes.ipv6 = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ipv6 = 12 [json_name = "ipv6", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the ipv6 field is set.
   */
  boolean hasIpv6();
  /**
   * <pre>
   * `ipv6` ensures that the field `value` is a valid IPv6 address in byte format.
   * If the field value doesn't meet this constraint, an error message is generated.
   * ```proto
   * message MyBytes {
   * // value must be a valid IPv6 address
   * optional bytes value = 1 [(buf.validate.field).bytes.ipv6 = true];
   * }
   * ```
   * </pre>
   *
   * <code>bool ipv6 = 12 [json_name = "ipv6", (.buf.validate.predefined) = { ... }</code>
   * @return The ipv6.
   */
  boolean getIpv6();

  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyBytes {
   * bytes value = 1 [
   * (buf.validate.field).bytes.example = "&#92;x01&#92;x02",
   * (buf.validate.field).bytes.example = "&#92;x02&#92;x03"
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes example = 14 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the example.
   */
  java.util.List<com.google.protobuf.ByteString> getExampleList();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyBytes {
   * bytes value = 1 [
   * (buf.validate.field).bytes.example = "&#92;x01&#92;x02",
   * (buf.validate.field).bytes.example = "&#92;x02&#92;x03"
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes example = 14 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return The count of example.
   */
  int getExampleCount();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MyBytes {
   * bytes value = 1 [
   * (buf.validate.field).bytes.example = "&#92;x01&#92;x02",
   * (buf.validate.field).bytes.example = "&#92;x02&#92;x03"
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated bytes example = 14 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The example at the given index.
   */
  com.google.protobuf.ByteString getExample(int index);

  build.buf.validate.BytesRules.WellKnownCase getWellKnownCase();
}
