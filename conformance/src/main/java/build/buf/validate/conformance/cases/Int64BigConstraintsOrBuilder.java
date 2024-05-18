// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/cases/numbers.proto

// Protobuf Java Version: 3.25.3
package build.buf.validate.conformance.cases;

public interface Int64BigConstraintsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.Int64BigConstraints)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Intentionally choose limits that are outside the range of both signed and unsigned 32-bit integers.
   * </pre>
   *
   * <code>int64 lt_pos = 1 [json_name = "ltPos", (.buf.validate.field) = { ... }</code>
   * @return The ltPos.
   */
  long getLtPos();

  /**
   * <code>int64 lt_neg = 2 [json_name = "ltNeg", (.buf.validate.field) = { ... }</code>
   * @return The ltNeg.
   */
  long getLtNeg();

  /**
   * <code>int64 gt_pos = 3 [json_name = "gtPos", (.buf.validate.field) = { ... }</code>
   * @return The gtPos.
   */
  long getGtPos();

  /**
   * <code>int64 gt_neg = 4 [json_name = "gtNeg", (.buf.validate.field) = { ... }</code>
   * @return The gtNeg.
   */
  long getGtNeg();

  /**
   * <code>int64 lte_pos = 5 [json_name = "ltePos", (.buf.validate.field) = { ... }</code>
   * @return The ltePos.
   */
  long getLtePos();

  /**
   * <code>int64 lte_neg = 6 [json_name = "lteNeg", (.buf.validate.field) = { ... }</code>
   * @return The lteNeg.
   */
  long getLteNeg();

  /**
   * <code>int64 gte_pos = 7 [json_name = "gtePos", (.buf.validate.field) = { ... }</code>
   * @return The gtePos.
   */
  long getGtePos();

  /**
   * <code>int64 gte_neg = 8 [json_name = "gteNeg", (.buf.validate.field) = { ... }</code>
   * @return The gteNeg.
   */
  long getGteNeg();

  /**
   * <code>int64 constant_pos = 9 [json_name = "constantPos", (.buf.validate.field) = { ... }</code>
   * @return The constantPos.
   */
  long getConstantPos();

  /**
   * <code>int64 constant_neg = 10 [json_name = "constantNeg", (.buf.validate.field) = { ... }</code>
   * @return The constantNeg.
   */
  long getConstantNeg();

  /**
   * <code>int64 in = 11 [json_name = "in", (.buf.validate.field) = { ... }</code>
   * @return The in.
   */
  long getIn();

  /**
   * <code>int64 notin = 12 [json_name = "notin", (.buf.validate.field) = { ... }</code>
   * @return The notin.
   */
  long getNotin();
}
