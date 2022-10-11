package cs.matemaster.stdcs.primitives;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.function.BinaryOperator;

/**
 * @author matemaster
 */
public class IntegerTest {

    public void func() {
        BinaryOperator<Integer> sum = (number1, number2) -> number1 + number2;
        BinaryOperator<Integer> sumV1 = Integer::sum;

        BinaryOperator<Integer> min = (number1, number2) -> number1 < number2 ? number1 : number2;
        BinaryOperator<Integer> minV1 = Integer::min;

        BinaryOperator<Integer> max = (number1, number2) -> number1 > number2 ? number1 : number2;
        BinaryOperator<Integer> maxV1 = Integer::max;
    }

    @Test
    public void convert() {
        // -2147483648
        Console.log(Integer.MIN_VALUE);
        // 2147483647
        Console.log(Integer.MAX_VALUE);

        // string to primitive
        Console.log(Integer.parseInt("1024"));
        Console.log(Integer.parseInt("-1024"));
        Console.log(Integer.parseInt("10",2));

        // string tyo boxing
        Console.log(Integer.valueOf("1024"));
        Console.log(Integer.valueOf("12",8));

        Integer value = Integer.valueOf("1025");
        Console.log(value.shortValue());
        Console.log(value.longValue());
        Console.log(value.byteValue());
        Console.log(value.intValue());
        Console.log(value.floatValue());
        Console.log(value.doubleValue());

        // throw NumberFormatException
        // Console.log(Integer.parseUnsignedInt("-1024"));
    }

    @Test
    public void toStr() {
        Console.log(Integer.toBinaryString(10));
        Console.log(Integer.toHexString(10));
        Console.log(Integer.toOctalString(10));
    }
}
