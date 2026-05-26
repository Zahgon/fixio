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
package fixio.fixprotocol.session;

import fixio.fixprotocol.FixConst;
import fixio.fixprotocol.FixMessageBuilder;
import fixio.fixprotocol.FixMessageHeader;
import fixio.fixprotocol.fields.DateTimeFormatterWrapper;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import static fixio.fixprotocol.FixConst.TimeStampPrecision.MICROS;
import static fixio.fixprotocol.FixConst.TimeStampPrecision.MILLIS;
import static fixio.fixprotocol.FixConst.TimeStampPrecision.NANOS;
import static fixio.fixprotocol.FixConst.TimeStampPrecision.PICOS;
import static fixio.fixprotocol.FixConst.TimeStampPrecision.SECONDS;

public class FixSession {

    private static final AtomicIntegerFieldUpdater<FixSession> INCOMING_SEQ_NUM_UPDATER = AtomicIntegerFieldUpdater.newUpdater(FixSession.class, "nextIncomingMessageSeqNum");

    private final AtomicInteger nextOutgoingMessageSeqNum = new AtomicInteger();

    private final String beginString;

    private final String senderCompID;

    private final String senderSubID;

    private final String senderLocationID;

    private final String targetCompID;

    private final String targetLocationID;

    private final String targetSubID;

    private final String defaultApplVerID;

    private final String defaultApplExtID;

    private final SessionId sessionId;

    private volatile int nextIncomingMessageSeqNum;

    private DateTimeFormatterWrapper dateTimeFormatter = FixConst.DATE_TIME_FORMATTER_MILLIS;

    private FixSession(Builder builder) {
        this.beginString = builder.beginString;
        this.senderCompID = builder.senderCompID;
        this.senderSubID = builder.senderSubID;
        this.senderLocationID = builder.senderLocationID;
        this.targetCompID = builder.targetCompID;
        this.targetSubID = builder.targetSubID;
        this.targetLocationID = builder.targetLocationID;
        this.defaultApplVerID = builder.defaultApplVerID;
        this.defaultApplExtID = builder.defaultApplExtID;
        this.sessionId = new SessionId(senderCompID, targetCompID, senderSubID, targetSubID, senderLocationID, targetLocationID);
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBeginString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDefaultApplVerID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getDefaultApplExtID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNextOutgoingMessageSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNextOutgoingMessageSeqNum(int nextOutgoingMessageSeqNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNextIncomingMessageSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setNextIncomingMessageSeqNum(int nextIncomingMessageSeqNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getNextOutgoingMsgSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public boolean checkAndIncrementIncomingSeqNum(final int num) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DateTimeFormatterWrapper getDateTimeFormatter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateTimeFormatter(DateTimeFormatterWrapper dateTimeFormatter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void prepareOutgoing(FixMessageBuilder fixMessage) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public SessionId getId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static class Builder {

        private String beginString;

        private String senderCompID;

        private String senderSubID;

        private String senderLocationID;

        private String targetCompID;

        private String targetSubID;

        private String targetLocationID;

        private String defaultApplVerID;

        private String defaultApplExtID;

        private DateTimeFormatterWrapper dateTimeFormatter = FixConst.DATE_TIME_FORMATTER_MILLIS;

        private Builder() {
        }

        public Builder beginString(String beginString) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderCompID(String senderCompId) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderSubID(String senderSubId) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderLocationID(String senderLocationID) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetCompID(String targetCompId) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetSubID(String targetSubId) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetLocationID(String targetLocationID) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder defaultApplVerID(String defaultApplVerID) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder defaultApplExtID(String defaultApplExtID) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder timeStampPrecision(String timeStampPrecision) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FixSession build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
