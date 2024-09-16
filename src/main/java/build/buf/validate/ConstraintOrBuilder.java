// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/expression.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate;

public interface ConstraintOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.Constraint)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * `id` is a string that serves as a machine-readable name for this Constraint.
   * It should be unique within its scope, which could be either a message or a field.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The id.
   */
  java.lang.String getId();
  /**
   * <pre>
   * `id` is a string that serves as a machine-readable name for this Constraint.
   * It should be unique within its scope, which could be either a message or a field.
   * </pre>
   *
   * <code>string id = 1 [json_name = "id"];</code>
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString
      getIdBytes();

  /**
   * <pre>
   * `message` is an optional field that provides a human-readable error message
   * for this Constraint when the CEL expression evaluates to false. If a
   * non-empty message is provided, any strings resulting from the CEL
   * expression evaluation are ignored.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The message.
   */
  java.lang.String getMessage();
  /**
   * <pre>
   * `message` is an optional field that provides a human-readable error message
   * for this Constraint when the CEL expression evaluates to false. If a
   * non-empty message is provided, any strings resulting from the CEL
   * expression evaluation are ignored.
   * </pre>
   *
   * <code>string message = 2 [json_name = "message"];</code>
   * @return The bytes for message.
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <pre>
   * `expression` is the actual CEL expression that will be evaluated for
   * validation. This string must resolve to either a boolean or a string
   * value. If the expression evaluates to false or a non-empty string, the
   * validation is considered failed, and the message is rejected.
   * </pre>
   *
   * <code>string expression = 3 [json_name = "expression"];</code>
   * @return The expression.
   */
  java.lang.String getExpression();
  /**
   * <pre>
   * `expression` is the actual CEL expression that will be evaluated for
   * validation. This string must resolve to either a boolean or a string
   * value. If the expression evaluates to false or a non-empty string, the
   * validation is considered failed, and the message is rejected.
   * </pre>
   *
   * <code>string expression = 3 [json_name = "expression"];</code>
   * @return The bytes for expression.
   */
  com.google.protobuf.ByteString
      getExpressionBytes();
}
