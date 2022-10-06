package cs.matemaster.stdcs.coll;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.Collections;
import java.util.List;

/**
 * @author matemaster
 */
public class ListTest {

    @Test
    public void add1() {
        List<Integer> integerArrayList = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerArrayList.add(10);
        Console.log(integerArrayList);
    }

    @Test
    public void add1_1() {
        List<Integer> integerArrayList = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerArrayList.add(1, 10);
        Console.log(integerArrayList);
    }

    @Test
    public void addAll1() {
        List<Integer> integerArrayList = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> emptyList = Collections.emptyList();
        integerArrayList.addAll(emptyList);
        integerArrayList.addAll(1, emptyList);
        Console.log(integerArrayList);
    }

    @Test
    public void addAll1_1() {
        List<Integer> integerArrayList = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        integerArrayList.addAll(null);
        Console.log(integerArrayList);
    }
}
