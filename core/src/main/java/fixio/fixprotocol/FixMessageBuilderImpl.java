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

import fixio.fixprotocol.fields.CharField;
import fixio.fixprotocol.fields.FixedPointNumber;
import fixio.fixprotocol.fields.IntField;
import fixio.fixprotocol.fields.StringField;
import java.util.ArrayList;
import java.util.List;

public class FixMessageBuilderImpl implements FixMessage, FixMessageBuilder {

    private static final int DEFAULT_BODY_FIELD_COUNT = 16;

    private final FixMessageHeader header;

    private final FixMessageTrailer trailer;

    private final List<FixMessageFragment> body;

    /**
     * Creates FixMessageBuilderImpl with expected body field count.
     * <p>
     * Providing expected capacity eliminates unnecessary growing of internal ArrayList storing body fields.
     * </p>
     *
     * @param expectedBodyFieldCount estimated maximum number of field in message body
     */
    private FixMessageBuilderImpl(int expectedBodyFieldCount) {
        this.header = new FixMessageHeader();
        this.trailer = new FixMessageTrailer();
        body = new ArrayList<>(expectedBodyFieldCount);
    }

    /**
     * Creates FixMessageBuilderImpl with specified FixMessageHeader and  FixMessageTrailer.
     *
     * @param header  message header
     * @param trailer message trailer
     */
    public FixMessageBuilderImpl(FixMessageHeader header, final FixMessageTrailer trailer) {
        assert (header != null) : "FixMessageHeader is expected";
        assert (trailer != null) : "FixMessageTrailer is expected";
        this.header = header;
        this.trailer = trailer;
        body = new ArrayList<>(DEFAULT_BODY_FIELD_COUNT);
    }

    /**
     * Creates FixMessageBuilderImpl with default expected body field count.
     *
     * @see #DEFAULT_BODY_FIELD_COUNT
     */
    public FixMessageBuilderImpl() {
        this(DEFAULT_BODY_FIELD_COUNT);
    }

    /**
     * Creates FixMessageBuilderImpl with specified message type (tag 35)
     * and default expected body field count.
     *
     * @param messageType Value of message type (tag 35)
     * @see #DEFAULT_BODY_FIELD_COUNT
     */
    public FixMessageBuilderImpl(String messageType) {
        this();
        header.setMessageType(messageType);
    }

    /**
     * Creates FixMessageBuilderImpl with specified message type (tag 35)
     * and expected body field count.
     *
     * @param messageType            Value of message type (tag 35)
     * @param expectedBodyFieldCount estimated maximum number of field in message body
     */
    public FixMessageBuilderImpl(String messageType, int expectedBodyFieldCount) {
        this(expectedBodyFieldCount);
        header.setMessageType(messageType);
    }

    @Override
    public FixMessageBuilderImpl add(FieldType field, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(DataType type, int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(FieldType field, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(DataType type, int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(FieldType fieldType, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(FieldType field, char value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(DataType type, int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilderImpl add(FieldType fieldType, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageBuilder add(DataType type, int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group newGroup(FieldType fieldType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group newGroup(FieldType fieldType, int expectedGroupSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group newGroup(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group newGroup(int tagNum, int expectedGroupSize) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<FixMessageFragment> getBody() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void copyBody(List<? extends FixMessageFragment> body) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getString(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getValue(FieldType fieldType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T getValue(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getString(FieldType field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Character getChar(FieldType fieldType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Character getChar(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer getInt(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Integer getInt(FieldType field) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public FixMessageHeader getHeader() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public void copyHeader(FixMessageHeader header) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getMsgSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getTargetCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getSenderCompID() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getBeginString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getMessageType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMessageType(String messageType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Group> getGroups(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private void addGroup(int tagNum, Group group) {
        GroupField g = (GroupField) getLast(tagNum);
        if (g == null) {
            g = new GroupField(tagNum);
            body.add(g);
        }
        g.add(group);
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
