package cs.matemaster.stdcs;

import org.junit.Test;

import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class ChronoUnitTest {

    @Test
    public void test() {
        ChronoUnit[] values = ChronoUnit.values();
        for (ChronoUnit value : values) {
            StdCSLogger.debug(value);
        }
    }
}
