// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/harness/harness.proto
// Protobuf Java Version: 4.28.2

package build.buf.validate.conformance.harness;

public interface TestConformanceRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.TestConformanceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   * @return Whether the fdset field is set.
   */
  boolean hasFdset();
  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   * @return The fdset.
   */
  com.google.protobuf.DescriptorProtos.FileDescriptorSet getFdset();
  /**
   * <code>.google.protobuf.FileDescriptorSet fdset = 2 [json_name = "fdset"];</code>
   */
  com.google.protobuf.DescriptorProtos.FileDescriptorSetOrBuilder getFdsetOrBuilder();

  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  int getCasesCount();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  boolean containsCases(
      java.lang.String key);
  /**
   * Use {@link #getCasesMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getCases();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  java.util.Map<java.lang.String, com.google.protobuf.Any>
  getCasesMap();
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  /* nullable */
com.google.protobuf.Any getCasesOrDefault(
      java.lang.String key,
      /* nullable */
com.google.protobuf.Any defaultValue);
  /**
   * <code>map&lt;string, .google.protobuf.Any&gt; cases = 3 [json_name = "cases"];</code>
   */
  com.google.protobuf.Any getCasesOrThrow(
      java.lang.String key);
}
