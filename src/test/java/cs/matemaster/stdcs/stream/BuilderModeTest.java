package cs.matemaster.stdcs.stream;

import cs.matemaster.stdcs.lambda.builder.OrgDto;
import cs.matemaster.stdcs.lambda.builder.Trainee;
import org.junit.Test;

import java.util.function.Function;

/**
 * @author matemaster
 */
public class BuilderModeTest {

    @Test
    public void build() {
        Trainee trainee = Trainee.of(builder -> builder.traineeId("M100"));
        System.out.println(trainee);
    }

    @Test
    public void build_v2() {
        OrgDto orgLambda = OrgDto.of(builder -> builder.name("Apache").id("M100").build());
        System.out.println(orgLambda);

        OrgDto orgAnonymous = OrgDto.of(new Function<OrgDto.OrgDtoBuilder, OrgDto>() {
            @Override
            public OrgDto apply(OrgDto.OrgDtoBuilder builder) {
                return builder.name("Apache").id("M100").build();
            }
        });
        System.out.println(orgAnonymous);
    }
}
