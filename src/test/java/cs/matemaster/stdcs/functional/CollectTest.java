package cs.matemaster.stdcs.functional;

import cn.hutool.core.lang.Console;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author matemaster
 */
public class CollectTest {

    @Test
    public void case1() {
        Map<String, Integer> map = new HashMap<String, Integer>() {{
            put("mate", 100);
            put("master", 200);
            put("eric", null);
        }};
    }

    @Test
    public void case2() {
        List<TrackDto> trackList = Arrays.asList(new TrackDto("v", 60),
                new TrackDto("cap", 32),
                new TrackDto("go", 80),
                new TrackDto("eric", null)
        );

        // 针对 null value 处理
        Map<String, Integer> lengthMap = trackList.stream()
                .collect(Collectors.toMap(
                        TrackDto::getName,
                        track -> track.getLength() == null ? -1 : track.getLength()
                ));
        lengthMap.forEach((k, v) -> Console.log("key: " + k, " value: " + v));
    }

    @Test
    public void case3() {
        List<TrackDto> trackList = Arrays.asList(new TrackDto("v", 60),
                new TrackDto("cap", 32),
                new TrackDto("go", 80),
                new TrackDto("go", null),
                new TrackDto(null, 0)
        );

        // 针对 duplicate key 处理
        Map<String, Integer> lengthMap = trackList.stream()
                .collect(Collectors.toMap(
                        TrackDto::getName,
                        track -> track.getLength() == null ? -1 : track.getLength(),
                        (old, newValue) -> newValue
                ));
        lengthMap.forEach((k, v) -> Console.log("key: " + k, " value: " + v));
    }


    @Test
    public void case4() {
        List<TrackDto> trackList = Arrays.asList(new TrackDto("v", 60),
                new TrackDto("cap", 32),
                new TrackDto("go", 80),
                new TrackDto("go", null),
                new TrackDto(null, 0),
                new TrackDto("cap", 10)
        );

        // 分组:支持null key
        Map<String, List<Integer>> lengthMap = trackList.stream()
                .collect(Collectors.toMap(
                        TrackDto::getName,
                        track -> {
                            List<Integer> values = new ArrayList<>();
                            values.add(track.getLength());
                            return values;
                        },
                        (old, newList) -> {
                            old.addAll(newList);
                            return old;
                        }
                ));
        lengthMap.forEach((k, v) -> Console.log("key: " + k, " value: " + v));
    }

}
