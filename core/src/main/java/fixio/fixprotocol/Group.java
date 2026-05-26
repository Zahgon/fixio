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

import fixio.fixprotocol.fields.FixedPointNumber;
import fixio.fixprotocol.fields.StringField;
import java.util.ArrayList;
import java.util.List;

/**
 * Represents FIX Protocol field Group or Component - a sequence of Fields or other Groups.
 */
public class Group implements FieldListBuilder<Group> {

    private static final int DEFAULT_GROUP_SIZE = 8;

    private final ArrayList<FixMessageFragment> contents;

    public Group(int expectedSize) {
        this.contents = new ArrayList<>(expectedSize);
    }

    public Group() {
        this.contents = new ArrayList<>(DEFAULT_GROUP_SIZE);
    }

    public void add(FixMessageFragment element) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(FieldType fieldType, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(DataType type, int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(FieldType field, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(DataType type, int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(FieldType field, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(DataType type, int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(FieldType fieldType, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(DataType type, int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public Group add(FieldType field, char value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T> T getValue(int tagNum) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public <T> T getValue(FieldType fieldType) {
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

    private void addGroup(int tagNum, Group group) {
        GroupField g = (GroupField) getFragment(tagNum);
        if (g == null) {
            g = new GroupField(tagNum);
            contents.add(g);
        }
        g.add(group);
    }

    private FixMessageFragment getFragment(int tagNum) {
        return contents.get(tagNum);
    }

    public List<FixMessageFragment> getContents() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
