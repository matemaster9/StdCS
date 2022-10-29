package cs.matemaster.stdcs.stream;

import org.junit.Test;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author matemaster
 */
public class DataFunnelTest {

    @Test
    public void mock() {
        List<DataFunnelDto> dataFunnelDtoList = new ArrayList<>();

        List<DataFunnelDto> sortedDataFunnel = dataFunnelDtoList.stream()
                .sorted(Comparator.comparing(DataFunnelDto::getDate))
                .collect(Collectors.toList());

        Map<LocalDate, DataFunnelDto> dataFunnelMap = sortedDataFunnel.parallelStream()
                .collect(Collectors.groupingBy(
                                DataFunnelDto::getDate,
                                Collectors.collectingAndThen(
                                        Collectors.toList(),
                                        dataFunnels -> DataFunnelDto.builder()
                                                .number(9999999999L)
                                                .date(dataFunnels.get(0).getDate())
                                                .dept("全部科室")
                                                .registeredPatient(dataFunnels.stream().mapToInt(DataFunnelDto::getRegisteredPatient).sum())
                                                .visitedPatient(dataFunnels.stream().mapToInt(DataFunnelDto::getVisitedPatient).sum())
                                                .income(dataFunnels.parallelStream().map(DataFunnelDto::getIncome).reduce(BigDecimal.ZERO, BigDecimal::add))
                                                .build())
                        )
                );
        System.out.println(dataFunnelMap);
    }
}
