// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.27.4

package build.buf.validate;

public interface FloatRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.FloatRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must equal 42.0
   * float value = 1 [(buf.validate.field).float.const = 42.0];
   * }
   * ```
   * </pre>
   *
   * <code>optional float const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` requires the field value to exactly match the specified value. If
   * the field value doesn't match, an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must equal 42.0
   * float value = 1 [(buf.validate.field).float.const = 42.0];
   * }
   * ```
   * </pre>
   *
   * <code>optional float const = 1 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  float getConst();

  /**
   * <pre>
   * `lt` requires the field value to be less than the specified value (field &lt;
   * value). If the field value is equal to or greater than the specified value,
   * an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be less than 10.0
   * float value = 1 [(buf.validate.field).float.lt = 10.0];
   * }
   * ```
   * </pre>
   *
   * <code>float lt = 2 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
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
   * message MyFloat {
   * // value must be less than 10.0
   * float value = 1 [(buf.validate.field).float.lt = 10.0];
   * }
   * ```
   * </pre>
   *
   * <code>float lt = 2 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return The lt.
   */
  float getLt();

  /**
   * <pre>
   * `lte` requires the field value to be less than or equal to the specified
   * value (field &lt;= value). If the field value is greater than the specified
   * value, an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be less than or equal to 10.0
   * float value = 1 [(buf.validate.field).float.lte = 10.0];
   * }
   * ```
   * </pre>
   *
   * <code>float lte = 3 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
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
   * message MyFloat {
   * // value must be less than or equal to 10.0
   * float value = 1 [(buf.validate.field).float.lte = 10.0];
   * }
   * ```
   * </pre>
   *
   * <code>float lte = 3 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return The lte.
   */
  float getLte();

  /**
   * <pre>
   * `gt` requires the field value to be greater than the specified value
   * (exclusive). If the value of `gt` is larger than a specified `lt` or
   * `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be greater than 5.0 [float.gt]
   * float value = 1 [(buf.validate.field).float.gt = 5.0];
   *
   * // value must be greater than 5 and less than 10.0 [float.gt_lt]
   * float other_value = 2 [(buf.validate.field).float = { gt: 5.0, lt: 10.0 }];
   *
   * // value must be greater than 10 or less than 5.0 [float.gt_lt_exclusive]
   * float another_value = 3 [(buf.validate.field).float = { gt: 10.0, lt: 5.0 }];
   * }
   * ```
   * </pre>
   *
   * <code>float gt = 4 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
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
   * message MyFloat {
   * // value must be greater than 5.0 [float.gt]
   * float value = 1 [(buf.validate.field).float.gt = 5.0];
   *
   * // value must be greater than 5 and less than 10.0 [float.gt_lt]
   * float other_value = 2 [(buf.validate.field).float = { gt: 5.0, lt: 10.0 }];
   *
   * // value must be greater than 10 or less than 5.0 [float.gt_lt_exclusive]
   * float another_value = 3 [(buf.validate.field).float = { gt: 10.0, lt: 5.0 }];
   * }
   * ```
   * </pre>
   *
   * <code>float gt = 4 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return The gt.
   */
  float getGt();

  /**
   * <pre>
   * `gte` requires the field value to be greater than or equal to the specified
   * value (exclusive). If the value of `gte` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be greater than or equal to 5.0 [float.gte]
   * float value = 1 [(buf.validate.field).float.gte = 5.0];
   *
   * // value must be greater than or equal to 5.0 and less than 10.0 [float.gte_lt]
   * float other_value = 2 [(buf.validate.field).float = { gte: 5.0, lt: 10.0 }];
   *
   * // value must be greater than or equal to 10.0 or less than 5.0 [float.gte_lt_exclusive]
   * float another_value = 3 [(buf.validate.field).float = { gte: 10.0, lt: 5.0 }];
   * }
   * ```
   * </pre>
   *
   * <code>float gte = 5 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
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
   * message MyFloat {
   * // value must be greater than or equal to 5.0 [float.gte]
   * float value = 1 [(buf.validate.field).float.gte = 5.0];
   *
   * // value must be greater than or equal to 5.0 and less than 10.0 [float.gte_lt]
   * float other_value = 2 [(buf.validate.field).float = { gte: 5.0, lt: 10.0 }];
   *
   * // value must be greater than or equal to 10.0 or less than 5.0 [float.gte_lt_exclusive]
   * float another_value = 3 [(buf.validate.field).float = { gte: 10.0, lt: 5.0 }];
   * }
   * ```
   * </pre>
   *
   * <code>float gte = 5 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return The gte.
   */
  float getGte();

  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @return A list containing the in.
   */
  java.util.List<java.lang.Float> getInList();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @return The count of in.
   */
  int getInCount();
  /**
   * <pre>
   * `in` requires the field value to be equal to one of the specified values.
   * If the field value isn't one of the specified values, an error message
   * is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float in = 6 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The in at the given index.
   */
  float getIn(int index);

  /**
   * <pre>
   * `in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must not be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { not_in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @return A list containing the notIn.
   */
  java.util.List<java.lang.Float> getNotInList();
  /**
   * <pre>
   * `in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must not be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { not_in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @return The count of notIn.
   */
  int getNotInCount();
  /**
   * <pre>
   * `in` requires the field value to not be equal to any of the specified
   * values. If the field value is one of the specified values, an error
   * message is generated.
   *
   * ```proto
   * message MyFloat {
   * // value must not be in list [1.0, 2.0, 3.0]
   * repeated float value = 1 (buf.validate.field).float = { not_in: [1.0, 2.0, 3.0] };
   * }
   * ```
   * </pre>
   *
   * <code>repeated float not_in = 7 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The notIn at the given index.
   */
  float getNotIn(int index);

  /**
   * <pre>
   * `finite` requires the field value to be finite. If the field value is
   * infinite or NaN, an error message is generated.
   * </pre>
   *
   * <code>bool finite = 8 [json_name = "finite", (.buf.validate.priv.field) = { ... }</code>
   * @return The finite.
   */
  boolean getFinite();

  build.buf.validate.FloatRules.LessThanCase getLessThanCase();

  build.buf.validate.FloatRules.GreaterThanCase getGreaterThanCase();
}
