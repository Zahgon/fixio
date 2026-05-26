package fixio.fixprotocol.fields;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class DateTimeFormatterWrapper {

    private final String pattern;

    private final ZoneId zoneId;

    private final DateTimeFormatter dateTimeFormatter;

    private final String padding;

    private final int paddingLen;

    public DateTimeFormatterWrapper(String pattern, ZoneId zoneId) {
        this.pattern = pattern;
        this.zoneId = zoneId;
        int idx = pattern.indexOf('\'');
        if (idx > 0) {
            this.dateTimeFormatter = DateTimeFormatter.ofPattern(pattern.substring(0, idx)).withZone(zoneId);
            this.padding = pattern.substring(idx).replaceAll("'", "");
        } else {
            this.dateTimeFormatter = DateTimeFormatter.ofPattern(pattern).withZone(zoneId);
            this.padding = "";
        }
        this.paddingLen = this.padding.length();
    }

    public String getPattern() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZoneId getZoneId() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public DateTimeFormatter getDateTimeFormatter() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String getPadding() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public String format(TemporalAccessor value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public LocalDate parseLocalDate(String timestampString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public LocalTime parseLocalTime(String timestampString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ZonedDateTime parseZonedDateTime(String timestampString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
