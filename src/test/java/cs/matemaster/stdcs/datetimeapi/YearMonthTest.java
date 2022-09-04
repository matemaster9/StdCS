package cs.matemaster.stdcs.datetimeapi;

import cs.matemaster.stdcs.StdCSLogger;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class YearMonthTest {

    private static final ThreadLocalRandom StdRandom = ThreadLocalRandom.current();

    @Test
    public void create() {
        YearMonth now = YearMonth.now();
        StdCSLogger.debug(now);

        YearMonth of = YearMonth.of(2018, 1);
        StdCSLogger.debug(of);

        YearMonth from = YearMonth.from(LocalDate.now());
        StdCSLogger.debug(from);

        YearMonth parse = YearMonth.parse("2018-10");
        StdCSLogger.debug(parse);

        YearMonth parse1 = YearMonth.parse("2018-09-01", DateTimeFormatter.ISO_DATE);
        StdCSLogger.debug(parse1);
    }

    @Test
    public void lengthOfMonth() {
        YearMonth of = YearMonth.of(2022, 2);
        StdCSLogger.debug(of.lengthOfMonth());

        YearMonth of1 = YearMonth.of(2020, 2);
        StdCSLogger.debug(of1.lengthOfMonth());
    }


    @Test
    public void adjust() {
        YearMonth of = YearMonth.of(2022, 2);
        StdCSLogger.debug(of.with((temporal) -> temporal.with(ChronoField.MONTH_OF_YEAR, 1)));
        StdCSLogger.debug(of.with(ChronoField.MONTH_OF_YEAR, 12));
    }

    @Test
    public void other() {
        YearMonth from = YearMonth.of(2018, 2);
        StdCSLogger.debug(from);
        StdCSLogger.debug(from.isLeapYear());
        StdCSLogger.debug(from.isValidDay(29));
    }


    @Test
    public void case1() {
        printMonthLengthOfYear(2022);
    }

    private void printMonthLengthOfYear(int year) {
        Arrays.stream(Month.values())
                .map(month -> YearMonth.of(year, month))
                .forEach(yearMonth -> StdCSLogger.debug(yearMonth.getMonth() + ": " + yearMonth.lengthOfMonth()));
    }
}
