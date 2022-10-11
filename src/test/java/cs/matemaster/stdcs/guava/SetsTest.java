package cs.matemaster.stdcs.guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Sets;
import org.junit.Test;

import java.util.Set;

/**
 * @author matemaster
 */
public class SetsTest {

    @Test
    public void setTheoretic() {
        ImmutableSet<Integer> set1 = ImmutableSet.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        ImmutableSet<Integer> set2 = ImmutableSet.of(5, 6, 7, 8, 9, 10, 11, 12, 13);

        Sets.SetView<Integer> difference = Sets.difference(set1, set2);
        Sets.SetView<Integer> union = Sets.union(set1, set2);
        Sets.SetView<Integer> intersection = Sets.intersection(set1, set2);
        Sets.SetView<Integer> symmetricDifference = Sets.symmetricDifference(set1, set2);

        Console.log(difference);
        Console.log(union);
        Console.log(intersection);
        Console.log(symmetricDifference);

        Set<Integer> copySet = Sets.newHashSet();
        Set<Integer> integers = intersection.copyInto(copySet);
        Console.log(copySet);
        Console.log(integers);

        ImmutableSet<Integer> immutableCopy = intersection.immutableCopy();
        Console.log(immutableCopy);
    }

    @Test
    public void combinations() {
        ImmutableSet<Integer> set1 = ImmutableSet.of(1, 2, 3, 4);
        Set<Set<Integer>> combinations = Sets.combinations(set1, 3);
        combinations.forEach(Console::log);
    }

    @Test
    public void filter() {
        ImmutableSet<Integer> set1 = ImmutableSet.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        Set<Integer> filteredSet = Sets.filter(set1, item -> item > 5);
        Console.log(filteredSet);
    }
}
