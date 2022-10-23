package cs.matemaster.stdcs.functional;

import cn.hutool.core.lang.Console;
import com.google.common.primitives.Ints;
import org.junit.Test;

import java.util.List;
import java.util.stream.IntStream;

/**
 * @author matemaster
 */
public class ReduceTest {


    @Test
    public void case1() {
        reduce();
    }

    public void reduce() {
        int result = IntStream.range(1, 10)
                .boxed()
                .parallel()
                .reduce(0, (a, b) -> {
                    Console.log("a :" + a + " b: " + b);
                    return a + b;
                }, (left, right) -> {
                    Console.log("left :" + left + " right: " + right);
                    return left * right;
                }).intValue();
    }

    @Test
    public void case2() {
        List<Integer> integers = Ints.asList(1, 2, 3, 4, 5);
        int sequential = integers.stream()
                .reduce(2, (a, b) -> {
                    Console.log("a :" + a + " b: " + b);
                    return a * b;
                }).intValue();
        System.out.println(sequential);

        int parallel = integers.parallelStream()
                .reduce(2, (a, b) -> {
                    Console.log("a :" + a + " b: " + b);
                    return a * b;
                }).intValue();
        System.out.println(parallel);

        int parallelYes = integers.parallelStream()
                .reduce(2, (a, b) -> {
                            Console.log("a :" + a + " b: " + b);
                            return a * b;
                        },
                        (left, right) -> {
                            Console.log("left :" + left + " right: " + right);
                            return left * (right / 2);
                        }).intValue();
        System.out.println(parallelYes);
    }
}
