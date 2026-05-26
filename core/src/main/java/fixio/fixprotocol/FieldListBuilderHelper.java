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

import fixio.fixprotocol.fields.FieldFactory;
import fixio.fixprotocol.fields.FixedPointNumber;
import java.util.List;

/**
 * Helper class for managing {@link FieldListBuilder}.
 */
final class FieldListBuilderHelper {

    private FieldListBuilderHelper() {
    }

    // From Int
    static void add(List<FixMessageFragment> list, DataType type, int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, FieldType fieldType, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // From Long
    static void add(List<FixMessageFragment> list, DataType type, int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, FieldType fieldType, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // From String
    static void add(List<FixMessageFragment> list, FieldType fieldType, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, DataType type, int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // From FixedPointNumber
    static void add(List<FixMessageFragment> list, FieldType fieldType, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    static void add(List<FixMessageFragment> list, DataType type, int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
