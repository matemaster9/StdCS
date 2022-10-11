package cs.matemaster.stdcs.guava;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

/**
 * @author matemaster
 */
public class ImmutableMapTest {


    @Test
    public void create() {
        ImmutableMap<String, String> headerMap = ImmutableMap.of("secret-key", "erDKOCD47XaE0CHEFv144MK2ujRrmFHx");
    }
}
