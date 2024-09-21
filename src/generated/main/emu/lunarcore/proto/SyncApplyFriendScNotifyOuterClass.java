// Code generated by protocol buffer compiler. Do not edit!
package emu.lunarcore.proto;

import java.io.IOException;
import us.hebi.quickbuf.FieldName;
import us.hebi.quickbuf.InvalidProtocolBufferException;
import us.hebi.quickbuf.JsonSink;
import us.hebi.quickbuf.JsonSource;
import us.hebi.quickbuf.MessageFactory;
import us.hebi.quickbuf.ProtoMessage;
import us.hebi.quickbuf.ProtoSink;
import us.hebi.quickbuf.ProtoSource;

public final class SyncApplyFriendScNotifyOuterClass {
  /**
   * Protobuf type {@code SyncApplyFriendScNotify}
   */
  public static final class SyncApplyFriendScNotify extends ProtoMessage<SyncApplyFriendScNotify> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     */
    private final FriendApplyInfoOuterClass.FriendApplyInfo friendApplyInfo = FriendApplyInfoOuterClass.FriendApplyInfo.newInstance();

    private SyncApplyFriendScNotify() {
    }

    /**
     * @return a new empty instance of {@code SyncApplyFriendScNotify}
     */
    public static SyncApplyFriendScNotify newInstance() {
      return new SyncApplyFriendScNotify();
    }

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     * @return whether the friendApplyInfo field is set
     */
    public boolean hasFriendApplyInfo() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     * @return this
     */
    public SyncApplyFriendScNotify clearFriendApplyInfo() {
      bitField0_ &= ~0x00000001;
      friendApplyInfo.clear();
      return this;
    }

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableFriendApplyInfo()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public FriendApplyInfoOuterClass.FriendApplyInfo getFriendApplyInfo() {
      return friendApplyInfo;
    }

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public FriendApplyInfoOuterClass.FriendApplyInfo getMutableFriendApplyInfo() {
      bitField0_ |= 0x00000001;
      return friendApplyInfo;
    }

    /**
     * <code>optional .FriendApplyInfo friend_apply_info = 6;</code>
     * @param value the friendApplyInfo to set
     * @return this
     */
    public SyncApplyFriendScNotify setFriendApplyInfo(
        final FriendApplyInfoOuterClass.FriendApplyInfo value) {
      bitField0_ |= 0x00000001;
      friendApplyInfo.copyFrom(value);
      return this;
    }

    @Override
    public SyncApplyFriendScNotify copyFrom(final SyncApplyFriendScNotify other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        friendApplyInfo.copyFrom(other.friendApplyInfo);
      }
      return this;
    }

    @Override
    public SyncApplyFriendScNotify mergeFrom(final SyncApplyFriendScNotify other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasFriendApplyInfo()) {
        getMutableFriendApplyInfo().mergeFrom(other.friendApplyInfo);
      }
      return this;
    }

    @Override
    public SyncApplyFriendScNotify clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendApplyInfo.clear();
      return this;
    }

    @Override
    public SyncApplyFriendScNotify clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      friendApplyInfo.clearQuick();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof SyncApplyFriendScNotify)) {
        return false;
      }
      SyncApplyFriendScNotify other = (SyncApplyFriendScNotify) o;
      return bitField0_ == other.bitField0_
        && (!hasFriendApplyInfo() || friendApplyInfo.equals(other.friendApplyInfo));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 50);
        output.writeMessageNoTag(friendApplyInfo);
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeMessageSizeNoTag(friendApplyInfo);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public SyncApplyFriendScNotify mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 50: {
            // friendApplyInfo
            input.readMessage(friendApplyInfo);
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 0) {
              break;
            }
          }
          case 0: {
            return this;
          }
          default: {
            if (!input.skipField(tag)) {
              return this;
            }
            tag = input.readTag();
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeMessage(FieldNames.friendApplyInfo, friendApplyInfo);
      }
      output.endObject();
    }

    @Override
    public SyncApplyFriendScNotify mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case -1582425026:
          case 1375841056: {
            if (input.isAtField(FieldNames.friendApplyInfo)) {
              if (!input.trySkipNullValue()) {
                input.readMessage(friendApplyInfo);
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          default: {
            input.skipUnknownField();
            break;
          }
        }
      }
      input.endObject();
      return this;
    }

    @Override
    public SyncApplyFriendScNotify clone() {
      return new SyncApplyFriendScNotify().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static SyncApplyFriendScNotify parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new SyncApplyFriendScNotify(), data).checkInitialized();
    }

    public static SyncApplyFriendScNotify parseFrom(final ProtoSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncApplyFriendScNotify(), input).checkInitialized();
    }

    public static SyncApplyFriendScNotify parseFrom(final JsonSource input) throws IOException {
      return ProtoMessage.mergeFrom(new SyncApplyFriendScNotify(), input).checkInitialized();
    }

    /**
     * @return factory for creating SyncApplyFriendScNotify messages
     */
    public static MessageFactory<SyncApplyFriendScNotify> getFactory() {
      return SyncApplyFriendScNotifyFactory.INSTANCE;
    }

    private enum SyncApplyFriendScNotifyFactory implements MessageFactory<SyncApplyFriendScNotify> {
      INSTANCE;

      @Override
      public SyncApplyFriendScNotify create() {
        return SyncApplyFriendScNotify.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName friendApplyInfo = FieldName.forField("friendApplyInfo", "friend_apply_info");
    }
  }
}
