package cs.matemaster.stdcs.coll;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author matemaster
 */
public class HastSetTest {

    @Test
    public void addAll() {
        Set<Integer> emptySet = new HashSet<>();
        Set<Integer> collect = IntStream.range(0, 10).boxed().collect(Collectors.toSet());
        Console.log(collect);
        emptySet.addAll(collect);
        Console.log(emptySet);
    }

    @Test
    public void containsAll() {
        Set<Integer> collect = IntStream.range(0, 10).boxed().collect(Collectors.toSet());
        Set<Integer> integers = Sets.newHashSet(9, 7, 10);
        Set<Integer> integers1 = Sets.newHashSet(9, 7, 0);
        Console.log(collect.containsAll(integers));
        Console.log(collect.containsAll(integers1));
    }

    @Test
    public void removeAll() {
        Set<Integer> integers = Sets.newHashSet(9, 7, 10);
        Set<Integer> integers1 = Sets.newHashSet(9, 7, 0);
        integers.removeAll(integers1);
        Console.log(integers);
    }

    @Test
    public void retainAll() {
        Set<Integer> integers = Sets.newHashSet(9, 7, 10);
        Set<Integer> integers1 = Sets.newHashSet(9, 7, 0);
        integers.retainAll(integers1);
        Console.log(integers);
    }
}
