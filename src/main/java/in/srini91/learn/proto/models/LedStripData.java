// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpio.proto

package in.srini91.learn.proto.models;

/**
 * Protobuf type {@code LedStripData}
 */
public final class LedStripData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:LedStripData)
    LedStripDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use LedStripData.newBuilder() to construct.
  private LedStripData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private LedStripData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new LedStripData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private LedStripData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            pixelCount_ = input.readInt32();
            break;
          }
          case 17: {

            brightness_ = input.readDouble();
            break;
          }
          case 24: {

            allPixel_ = input.readBool();
            break;
          }
          case 32: {

            pixelNo_ = input.readInt32();
            break;
          }
          case 40: {

            pixelColor_ = input.readInt32();
            break;
          }
          case 48: {

            turnOff_ = input.readBool();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return in.srini91.learn.proto.models.Gpio.internal_static_LedStripData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return in.srini91.learn.proto.models.Gpio.internal_static_LedStripData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            in.srini91.learn.proto.models.LedStripData.class, in.srini91.learn.proto.models.LedStripData.Builder.class);
  }

  public static final int PIXELCOUNT_FIELD_NUMBER = 1;
  private int pixelCount_;
  /**
   * <code>int32 pixelCount = 1;</code>
   * @return The pixelCount.
   */
  @java.lang.Override
  public int getPixelCount() {
    return pixelCount_;
  }

  public static final int BRIGHTNESS_FIELD_NUMBER = 2;
  private double brightness_;
  /**
   * <code>double brightness = 2;</code>
   * @return The brightness.
   */
  @java.lang.Override
  public double getBrightness() {
    return brightness_;
  }

  public static final int ALLPIXEL_FIELD_NUMBER = 3;
  private boolean allPixel_;
  /**
   * <code>bool allPixel = 3;</code>
   * @return The allPixel.
   */
  @java.lang.Override
  public boolean getAllPixel() {
    return allPixel_;
  }

  public static final int PIXELNO_FIELD_NUMBER = 4;
  private int pixelNo_;
  /**
   * <code>int32 pixelNo = 4;</code>
   * @return The pixelNo.
   */
  @java.lang.Override
  public int getPixelNo() {
    return pixelNo_;
  }

  public static final int PIXELCOLOR_FIELD_NUMBER = 5;
  private int pixelColor_;
  /**
   * <code>int32 pixelColor = 5;</code>
   * @return The pixelColor.
   */
  @java.lang.Override
  public int getPixelColor() {
    return pixelColor_;
  }

  public static final int TURNOFF_FIELD_NUMBER = 6;
  private boolean turnOff_;
  /**
   * <code>bool turnOff = 6;</code>
   * @return The turnOff.
   */
  @java.lang.Override
  public boolean getTurnOff() {
    return turnOff_;
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
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (pixelCount_ != 0) {
      output.writeInt32(1, pixelCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(brightness_) != 0) {
      output.writeDouble(2, brightness_);
    }
    if (allPixel_ != false) {
      output.writeBool(3, allPixel_);
    }
    if (pixelNo_ != 0) {
      output.writeInt32(4, pixelNo_);
    }
    if (pixelColor_ != 0) {
      output.writeInt32(5, pixelColor_);
    }
    if (turnOff_ != false) {
      output.writeBool(6, turnOff_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (pixelCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, pixelCount_);
    }
    if (java.lang.Double.doubleToRawLongBits(brightness_) != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(2, brightness_);
    }
    if (allPixel_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(3, allPixel_);
    }
    if (pixelNo_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(4, pixelNo_);
    }
    if (pixelColor_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(5, pixelColor_);
    }
    if (turnOff_ != false) {
      size += com.google.protobuf.CodedOutputStream
        .computeBoolSize(6, turnOff_);
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
    if (!(obj instanceof in.srini91.learn.proto.models.LedStripData)) {
      return super.equals(obj);
    }
    in.srini91.learn.proto.models.LedStripData other = (in.srini91.learn.proto.models.LedStripData) obj;

    if (getPixelCount()
        != other.getPixelCount()) return false;
    if (java.lang.Double.doubleToLongBits(getBrightness())
        != java.lang.Double.doubleToLongBits(
            other.getBrightness())) return false;
    if (getAllPixel()
        != other.getAllPixel()) return false;
    if (getPixelNo()
        != other.getPixelNo()) return false;
    if (getPixelColor()
        != other.getPixelColor()) return false;
    if (getTurnOff()
        != other.getTurnOff()) return false;
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
    hash = (37 * hash) + PIXELCOUNT_FIELD_NUMBER;
    hash = (53 * hash) + getPixelCount();
    hash = (37 * hash) + BRIGHTNESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBrightness()));
    hash = (37 * hash) + ALLPIXEL_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getAllPixel());
    hash = (37 * hash) + PIXELNO_FIELD_NUMBER;
    hash = (53 * hash) + getPixelNo();
    hash = (37 * hash) + PIXELCOLOR_FIELD_NUMBER;
    hash = (53 * hash) + getPixelColor();
    hash = (37 * hash) + TURNOFF_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(
        getTurnOff());
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static in.srini91.learn.proto.models.LedStripData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static in.srini91.learn.proto.models.LedStripData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static in.srini91.learn.proto.models.LedStripData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(in.srini91.learn.proto.models.LedStripData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code LedStripData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:LedStripData)
      in.srini91.learn.proto.models.LedStripDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return in.srini91.learn.proto.models.Gpio.internal_static_LedStripData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return in.srini91.learn.proto.models.Gpio.internal_static_LedStripData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              in.srini91.learn.proto.models.LedStripData.class, in.srini91.learn.proto.models.LedStripData.Builder.class);
    }

    // Construct using in.srini91.learn.proto.models.LedStripData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      pixelCount_ = 0;

      brightness_ = 0D;

      allPixel_ = false;

      pixelNo_ = 0;

      pixelColor_ = 0;

      turnOff_ = false;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return in.srini91.learn.proto.models.Gpio.internal_static_LedStripData_descriptor;
    }

    @java.lang.Override
    public in.srini91.learn.proto.models.LedStripData getDefaultInstanceForType() {
      return in.srini91.learn.proto.models.LedStripData.getDefaultInstance();
    }

    @java.lang.Override
    public in.srini91.learn.proto.models.LedStripData build() {
      in.srini91.learn.proto.models.LedStripData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public in.srini91.learn.proto.models.LedStripData buildPartial() {
      in.srini91.learn.proto.models.LedStripData result = new in.srini91.learn.proto.models.LedStripData(this);
      result.pixelCount_ = pixelCount_;
      result.brightness_ = brightness_;
      result.allPixel_ = allPixel_;
      result.pixelNo_ = pixelNo_;
      result.pixelColor_ = pixelColor_;
      result.turnOff_ = turnOff_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof in.srini91.learn.proto.models.LedStripData) {
        return mergeFrom((in.srini91.learn.proto.models.LedStripData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(in.srini91.learn.proto.models.LedStripData other) {
      if (other == in.srini91.learn.proto.models.LedStripData.getDefaultInstance()) return this;
      if (other.getPixelCount() != 0) {
        setPixelCount(other.getPixelCount());
      }
      if (other.getBrightness() != 0D) {
        setBrightness(other.getBrightness());
      }
      if (other.getAllPixel() != false) {
        setAllPixel(other.getAllPixel());
      }
      if (other.getPixelNo() != 0) {
        setPixelNo(other.getPixelNo());
      }
      if (other.getPixelColor() != 0) {
        setPixelColor(other.getPixelColor());
      }
      if (other.getTurnOff() != false) {
        setTurnOff(other.getTurnOff());
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
      in.srini91.learn.proto.models.LedStripData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (in.srini91.learn.proto.models.LedStripData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int pixelCount_ ;
    /**
     * <code>int32 pixelCount = 1;</code>
     * @return The pixelCount.
     */
    @java.lang.Override
    public int getPixelCount() {
      return pixelCount_;
    }
    /**
     * <code>int32 pixelCount = 1;</code>
     * @param value The pixelCount to set.
     * @return This builder for chaining.
     */
    public Builder setPixelCount(int value) {
      
      pixelCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pixelCount = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixelCount() {
      
      pixelCount_ = 0;
      onChanged();
      return this;
    }

    private double brightness_ ;
    /**
     * <code>double brightness = 2;</code>
     * @return The brightness.
     */
    @java.lang.Override
    public double getBrightness() {
      return brightness_;
    }
    /**
     * <code>double brightness = 2;</code>
     * @param value The brightness to set.
     * @return This builder for chaining.
     */
    public Builder setBrightness(double value) {
      
      brightness_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double brightness = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearBrightness() {
      
      brightness_ = 0D;
      onChanged();
      return this;
    }

    private boolean allPixel_ ;
    /**
     * <code>bool allPixel = 3;</code>
     * @return The allPixel.
     */
    @java.lang.Override
    public boolean getAllPixel() {
      return allPixel_;
    }
    /**
     * <code>bool allPixel = 3;</code>
     * @param value The allPixel to set.
     * @return This builder for chaining.
     */
    public Builder setAllPixel(boolean value) {
      
      allPixel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool allPixel = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearAllPixel() {
      
      allPixel_ = false;
      onChanged();
      return this;
    }

    private int pixelNo_ ;
    /**
     * <code>int32 pixelNo = 4;</code>
     * @return The pixelNo.
     */
    @java.lang.Override
    public int getPixelNo() {
      return pixelNo_;
    }
    /**
     * <code>int32 pixelNo = 4;</code>
     * @param value The pixelNo to set.
     * @return This builder for chaining.
     */
    public Builder setPixelNo(int value) {
      
      pixelNo_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pixelNo = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixelNo() {
      
      pixelNo_ = 0;
      onChanged();
      return this;
    }

    private int pixelColor_ ;
    /**
     * <code>int32 pixelColor = 5;</code>
     * @return The pixelColor.
     */
    @java.lang.Override
    public int getPixelColor() {
      return pixelColor_;
    }
    /**
     * <code>int32 pixelColor = 5;</code>
     * @param value The pixelColor to set.
     * @return This builder for chaining.
     */
    public Builder setPixelColor(int value) {
      
      pixelColor_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 pixelColor = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPixelColor() {
      
      pixelColor_ = 0;
      onChanged();
      return this;
    }

    private boolean turnOff_ ;
    /**
     * <code>bool turnOff = 6;</code>
     * @return The turnOff.
     */
    @java.lang.Override
    public boolean getTurnOff() {
      return turnOff_;
    }
    /**
     * <code>bool turnOff = 6;</code>
     * @param value The turnOff to set.
     * @return This builder for chaining.
     */
    public Builder setTurnOff(boolean value) {
      
      turnOff_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>bool turnOff = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearTurnOff() {
      
      turnOff_ = false;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:LedStripData)
  }

  // @@protoc_insertion_point(class_scope:LedStripData)
  private static final in.srini91.learn.proto.models.LedStripData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new in.srini91.learn.proto.models.LedStripData();
  }

  public static in.srini91.learn.proto.models.LedStripData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LedStripData>
      PARSER = new com.google.protobuf.AbstractParser<LedStripData>() {
    @java.lang.Override
    public LedStripData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new LedStripData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<LedStripData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LedStripData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public in.srini91.learn.proto.models.LedStripData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

