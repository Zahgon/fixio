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
package fixio.fixprotocol;

import fixio.fixprotocol.fields.DateTimeFormatterWrapper;
import java.time.ZonedDateTime;
import java.util.List;

public class FixMessageHeader {

    private String beginString;

    private String messageType;

    private int msgSeqNum;

    private ZonedDateTime sendingTime;

    private String senderCompID;

    private String senderSubID;

    private String senderLocationID;

    private String targetCompID;

    private String targetSubID;

    private String targetLocationID;

    private List<FixMessageFragment> customFields;

    private DateTimeFormatterWrapper dateTimeFormatter = null;

    public String getBeginString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setBeginString(String beginString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getMessageType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMessageType(String messageType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSenderCompID(String senderCompID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSenderSubID(String senderSubID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSenderLocationID(String senderLocationID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTargetCompID(String targetCompID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetSubID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTargetSubID(String targetSubID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetLocationID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setTargetLocationID(String targetLocationID) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMsgSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMsgSeqNum(int msgSeqNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZonedDateTime getSendingTime() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setSendingTime(ZonedDateTime sendingTime) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<FixMessageFragment> getCustomFields() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setCustomFields(List<FixMessageFragment> customFields) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DateTimeFormatterWrapper getDateTimeFormatter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setDateTimeFormatter(DateTimeFormatterWrapper dateTimeFormatter) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
