package cs.matemaster.stdcs.coll;

import cn.hutool.core.lang.Console;
import com.google.common.collect.Lists;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * @author matemaster
 */
public class ArrayListTest {

    @Test
    public void addAll() {
        List<Integer> list = new ArrayList<>();
        List<Integer> integers = IntStream.range(0, 100).limit(10).boxed().collect(Collectors.toList());
        list.addAll(integers);
        Console.log(list);

        list.addAll(Collections.emptyList());
        list.addAll((ArrayList) null);
    }

    @Test
    public void addAll_1() {
        List<Integer> integers = new ArrayList<>();
        List<Integer> collect = IntStream.range(0, 100).limit(10).boxed().collect(Collectors.toList());
        integers.add(-1);
        integers.addAll(0, collect);
        Console.log(integers);
    }

    @Test
    public void contains() {
        List<Integer> collect = IntStream.range(0, 100).limit(40).boxed().collect(Collectors.toList());
        List<Integer> collect1 = IntStream.range(0, 100).limit(10).boxed().collect(Collectors.toList());

        collect1.sort(Collections.reverseOrder());

        Console.log(collect);
        Console.log(collect1);
        Console.log(collect.containsAll(collect1));
    }

    @Test
    public void equals() {
        List<Integer> collect = IntStream.range(0, 100).limit(40).boxed().collect(Collectors.toList());
        List<Integer> collect1 = IntStream.range(0, 100).limit(40).boxed().collect(Collectors.toList());


        Console.log(collect);
        Console.log(collect1);
        Console.log(collect.equals(collect1));
    }

    @Test
    public void get() {
        List<Integer> collect = IntStream.range(0, 100).limit(40).boxed().collect(Collectors.toList());
        Console.log(collect.get(0));
    }

    @Test
    public void indexOf() {
        List<Integer> collect = IntStream.range(0, 100).limit(40).boxed().collect(Collectors.toList());
        Console.log(collect.indexOf(0));
        Console.log(collect.lastIndexOf(30));
    }

    @Test
    public void removeAll() {
        List<Integer> collect = IntStream.range(0, 100).limit(10).boxed().collect(Collectors.toList());
        List<Integer> integers = Arrays.asList(98, 99, 0, 1);
        boolean b = collect.removeAll(integers);
        Console.log(b);
        Console.log(collect);
    }

    @Test
    public void retainAll() {
        List<Integer> collect = IntStream.range(0, 100).limit(10).boxed().collect(Collectors.toList());
        List<Integer> integers = Arrays.asList(98, 99, 0, 1);
        boolean b = collect.retainAll(integers);
        Console.log(b);
        Console.log(collect);
    }

    @Test
    public void retainAll_1() {
        List<Integer> collect = IntStream.range(0, 100).limit(100).boxed().collect(Collectors.toList());
        List<Integer> integers = Lists.newArrayList(98, 99, 0, 1, 100);
        boolean b = integers.retainAll(collect);
        Console.log(b);
        Console.log(integers);
    }

    @Test
    public void replaceAll() {
        List<Integer> integers = Lists.newArrayList(98, 99, 0, 1, 100);

        UnaryOperator<Integer> unaryOperator = (item) -> item > 10 ? null : item;

        integers.replaceAll(unaryOperator);
        Console.log(integers);
    }

    @Test
    public void sort() {
        List<Integer> collect = IntStream.range(90, 100).boxed().collect(Collectors.toList());
        Console.log(collect);
        collect.sort(Collections.reverseOrder());
        Console.log(collect);
    }

    @Test
    public void sublist() {
        List<Integer> collect = IntStream.range(90, 100).boxed().collect(Collectors.toList());
        List<Integer> integers = collect.subList(0, 5);
        integers.add(100);
        Console.log(integers);
        Console.log(collect);
    }

    @Test
    public void sublist_1() {
        List<Integer> collect = Lists.newArrayList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        List<Integer> integers = collect.subList(0, 5);
        integers.add(100);
        Console.log(integers);
        Console.log(collect);
    }
}
