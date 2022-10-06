package cs.matemaster.stdcs.stream;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.concurrent.ThreadLocalRandom;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Stream;

/**
 * @author matemaster
 */
public class ReduceTest {

    private static final ThreadLocalRandom RANDOM = ThreadLocalRandom.current();

    @Test
    public void reduce1() {
        Integer reduce = RANDOM.ints(100).boxed()
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException("error"));
        Console.log(reduce);
    }

    @Test
    public void reduce2() {

        BinaryOperator<Integer> accumulator = (x, y) -> x - y;

        Integer reduce = RANDOM.ints(100).boxed()
                .reduce(accumulator)
                .orElseThrow(() -> new RuntimeException("error"));
        Console.log(reduce);
    }

    @Test
    public void reduce3() {

        BiFunction<Integer, String, Integer> accumulator = (init, str2) -> init + str2.length();
        BinaryOperator<Integer> combiner = (var1, var2) -> var1 + var2;

        Integer reduce = Stream.of("Spring", "redis", "elasticsearch", "rabbitmq", "kafka")
                .reduce(0, accumulator, combiner);
        System.out.println(reduce);
    }

    @Test
    public void reduce4() {
        Integer reduce = Stream.of(10, 20, 98, 81, 100)
                .parallel()
                .reduce((num1, num2) -> num1 - num2)
                .orElseThrow(() -> new RuntimeException(""));
        Console.log(reduce);
    }

    @Test
    public void reduce4_1() {
        Integer reduce = Stream.of(10, 20, 98, 81, 100)
                .reduce((num1, num2) -> num1 - num2)
                .orElseThrow(() -> new RuntimeException(""));
        Console.log(reduce);
    }

    @Test
    public void reduce5() {
        Integer reduce = Stream.of(10, 20, 98, 81, 100)
                .parallel()
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException(""));
        Console.log(reduce);
    }

    @Test
    public void reduce5_1() {
        Integer reduce = Stream.of(10, 20, 98, 81, 100)
                .reduce(Integer::sum)
                .orElseThrow(() -> new RuntimeException(""));
        Console.log(reduce);
    }
}
