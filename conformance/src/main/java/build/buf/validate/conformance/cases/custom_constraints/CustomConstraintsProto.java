// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: buf/validate/conformance/cases/custom_constraints/custom_constraints.proto
// Protobuf Java Version: 4.28.1

package build.buf.validate.conformance.cases.custom_constraints;

public final class CustomConstraintsProto {
  private CustomConstraintsProto() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 28,
      /* patch= */ 1,
      /* suffix= */ "",
      CustomConstraintsProto.class.getName());
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
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_Nested_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_Nested_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_Nested_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_Nested_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_Nested_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_Nested_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_IncorrectType_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_IncorrectType_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_DynRuntimeError_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_DynRuntimeError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_buf_validate_conformance_cases_custom_constraints_NowEqualsNow_descriptor;
  static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_buf_validate_conformance_cases_custom_constraints_NowEqualsNow_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJbuf/validate/conformance/cases/custom_" +
      "constraints/custom_constraints.proto\0221bu" +
      "f.validate.conformance.cases.custom_cons" +
      "traints\032\033buf/validate/validate.proto\"\305\001\n" +
      "\rNoExpressions\022\014\n\001a\030\001 \001(\005R\001a\022E\n\001b\030\002 \001(\0162" +
      "7.buf.validate.conformance.cases.custom_" +
      "constraints.EnumR\001b\022U\n\001c\030\003 \001(\0132G.buf.val" +
      "idate.conformance.cases.custom_constrain" +
      "ts.NoExpressions.NestedR\001c\032\010\n\006Nested\"\303\005\n" +
      "\022MessageExpressions\022\014\n\001a\030\001 \001(\005R\001a\022\014\n\001b\030\002" +
      " \001(\005R\001b\022E\n\001c\030\003 \001(\01627.buf.validate.confor" +
      "mance.cases.custom_constraints.EnumR\001c\022E" +
      "\n\001d\030\004 \001(\01627.buf.validate.conformance.cas" +
      "es.custom_constraints.EnumR\001d\022Z\n\001e\030\005 \001(\013" +
      "2L.buf.validate.conformance.cases.custom" +
      "_constraints.MessageExpressions.NestedR\001" +
      "e\022Z\n\001f\030\006 \001(\0132L.buf.validate.conformance." +
      "cases.custom_constraints.MessageExpressi" +
      "ons.NestedR\001f\032x\n\006Nested\022\014\n\001a\030\001 \001(\005R\001a\022\014\n" +
      "\001b\030\002 \001(\005R\001b:R\272HO\032M\n\031message_expression_n" +
      "ested\0320this.a > this.b ? \'\': \'a must be " +
      "greater than b\':\320\001\272H\314\001\032C\n\031message_expres" +
      "sion_scalar\022\025a must be less than b\032\017this" +
      ".a < this.b\032?\n\027message_expression_enum\022\022" +
      "c must not equal d\032\020this.c != this.d\032D\n\030" +
      "message_expression_embed\022\022e.a must equal" +
      " f.a\032\024this.e.a == this.f.a\"\366\003\n\020FieldExpr" +
      "essions\022Z\n\001a\030\001 \001(\005BL\272HI\272\001F\n\027field_expres" +
      "sion_scalar\032+this > 42 ? \'\': \'a must be " +
      "greater than 42\'R\001a\022\177\n\001b\030\002 \001(\01627.buf.val" +
      "idate.conformance.cases.custom_constrain" +
      "ts.EnumB8\272H5\272\0012\n\025field_expression_enum\022\016" +
      "b must be ~ONE\032\tthis == 1R\001b\022\246\001\n\001c\030\003 \001(\013" +
      "2J.buf.validate.conformance.cases.custom" +
      "_constraints.FieldExpressions.NestedBL\272H" +
      "I\272\001F\n\026field_expression_embed\022\033c.a must b" +
      "e a multiple of 4\032\017this.a % 4 == 0R\001c\032\\\n" +
      "\006Nested\022R\n\001a\030\001 \001(\005BD\272HA\272\001>\n\027field_expres" +
      "sion_nested\032#this > 0 ? \'\': \'a must be p" +
      "ositive\'R\001a\"R\n\014MissingField\022\014\n\001a\030\001 \001(\005R\001" +
      "a:4\272H1\032/\n\rmissing_field\022\022b must be posit" +
      "ive\032\nthis.b > 0\"g\n\rIncorrectType\022\014\n\001a\030\001 " +
      "\001(\005R\001a:H\272HE\032C\n\016incorrect_type\022\027a must st" +
      "art with \'foo\'\032\030this.a.startsWith(\'foo\')" +
      "\"}\n\017DynRuntimeError\022\014\n\001a\030\001 \001(\005R\001a:\\\272HY\032W" +
      "\n\017dyn_runtime_err\022.dynamic type tries to" +
      " use a non-existent field\032\024dyn(this).b =" +
      "= \'foo\'\"\\\n\014NowEqualsNow:L\272HI\032G\n\016now_equa" +
      "ls_now\022)now should equal now within an e" +
      "xpression\032\nnow == now**\n\004Enum\022\024\n\020ENUM_UN" +
      "SPECIFIED\020\000\022\014\n\010ENUM_ONE\020\001B\267\002\n7build.buf." +
      "validate.conformance.cases.custom_constr" +
      "aintsB\026CustomConstraintsProtoP\001\242\002\005BVCCC\252" +
      "\0020Buf.Validate.Conformance.Cases.CustomC" +
      "onstraints\312\0020Buf\\Validate\\Conformance\\Ca" +
      "ses\\CustomConstraints\342\002<Buf\\Validate\\Con" +
      "formance\\Cases\\CustomConstraints\\GPBMeta" +
      "data\352\0024Buf::Validate::Conformance::Cases" +
      "::CustomConstraintsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          build.buf.validate.ValidateProto.getDescriptor(),
        });
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_descriptor,
        new java.lang.String[] { "A", "B", "C", });
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_Nested_descriptor =
      internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_Nested_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_NoExpressions_Nested_descriptor,
        new java.lang.String[] { });
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_descriptor,
        new java.lang.String[] { "A", "B", "C", "D", "E", "F", });
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_Nested_descriptor =
      internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_Nested_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_MessageExpressions_Nested_descriptor,
        new java.lang.String[] { "A", "B", });
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_descriptor,
        new java.lang.String[] { "A", "B", "C", });
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_Nested_descriptor =
      internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_descriptor.getNestedTypes().get(0);
    internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_Nested_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_FieldExpressions_Nested_descriptor,
        new java.lang.String[] { "A", });
    internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_MissingField_descriptor,
        new java.lang.String[] { "A", });
    internal_static_buf_validate_conformance_cases_custom_constraints_IncorrectType_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_buf_validate_conformance_cases_custom_constraints_IncorrectType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_IncorrectType_descriptor,
        new java.lang.String[] { "A", });
    internal_static_buf_validate_conformance_cases_custom_constraints_DynRuntimeError_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_buf_validate_conformance_cases_custom_constraints_DynRuntimeError_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_DynRuntimeError_descriptor,
        new java.lang.String[] { "A", });
    internal_static_buf_validate_conformance_cases_custom_constraints_NowEqualsNow_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_buf_validate_conformance_cases_custom_constraints_NowEqualsNow_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_buf_validate_conformance_cases_custom_constraints_NowEqualsNow_descriptor,
        new java.lang.String[] { });
    descriptor.resolveAllFeaturesImmutable();
    build.buf.validate.ValidateProto.getDescriptor();
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(build.buf.validate.ValidateProto.field);
    registry.add(build.buf.validate.ValidateProto.message);
    com.google.protobuf.Descriptors.FileDescriptor
        .internalUpdateFileDescriptor(descriptor, registry);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
