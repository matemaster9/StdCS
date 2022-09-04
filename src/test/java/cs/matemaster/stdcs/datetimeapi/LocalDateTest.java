package cs.matemaster.stdcs.datetimeapi;

import cs.matemaster.stdcs.StdCSLogger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class LocalDateTest {

    private static final ThreadLocalRandom StdRandom = ThreadLocalRandom.current();

    @Test
    public void compare() {
        LocalDate date = LocalDate.of(2022, 9, 3);
        LocalDate localDate = date.plusDays(1);
        StdCSLogger.debug(date.isAfter(localDate));
        StdCSLogger.debug(date.isBefore(localDate));
        StdCSLogger.debug(date.isEqual(localDate));
    }


    @Test
    public void create() {

        LocalDate localDate = LocalDate.ofYearDay(2020, 364);
        StdCSLogger.debug(localDate);

        LocalDate date = LocalDate.of(2022, 9, 3);
        // 将月份调整至当年第一月
        LocalDate with = date.with(ChronoField.MONTH_OF_YEAR, 1);
        // 将日期调整至月首
        LocalDate with1 = date.with(TemporalAdjusters.firstDayOfMonth());
        StdCSLogger.debug(with);
        StdCSLogger.debug(with1);
    }

    @Test
    public void printStyle() {
        LocalDate localDate = LocalDate.ofYearDay(2022, 1);
        StdCSLogger.debug(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(localDate));
        StdCSLogger.debug(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(localDate));
        StdCSLogger.debug(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(localDate));
        StdCSLogger.debug(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(localDate));
    }

    @Test
    public void getter() {
        LocalDate stochastic = LocalDate.ofEpochDay(StdRandom.nextLong(10_000));
        StdCSLogger.debug(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(stochastic));
        // 日历年表
        StdCSLogger.debug(stochastic.getChronology());

        StdCSLogger.debug(stochastic.getDayOfMonth());
        StdCSLogger.debug(stochastic.getDayOfWeek());
        StdCSLogger.debug(stochastic.getDayOfYear());
        // 日期时代
        StdCSLogger.debug(stochastic.getEra());

        StdCSLogger.debug(stochastic.getYear());
        StdCSLogger.debug(stochastic.getMonth());
        StdCSLogger.debug(stochastic.getMonthValue());
        StdCSLogger.debug(stochastic.get(WeekFields.ISO.weekOfWeekBasedYear()));
    }
}
