// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/required_field_proto3.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.conformance.cases;

public interface RequiredProto3OneOfOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.RequiredProto3OneOf)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return Whether the a field is set.
   */
  boolean hasA();
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The a.
   */
  java.lang.String getA();
  /**
   * <code>string a = 1 [json_name = "a", (.buf.validate.field) = { ... }</code>
   * @return The bytes for a.
   */
  com.google.protobuf.ByteString
      getABytes();

  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return Whether the b field is set.
   */
  boolean hasB();
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The b.
   */
  java.lang.String getB();
  /**
   * <code>string b = 2 [json_name = "b"];</code>
   * @return The bytes for b.
   */
  com.google.protobuf.ByteString
      getBBytes();

  build.buf.validate.conformance.cases.RequiredProto3OneOf.ValCase getValCase();
}
