// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/maps.proto
// Protobuf Java Version: 4.28.2

package build.buf.validate.conformance.cases;

public interface MapExactIgnoreOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.cases.MapExactIgnore)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>map&lt;uint64, string&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  int getValCount();
  /**
   * <code>map&lt;uint64, string&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  boolean containsVal(
      long key);
  /**
   * Use {@link #getValMap()} instead.
   */
  @java.lang.Deprecated
  java.util.Map<java.lang.Long, java.lang.String>
  getVal();
  /**
   * <code>map&lt;uint64, string&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  java.util.Map<java.lang.Long, java.lang.String>
  getValMap();
  /**
   * <code>map&lt;uint64, string&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  /* nullable */
java.lang.String getValOrDefault(
      long key,
      /* nullable */
java.lang.String defaultValue);
  /**
   * <code>map&lt;uint64, string&gt; val = 1 [json_name = "val", (.buf.validate.field) = { ... }</code>
   */
  java.lang.String getValOrThrow(
      long key);
}
