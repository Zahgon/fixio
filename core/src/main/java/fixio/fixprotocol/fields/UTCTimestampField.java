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

import java.text.ParseException;
import java.time.ZonedDateTime;
import java.util.Objects;
import static fixio.fixprotocol.FixConst.DATE_TIME_FORMATTER_MICROS;
import static fixio.fixprotocol.FixConst.DATE_TIME_FORMATTER_MILLIS;
import static fixio.fixprotocol.FixConst.DATE_TIME_FORMATTER_NANOS;
import static fixio.fixprotocol.FixConst.DATE_TIME_FORMATTER_PICOS;
import static fixio.fixprotocol.FixConst.DATE_TIME_FORMATTER_SECONDS;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_MICROS_LENGTH;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_MILLIS;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_MILLIS_LENGTH;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_NANOS_LENGTH;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_PICOS_LENGTH;
import static fixio.fixprotocol.FixConst.DATE_TIME_PATTERN_SECONDS_LENGTH;
import static java.nio.charset.StandardCharsets.US_ASCII;

public class UTCTimestampField extends AbstractField<ZonedDateTime> {

    private final ZonedDateTime value;

    private final int valueLen;

    public UTCTimestampField(int tagNum, byte[] bytes, int offset, int length) throws ParseException {
        super(tagNum);
        this.value = parse(bytes, offset, length);
        this.valueLen = length;
    }

    public UTCTimestampField(int tagNum, String timestampString) throws ParseException {
        super(tagNum);
        this.value = parse(timestampString);
        this.valueLen = timestampString.length();
    }

    public UTCTimestampField(int tagNum, ZonedDateTime value) {
        super(tagNum);
        this.value = value;
        this.valueLen = DATE_TIME_PATTERN_MILLIS.length();
    }

    public static ZonedDateTime parse(byte[] bytes) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ZonedDateTime parse(byte[] bytes, int offset, int length) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static ZonedDateTime parse(String timestampString) throws ParseException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public ZonedDateTime getValue() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public byte[] getBytes() {
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
