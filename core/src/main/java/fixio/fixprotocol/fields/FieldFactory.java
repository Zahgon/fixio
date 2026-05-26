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
package fixio.fixprotocol.fields;

import fixio.fixprotocol.DataType;
import fixio.fixprotocol.FieldType;
import java.text.ParseException;
import java.time.Instant;
import java.time.ZoneOffset;

public class FieldFactory {

    public static <F extends AbstractField> F valueOf(int tagNum, byte[] value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <F extends AbstractField> F valueOf(int tagNum, byte[] value, int offset, int length) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <F extends AbstractField<?>> F fromIntValue(DataType type, int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromIntValue(int tagNum, int value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromLongValue(int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromLongValue(FieldType fieldType, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <F extends AbstractField<?>> F fromLongValue(DataType type, int tagNum, long value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromStringValue(int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromStringValue(FieldType fieldType, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <F extends AbstractField<?>> F fromStringValue(DataType type, int tagNum, String value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <F extends AbstractField<?>> F fromFixedPointValue(int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static <T, F extends AbstractField<?>> F fromFixedPointValue(FieldType fieldType, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @SuppressWarnings("unchecked")
    public static <F extends AbstractField<?>> F fromFixedPointValue(DataType type, int tagNum, FixedPointNumber value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
