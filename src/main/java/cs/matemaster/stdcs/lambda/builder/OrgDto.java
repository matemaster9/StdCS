package cs.matemaster.stdcs.lambda.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

import java.util.function.Function;

/**
 * @author matemaster
 */
@Builder
@Getter
@ToString
public class OrgDto {

    private String name;

    private String id;

    public static OrgDto of(Function<OrgDto.OrgDtoBuilder, OrgDto> func) {
        return func.apply(builder());
    }
}
