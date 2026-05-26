/*
 * Copyright 2014 The FIX.io Project
 *
 * The FIX.io Project licenses this file to you under the Apache License,
 * version 2.0 (the "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package fixio.netty.codec;

import fixio.fixprotocol.FieldType;
import fixio.fixprotocol.FixMessageImpl;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.DecoderException;
import io.netty.handler.codec.MessageToMessageDecoder;
import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * Decodes series of {@link ByteBuf}s into FixMessages.
 * <p>
 * Use following code to configure {@link io.netty.channel.ChannelPipeline}:
 * </p>
 * <pre><code>
 * ChannelPipeline pipeline = ch.pipeline();
 * pipeline.addLast("tagDecoder", new DelimiterBasedFrameDecoder(1024, Unpooled.wrappedBuffer(new byte[]{1})));
 * pipeline.addLast("fixMessageDecoder", new FixMessageDecoder());
 * pipeline.addLast("fixMessageEncoder", new FixMessageEncoder());
 * </code></pre>
 * <p>
 * FixMessageDecoder should be preceded in pipeline with {@link io.netty.handler.codec.DelimiterBasedFrameDecoder},
 * which is responsible for detecting FIX Protocol tags.
 * </p>
 * <p>
 * <strong>This class is not thread safe!</strong>
 * It should be a separate instance per {@link io.netty.channel.Channel}.
 * </p>
 */
public class FixMessageDecoder extends MessageToMessageDecoder<ByteBuf> {

    private FixMessageImpl message;

    private int checksum;

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, ByteBuf in, List<Object> out) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void appendField(int tag, byte[] value, int offset, int valueLength) {
        if (message == null) {
            String strValue = new String(value, offset, Math.min(10, valueLength), StandardCharsets.US_ASCII);
            if (valueLength > 10) {
                strValue += "...";
            }
            throw new DecoderException("BeginString tag expected, but got: " + tag + "=" + strValue);
        }
        FieldType type = FieldType.forTag(tag);
        if (type == null) {
            throw new DecoderException("Unknown tag: " + tag);
        }
        message.add(tag, value, offset, valueLength);
    }

    private void verifyChecksum(int declaredChecksum) {
        checksum = (checksum % 256);
        if (declaredChecksum != checksum) {
            message = null;
            throw new DecoderException("Checksum mismatch. Expected: " + declaredChecksum + " but found: " + checksum);
        }
    }

    private void reset() {
        message = null;
        checksum = -1;
    }
}
