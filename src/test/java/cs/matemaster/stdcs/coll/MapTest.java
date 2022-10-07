package cs.matemaster.stdcs.coll;

import com.google.common.collect.ImmutableMap;
import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author matemaster
 */
public class MapTest {

    @Test
    public void compute() {
        Map<String, Object> map = new HashMap<>();
        map.put("user", "mate-master");
        map.put("passwd", "JCH980JS1Dcv2j9");
        Object compute = map.compute("user", (k, v) -> StringUtils.isNotEmpty(k) ? "name: " + v : "name:null");
        System.out.println(compute);
        System.out.println(map);
    }

    @Test
    public void init() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("user", "mate-master");
            put("passwd", "JCH980JS1Dcv2j9");
        }};

        System.out.println(map);

        ImmutableMap<String, String> immutableMap = ImmutableMap.of("user", "mate-master");
        System.out.println(immutableMap);
    }

    @Test
    public void contains() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("user", "mate-master");
            put("passwd", "JCH980JS1Dcv2j9");
        }};

        boolean containsKey = map.containsKey("user");
        boolean containsValue = map.containsValue("mate-master");
        System.out.println(containsKey);
        System.out.println(containsValue);
    }

    @Test
    public void replace() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("user", "mate-master");
            put("passwd", "JCH980JS1Dcv2j9");
        }};

        Object replace = map.replace("user", 100);
        System.out.println(replace);

        boolean result = map.replace("user", 100, "Matemaster");
        System.out.println(result);

        System.out.println(map);
    }

    @Test
    public void replace_1() {
        Map<String, Object> map = new HashMap<String, Object>() {{
            put("user", "mate-master");
            put("passwd", "JCH980JS1Dcv2j9");
        }};

        Object replace = map.replace("username", 100);
        System.out.println(replace);

        boolean result = map.replace("user", 200, "Matemaster");
        System.out.println(result);

        System.out.println(map);
    }

    @Test
    public void computeIfAbsent() {
        Map<String, Object> map = new HashMap<>();
        map.put("user", "macro");
        map.computeIfAbsent("user", (v) -> v.equals("macro") ? "matemaster" : v);
        map.computeIfPresent("user", (k, v) -> v.equals("macro") ? "matemaster" : v);
        System.out.println(map);
    }

    @Test
    public void getOrDefault() {
        Map<String, Object> map = new HashMap<>();
        map.put("user", "matemaster");
        Object user = map.get("user");
        Object orDefault = map.getOrDefault("username", "username");
        System.out.println(user);
        System.out.println(orDefault);
    }

    @Test
    public void replaceAll() {
        Map<String, Object> map = new HashMap<>();
        map.put("user", "matemaster");
        map.put("passwd", "matemaster");

        map.replaceAll((key, value) -> {
            if (key.length() <= 4) {
                return null;
            } else {
                return value;
            }
        });

        System.out.println(map);
    }

    @Test
    public void set() {
        Map<String, String> map = new HashMap<String, String>() {{
            put("port", "8080");
            put("server", "localhost");
            put("driver", "mysql");
            put("framework", "spring");
        }};

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
        }

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        for (String value : map.values()) {
            System.out.println(value);
        }

        map.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}
