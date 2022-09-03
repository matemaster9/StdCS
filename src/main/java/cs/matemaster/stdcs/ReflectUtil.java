package cs.matemaster.stdcs;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * @author MateMaster
 * @since 2022/9/3
 */
public final class ReflectUtil {

    private ReflectUtil() {
    }

    public static void printAllDeclaredMethod(Class<?> clazz) {
        Method[] declaredMethods = clazz.getDeclaredMethods();
        Arrays.stream(declaredMethods).filter(method -> Modifier.toString(method.getModifiers()).contains("public")).forEach(StdCSLogger::debug);
    }
}
