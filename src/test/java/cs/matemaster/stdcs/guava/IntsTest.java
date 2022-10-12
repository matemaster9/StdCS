package cs.matemaster.stdcs.guava;

import cn.hutool.core.lang.Console;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.List;

/**
 * @author matemaster
 */
public class IntsTest {

    @Test
    public void asList() {
        // asList创建只读集合
        List<Integer> integers = Ints.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);

        // throw UnSupport
        // integers.add(10);
    }

    @Test
    public void long2Int() {
        long overflow = Integer.MAX_VALUE + 1L;
        Console.log(Ints.saturatedCast(overflow));
        // throw Out of range
        // Console.log(Ints.checkedCast(overflow));
    }


}
