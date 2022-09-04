package cs.matemaster.stdcs.datetimeapi;

import cs.matemaster.stdcs.ReflectUtil;
import cs.matemaster.stdcs.StdCSLogger;
import org.junit.Test;


import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.TemporalQueries;
import java.util.Date;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class CoreDateTimeApiTest {

    private static final ThreadLocalRandom StdRandom = ThreadLocalRandom.current();

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

    @Test
    public void docs() {
        LocalDateTime now = LocalDateTime.now();
        StdCSLogger.debug(now.atZone(ZoneId.systemDefault()).toInstant());
        StdCSLogger.debug(now.format(DateTimeFormatter.ISO_DATE));
        StdCSLogger.debug(now.format(DateTimeFormatter.ISO_LOCAL_DATE));
        StdCSLogger.debug(now.format(DateTimeFormatter.ISO_WEEK_DATE));
        StdCSLogger.debug(now.format(DateTimeFormatter.ISO_TIME));
        StdCSLogger.debug(now.format(DateTimeFormatter.ISO_DATE_TIME));

        StdCSLogger.debug(now.get(ChronoField.MONTH_OF_YEAR));
        StdCSLogger.debug(now.get(ChronoField.DAY_OF_MONTH));
        StdCSLogger.debug(now.get(ChronoField.HOUR_OF_DAY));
        StdCSLogger.debug(now.get(ChronoField.HOUR_OF_AMPM));
        StdCSLogger.debug(now.get(ChronoField.AMPM_OF_DAY));
        StdCSLogger.debug(now.get(ChronoField.CLOCK_HOUR_OF_AMPM));
        StdCSLogger.debug(now.get(ChronoField.CLOCK_HOUR_OF_DAY));

        StdCSLogger.debug(now.get(IsoFields.QUARTER_OF_YEAR));

        StdCSLogger.debug(now.with(TemporalAdjusters.lastDayOfYear()));
        StdCSLogger.debug(now.with(IsoFields.QUARTER_OF_YEAR, 1));

        StdCSLogger.debug(now.query(TemporalQueries.precision()));

        StdCSLogger.debug(
                Period.between(
                        LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365)),
                        LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365))
                )
        );
    }

    @Test
    public void period() {

        LocalDate start = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));
        LocalDate end = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));

        if (start.isAfter(end)) {
            LocalDate temp = start;
            start = end;
            end  =temp;
        }

        StdCSLogger.debug(start);
        StdCSLogger.debug(end);
        StdCSLogger.debug(Period.between(start, end));
    }

    @Test
    public void duration() throws InterruptedException {
        Instant instant1 = Instant.now();
        TimeUnit.NANOSECONDS.sleep(2);
        Instant instant2 = Instant.now();
        Duration between = Duration.between(instant1, instant2);
        long toNanos = between.toNanos();
        StdCSLogger.debug(toNanos);
    }
}
