package cs.matemaster.stdcs.guava;

import cn.hutool.core.lang.Console;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.google.common.primitives.Longs;
import com.google.common.primitives.Shorts;
import cs.matemaster.stdcs.model.ComStaffDto;
import org.junit.Test;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author matemaster
 */
public class MapsTest {

    @Test
    public void filterKey() {
        ImmutableMap<Integer, String> immutableMap = ImmutableMap.of(1, "one", 2, "two", 3, "three", 4, "four");
        Map<Integer, String> filteredMap = Maps.filterKeys(immutableMap, k -> k > 2);
        Console.log(filteredMap);
    }

    @Test
    public void init() {
        Map<String, Object> map = Maps.newHashMap();
        map.put("name", "Matemaster");
        Console.log(map);

        Map<String, Object> mapWithExpectedSize = Maps.newHashMapWithExpectedSize(10);
        mapWithExpectedSize.put("name", "Matemaster");
        Console.log(mapWithExpectedSize);
    }

    @Test
    public void filterEntry() {
        ThreadLocalRandom currentRandom = ThreadLocalRandom.current();

        Map<String, Short> collectMap = Stream.generate(() -> {
            ComStaffDto staff = new ComStaffDto();
            staff.setCode(String.valueOf(80_000_000 + currentRandom.nextInt(1_000_001, 10_000_000)));
            staff.setAge(Shorts.saturatedCast(currentRandom.nextInt(0, 100)));
            return staff;
        }).limit(10).collect(Collectors.toMap(ComStaffDto::getCode, ComStaffDto::getAge));

        Console.log(collectMap);

        // 工号大于80490072 以及年纪大于25的员工
        Map<String, Short> filteredMap = Maps.filterEntries(collectMap, entry -> Integer.parseInt(entry.getKey()) < 80490072 && Longs.compare(entry.getValue(), 25) > 0);
        Console.log(filteredMap);

        Map<String, Short> filteredMapV2 = collectMap.entrySet().stream()
                .filter(entry -> Integer.parseInt(entry.getKey()) < 80490072 && Longs.compare(entry.getValue(), 25) > 0)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        Console.log(filteredMapV2);
    }
}
