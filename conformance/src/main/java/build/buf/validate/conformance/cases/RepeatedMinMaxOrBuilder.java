// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/repeated.proto
// Protobuf Java Version: 4.27.4

package build.buf.validate.conformance.cases;

public interface RepeatedMinMaxOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RepeatedMinMax)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated sfixed32 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return A list containing the val.
   */
  java.util.List<java.lang.Integer> getValList();
  /**
   * <code>repeated sfixed32 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @return The count of val.
   */
  int getValCount();
  /**
   * <code>repeated sfixed32 val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   * @param index The index of the element to return.
   * @return The val at the given index.
   */
  int getVal(int index);
}
