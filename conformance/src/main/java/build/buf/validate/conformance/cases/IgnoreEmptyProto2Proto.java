// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/ignore_empty_proto2.proto
// Protobuf Java Version: 4.28.2

package build.buf.validate.conformance.cases;

public final class IgnoreEmptyProto2Proto {
  private IgnoreEmptyProto2Proto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 2,
      /* suffix= */ "",
      IgnoreEmptyProto2Proto.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptional_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptional_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptionalWithDefault_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptionalWithDefault_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarRequired_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarRequired_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_Msg_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_Msg_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Oneof_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Oneof_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Repeated_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Repeated_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_ValEntry_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_ValEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n8buf/validate/conformance/cases/ignore_" +
      "empty_proto2.proto\022\036buf.validate.conform" +
      "ance.cases\032\033buf/validate/validate.proto\"" +
      "?\n\037IgnoreEmptyProto2ScalarOptional\022\034\n\003va" +
      "l\030\001 \001(\005B\n\272H\007\032\002 \000\320\001\001R\003val\"N\n*IgnoreEmptyP" +
      "roto2ScalarOptionalWithDefault\022 \n\003val\030\001 " +
      "\001(\005:\00242B\n\272H\007\032\002 \000\320\001\001R\003val\"?\n\037IgnoreEmptyP" +
      "roto2ScalarRequired\022\034\n\003val\030\001 \002(\005B\n\272H\007\032\002 " +
      "\000\320\001\001R\003val\"\307\001\n\030IgnoreEmptyProto2Message\022\221" +
      "\001\n\003val\030\001 \001(\0132<.buf.validate.conformance." +
      "cases.IgnoreEmptyProto2Message.MsgBA\272H>\272" +
      "\0018\n\033ignore_empty.proto2.message\022\006foobar\032" +
      "\021this.val == \'foo\'\320\001\001R\003val\032\027\n\003Msg\022\020\n\003val" +
      "\030\001 \001(\tR\003val\"=\n\026IgnoreEmptyProto2Oneof\022\036\n" +
      "\003val\030\001 \001(\005B\n\272H\007\032\002 \000\320\001\001H\000R\003valB\003\n\001o\":\n\031Ig" +
      "noreEmptyProto2Repeated\022\035\n\003val\030\001 \003(\005B\013\272H" +
      "\010\222\001\002\010\003\320\001\001R\003val\"\254\001\n\024IgnoreEmptyProto2Map\022" +
      "\\\n\003val\030\001 \003(\0132=.buf.validate.conformance." +
      "cases.IgnoreEmptyProto2Map.ValEntryB\013\272H\010" +
      "\232\001\002\010\003\320\001\001R\003val\0326\n\010ValEntry\022\020\n\003key\030\001 \001(\005R\003" +
      "key\022\024\n\005value\030\002 \001(\005R\005value:\0028\001B\332\001\n$build." +
      "buf.validate.conformance.casesB\026IgnoreEm" +
      "ptyProto2ProtoP\001\242\002\004BVCC\252\002\036Buf.Validate.C" +
      "onformance.Cases\312\002\036Buf\\Validate\\Conforma" +
      "nce\\Cases\342\002*Buf\\Validate\\Conformance\\Cas" +
      "es\\GPBMetadata\352\002!Buf::Validate::Conforma" +
      "nce::Cases"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptional_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptional_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptional_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptionalWithDefault_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptionalWithDefault_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarOptionalWithDefault_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarRequired_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarRequired_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2ScalarRequired_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_Msg_descriptor =
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_Msg_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Message_Msg_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Oneof_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Oneof_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Oneof_descriptor,
        new java.lang.String[] { "Val", "O", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Repeated_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Repeated_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Repeated_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_descriptor,
        new java.lang.String[] { "Val", });
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_ValEntry_descriptor =
      internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_ValEntry_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_IgnoreEmptyProto2Map_ValEntry_descriptor,
        new java.lang.String[] { "Key", "Value", });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
