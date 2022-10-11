package cs.matemaster.stdcs.guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.ImmutableList;
import org.junit.Test;

/**
 * @author matemaster
 */
public class ImmutableListTest {

    @Test
    public void createImmutableList() {
        ImmutableList<String> stringImmutableList = ImmutableList.of("username", "password");
        ImmutableList<String> stringImmutableList1 = ImmutableList.copyOf(stringImmutableList);
        ImmutableList<String> stringImmutableList2 = ImmutableList.<String>builder().addAll(stringImmutableList).build();

        Console.log(stringImmutableList);
        Console.log(stringImmutableList1);
        Console.log(stringImmutableList2);
    }

    @Test
    public void notNull() {
        ImmutableList<Integer> integerImmutableList = ImmutableList.of(0, 1, 5, 8, 2, 9, 3, 4, 7, 6, null);
    }
}
