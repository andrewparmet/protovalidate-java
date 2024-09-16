// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/validate.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

public interface DurationRulesOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.DurationRules)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `const` dictates that the field must match the specified value of the `google.protobuf.Duration` type exactly.
   * If the field's value deviates from the specified value, an error message
   * will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must equal 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.const = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the const field is set.
   */
  boolean hasConst();
  /**
   * <pre>
   * `const` dictates that the field must match the specified value of the `google.protobuf.Duration` type exactly.
   * If the field's value deviates from the specified value, an error message
   * will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must equal 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.const = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   * @return The const.
   */
  com.google.protobuf.Duration getConst();
  /**
   * <pre>
   * `const` dictates that the field must match the specified value of the `google.protobuf.Duration` type exactly.
   * If the field's value deviates from the specified value, an error message
   * will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must equal 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.const = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>optional .google.protobuf.Duration const = 2 [json_name = "const", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getConstOrBuilder();

  /**
   * <pre>
   * `lt` stipulates that the field must be less than the specified value of the `google.protobuf.Duration` type,
   * exclusive. If the field's value is greater than or equal to the specified
   * value, an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lt field is set.
   */
  boolean hasLt();
  /**
   * <pre>
   * `lt` stipulates that the field must be less than the specified value of the `google.protobuf.Duration` type,
   * exclusive. If the field's value is greater than or equal to the specified
   * value, an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   * @return The lt.
   */
  com.google.protobuf.Duration getLt();
  /**
   * <pre>
   * `lt` stipulates that the field must be less than the specified value of the `google.protobuf.Duration` type,
   * exclusive. If the field's value is greater than or equal to the specified
   * value, an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than 5s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lt = "5s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lt = 3 [json_name = "lt", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getLtOrBuilder();

  /**
   * <pre>
   * `lte` indicates that the field must be less than or equal to the specified
   * value of the `google.protobuf.Duration` type, inclusive. If the field's value is greater than the specified value,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than or equal to 10s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lte = "10s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the lte field is set.
   */
  boolean hasLte();
  /**
   * <pre>
   * `lte` indicates that the field must be less than or equal to the specified
   * value of the `google.protobuf.Duration` type, inclusive. If the field's value is greater than the specified value,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than or equal to 10s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lte = "10s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   * @return The lte.
   */
  com.google.protobuf.Duration getLte();
  /**
   * <pre>
   * `lte` indicates that the field must be less than or equal to the specified
   * value of the `google.protobuf.Duration` type, inclusive. If the field's value is greater than the specified value,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be less than or equal to 10s
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.lte = "10s"];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration lte = 4 [json_name = "lte", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getLteOrBuilder();

  /**
   * <pre>
   * `gt` requires the duration field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than 5s [duration.gt]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gt = { seconds: 5 }];
   *
   * // duration must be greater than 5s and less than 10s [duration.gt_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gt: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than 10s or less than 5s [duration.gt_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gt: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gt field is set.
   */
  boolean hasGt();
  /**
   * <pre>
   * `gt` requires the duration field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than 5s [duration.gt]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gt = { seconds: 5 }];
   *
   * // duration must be greater than 5s and less than 10s [duration.gt_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gt: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than 10s or less than 5s [duration.gt_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gt: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   * @return The gt.
   */
  com.google.protobuf.Duration getGt();
  /**
   * <pre>
   * `gt` requires the duration field value to be greater than the specified
   * value (exclusive). If the value of `gt` is larger than a specified `lt`
   * or `lte`, the range is reversed, and the field value must be outside the
   * specified range. If the field value doesn't meet the required conditions,
   * an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than 5s [duration.gt]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gt = { seconds: 5 }];
   *
   * // duration must be greater than 5s and less than 10s [duration.gt_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gt: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than 10s or less than 5s [duration.gt_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gt: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gt = 5 [json_name = "gt", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getGtOrBuilder();

  /**
   * <pre>
   * `gte` requires the duration field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value must
   * be outside the specified range. If the field value doesn't meet the
   * required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than or equal to 5s [duration.gte]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gte = { seconds: 5 }];
   *
   * // duration must be greater than or equal to 5s and less than 10s [duration.gte_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gte: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than or equal to 10s or less than 5s [duration.gte_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gte: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return Whether the gte field is set.
   */
  boolean hasGte();
  /**
   * <pre>
   * `gte` requires the duration field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value must
   * be outside the specified range. If the field value doesn't meet the
   * required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than or equal to 5s [duration.gte]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gte = { seconds: 5 }];
   *
   * // duration must be greater than or equal to 5s and less than 10s [duration.gte_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gte: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than or equal to 10s or less than 5s [duration.gte_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gte: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   * @return The gte.
   */
  com.google.protobuf.Duration getGte();
  /**
   * <pre>
   * `gte` requires the duration field value to be greater than or equal to the
   * specified value (exclusive). If the value of `gte` is larger than a
   * specified `lt` or `lte`, the range is reversed, and the field value must
   * be outside the specified range. If the field value doesn't meet the
   * required conditions, an error message is generated.
   *
   * ```proto
   * message MyDuration {
   * // duration must be greater than or equal to 5s [duration.gte]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.gte = { seconds: 5 }];
   *
   * // duration must be greater than or equal to 5s and less than 10s [duration.gte_lt]
   * google.protobuf.Duration another_value = 2 [(buf.validate.field).duration = { gte: { seconds: 5 }, lt: { seconds: 10 } }];
   *
   * // duration must be greater than or equal to 10s or less than 5s [duration.gte_lt_exclusive]
   * google.protobuf.Duration other_value = 3 [(buf.validate.field).duration = { gte: { seconds: 10 }, lt: { seconds: 5 } }];
   * }
   * ```
   * </pre>
   *
   * <code>.google.protobuf.Duration gte = 6 [json_name = "gte", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getGteOrBuilder();

  /**
   * <pre>
   * `in` asserts that the field must be equal to one of the specified values of the `google.protobuf.Duration` type.
   * If the field's value doesn't correspond to any of the specified values,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getInList();
  /**
   * <pre>
   * `in` asserts that the field must be equal to one of the specified values of the `google.protobuf.Duration` type.
   * If the field's value doesn't correspond to any of the specified values,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.Duration getIn(int index);
  /**
   * <pre>
   * `in` asserts that the field must be equal to one of the specified values of the `google.protobuf.Duration` type.
   * If the field's value doesn't correspond to any of the specified values,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   */
  int getInCount();
  /**
   * <pre>
   * `in` asserts that the field must be equal to one of the specified values of the `google.protobuf.Duration` type.
   * If the field's value doesn't correspond to any of the specified values,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getInOrBuilderList();
  /**
   * <pre>
   * `in` asserts that the field must be equal to one of the specified values of the `google.protobuf.Duration` type.
   * If the field's value doesn't correspond to any of the specified values,
   * an error message will be generated.
   *
   * ```proto
   * message MyDuration {
   * // value must be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration in = 7 [json_name = "in", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getInOrBuilder(
      int index);

  /**
   * <pre>
   * `not_in` denotes that the field must not be equal to
   * any of the specified values of the `google.protobuf.Duration` type.
   * If the field's value matches any of these values, an error message will be
   * generated.
   *
   * ```proto
   * message MyDuration {
   * // value must not be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.not_in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   */
  java.util.List<com.google.protobuf.Duration> 
      getNotInList();
  /**
   * <pre>
   * `not_in` denotes that the field must not be equal to
   * any of the specified values of the `google.protobuf.Duration` type.
   * If the field's value matches any of these values, an error message will be
   * generated.
   *
   * ```proto
   * message MyDuration {
   * // value must not be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.not_in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.Duration getNotIn(int index);
  /**
   * <pre>
   * `not_in` denotes that the field must not be equal to
   * any of the specified values of the `google.protobuf.Duration` type.
   * If the field's value matches any of these values, an error message will be
   * generated.
   *
   * ```proto
   * message MyDuration {
   * // value must not be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.not_in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   */
  int getNotInCount();
  /**
   * <pre>
   * `not_in` denotes that the field must not be equal to
   * any of the specified values of the `google.protobuf.Duration` type.
   * If the field's value matches any of these values, an error message will be
   * generated.
   *
   * ```proto
   * message MyDuration {
   * // value must not be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.not_in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   */
  java.util.List<? extends com.google.protobuf.DurationOrBuilder> 
      getNotInOrBuilderList();
  /**
   * <pre>
   * `not_in` denotes that the field must not be equal to
   * any of the specified values of the `google.protobuf.Duration` type.
   * If the field's value matches any of these values, an error message will be
   * generated.
   *
   * ```proto
   * message MyDuration {
   * // value must not be in list [1s, 2s, 3s]
   * google.protobuf.Duration value = 1 [(buf.validate.field).duration.not_in = ["1s", "2s", "3s"]];
   * }
   * ```
   * </pre>
   *
   * <code>repeated .google.protobuf.Duration not_in = 8 [json_name = "notIn", (.buf.validate.priv.field) = { ... }</code>
   */
  com.google.protobuf.DurationOrBuilder getNotInOrBuilder(
      int index);

  build.buf.validate.DurationRules.LessThanCase getLessThanCase();

  build.buf.validate.DurationRules.GreaterThanCase getGreaterThanCase();
}
