package cs.matemaster.stdcs;

import org.junit.Test;

import java.lang.reflect.Method;
import java.time.temporal.TemporalAdjusters;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public class ReflectTemporalAdjusters {

    @Test
    public void reflect() {
        Class<TemporalAdjusters> temporalAdjustersClass = TemporalAdjusters.class;
        Method[] methods = temporalAdjustersClass.getMethods();
        for (Method method : methods) {
            StdCSLogger.debug(method);
        }
    }

    @Test
    public void getAllPublicMethod() {
        ReflectUtil.printAllDeclaredMethod(TemporalAdjusters.class);
    }
}
