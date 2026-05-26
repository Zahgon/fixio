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
package fixio.handlers;

import fixio.fixprotocol.FixMessage;
import fixio.fixprotocol.FixMessageBuilder;
import fixio.validator.BusinessRejectException;
import fixio.validator.FixMessageValidator;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Collections;
import java.util.List;

@ChannelHandler.Sharable
public class CompositeFixApplicationAdapter extends FixApplicationAdapter {

    private static final Logger LOGGER = LoggerFactory.getLogger(CompositeFixApplicationAdapter.class);

    private final List<FixMessageHandler> handlers;

    private final List<FixMessageValidator> validators;

    public CompositeFixApplicationAdapter(List<FixMessageValidator> validators, List<FixMessageHandler> handlers) {
        assert (validators != null) : "FixMessageValidators expected";
        assert (handlers != null) : "FixMessageHandlers expected";
        this.validators = Collections.unmodifiableList(validators);
        this.handlers = Collections.unmodifiableList(handlers);
    }

    @Override
    public void onMessage(ChannelHandlerContext ctx, FixMessage msg, List<Object> out) throws BusinessRejectException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void beforeSendMessage(ChannelHandlerContext ctx, FixMessageBuilder msg) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
