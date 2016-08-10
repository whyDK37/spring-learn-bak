// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: proto/user.proto

package boot.proto;

public final class UserProtos {
    private UserProtos() {
    }

    public static void registerAllExtensions(
            com.google.protobuf.ExtensionRegistry registry) {
    }

    public interface UserOrBuilder
            extends com.google.protobuf.MessageOrBuilder {

        // optional int64 id = 1;

        /**
         * <code>optional int64 id = 1;</code>
         */
        boolean hasId();

        /**
         * <code>optional int64 id = 1;</code>
         */
        long getId();

        // optional string name = 2;

        /**
         * <code>optional string name = 2;</code>
         */
        boolean hasName();

        /**
         * <code>optional string name = 2;</code>
         */
        java.lang.String getName();

        /**
         * <code>optional string name = 2;</code>
         */
        com.google.protobuf.ByteString
        getNameBytes();
    }

    /**
     * Protobuf type {@code proto.User}
     */
    public static final class User extends
            com.google.protobuf.GeneratedMessage
            implements UserOrBuilder {
        // Use User.newBuilder() to construct.
        private User(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
            super(builder);
            this.unknownFields = builder.getUnknownFields();
        }

        private User(boolean noInit) {
            this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance();
        }

        private static final User defaultInstance;

        public static User getDefaultInstance() {
            return defaultInstance;
        }

        public User getDefaultInstanceForType() {
            return defaultInstance;
        }

        private final com.google.protobuf.UnknownFieldSet unknownFields;

        @java.lang.Override
        public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
            return this.unknownFields;
        }

