/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/api/client.proto

// Protobuf Java Version: 3.25.5
package com.google.api;

public final class ClientProto {
  private ClientProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ClientProto.apiVersion);
  }

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  public static final int METHOD_SIGNATURE_FIELD_NUMBER = 1051;
  /**
   *
   *
   * <pre>
   * A definition of a client library method signature.
   *
   * In client libraries, each proto RPC corresponds to one or more methods
   * which the end user is able to call, and calls the underlying RPC.
   * Normally, this method receives a single argument (a struct or instance
   * corresponding to the RPC request object). Defining this field will
   * add one or more overloads providing flattened or simpler method signatures
   * in some languages.
   *
   * The fields on the method signature are provided as a comma-separated
   * string.
   *
   * For example, the proto RPC and annotation:
   *
   *   rpc CreateSubscription(CreateSubscriptionRequest)
   *       returns (Subscription) {
   *     option (google.api.method_signature) = "name,topic";
   *   }
   *
   * Would add the following Java overload (in addition to the method accepting
   * the request object):
   *
   *   public final Subscription createSubscription(String name, String topic)
   *
   * The following backwards-compatibility guidelines apply:
   *
   *   * Adding this annotation to an unannotated method is backwards
   *     compatible.
   *   * Adding this annotation to a method which already has existing
   *     method signature annotations is backwards compatible if and only if
   *     the new method signature annotation is last in the sequence.
   *   * Modifying or removing an existing method signature annotation is
   *     a breaking change.
   *   * Re-ordering existing method signature annotations is a breaking
   *     change.
   * </pre>
   *
   * <code>extend .google.protobuf.MethodOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.MethodOptions, java.util.List<java.lang.String>>
      methodSignature =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int DEFAULT_HOST_FIELD_NUMBER = 1049;
  /**
   *
   *
   * <pre>
   * The hostname for this service.
   * This should be specified with no prefix or protocol.
   *
   * Example:
   *
   *   service Foo {
   *     option (google.api.default_host) = "foo.googleapi.com";
   *     ...
   *   }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.ServiceOptions, java.lang.String>
      defaultHost =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int OAUTH_SCOPES_FIELD_NUMBER = 1050;
  /**
   *
   *
   * <pre>
   * OAuth scopes needed for the client.
   *
   * Example:
   *
   *   service Foo {
   *     option (google.api.oauth_scopes) = &#92;
   *       "https://www.googleapis.com/auth/cloud-platform";
   *     ...
   *   }
   *
   * If there is more than one scope, use a comma-separated string:
   *
   * Example:
   *
   *   service Foo {
   *     option (google.api.oauth_scopes) = &#92;
   *       "https://www.googleapis.com/auth/cloud-platform,"
   *       "https://www.googleapis.com/auth/monitoring";
   *     ...
   *   }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.ServiceOptions, java.lang.String>
      oauthScopes =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  public static final int API_VERSION_FIELD_NUMBER = 525000001;
  /**
   *
   *
   * <pre>
   * The API version of this service, which should be sent by version-aware
   * clients to the service. This allows services to abide by the schema and
   * behavior of the service at the time this API version was deployed.
   * The format of the API version must be treated as opaque by clients.
   * Services may use a format with an apparent structure, but clients must
   * not rely on this to determine components within an API version, or attempt
   * to construct other valid API versions. Note that this is for upcoming
   * functionality and may not be implemented for all services.
   *
   * Example:
   *
   *   service Foo {
   *     option (google.api.api_version) = "v1_20230821_preview";
   *   }
   * </pre>
   *
   * <code>extend .google.protobuf.ServiceOptions { ... }</code>
   */
  public static final com.google.protobuf.GeneratedMessage.GeneratedExtension<
          com.google.protobuf.DescriptorProtos.ServiceOptions, java.lang.String>
      apiVersion =
          com.google.protobuf.GeneratedMessage.newFileScopedGeneratedExtension(
              java.lang.String.class, null);

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_CommonLanguageSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_CommonLanguageSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_ClientLibrarySettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_ClientLibrarySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_Publishing_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_Publishing_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_JavaSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_JavaSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_JavaSettings_ServiceClassNamesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_CppSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_CppSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_PhpSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_PhpSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_PythonSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_PythonSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_PythonSettings_ExperimentalFeatures_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_PythonSettings_ExperimentalFeatures_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_NodeSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_NodeSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_DotnetSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_DotnetSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_DotnetSettings_RenamedServicesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_DotnetSettings_RenamedResourcesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_RubySettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_RubySettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_GoSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_GoSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_MethodSettings_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MethodSettings_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_api_MethodSettings_LongRunning_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n\027google/api/client.proto\022\ngoogle.api\032\035g"
          + "oogle/api/launch_stage.proto\032 google/pro"
          + "tobuf/descriptor.proto\032\036google/protobuf/"
          + "duration.proto\"t\n\026CommonLanguageSettings"
          + "\022\036\n\022reference_docs_uri\030\001 \001(\tB\002\030\001\022:\n\014dest"
          + "inations\030\002 \003(\0162$.google.api.ClientLibrar"
          + "yDestination\"\373\003\n\025ClientLibrarySettings\022\017"
          + "\n\007version\030\001 \001(\t\022-\n\014launch_stage\030\002 \001(\0162\027."
          + "google.api.LaunchStage\022\032\n\022rest_numeric_e"
          + "nums\030\003 \001(\010\022/\n\rjava_settings\030\025 \001(\0132\030.goog"
          + "le.api.JavaSettings\022-\n\014cpp_settings\030\026 \001("
          + "\0132\027.google.api.CppSettings\022-\n\014php_settin"
          + "gs\030\027 \001(\0132\027.google.api.PhpSettings\0223\n\017pyt"
          + "hon_settings\030\030 \001(\0132\032.google.api.PythonSe"
          + "ttings\022/\n\rnode_settings\030\031 \001(\0132\030.google.a"
          + "pi.NodeSettings\0223\n\017dotnet_settings\030\032 \001(\013"
          + "2\032.google.api.DotnetSettings\022/\n\rruby_set"
          + "tings\030\033 \001(\0132\030.google.api.RubySettings\022+\n"
          + "\013go_settings\030\034 \001(\0132\026.google.api.GoSettin"
          + "gs\"\250\003\n\nPublishing\0223\n\017method_settings\030\002 \003"
          + "(\0132\032.google.api.MethodSettings\022\025\n\rnew_is"
          + "sue_uri\030e \001(\t\022\031\n\021documentation_uri\030f \001(\t"
          + "\022\026\n\016api_short_name\030g \001(\t\022\024\n\014github_label"
          + "\030h \001(\t\022\036\n\026codeowner_github_teams\030i \003(\t\022\026"
          + "\n\016doc_tag_prefix\030j \001(\t\022;\n\014organization\030k"
          + " \001(\0162%.google.api.ClientLibraryOrganizat"
          + "ion\022;\n\020library_settings\030m \003(\0132!.google.a"
          + "pi.ClientLibrarySettings\022)\n!proto_refere"
          + "nce_documentation_uri\030n \001(\t\022(\n rest_refe"
          + "rence_documentation_uri\030o \001(\t\"\343\001\n\014JavaSe"
          + "ttings\022\027\n\017library_package\030\001 \001(\t\022L\n\023servi"
          + "ce_class_names\030\002 \003(\0132/.google.api.JavaSe"
          + "ttings.ServiceClassNamesEntry\0222\n\006common\030"
          + "\003 \001(\0132\".google.api.CommonLanguageSetting"
          + "s\0328\n\026ServiceClassNamesEntry\022\013\n\003key\030\001 \001(\t"
          + "\022\r\n\005value\030\002 \001(\t:\0028\001\"A\n\013CppSettings\0222\n\006co"
          + "mmon\030\001 \001(\0132\".google.api.CommonLanguageSe"
          + "ttings\"A\n\013PhpSettings\0222\n\006common\030\001 \001(\0132\"."
          + "google.api.CommonLanguageSettings\"\313\001\n\016Py"
          + "thonSettings\0222\n\006common\030\001 \001(\0132\".google.ap"
          + "i.CommonLanguageSettings\022N\n\025experimental"
          + "_features\030\002 \001(\0132/.google.api.PythonSetti"
          + "ngs.ExperimentalFeatures\0325\n\024Experimental"
          + "Features\022\035\n\025rest_async_io_enabled\030\001 \001(\010\""
          + "B\n\014NodeSettings\0222\n\006common\030\001 \001(\0132\".google"
          + ".api.CommonLanguageSettings\"\252\003\n\016DotnetSe"
          + "ttings\0222\n\006common\030\001 \001(\0132\".google.api.Comm"
          + "onLanguageSettings\022I\n\020renamed_services\030\002"
          + " \003(\0132/.google.api.DotnetSettings.Renamed"
          + "ServicesEntry\022K\n\021renamed_resources\030\003 \003(\013"
          + "20.google.api.DotnetSettings.RenamedReso"
          + "urcesEntry\022\031\n\021ignored_resources\030\004 \003(\t\022 \n"
          + "\030forced_namespace_aliases\030\005 \003(\t\022\036\n\026handw"
          + "ritten_signatures\030\006 \003(\t\0326\n\024RenamedServic"
          + "esEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001\032"
          + "7\n\025RenamedResourcesEntry\022\013\n\003key\030\001 \001(\t\022\r\n"
          + "\005value\030\002 \001(\t:\0028\001\"B\n\014RubySettings\0222\n\006comm"
          + "on\030\001 \001(\0132\".google.api.CommonLanguageSett"
          + "ings\"@\n\nGoSettings\0222\n\006common\030\001 \001(\0132\".goo"
          + "gle.api.CommonLanguageSettings\"\317\002\n\016Metho"
          + "dSettings\022\020\n\010selector\030\001 \001(\t\022<\n\014long_runn"
          + "ing\030\002 \001(\0132&.google.api.MethodSettings.Lo"
          + "ngRunning\022\035\n\025auto_populated_fields\030\003 \003(\t"
          + "\032\315\001\n\013LongRunning\0225\n\022initial_poll_delay\030\001"
          + " \001(\0132\031.google.protobuf.Duration\022\035\n\025poll_"
          + "delay_multiplier\030\002 \001(\002\0221\n\016max_poll_delay"
          + "\030\003 \001(\0132\031.google.protobuf.Duration\0225\n\022tot"
          + "al_poll_timeout\030\004 \001(\0132\031.google.protobuf."
          + "Duration*\243\001\n\031ClientLibraryOrganization\022+"
          + "\n\'CLIENT_LIBRARY_ORGANIZATION_UNSPECIFIE"
          + "D\020\000\022\t\n\005CLOUD\020\001\022\007\n\003ADS\020\002\022\n\n\006PHOTOS\020\003\022\017\n\013S"
          + "TREET_VIEW\020\004\022\014\n\010SHOPPING\020\005\022\007\n\003GEO\020\006\022\021\n\rG"
          + "ENERATIVE_AI\020\007*g\n\030ClientLibraryDestinati"
          + "on\022*\n&CLIENT_LIBRARY_DESTINATION_UNSPECI"
          + "FIED\020\000\022\n\n\006GITHUB\020\n\022\023\n\017PACKAGE_MANAGER\020\024:"
          + "9\n\020method_signature\022\036.google.protobuf.Me"
          + "thodOptions\030\233\010 \003(\t:6\n\014default_host\022\037.goo"
          + "gle.protobuf.ServiceOptions\030\231\010 \001(\t:6\n\014oa"
          + "uth_scopes\022\037.google.protobuf.ServiceOpti"
          + "ons\030\232\010 \001(\t:8\n\013api_version\022\037.google.proto"
          + "buf.ServiceOptions\030\301\272\253\372\001 \001(\tBi\n\016com.goog"
          + "le.apiB\013ClientProtoP\001ZAgoogle.golang.org"
          + "/genproto/googleapis/api/annotations;ann"
          + "otations\242\002\004GAPIb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.LaunchStageProto.getDescriptor(),
              com.google.protobuf.DescriptorProtos.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_api_CommonLanguageSettings_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_api_CommonLanguageSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_CommonLanguageSettings_descriptor,
            new java.lang.String[] {
              "ReferenceDocsUri", "Destinations",
            });
    internal_static_google_api_ClientLibrarySettings_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_api_ClientLibrarySettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_ClientLibrarySettings_descriptor,
            new java.lang.String[] {
              "Version",
              "LaunchStage",
              "RestNumericEnums",
              "JavaSettings",
              "CppSettings",
              "PhpSettings",
              "PythonSettings",
              "NodeSettings",
              "DotnetSettings",
              "RubySettings",
              "GoSettings",
            });
    internal_static_google_api_Publishing_descriptor = getDescriptor().getMessageTypes().get(2);
    internal_static_google_api_Publishing_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_Publishing_descriptor,
            new java.lang.String[] {
              "MethodSettings",
              "NewIssueUri",
              "DocumentationUri",
              "ApiShortName",
              "GithubLabel",
              "CodeownerGithubTeams",
              "DocTagPrefix",
              "Organization",
              "LibrarySettings",
              "ProtoReferenceDocumentationUri",
              "RestReferenceDocumentationUri",
            });
    internal_static_google_api_JavaSettings_descriptor = getDescriptor().getMessageTypes().get(3);
    internal_static_google_api_JavaSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_JavaSettings_descriptor,
            new java.lang.String[] {
              "LibraryPackage", "ServiceClassNames", "Common",
            });
    internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor =
        internal_static_google_api_JavaSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_api_JavaSettings_ServiceClassNamesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_JavaSettings_ServiceClassNamesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_CppSettings_descriptor = getDescriptor().getMessageTypes().get(4);
    internal_static_google_api_CppSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_CppSettings_descriptor,
            new java.lang.String[] {
              "Common",
            });
    internal_static_google_api_PhpSettings_descriptor = getDescriptor().getMessageTypes().get(5);
    internal_static_google_api_PhpSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_PhpSettings_descriptor,
            new java.lang.String[] {
              "Common",
            });
    internal_static_google_api_PythonSettings_descriptor = getDescriptor().getMessageTypes().get(6);
    internal_static_google_api_PythonSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_PythonSettings_descriptor,
            new java.lang.String[] {
              "Common", "ExperimentalFeatures",
            });
    internal_static_google_api_PythonSettings_ExperimentalFeatures_descriptor =
        internal_static_google_api_PythonSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_api_PythonSettings_ExperimentalFeatures_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_PythonSettings_ExperimentalFeatures_descriptor,
            new java.lang.String[] {
              "RestAsyncIoEnabled",
            });
    internal_static_google_api_NodeSettings_descriptor = getDescriptor().getMessageTypes().get(7);
    internal_static_google_api_NodeSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_NodeSettings_descriptor,
            new java.lang.String[] {
              "Common",
            });
    internal_static_google_api_DotnetSettings_descriptor = getDescriptor().getMessageTypes().get(8);
    internal_static_google_api_DotnetSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_DotnetSettings_descriptor,
            new java.lang.String[] {
              "Common",
              "RenamedServices",
              "RenamedResources",
              "IgnoredResources",
              "ForcedNamespaceAliases",
              "HandwrittenSignatures",
            });
    internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor =
        internal_static_google_api_DotnetSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_api_DotnetSettings_RenamedServicesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_DotnetSettings_RenamedServicesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor =
        internal_static_google_api_DotnetSettings_descriptor.getNestedTypes().get(1);
    internal_static_google_api_DotnetSettings_RenamedResourcesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_DotnetSettings_RenamedResourcesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_api_RubySettings_descriptor = getDescriptor().getMessageTypes().get(9);
    internal_static_google_api_RubySettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_RubySettings_descriptor,
            new java.lang.String[] {
              "Common",
            });
    internal_static_google_api_GoSettings_descriptor = getDescriptor().getMessageTypes().get(10);
    internal_static_google_api_GoSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_GoSettings_descriptor,
            new java.lang.String[] {
              "Common",
            });
    internal_static_google_api_MethodSettings_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_api_MethodSettings_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_MethodSettings_descriptor,
            new java.lang.String[] {
              "Selector", "LongRunning", "AutoPopulatedFields",
            });
    internal_static_google_api_MethodSettings_LongRunning_descriptor =
        internal_static_google_api_MethodSettings_descriptor.getNestedTypes().get(0);
    internal_static_google_api_MethodSettings_LongRunning_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_api_MethodSettings_LongRunning_descriptor,
            new java.lang.String[] {
              "InitialPollDelay", "PollDelayMultiplier", "MaxPollDelay", "TotalPollTimeout",
            });
    methodSignature.internalInit(descriptor.getExtensions().get(0));
    defaultHost.internalInit(descriptor.getExtensions().get(1));
    oauthScopes.internalInit(descriptor.getExtensions().get(2));
    apiVersion.internalInit(descriptor.getExtensions().get(3));
    com.google.api.LaunchStageProto.getDescriptor();
    com.google.protobuf.DescriptorProtos.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
