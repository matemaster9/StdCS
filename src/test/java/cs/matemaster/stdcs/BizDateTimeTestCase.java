package cs.matemaster.stdcs;

import org.junit.Test;

import java.time.*;
import java.time.temporal.*;
import java.util.concurrent.ThreadLocalRandom;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class BizDateTimeTestCase {

    private static final ThreadLocalRandom StdRandom = ThreadLocalRandom.current();

    /**
     * 计算两个日期时间相隔多少天
     */
    @Test
    public void case1() {
        LocalDate date1 = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));
        LocalDate date2 = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));

        StdCSLogger.debug(date1);
        StdCSLogger.debug(date2);
        StdCSLogger.debug(ChronoUnit.DAYS.between(date1, date2));
        StdCSLogger.debug(date1.until(date2, ChronoUnit.DAYS));
    }

    /**
     * 计算两个日期之间的间隔 P Y W D：年、月、周、日
     */
    @Test
    public void case2() {
        LocalDate date1 = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));
        LocalDate date2 = LocalDate.ofYearDay(StdRandom.nextInt(2000, 2022), StdRandom.nextInt(365));

        StdCSLogger.debug(date1);
        StdCSLogger.debug(date2);
        StdCSLogger.debug(date1.until(date2));
    }

    @Test
    public void case3() {
        StdCSLogger.debug(LocalDate.now().with(new PayrollAdjuster()));
        StdCSLogger.debug(LocalDate.now().with(
                temporal -> {
                    LocalDate from = LocalDate.from(temporal);
                    LocalDate with = from.with(ChronoField.DAY_OF_MONTH, 8);
                    if (with.getDayOfWeek() == DayOfWeek.SUNDAY || with.getDayOfWeek() == DayOfWeek.SATURDAY) {
                        with = with.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
                    }
                    return with;
                }
        ));
    }


    private static class PayrollAdjuster implements TemporalAdjuster {

        @Override
        public Temporal adjustInto(Temporal temporal) {
            LocalDate from = LocalDate.from(temporal);
            LocalDate with = from.with(ChronoField.DAY_OF_MONTH, 8);
            if (with.getDayOfWeek() == DayOfWeek.SUNDAY || with.getDayOfWeek() == DayOfWeek.SATURDAY) {
                with = with.with(TemporalAdjusters.previous(DayOfWeek.FRIDAY));
            }
            return with;
        }
    }

}