        private User(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            initFields();
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
                        default: {
                            if (!parseUnknownField(input, unknownFields,
                                    extensionRegistry, tag)) {
                                done = true;
                            }
                            break;
                        }
                        case 8: {
                            bitField0_ |= 0x00000001;
                            id_ = input.readInt64();
                            break;
                        }
                        case 18: {
                            bitField0_ |= 0x00000002;
                            name_ = input.readBytes();
                            break;
                        }
                    }
                }
            } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(this);
            } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(
                        e.getMessage()).setUnfinishedMessage(this);
            } finally {
                this.unknownFields = unknownFields.build();
                makeExtensionsImmutable();
            }
        }

        public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
            return UserProtos.internal_static_proto_User_descriptor;
        }

        protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
            return UserProtos.internal_static_proto_User_fieldAccessorTable
                    .ensureFieldAccessorsInitialized(
                            UserProtos.User.class, UserProtos.User.Builder.class);
        }

        public static com.google.protobuf.Parser<User> PARSER =
                new com.google.protobuf.AbstractParser<User>() {
                    public User parsePartialFrom(
                            com.google.protobuf.CodedInputStream input,
                            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                            throws com.google.protobuf.InvalidProtocolBufferException {
                        return new User(input, extensionRegistry);
                    }
                };

        @java.lang.Override
        public com.google.protobuf.Parser<User> getParserForType() {
            return PARSER;
        }

        private int bitField0_;
        // optional int64 id = 1;
        public static final int ID_FIELD_NUMBER = 1;
        private long id_;

        /**
         * <code>optional int64 id = 1;</code>
         */
        public boolean hasId() {
            return ((bitField0_ & 0x00000001) == 0x00000001);
        }

        /**
         * <code>optional int64 id = 1;</code>
         */
        public long getId() {
            return id_;
        }

        // optional string name = 2;
        public static final int NAME_FIELD_NUMBER = 2;
        private java.lang.Object name_;

        /**
         * <code>optional string name = 2;</code>
         */
        public boolean hasName() {
            return ((bitField0_ & 0x00000002) == 0x00000002);
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public java.lang.String getName() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                return (java.lang.String) ref;
            } else {
                com.google.protobuf.ByteString bs =
                        (com.google.protobuf.ByteString) ref;
                java.lang.String s = bs.toStringUtf8();
                if (bs.isValidUtf8()) {
                    name_ = s;
                }
                return s;
            }
        }

        /**
         * <code>optional string name = 2;</code>
         */
        public com.google.protobuf.ByteString
        getNameBytes() {
            java.lang.Object ref = name_;
            if (ref instanceof java.lang.String) {
                com.google.protobuf.ByteString b =
                        com.google.protobuf.ByteString.copyFromUtf8(
                                (java.lang.String) ref);
                name_ = b;
                return b;
            } else {
                return (com.google.protobuf.ByteString) ref;
            }
        }

        private void initFields() {
            id_ = 0L;
            name_ = "";
        }

        private byte memoizedIsInitialized = -1;

        public final boolean isInitialized() {
            byte isInitialized = memoizedIsInitialized;
            if (isInitialized != -1) return isInitialized == 1;

            memoizedIsInitialized = 1;
            return true;
        }

        public void writeTo(com.google.protobuf.CodedOutputStream output)
                throws java.io.IOException {
            getSerializedSize();
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                output.writeInt64(1, id_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                output.writeBytes(2, getNameBytes());
            }
            getUnknownFields().writeTo(output);
        }

        private int memoizedSerializedSize = -1;

        public int getSerializedSize() {
            int size = memoizedSerializedSize;
            if (size != -1) return size;

            size = 0;
            if (((bitField0_ & 0x00000001) == 0x00000001)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeInt64Size(1, id_);
            }
            if (((bitField0_ & 0x00000002) == 0x00000002)) {
                size += com.google.protobuf.CodedOutputStream
                        .computeBytesSize(2, getNameBytes());
            }
            size += getUnknownFields().getSerializedSize();
            memoizedSerializedSize = size;
            return size;
        }

        private static final long serialVersionUID = 0L;

        @java.lang.Override
        protected java.lang.Object writeReplace()
                throws java.io.ObjectStreamException {
            return super.writeReplace();
        }

        public static UserProtos.User parseFrom(
                com.google.protobuf.ByteString data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static UserProtos.User parseFrom(
                com.google.protobuf.ByteString data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static UserProtos.User parseFrom(byte[] data)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data);
        }

        public static UserProtos.User parseFrom(
                byte[] data,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
            return PARSER.parseFrom(data, extensionRegistry);
        }

        public static UserProtos.User parseFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static UserProtos.User parseFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static UserProtos.User parseDelimitedFrom(java.io.InputStream input)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input);
        }

        public static UserProtos.User parseDelimitedFrom(
                java.io.InputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseDelimitedFrom(input, extensionRegistry);
        }

        public static UserProtos.User parseFrom(
                com.google.protobuf.CodedInputStream input)
                throws java.io.IOException {
            return PARSER.parseFrom(input);
        }

        public static UserProtos.User parseFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws java.io.IOException {
            return PARSER.parseFrom(input, extensionRegistry);
        }

        public static Builder newBuilder() {
            return Builder.create();
        }

        public Builder newBuilderForType() {
            return newBuilder();
        }

        public static Builder newBuilder(UserProtos.User prototype) {
            return newBuilder().mergeFrom(prototype);
        }

        public Builder toBuilder() {
            return newBuilder(this);
        }

        @java.lang.Override
        protected Builder newBuilderForType(
                com.google.protobuf.GeneratedMessage.BuilderParent parent) {
            Builder builder = new Builder(parent);
            return builder;
        }

        /**
         * Protobuf type {@code proto.User}
         */
        public static final class Builder extends
                com.google.protobuf.GeneratedMessage.Builder<Builder>
                implements UserProtos.UserOrBuilder {
            public static final com.google.protobuf.Descriptors.Descriptor
            getDescriptor() {
                return UserProtos.internal_static_proto_User_descriptor;
            }

            protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internalGetFieldAccessorTable() {
                return UserProtos.internal_static_proto_User_fieldAccessorTable
                        .ensureFieldAccessorsInitialized(
                                UserProtos.User.class, UserProtos.User.Builder.class);
            }

            // Construct using proto.UserProtos.User.newBuilder()
            private Builder() {
                maybeForceBuilderInitialization();
            }

            private Builder(
                    com.google.protobuf.GeneratedMessage.BuilderParent parent) {
                super(parent);
                maybeForceBuilderInitialization();
            }

            private void maybeForceBuilderInitialization() {
                if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
                }
            }

            private static Builder create() {
                return new Builder();
            }

            public Builder clear() {
                super.clear();
                id_ = 0L;
                bitField0_ = (bitField0_ & ~0x00000001);
                name_ = "";
                bitField0_ = (bitField0_ & ~0x00000002);
                return this;
            }

            public Builder clone() {
                return create().mergeFrom(buildPartial());
            }

            public com.google.protobuf.Descriptors.Descriptor
            getDescriptorForType() {
                return UserProtos.internal_static_proto_User_descriptor;
            }

            public UserProtos.User getDefaultInstanceForType() {
                return UserProtos.User.getDefaultInstance();
            }

            public UserProtos.User build() {
                UserProtos.User result = buildPartial();
                if (!result.isInitialized()) {
                    throw newUninitializedMessageException(result);
                }
                return result;
            }

            public UserProtos.User buildPartial() {
                UserProtos.User result = new UserProtos.User(this);
                int from_bitField0_ = bitField0_;
                int to_bitField0_ = 0;
                if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
                    to_bitField0_ |= 0x00000001;
                }
                result.id_ = id_;
                if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
                    to_bitField0_ |= 0x00000002;
                }
                result.name_ = name_;
                result.bitField0_ = to_bitField0_;
                onBuilt();
                return result;
            }

            public Builder mergeFrom(com.google.protobuf.Message other) {
                if (other instanceof UserProtos.User) {
                    return mergeFrom((UserProtos.User) other);
                } else {
                    super.mergeFrom(other);
                    return this;
                }
            }

            public Builder mergeFrom(UserProtos.User other) {
                if (other == UserProtos.User.getDefaultInstance()) return this;
                if (other.hasId()) {
                    setId(other.getId());
                }
                if (other.hasName()) {
                    bitField0_ |= 0x00000002;
                    name_ = other.name_;
                    onChanged();
                }
                this.mergeUnknownFields(other.getUnknownFields());
                return this;
            }

            public final boolean isInitialized() {
                return true;
            }

            public Builder mergeFrom(
                    com.google.protobuf.CodedInputStream input,
                    com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                    throws java.io.IOException {
                UserProtos.User parsedMessage = null;
                try {
                    parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
                } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                    parsedMessage = (UserProtos.User) e.getUnfinishedMessage();
                    throw e;
                } finally {
                    if (parsedMessage != null) {
                        mergeFrom(parsedMessage);
                    }
                }
                return this;
            }

            private int bitField0_;

            // optional int64 id = 1;
            private long id_;

            /**
             * <code>optional int64 id = 1;</code>
             */
            public boolean hasId() {
                return ((bitField0_ & 0x00000001) == 0x00000001);
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public long getId() {
                return id_;
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public Builder setId(long value) {
                bitField0_ |= 0x00000001;
                id_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional int64 id = 1;</code>
             */
            public Builder clearId() {
                bitField0_ = (bitField0_ & ~0x00000001);
                id_ = 0L;
                onChanged();
                return this;
            }

            // optional string name = 2;
            private java.lang.Object name_ = "";

            /**
             * <code>optional string name = 2;</code>
             */
            public boolean hasName() {
                return ((bitField0_ & 0x00000002) == 0x00000002);
            }

            /**
             * <code>optional string name = 2;</code>
             */
            public java.lang.String getName() {
                java.lang.Object ref = name_;
                if (!(ref instanceof java.lang.String)) {
                    java.lang.String s = ((com.google.protobuf.ByteString) ref)
                            .toStringUtf8();
                    name_ = s;
                    return s;
                } else {
                    return (java.lang.String) ref;
                }
            }

            /**
             * <code>optional string name = 2;</code>
             */
            public com.google.protobuf.ByteString
            getNameBytes() {
                java.lang.Object ref = name_;
                if (ref instanceof String) {
                    com.google.protobuf.ByteString b =
                            com.google.protobuf.ByteString.copyFromUtf8(
                                    (java.lang.String) ref);
                    name_ = b;
                    return b;
                } else {
                    return (com.google.protobuf.ByteString) ref;
                }
            }

            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setName(
                    java.lang.String value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }

            /**
             * <code>optional string name = 2;</code>
             */
            public Builder clearName() {
                bitField0_ = (bitField0_ & ~0x00000002);
                name_ = getDefaultInstance().getName();
                onChanged();
                return this;
            }

            /**
             * <code>optional string name = 2;</code>
             */
            public Builder setNameBytes(
                    com.google.protobuf.ByteString value) {
                if (value == null) {
                    throw new NullPointerException();
                }
                bitField0_ |= 0x00000002;
                name_ = value;
                onChanged();
                return this;
            }

            // @@protoc_insertion_point(builder_scope:proto.User)
        }

        static {
            defaultInstance = new User(true);
            defaultInstance.initFields();
        }

        // @@protoc_insertion_point(class_scope:proto.User)
    }

    private static com.google.protobuf.Descriptors.Descriptor
            internal_static_proto_User_descriptor;
    private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
            internal_static_proto_User_fieldAccessorTable;

    public static com.google.protobuf.Descriptors.FileDescriptor
    getDescriptor() {
        return descriptor;
    }

    private static com.google.protobuf.Descriptors.FileDescriptor
            descriptor;

    static {
        java.lang.String[] descriptorData = {
                "\n\020proto/user.proto\022\005proto\" \n\004User\022\n\n\002id\030" +
                        "\001 \001(\003\022\014\n\004name\030\002 \001(\tB\023\n\005protoB\nUserProtos"
        };
        com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
                new com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner() {
                    public com.google.protobuf.ExtensionRegistry assignDescriptors(
                            com.google.protobuf.Descriptors.FileDescriptor root) {
                        descriptor = root;
                        internal_static_proto_User_descriptor =
                                getDescriptor().getMessageTypes().get(0);
                        internal_static_proto_User_fieldAccessorTable = new
                                com.google.protobuf.GeneratedMessage.FieldAccessorTable(
                                internal_static_proto_User_descriptor,
                                new java.lang.String[]{"Id", "Name",});
                        return null;
                    }
                };
        com.google.protobuf.Descriptors.FileDescriptor
                .internalBuildGeneratedFileFrom(descriptorData,
                        new com.google.protobuf.Descriptors.FileDescriptor[]{
                        }, assigner);
    }

    // @@protoc_insertion_point(outer_class_scope)
}