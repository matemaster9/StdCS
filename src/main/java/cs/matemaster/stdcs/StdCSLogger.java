package cs.matemaster.stdcs;

import lombok.extern.slf4j.Slf4j;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
@Slf4j
public final class StdCSLogger {

    private StdCSLogger() {
    }

    public static void debug(Object arg) {
        if (arg == null) {
            log.debug("null");
        } else {
            log.debug(arg.toString());
        }
    }
}
