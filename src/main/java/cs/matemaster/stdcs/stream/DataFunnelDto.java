package cs.matemaster.stdcs.stream;

import lombok.Builder;
import lombok.Getter;

import java.math.BigDecimal;
import java.time.LocalDate;

/**
 * @author matemaster
 */
@Getter
@Builder
public class DataFunnelDto {
    private Long number;
    private String dept;
    private LocalDate date;
    private Integer registeredPatient;
    private Integer visitedPatient;
    private BigDecimal income;
}
