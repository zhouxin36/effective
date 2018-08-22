package chaptereleven;

import org.apache.commons.lang3.builder.ToStringBuilder;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;

/**
 * 不变类
 */
public final class Period implements Serializable {

    private LocalDateTime start;
    private LocalDateTime end;

    public Period(LocalDateTime start, LocalDateTime end) {
        this.start = LocalDateTime.ofInstant(start.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));
        this.end = LocalDateTime.ofInstant(end.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));
        if(this.start.compareTo(this.end) > 0){
            throw new IllegalArgumentException(start + "after" + end);
        }
    }

    public LocalDateTime getStart() {
        return LocalDateTime.ofInstant(start.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));
    }

    public LocalDateTime getEnd() {
        return LocalDateTime.ofInstant(end.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("start", start)
                .append("end", end)
                .toString();
    }

    private void readObject(ObjectInputStream s) throws Exception{
        s.defaultReadObject();

        start = LocalDateTime.ofInstant(start.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));
        end = LocalDateTime.ofInstant(end.toInstant(ZoneOffset.of("+8")), ZoneId.of("+8"));

        if(this.start.compareTo(this.end) > 0){
            throw new InvalidObjectException(start + "after" + end);
        }
    }
}
