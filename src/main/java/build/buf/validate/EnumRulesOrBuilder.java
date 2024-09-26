// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

public interface EnumRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.EnumRules)
    com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<EnumRules> {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified enum value.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be exactly MY_ENUM_VALUE1.
   * MyEnum value = 1 [(buf.validate.field).enum.const = 1];
   * }
   * ```
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified enum value.
   * If the field value doesn't match, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be exactly MY_ENUM_VALUE1.
   * MyEnum value = 1 [(buf.validate.field).enum.const = 1];
   * }
   * ```
   * </pre>
   *
   * <code>optional int32 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return The const.
   */
  int getConst();

  /**
   * <pre>
   * `defined_only` requires the field value to be one of the defined values for
   * this enum, failing on any undefined value.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be a defined value of MyEnum.
   * MyEnum value = 1 [(buf.validate.field).enum.defined_only = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return Whether the definedOnly field is set.
   */
  boolean hasDefinedOnly();
  /**
   * <pre>
   * `defined_only` requires the field value to be one of the defined values for
   * this enum, failing on any undefined value.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be a defined value of MyEnum.
   * MyEnum value = 1 [(buf.validate.field).enum.defined_only = true];
   * }
   * ```
   * </pre>
   *
   * <code>optional bool defined_only = 2 [json_name = "definedOnly"];</code>
   * @return The definedOnly.
   */
  boolean getDefinedOnly();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the
   * specified enum values. If the field value doesn't match any of the
   * specified values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be equal to one of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Integer> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the
   * specified enum values. If the field value doesn't match any of the
   * specified values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be equal to one of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the
   * specified enum values. If the field value doesn't match any of the
   * specified values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must be equal to one of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 in = 3 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  int getIn(int index);

  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the
   * specified enum values. If the field value matches one of the specified
   * values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must not be equal to any of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { not_in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Integer> getNotInList();
  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the
   * specified enum values. If the field value matches one of the specified
   * values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must not be equal to any of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { not_in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` requires the field value to be not equal to any of the
   * specified enum values. If the field value matches one of the specified
   * values, an error message is generated.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * // The field `value` must not be equal to any of the specified values.
   * MyEnum value = 1 [(buf.validate.field).enum = { not_in: [1, 2]}];
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 not_in = 4 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  int getNotIn(int index);

  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * (buf.validate.field).enum.example = 1,
   * (buf.validate.field).enum.example = 2
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 5 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the example.
   */
  java.util.List<java.lang.Integer> getExampleList();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * (buf.validate.field).enum.example = 1,
   * (buf.validate.field).enum.example = 2
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 5 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
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
   * enum MyEnum {
   * MY_ENUM_UNSPECIFIED = 0;
   * MY_ENUM_VALUE1 = 1;
   * MY_ENUM_VALUE2 = 2;
   * }
   *
   * message MyMessage {
   * (buf.validate.field).enum.example = 1,
   * (buf.validate.field).enum.example = 2
   * }
   * ```
   * </pre>
   *
   * <code>repeated int32 example = 5 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The example at the given index.
   */
  int getExample(int index);
}
