// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

public interface SFixed64RulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.SFixed64Rules)
    com.google.protobuf.GeneratedMessage.
        ExtendableMessageOrBuilder<SFixed64Rules> {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must equal 42
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional sfixed64 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must equal 42
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.const = 42];
   * }
   * ```
   * </pre>
   *
   * <code>optional sfixed64 const = 1 [json_name = "const", (.buf.validate.predefined) = { ... }</code>
   * @return The const.
   */
  long getConst();

  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field &lt;
   * value). If the field value is equal to or greater than the specified value,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be less than 10
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 lt = 2 [json_name = "lt", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field &lt;
   * value). If the field value is equal to or greater than the specified value,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be less than 10
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.lt = 10];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 lt = 2 [json_name = "lt", (.buf.validate.predefined) = { ... }</code>
   * @return The lt.
   */
  long getLt();

  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be less than or equal to 10
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 lte = 3 [json_name = "lte", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be less than or equal to 10
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.lte = 10];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 lte = 3 [json_name = "lte", (.buf.validate.predefined) = { ... }</code>
   * @return The lte.
   */
  long getLte();

  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be greater than 5 [sfixed64.gt]
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.gt = 5];
   *
   * // value must be greater than 5 and less than 10 [sfixed64.gt_lt]
   * sfixed64 other_value = 2 [(buf.validate.field).sfixed64 = { gt: 5, lt: 10 }];
   *
   * // value must be greater than 10 or less than 5 [sfixed64.gt_lt_exclusive]
   * sfixed64 another_value = 3 [(buf.validate.field).sfixed64 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 gt = 4 [json_name = "gt", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be greater than 5 [sfixed64.gt]
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.gt = 5];
   *
   * // value must be greater than 5 and less than 10 [sfixed64.gt_lt]
   * sfixed64 other_value = 2 [(buf.validate.field).sfixed64 = { gt: 5, lt: 10 }];
   *
   * // value must be greater than 10 or less than 5 [sfixed64.gt_lt_exclusive]
   * sfixed64 another_value = 3 [(buf.validate.field).sfixed64 = { gt: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 gt = 4 [json_name = "gt", (.buf.validate.predefined) = { ... }</code>
   * @return The gt.
   */
  long getGt();

  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified
   * value (exclusive). If the value of `gte` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be greater than or equal to 5 [sfixed64.gte]
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.gte = 5];
   *
   * // value must be greater than or equal to 5 and less than 10 [sfixed64.gte_lt]
   * sfixed64 other_value = 2 [(buf.validate.field).sfixed64 = { gte: 5, lt: 10 }];
   *
   * // value must be greater than or equal to 10 or less than 5 [sfixed64.gte_lt_exclusive]
   * sfixed64 another_value = 3 [(buf.validate.field).sfixed64 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 gte = 5 [json_name = "gte", (.buf.validate.predefined) = { ... }</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified
   * value (exclusive). If the value of `gte` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be greater than or equal to 5 [sfixed64.gte]
   * sfixed64 value = 1 [(buf.validate.field).sfixed64.gte = 5];
   *
   * // value must be greater than or equal to 5 and less than 10 [sfixed64.gte_lt]
   * sfixed64 other_value = 2 [(buf.validate.field).sfixed64 = { gte: 5, lt: 10 }];
   *
   * // value must be greater than or equal to 10 or less than 5 [sfixed64.gte_lt_exclusive]
   * sfixed64 another_value = 3 [(buf.validate.field).sfixed64 = { gte: 10, lt: 5 }];
   * }
   * ```
   * </pre>
   *
   * <code>sfixed64 gte = 5 [json_name = "gte", (.buf.validate.predefined) = { ... }</code>
   * @return The gte.
   */
  long getGte();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Long> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message is
   * generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 in = 6 [json_name = "in", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  long getIn(int index);

  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must not be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Long> getNotInList();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must not be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MySFixed64 {
   * // value must not be in list [1, 2, 3]
   * repeated sfixed64 value = 1 (buf.validate.field).sfixed64 = { not_in: [1, 2, 3] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 not_in = 7 [json_name = "notIn", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  long getNotIn(int index);

  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MySFixed64 {
   * sfixed64 value = 1 [
   * (buf.validate.field).sfixed64.example = 1,
   * (buf.validate.field).sfixed64.example = 2
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @return A list containing the example.
   */
  java.util.List<java.lang.Long> getExampleList();
  /**
   * <pre>
   * `example` specifies values that the field may have. These values SHOULD
   * conform to other constraints. `example` values will not impact validation
   * but may be used as helpful guidance on how to populate the given field.
   *
   * ```proto
   * message MySFixed64 {
   * sfixed64 value = 1 [
   * (buf.validate.field).sfixed64.example = 1,
   * (buf.validate.field).sfixed64.example = 2
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
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
   * message MySFixed64 {
   * sfixed64 value = 1 [
   * (buf.validate.field).sfixed64.example = 1,
   * (buf.validate.field).sfixed64.example = 2
   * ];
   * }
   * ```
   * </pre>
   *
   * <code>repeated sfixed64 example = 8 [json_name = "example", (.buf.validate.predefined) = { ... }</code>
   * @param index The index of the element to return.
   * @return The example at the given index.
   */
  long getExample(int index);

  build.buf.validate.SFixed64Rules.LessThanCase getLessThanCase();

  build.buf.validate.SFixed64Rules.GreaterThanCase getGreaterThanCase();
}
