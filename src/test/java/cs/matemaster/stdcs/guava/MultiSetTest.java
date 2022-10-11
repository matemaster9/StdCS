package cs.matemaster.stdcs.guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Maps;
import org.junit.Test;

import java.util.Map;

/**
 * @author matemaster
 */
public class MultiSetTest {

    @Test
    public void addUp() {
        String alphaContent = "kavewbvalwuvblaebvdmsbbcvkzxcnksahqffvqbfqilwbvszjscqoiwqwxzczjxvbzxvahqmqguiecvaqcquykcgq";
        Map<Character, Integer> map = Maps.newHashMapWithExpectedSize(26);
        char[] chars = alphaContent.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        Console.log(map);
    }
}
