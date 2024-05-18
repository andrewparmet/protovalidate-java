// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: buf/validate/conformance/harness/results.proto

// Protobuf Java Version: 3.25.3
package build.buf.validate.conformance.harness;

public interface ResultSetOrBuilder extends
    // @@protoc_insertion_point(interface_extends:buf.validate.conformance.harness.ResultSet)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Count of successes.
   * </pre>
   *
   * <code>int32 successes = 1 [json_name = "successes"];</code>
   * @return The successes.
   */
  int getSuccesses();

  /**
   * <pre>
   * Count of failures.
   * </pre>
   *
   * <code>int32 failures = 2 [json_name = "failures"];</code>
   * @return The failures.
   */
  int getFailures();

  /**
   * <pre>
   * List of suite results.
   * </pre>
   *
   * <code>repeated .buf.validate.conformance.harness.SuiteResults suites = 3 [json_name = "suites"];</code>
   */
  java.util.List<build.buf.validate.conformance.harness.SuiteResults> 
      getSuitesList();
  /**
   * <pre>
   * List of suite results.
   * </pre>
   *
   * <code>repeated .buf.validate.conformance.harness.SuiteResults suites = 3 [json_name = "suites"];</code>
   */
  build.buf.validate.conformance.harness.SuiteResults getSuites(int index);
  /**
   * <pre>
   * List of suite results.
   * </pre>
   *
   * <code>repeated .buf.validate.conformance.harness.SuiteResults suites = 3 [json_name = "suites"];</code>
   */
  int getSuitesCount();
  /**
   * <pre>
   * List of suite results.
   * </pre>
   *
   * <code>repeated .buf.validate.conformance.harness.SuiteResults suites = 3 [json_name = "suites"];</code>
   */
  java.util.List<? extends build.buf.validate.conformance.harness.SuiteResultsOrBuilder> 
      getSuitesOrBuilderList();
  /**
   * <pre>
   * List of suite results.
   * </pre>
   *
   * <code>repeated .buf.validate.conformance.harness.SuiteResults suites = 3 [json_name = "suites"];</code>
   */
  build.buf.validate.conformance.harness.SuiteResultsOrBuilder getSuitesOrBuilder(
      int index);

  /**
   * <pre>
   * Options used to generate this result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.ResultOptions options = 4 [json_name = "options"];</code>
   * @return Whether the options field is set.
   */
  boolean hasOptions();
  /**
   * <pre>
   * Options used to generate this result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.ResultOptions options = 4 [json_name = "options"];</code>
   * @return The options.
   */
  build.buf.validate.conformance.harness.ResultOptions getOptions();
  /**
   * <pre>
   * Options used to generate this result.
   * </pre>
   *
   * <code>.buf.validate.conformance.harness.ResultOptions options = 4 [json_name = "options"];</code>
   */
  build.buf.validate.conformance.harness.ResultOptionsOrBuilder getOptionsOrBuilder();

  /**
   * <pre>
   * Count of expected failures.
   * </pre>
   *
   * <code>int32 expected_failures = 5 [json_name = "expectedFailures"];</code>
   * @return The expectedFailures.
   */
  int getExpectedFailures();
}
