package cs.matemaster.stdcs;

import org.junit.Test;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class LocalTimeTest {

    @Test
    public void create() {
        LocalTime now = LocalTime.now();
        StdCSLogger.debug(now);
    }
}
