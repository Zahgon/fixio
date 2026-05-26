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
package fixio.examples.quickfix;

import fixio.examples.common.AbstractQuoteStreamingWorker;
import fixio.examples.common.Quote;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import quickfix.Application;
import quickfix.DoubleField;
import quickfix.FieldNotFound;
import quickfix.Message;
import quickfix.Session;
import quickfix.SessionID;
import quickfix.SessionNotFound;
import quickfix.field.MktBidPx;
import quickfix.field.MktOfferPx;
import quickfix.field.MsgType;
import quickfix.field.QuoteReqID;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Collectors;

public class QuickFixStreamingApp implements Application {

    private static final Logger LOGGER = LoggerFactory.getLogger(QuickFixStreamingApp.class);

    private static final MsgType QUOTE_MSG_TYPE = new MsgType(MsgType.QUOTE);

    private final Map<String, SessionID> subscriptions = new ConcurrentHashMap<>();

    public QuickFixStreamingApp(BlockingQueue<Quote> quoteQueue) {
        StreamingWorker streamingWorker = new StreamingWorker(quoteQueue);
        new Thread(streamingWorker, "StreamingWorker").start();
    }

    private static Message createQuoteMessage(String reqId, Quote quote) {
        Message message = new Message();
        message.getHeader().setField(QUOTE_MSG_TYPE);
        message.setField(new QuoteReqID(reqId));
        message.setField(new DoubleField(MktBidPx.FIELD, quote.getBid(), 2));
        message.setField(new DoubleField(MktOfferPx.FIELD, quote.getBid(), 2));
        return message;
    }

    @Override
    public void onCreate(SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void onLogon(SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void onLogout(SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void toAdmin(Message message, SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void fromAdmin(Message message, SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void toApp(Message message, SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void fromApp(Message message, SessionID sessionID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void stopStreaming(SessionID sessionID) {
        ArrayList<String> requestsToCancel = new ArrayList<>(subscriptions.size());
        requestsToCancel.addAll(subscriptions.entrySet().stream().filter(entry -> entry.getValue() == sessionID).map(Map.Entry::getKey).collect(Collectors.toList()));
        requestsToCancel.forEach(subscriptions::remove);
        LOGGER.info("Streaming Stopped for {}", sessionID);
    }

    private class StreamingWorker extends AbstractQuoteStreamingWorker {

        public StreamingWorker(BlockingQueue<Quote> quoteQueue) {
            super(quoteQueue);
        }

        @Override
        protected void sendQuotes(List<Quote> buffer) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
