package cs.matemaster.stdcs;

import org.junit.Test;

import java.time.MonthDay;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class MonthDayTest {

    @Test
    public void create() {
        MonthDay of = MonthDay.of(1, 1);
        StdCSLogger.debug(of);

        MonthDay now = MonthDay.now();
        StdCSLogger.debug(now);
    }

    @Test
    public void valid() {
        MonthDay of = MonthDay.of(2, 29);
        StdCSLogger.debug(of);

        StdCSLogger.debug(of.isValidYear(2022));
        StdCSLogger.debug(of.isValidYear(2020));
    }
}
