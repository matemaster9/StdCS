package cs.matemaster.stdcs.effectivejava;

import cn.hutool.core.lang.Console;
import com.google.common.primitives.Shorts;
import cs.matemaster.stdcs.model.ComStaffDto;
import org.junit.Test;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author matemaster
 */
public class J42 {

    @Test
    public void lambda() {
        List<ComStaffDto> staffList = Stream.generate(() -> {
                    ComStaffDto staff = new ComStaffDto();
                    staff.setAge(Shorts.saturatedCast(ThreadLocalRandom.current().nextInt(100)));
                    staff.setCode(String.valueOf(ThreadLocalRandom.current().nextGaussian()));
                    staff.setSalary(ThreadLocalRandom.current().nextInt(100_000));
                    return staff;
                }).limit(10)
                .sorted(Comparator.comparingInt(ComStaffDto::getSalary).reversed())
                .collect(Collectors.toList());

        staffList.forEach(Console::log);
    }


    @Test
    public void chars() {
        "MateMaster".chars().forEach(item -> Console.log((char) item));
        "MateMaster".chars().forEach(Console::log);
    }
}
