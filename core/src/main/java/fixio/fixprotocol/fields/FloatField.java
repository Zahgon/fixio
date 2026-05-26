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

import java.util.Objects;
import static java.nio.charset.StandardCharsets.US_ASCII;

public class FloatField extends AbstractField<FixedPointNumber> {

    private final FixedPointNumber value;

    protected FloatField(int tagNum, FixedPointNumber value) {
        super(tagNum);
        this.value = value;
    }

    protected FloatField(int tagNum, byte[] value, int offset, int length) {
        super(tagNum);
        this.value = new FixedPointNumber(value, offset, length);
    }

    @Override
    public FixedPointNumber getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getBytes() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public float floatValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
