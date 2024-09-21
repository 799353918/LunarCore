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
import us.hebi.quickbuf.RepeatedInt;

public final class DeleteSocialEventServerCacheScRspOuterClass {
  /**
   * Protobuf type {@code DeleteSocialEventServerCacheScRsp}
   */
  public static final class DeleteSocialEventServerCacheScRsp extends ProtoMessage<DeleteSocialEventServerCacheScRsp> implements Cloneable {
    private static final long serialVersionUID = 0L;

    /**
     * <code>optional uint32 retcode = 8;</code>
     */
    private int retcode;

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     */
    private final RepeatedInt retDeleteCache = RepeatedInt.newEmptyInstance();

    private DeleteSocialEventServerCacheScRsp() {
    }

    /**
     * @return a new empty instance of {@code DeleteSocialEventServerCacheScRsp}
     */
    public static DeleteSocialEventServerCacheScRsp newInstance() {
      return new DeleteSocialEventServerCacheScRsp();
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return whether the retcode field is set
     */
    public boolean hasRetcode() {
      return (bitField0_ & 0x00000001) != 0;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return this
     */
    public DeleteSocialEventServerCacheScRsp clearRetcode() {
      bitField0_ &= ~0x00000001;
      retcode = 0;
      return this;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @return the retcode
     */
    public int getRetcode() {
      return retcode;
    }

    /**
     * <code>optional uint32 retcode = 8;</code>
     * @param value the retcode to set
     * @return this
     */
    public DeleteSocialEventServerCacheScRsp setRetcode(final int value) {
      bitField0_ |= 0x00000001;
      retcode = value;
      return this;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     * @return whether the retDeleteCache field is set
     */
    public boolean hasRetDeleteCache() {
      return (bitField0_ & 0x00000002) != 0;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     * @return this
     */
    public DeleteSocialEventServerCacheScRsp clearRetDeleteCache() {
      bitField0_ &= ~0x00000002;
      retDeleteCache.clear();
      return this;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     *
     * This method returns the internal storage object without modifying any has state.
     * The returned object should not be modified and be treated as read-only.
     *
     * Use {@link #getMutableRetDeleteCache()} if you want to modify it.
     *
     * @return internal storage object for reading
     */
    public RepeatedInt getRetDeleteCache() {
      return retDeleteCache;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     *
     * This method returns the internal storage object and sets the corresponding
     * has state. The returned object will become part of this message and its
     * contents may be modified as long as the has state is not cleared.
     *
     * @return internal storage object for modifications
     */
    public RepeatedInt getMutableRetDeleteCache() {
      bitField0_ |= 0x00000002;
      return retDeleteCache;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     * @param value the retDeleteCache to add
     * @return this
     */
    public DeleteSocialEventServerCacheScRsp addRetDeleteCache(final int value) {
      bitField0_ |= 0x00000002;
      retDeleteCache.add(value);
      return this;
    }

    /**
     * <code>repeated uint32 ret_delete_cache = 1;</code>
     * @param values the retDeleteCache to add
     * @return this
     */
    public DeleteSocialEventServerCacheScRsp addAllRetDeleteCache(final int... values) {
      bitField0_ |= 0x00000002;
      retDeleteCache.addAll(values);
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheScRsp copyFrom(
        final DeleteSocialEventServerCacheScRsp other) {
      cachedSize = other.cachedSize;
      if ((bitField0_ | other.bitField0_) != 0) {
        bitField0_ = other.bitField0_;
        retcode = other.retcode;
        retDeleteCache.copyFrom(other.retDeleteCache);
      }
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheScRsp mergeFrom(
        final DeleteSocialEventServerCacheScRsp other) {
      if (other.isEmpty()) {
        return this;
      }
      cachedSize = -1;
      if (other.hasRetcode()) {
        setRetcode(other.retcode);
      }
      if (other.hasRetDeleteCache()) {
        getMutableRetDeleteCache().addAll(other.retDeleteCache);
      }
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheScRsp clear() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retcode = 0;
      retDeleteCache.clear();
      return this;
    }

    @Override
    public DeleteSocialEventServerCacheScRsp clearQuick() {
      if (isEmpty()) {
        return this;
      }
      cachedSize = -1;
      bitField0_ = 0;
      retDeleteCache.clear();
      return this;
    }

    @Override
    public boolean equals(Object o) {
      if (o == this) {
        return true;
      }
      if (!(o instanceof DeleteSocialEventServerCacheScRsp)) {
        return false;
      }
      DeleteSocialEventServerCacheScRsp other = (DeleteSocialEventServerCacheScRsp) o;
      return bitField0_ == other.bitField0_
        && (!hasRetcode() || retcode == other.retcode)
        && (!hasRetDeleteCache() || retDeleteCache.equals(other.retDeleteCache));
    }

    @Override
    public void writeTo(final ProtoSink output) throws IOException {
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeRawByte((byte) 64);
        output.writeUInt32NoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        for (int i = 0; i < retDeleteCache.length(); i++) {
          output.writeRawByte((byte) 8);
          output.writeUInt32NoTag(retDeleteCache.array()[i]);
        }
      }
    }

    @Override
    protected int computeSerializedSize() {
      int size = 0;
      if ((bitField0_ & 0x00000001) != 0) {
        size += 1 + ProtoSink.computeUInt32SizeNoTag(retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        size += (1 * retDeleteCache.length()) + ProtoSink.computeRepeatedUInt32SizeNoTag(retDeleteCache);
      }
      return size;
    }

    @Override
    @SuppressWarnings("fallthrough")
    public DeleteSocialEventServerCacheScRsp mergeFrom(final ProtoSource input) throws IOException {
      // Enabled Fall-Through Optimization (QuickBuffers)
      int tag = input.readTag();
      while (true) {
        switch (tag) {
          case 64: {
            // retcode
            retcode = input.readUInt32();
            bitField0_ |= 0x00000001;
            tag = input.readTag();
            if (tag != 10) {
              break;
            }
          }
          case 10: {
            // retDeleteCache [packed=true]
            input.readPackedUInt32(retDeleteCache, tag);
            bitField0_ |= 0x00000002;
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
          case 8: {
            // retDeleteCache [packed=false]
            tag = input.readRepeatedUInt32(retDeleteCache, tag);
            bitField0_ |= 0x00000002;
            break;
          }
        }
      }
    }

    @Override
    public void writeTo(final JsonSink output) throws IOException {
      output.beginObject();
      if ((bitField0_ & 0x00000001) != 0) {
        output.writeUInt32(FieldNames.retcode, retcode);
      }
      if ((bitField0_ & 0x00000002) != 0) {
        output.writeRepeatedUInt32(FieldNames.retDeleteCache, retDeleteCache);
      }
      output.endObject();
    }

    @Override
    public DeleteSocialEventServerCacheScRsp mergeFrom(final JsonSource input) throws IOException {
      if (!input.beginObject()) {
        return this;
      }
      while (!input.isAtEnd()) {
        switch (input.readFieldHash()) {
          case 1097936398: {
            if (input.isAtField(FieldNames.retcode)) {
              if (!input.trySkipNullValue()) {
                retcode = input.readUInt32();
                bitField0_ |= 0x00000001;
              }
            } else {
              input.skipUnknownField();
            }
            break;
          }
          case 1240268086:
          case -1478890804: {
            if (input.isAtField(FieldNames.retDeleteCache)) {
              if (!input.trySkipNullValue()) {
                input.readRepeatedUInt32(retDeleteCache);
                bitField0_ |= 0x00000002;
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
    public DeleteSocialEventServerCacheScRsp clone() {
      return new DeleteSocialEventServerCacheScRsp().copyFrom(this);
    }

    @Override
    public boolean isEmpty() {
      return ((bitField0_) == 0);
    }

    public static DeleteSocialEventServerCacheScRsp parseFrom(final byte[] data) throws
        InvalidProtocolBufferException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheScRsp(), data).checkInitialized();
    }

    public static DeleteSocialEventServerCacheScRsp parseFrom(final ProtoSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheScRsp(), input).checkInitialized();
    }

    public static DeleteSocialEventServerCacheScRsp parseFrom(final JsonSource input) throws
        IOException {
      return ProtoMessage.mergeFrom(new DeleteSocialEventServerCacheScRsp(), input).checkInitialized();
    }

    /**
     * @return factory for creating DeleteSocialEventServerCacheScRsp messages
     */
    public static MessageFactory<DeleteSocialEventServerCacheScRsp> getFactory() {
      return DeleteSocialEventServerCacheScRspFactory.INSTANCE;
    }

    private enum DeleteSocialEventServerCacheScRspFactory implements MessageFactory<DeleteSocialEventServerCacheScRsp> {
      INSTANCE;

      @Override
      public DeleteSocialEventServerCacheScRsp create() {
        return DeleteSocialEventServerCacheScRsp.newInstance();
      }
    }

    /**
     * Contains name constants used for serializing JSON
     */
    static class FieldNames {
      static final FieldName retcode = FieldName.forField("retcode");

      static final FieldName retDeleteCache = FieldName.forField("retDeleteCache", "ret_delete_cache");
    }
  }
}
