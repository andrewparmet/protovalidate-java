// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/oneofs.proto
// Protobuf Java Version: 4.27.4

package build.buf.validate.conformance.cases;

public interface OneofNoneOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.OneofNone)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return Whether the x field is set.
   */
  boolean hasX();
  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return The x.
   */
  java.lang.String getX();
  /**
   * <code>string x = 1 [json_name = "x"];</code>
   * @return The bytes for x.
   */
  com.google.protobuf.ByteString
      getXBytes();

  /**
   * <code>int32 y = 2 [json_name = "y"];</code>
   * @return Whether the y field is set.
   */
  boolean hasY();
  /**
   * <code>int32 y = 2 [json_name = "y"];</code>
   * @return The y.
   */
  int getY();

  build.buf.validate.conformance.cases.OneofNone.OCase getOCase();
}
