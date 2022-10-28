package cs.matemaster.stdcs.functional;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import javax.swing.*;
import java.util.function.Predicate;

/**
 * @author matemaster
 */
public class FunctionTest {


    @Test
    public void test() {
        IntPred pred = (x -> x > 5);
        Predicate<Integer> stdPred = (x -> x > 5);

        Console.log(check(pred, 10));
        Console.log(check(stdPred, 10));
    }

    public boolean check(IntPred pred, Integer arg) {
        Console.log("IntPred");
        return pred.test(arg);
    }

    public boolean check(Predicate<Integer> pred, Integer arg) {
        Console.log("Predicate<Integer>");
        return pred.test(arg);
    }

    @Test
    public void test1() {
        Runnable helloWorld = () -> Console.log("hello world");
        helloWorld.run();
    }

    @Test
    public void test2() {
        JButton button = new JButton();
        button.addActionListener(event -> {
            Console.log(event.getActionCommand());
        });
    }

    @Test
    public void test3() {
        // 方法歧义
        // check(x -> x > 5, 10);
    }


}
