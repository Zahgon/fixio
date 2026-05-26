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
package fixio.netty.pipeline.client;

/**
 * Simple java bean FixSessionSettingsProvider implementation.
 * <p>
 * <strong>Thread-safety:</strong> This implementation is immutable and thread-safe.
 * </p>
 */
public class FixSessionSettingsProviderImpl implements FixSessionSettingsProvider {

    private final String beginString;

    private final String senderCompID;

    private final String senderSubID;

    private final String senderLocationID;

    private final String targetCompID;

    private final String targetSubID;

    private final String targetLocationID;

    private final boolean resetMsgSeqNum;

    private final int heartbeatIntervalSec;

    private final String timeStampPrecision;

    private final String defaultApplVerID;

    private final String defaultApplExtID;

    private FixSessionSettingsProviderImpl(Builder builder) {
        beginString = builder.beginString;
        senderCompID = builder.senderCompID;
        senderSubID = builder.senderSubID;
        senderLocationID = builder.senderLocationID;
        targetCompID = builder.targetCompID;
        targetSubID = builder.targetSubID;
        targetLocationID = builder.targetLocationID;
        resetMsgSeqNum = builder.resetMsgSeqNum;
        heartbeatIntervalSec = builder.heartbeatInterval;
        timeStampPrecision = builder.timeStampPrecision;
        defaultApplVerID = builder.defaultApplVerID;
        defaultApplExtID = builder.defaultApplExtID;
    }

    public static Builder newBuilder() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static Builder newBuilder(FixSessionSettingsProviderImpl copy) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getSenderCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getSenderSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getSenderLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getTargetCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getTargetSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getTargetLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getBeginString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean isResetMsgSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int getHeartbeatInterval() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getTimeStampPrecision() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getDefaultApplVerID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getDefaultApplExtID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getProperty(String key, String defaultValue) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static final class Builder {

        private String beginString;

        private String senderCompID;

        private String senderSubID;

        private String senderLocationID;

        private String targetCompID;

        private String targetSubID;

        private String targetLocationID;

        private boolean resetMsgSeqNum;

        private int heartbeatInterval = 60;

        private String timeStampPrecision = "";

        private String defaultApplVerID;

        private String defaultApplExtID;

        private Builder() {
        }

        public Builder beginString(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderCompID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderSubID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder senderLocationID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetCompID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetSubID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder targetLocationID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder resetMsgSeqNum(boolean val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder heartbeatInterval(int val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder timeStampPrecision(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder defaultApplVerID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public Builder defaultApplExtID(String val) {
            throw new UnsupportedOperationException("STUB: not implemented");
        }

        public FixSessionSettingsProviderImpl build() {
            throw new UnsupportedOperationException("STUB: not implemented");
        }
    }
}
