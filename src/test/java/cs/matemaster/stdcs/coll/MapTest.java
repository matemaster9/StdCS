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
        map.compute("user", (k, v) -> StringUtils.isNotEmpty(k) ? "name: " + v : "name:null");
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
}
