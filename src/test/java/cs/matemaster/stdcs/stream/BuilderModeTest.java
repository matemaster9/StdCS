package cs.matemaster.stdcs.stream;

import cs.matemaster.stdcs.lambda.builder.Trainee;
import org.junit.Test;

/**
 * @author matemaster
 */
public class BuilderModeTest {

    @Test
    public void build() {
        Trainee trainee = Trainee.of(builder -> builder.traineeId("M100"));
        System.out.println(trainee);
    }
}
