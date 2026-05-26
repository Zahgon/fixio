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

import fixio.fixprotocol.fields.AbstractField;
import fixio.fixprotocol.fields.CharField;
import fixio.fixprotocol.fields.FieldFactory;
import fixio.fixprotocol.fields.IntField;
import fixio.fixprotocol.fields.StringField;
import java.util.ArrayList;
import java.util.List;

/**
 * Read-only view implementation of received {@link FixMessage}.
 */
public class FixMessageImpl implements FixMessage {

    private final FixMessageHeader header = new FixMessageHeader();

    private final FixMessageTrailer trailer = new FixMessageTrailer();

    private final List<FixMessageFragment> body = new ArrayList<>();

    public FixMessageImpl add(int tagNum, byte[] value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FixMessageImpl addBody(int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FixMessageImpl addBody(GroupField group) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public FixMessageImpl add(int tagNum, byte[] value, int offset, int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public List<FixMessageFragment> getBody() {
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

    public int getMsgSeqNum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String getMessageType() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void setMessageType(String messageType) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public int getChecksum() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Group> getGroups(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
