/*
 * Copyright 2020 Google LLC
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
// source: google/spanner/admin/database/v1/spanner_database_admin.proto

package com.google.spanner.admin.database.v1;

/**
 *
 *
 * <pre>
 * The response for [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases].
 * </pre>
 *
 * Protobuf type {@code google.spanner.admin.database.v1.ListDatabasesResponse}
 */
public final class ListDatabasesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.spanner.admin.database.v1.ListDatabasesResponse)
    ListDatabasesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDatabasesResponse.newBuilder() to construct.
  private ListDatabasesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDatabasesResponse() {
    databases_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDatabasesResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private ListDatabasesResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10:
            {
              if (!((mutable_bitField0_ & 0x00000001) != 0)) {
                databases_ =
                    new java.util.ArrayList<com.google.spanner.admin.database.v1.Database>();
                mutable_bitField0_ |= 0x00000001;
              }
              databases_.add(
                  input.readMessage(
                      com.google.spanner.admin.database.v1.Database.parser(), extensionRegistry));
              break;
            }
          case 18:
            {
              java.lang.String s = input.readStringRequireUtf8();

              nextPageToken_ = s;
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        databases_ = java.util.Collections.unmodifiableList(databases_);
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
        .internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.spanner.admin.database.v1.ListDatabasesResponse.class,
            com.google.spanner.admin.database.v1.ListDatabasesResponse.Builder.class);
  }

  public static final int DATABASES_FIELD_NUMBER = 1;
  private java.util.List<com.google.spanner.admin.database.v1.Database> databases_;
  /**
   *
   *
   * <pre>
   * Databases that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.spanner.admin.database.v1.Database> getDatabasesList() {
    return databases_;
  }
  /**
   *
   *
   * <pre>
   * Databases that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.spanner.admin.database.v1.DatabaseOrBuilder>
      getDatabasesOrBuilderList() {
    return databases_;
  }
  /**
   *
   *
   * <pre>
   * Databases that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
   */
  @java.lang.Override
  public int getDatabasesCount() {
    return databases_.size();
  }
  /**
   *
   *
   * <pre>
   * Databases that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.Database getDatabases(int index) {
    return databases_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Databases that matched the request.
   * </pre>
   *
   * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
   */
  @java.lang.Override
  public com.google.spanner.admin.database.v1.DatabaseOrBuilder getDatabasesOrBuilder(int index) {
    return databases_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;
  private volatile java.lang.Object nextPageToken_;
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
   * of the matching databases.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * `next_page_token` can be sent in a subsequent
   * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
   * of the matching databases.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    for (int i = 0; i < databases_.size(); i++) {
      output.writeMessage(1, databases_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < databases_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, databases_.get(i));
    }
    if (!getNextPageTokenBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.spanner.admin.database.v1.ListDatabasesResponse)) {
      return super.equals(obj);
    }
    com.google.spanner.admin.database.v1.ListDatabasesResponse other =
        (com.google.spanner.admin.database.v1.ListDatabasesResponse) obj;

    if (!getDatabasesList().equals(other.getDatabasesList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getDatabasesCount() > 0) {
      hash = (37 * hash) + DATABASES_FIELD_NUMBER;
      hash = (53 * hash) + getDatabasesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(
      com.google.spanner.admin.database.v1.ListDatabasesResponse prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * The response for [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases].
   * </pre>
   *
   * Protobuf type {@code google.spanner.admin.database.v1.ListDatabasesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.spanner.admin.database.v1.ListDatabasesResponse)
      com.google.spanner.admin.database.v1.ListDatabasesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.spanner.admin.database.v1.ListDatabasesResponse.class,
              com.google.spanner.admin.database.v1.ListDatabasesResponse.Builder.class);
    }

    // Construct using com.google.spanner.admin.database.v1.ListDatabasesResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDatabasesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      if (databasesBuilder_ == null) {
        databases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        databasesBuilder_.clear();
      }
      nextPageToken_ = "";

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.spanner.admin.database.v1.SpannerDatabaseAdminProto
          .internal_static_google_spanner_admin_database_v1_ListDatabasesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabasesResponse getDefaultInstanceForType() {
      return com.google.spanner.admin.database.v1.ListDatabasesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabasesResponse build() {
      com.google.spanner.admin.database.v1.ListDatabasesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.spanner.admin.database.v1.ListDatabasesResponse buildPartial() {
      com.google.spanner.admin.database.v1.ListDatabasesResponse result =
          new com.google.spanner.admin.database.v1.ListDatabasesResponse(this);
      int from_bitField0_ = bitField0_;
      if (databasesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          databases_ = java.util.Collections.unmodifiableList(databases_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.databases_ = databases_;
      } else {
        result.databases_ = databasesBuilder_.build();
      }
      result.nextPageToken_ = nextPageToken_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.spanner.admin.database.v1.ListDatabasesResponse) {
        return mergeFrom((com.google.spanner.admin.database.v1.ListDatabasesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.spanner.admin.database.v1.ListDatabasesResponse other) {
      if (other == com.google.spanner.admin.database.v1.ListDatabasesResponse.getDefaultInstance())
        return this;
      if (databasesBuilder_ == null) {
        if (!other.databases_.isEmpty()) {
          if (databases_.isEmpty()) {
            databases_ = other.databases_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatabasesIsMutable();
            databases_.addAll(other.databases_);
          }
          onChanged();
        }
      } else {
        if (!other.databases_.isEmpty()) {
          if (databasesBuilder_.isEmpty()) {
            databasesBuilder_.dispose();
            databasesBuilder_ = null;
            databases_ = other.databases_;
            bitField0_ = (bitField0_ & ~0x00000001);
            databasesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatabasesFieldBuilder()
                    : null;
          } else {
            databasesBuilder_.addAllMessages(other.databases_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      com.google.spanner.admin.database.v1.ListDatabasesResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage =
            (com.google.spanner.admin.database.v1.ListDatabasesResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int bitField0_;

    private java.util.List<com.google.spanner.admin.database.v1.Database> databases_ =
        java.util.Collections.emptyList();

    private void ensureDatabasesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        databases_ =
            new java.util.ArrayList<com.google.spanner.admin.database.v1.Database>(databases_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.database.v1.Database,
            com.google.spanner.admin.database.v1.Database.Builder,
            com.google.spanner.admin.database.v1.DatabaseOrBuilder>
        databasesBuilder_;

    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.database.v1.Database> getDatabasesList() {
      if (databasesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(databases_);
      } else {
        return databasesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public int getDatabasesCount() {
      if (databasesBuilder_ == null) {
        return databases_.size();
      } else {
        return databasesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public com.google.spanner.admin.database.v1.Database getDatabases(int index) {
      if (databasesBuilder_ == null) {
        return databases_.get(index);
      } else {
        return databasesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder setDatabases(int index, com.google.spanner.admin.database.v1.Database value) {
      if (databasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabasesIsMutable();
        databases_.set(index, value);
        onChanged();
      } else {
        databasesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder setDatabases(
        int index, com.google.spanner.admin.database.v1.Database.Builder builderForValue) {
      if (databasesBuilder_ == null) {
        ensureDatabasesIsMutable();
        databases_.set(index, builderForValue.build());
        onChanged();
      } else {
        databasesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder addDatabases(com.google.spanner.admin.database.v1.Database value) {
      if (databasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabasesIsMutable();
        databases_.add(value);
        onChanged();
      } else {
        databasesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder addDatabases(int index, com.google.spanner.admin.database.v1.Database value) {
      if (databasesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatabasesIsMutable();
        databases_.add(index, value);
        onChanged();
      } else {
        databasesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder addDatabases(
        com.google.spanner.admin.database.v1.Database.Builder builderForValue) {
      if (databasesBuilder_ == null) {
        ensureDatabasesIsMutable();
        databases_.add(builderForValue.build());
        onChanged();
      } else {
        databasesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder addDatabases(
        int index, com.google.spanner.admin.database.v1.Database.Builder builderForValue) {
      if (databasesBuilder_ == null) {
        ensureDatabasesIsMutable();
        databases_.add(index, builderForValue.build());
        onChanged();
      } else {
        databasesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder addAllDatabases(
        java.lang.Iterable<? extends com.google.spanner.admin.database.v1.Database> values) {
      if (databasesBuilder_ == null) {
        ensureDatabasesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, databases_);
        onChanged();
      } else {
        databasesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder clearDatabases() {
      if (databasesBuilder_ == null) {
        databases_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        databasesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public Builder removeDatabases(int index) {
      if (databasesBuilder_ == null) {
        ensureDatabasesIsMutable();
        databases_.remove(index);
        onChanged();
      } else {
        databasesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public com.google.spanner.admin.database.v1.Database.Builder getDatabasesBuilder(int index) {
      return getDatabasesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public com.google.spanner.admin.database.v1.DatabaseOrBuilder getDatabasesOrBuilder(int index) {
      if (databasesBuilder_ == null) {
        return databases_.get(index);
      } else {
        return databasesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public java.util.List<? extends com.google.spanner.admin.database.v1.DatabaseOrBuilder>
        getDatabasesOrBuilderList() {
      if (databasesBuilder_ != null) {
        return databasesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(databases_);
      }
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public com.google.spanner.admin.database.v1.Database.Builder addDatabasesBuilder() {
      return getDatabasesFieldBuilder()
          .addBuilder(com.google.spanner.admin.database.v1.Database.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public com.google.spanner.admin.database.v1.Database.Builder addDatabasesBuilder(int index) {
      return getDatabasesFieldBuilder()
          .addBuilder(index, com.google.spanner.admin.database.v1.Database.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Databases that matched the request.
     * </pre>
     *
     * <code>repeated .google.spanner.admin.database.v1.Database databases = 1;</code>
     */
    public java.util.List<com.google.spanner.admin.database.v1.Database.Builder>
        getDatabasesBuilderList() {
      return getDatabasesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.spanner.admin.database.v1.Database,
            com.google.spanner.admin.database.v1.Database.Builder,
            com.google.spanner.admin.database.v1.DatabaseOrBuilder>
        getDatabasesFieldBuilder() {
      if (databasesBuilder_ == null) {
        databasesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.spanner.admin.database.v1.Database,
                com.google.spanner.admin.database.v1.Database.Builder,
                com.google.spanner.admin.database.v1.DatabaseOrBuilder>(
                databases_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        databases_ = null;
      }
      return databasesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      nextPageToken_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {

      nextPageToken_ = getDefaultInstance().getNextPageToken();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * `next_page_token` can be sent in a subsequent
     * [ListDatabases][google.spanner.admin.database.v1.DatabaseAdmin.ListDatabases] call to fetch more
     * of the matching databases.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);

      nextPageToken_ = value;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.spanner.admin.database.v1.ListDatabasesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.spanner.admin.database.v1.ListDatabasesResponse)
  private static final com.google.spanner.admin.database.v1.ListDatabasesResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.spanner.admin.database.v1.ListDatabasesResponse();
  }

  public static com.google.spanner.admin.database.v1.ListDatabasesResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDatabasesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDatabasesResponse>() {
        @java.lang.Override
        public ListDatabasesResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new ListDatabasesResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<ListDatabasesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDatabasesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.spanner.admin.database.v1.ListDatabasesResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
