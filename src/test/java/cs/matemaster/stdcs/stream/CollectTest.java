package cs.matemaster.stdcs.stream;

import org.junit.Test;

import java.math.BigDecimal;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

/**
 * @author matemaster
 */
public class CollectTest {

    @Test
    public void mock() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        BigDecimal reduce = Stream.generate(() -> BigDecimal.valueOf(random.nextDouble(0.0, 100.0)))
                .limit(10)
                .parallel()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        System.out.println(reduce);
    }
}
