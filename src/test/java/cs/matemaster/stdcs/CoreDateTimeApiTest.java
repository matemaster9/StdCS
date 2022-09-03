package cs.matemaster.stdcs;

import org.junit.Test;


import java.time.*;
import java.time.temporal.TemporalQueries;
import java.util.Date;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class CoreDateTimeApiTest {

    @Test
    public void printAllLocalDateTimeApi() {
        ReflectUtil.printAllDeclaredMethod(LocalDateTime.class);
    }


    @Test
    public void query() {
        StdCSLogger.debug(LocalDateTime.now().query(TemporalQueries.localTime()));
        StdCSLogger.debug(LocalDateTime.now().query(TemporalQueries.localDate()));
        StdCSLogger.debug(LocalDateTime.now().query(TemporalQueries.chronology()));
        StdCSLogger.debug(LocalDateTime.now().query(TemporalQueries.precision()));
    }


    @Test
    public void clock() {
        Clock clock = Clock.systemDefaultZone();
        StdCSLogger.debug(clock);
    }

    @Test
    public void convert() {
        LocalDate now = LocalDate.now();
        LocalDateTime now1 = LocalDateTime.now();
        LocalTime now2 = LocalTime.now();
        Instant now3 = Instant.now();
        ZonedDateTime now4 = ZonedDateTime.now();

        StdCSLogger.debug(Date.from(now.atStartOfDay(ZoneId.systemDefault()).toInstant()));
        StdCSLogger.debug(Date.from(now1.atZone(ZoneId.systemDefault()).toInstant()));
        StdCSLogger.debug(Date.from(now2.atDate(now).atZone(ZoneId.systemDefault()).toInstant()));
        StdCSLogger.debug(Date.from(now3));
        StdCSLogger.debug(Date.from(now4.toInstant()));
    }
}
