package cs.matemaster.stdcs.stream;

import cs.matemaster.stdcs.lambda.IErrorCode;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author matemaster
 */
public class LambdaTest {

    @Test
    public void anonymous() {
        IErrorCode err = new IErrorCode() {

            @Override
            public String getCode() {
                return "errorCode";
            }

            @Override
            public String getMessage() {
                return "errorMessage";
            }
        };

        System.out.println(err.getCode());
        System.out.println(err.getMessage());
    }

    @Test
    public void compare() {
        List<String> words = Arrays.asList("tomcat", "DHJ", "IWH", "AVSA", "IUQW2EVHIW", "VASDJVN");

        words.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(words);

        words.sort((str1, str2) -> str2.length() - str1.length());
        System.out.println(words);

        words.sort(Comparator.comparingInt(String::length));
        System.out.println(words);
    }
}
