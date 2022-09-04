package cs.matemaster.stdcs.datetimeapi;

import cs.matemaster.stdcs.StdCSLogger;
import org.junit.Test;

import java.time.temporal.ChronoField;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class ChronoFieldTest {

    @Test
    public void test() {
        ChronoField[] values = ChronoField.values();
        for (ChronoField value : values) {
            StdCSLogger.debug(value);
        }
    }
}
