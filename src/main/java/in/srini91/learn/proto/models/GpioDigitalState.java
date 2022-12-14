// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gpio.proto

package in.srini91.learn.proto.models;

/**
 * Protobuf enum {@code GpioDigitalState}
 */
public enum GpioDigitalState
    implements com.google.protobuf.ProtocolMessageEnum {
  /**
   * <code>LOW = 0;</code>
   */
  LOW(0),
  /**
   * <code>HIGH = 1;</code>
   */
  HIGH(1),
  UNRECOGNIZED(-1),
  ;

  /**
   * <code>LOW = 0;</code>
   */
  public static final int LOW_VALUE = 0;
  /**
   * <code>HIGH = 1;</code>
   */
  public static final int HIGH_VALUE = 1;


  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static GpioDigitalState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static GpioDigitalState forNumber(int value) {
    switch (value) {
      case 0: return LOW;
      case 1: return HIGH;
      default: return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<GpioDigitalState>
      internalGetValueMap() {
    return internalValueMap;
  }
  private static final com.google.protobuf.Internal.EnumLiteMap<
      GpioDigitalState> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<GpioDigitalState>() {
          public GpioDigitalState findValueByNumber(int number) {
            return GpioDigitalState.forNumber(number);
          }
        };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor
      getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }
  public final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptorForType() {
    return getDescriptor();
  }
  public static final com.google.protobuf.Descriptors.EnumDescriptor
      getDescriptor() {
    return in.srini91.learn.proto.models.Gpio.getDescriptor().getEnumTypes().get(1);
  }

  private static final GpioDigitalState[] VALUES = values();

  public static GpioDigitalState valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException(
        "EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private GpioDigitalState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:GpioDigitalState)
}

