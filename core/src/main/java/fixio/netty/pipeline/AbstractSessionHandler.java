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
package fixio.netty.pipeline;

import fixio.events.LogoutEvent;
import fixio.fixprotocol.FieldType;
import fixio.fixprotocol.FixMessage;
import fixio.fixprotocol.FixMessageBuilder;
import fixio.fixprotocol.FixMessageBuilderImpl;
import fixio.fixprotocol.FixMessageHeader;
import fixio.fixprotocol.MessageTypes;
import fixio.fixprotocol.session.FixSession;
import fixio.handlers.FixApplication;
import fixio.validator.BusinessRejectException;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToMessageCodec;
import io.netty.util.Attribute;
import io.netty.util.AttributeKey;
import org.slf4j.Logger;
import java.util.List;

public abstract class AbstractSessionHandler extends MessageToMessageCodec<FixMessage, FixMessageBuilder> {

    public static final AttributeKey<FixSession> FIX_SESSION_KEY = AttributeKey.valueOf("fixSession");

    private final FixApplication fixApplication;

    private final FixClock fixClock;

    private final SessionRepository sessionRepository;

    protected AbstractSessionHandler(FixApplication fixApplication, FixClock fixClock, SessionRepository sessionRepository) {
        assert (fixApplication != null) : "FixApplication is required";
        assert (fixClock != null) : "Clock is required";
        this.fixApplication = fixApplication;
        this.fixClock = fixClock;
        this.sessionRepository = sessionRepository;
    }

    private static FixMessageBuilderImpl createReject(FixMessage originalMsg) {
        final FixMessageBuilderImpl reject = new FixMessageBuilderImpl(MessageTypes.REJECT);
        reject.add(FieldType.RefSeqNum, originalMsg.getInt(FieldType.MsgSeqNum.tag()));
        reject.add(FieldType.RefMsgType, originalMsg.getMessageType());
        return reject;
    }

    private static FixMessageBuilderImpl createBusinessReject(BusinessRejectException exception) {
        final FixMessageBuilderImpl reject = new FixMessageBuilderImpl(MessageTypes.BUSINESS_MESSAGE_REJECT);
        if (exception.getRefSeqNum() > 0) {
            reject.add(FieldType.RefSeqNum, exception.getRefSeqNum());
        }
        reject.add(FieldType.RefMsgType, exception.getRefMsgType());
        reject.add(FieldType.BusinessRejectReason, exception.getBusinessRejectReason());
        if (exception.getText() != null) {
            reject.add(FieldType.Text, exception.getText());
        }
        return reject;
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void prepareMessageToSend(ChannelHandlerContext ctx, FixMessageBuilder response) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void prepareMessageToSend(ChannelHandlerContext ctx, FixSession session, FixMessageBuilder response) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Retrieves {@link FixSession} from context.
     *
     * @param ctx context
     * @return FixSession or null, if session not established.
     */
    protected FixSession getSession(ChannelHandlerContext ctx) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected boolean setSession(ChannelHandlerContext ctx, FixSession fixSession) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void encode(ChannelHandlerContext ctx, FixMessageBuilder msg, List<Object> out) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    protected void decode(ChannelHandlerContext ctx, FixMessage msg, List<Object> out) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected abstract Logger getLogger();

    protected void sendReject(ChannelHandlerContext ctx, FixMessage originalMsg, boolean closeConnection) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected FixApplication getFixApplication() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected SessionRepository getSessionRepository() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
