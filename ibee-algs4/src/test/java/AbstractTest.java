import cs.matemaster.algs4.search.AbstractSymbolTable;
import cs.matemaster.algs4.search.SymbolTable;
import org.junit.Test;

import java.util.Collections;

/**
 * @author matemaster
 */
public class AbstractTest {

    @Test
    public void test() {
        SymbolTable<String, Object> emptySymbolTable = new AbstractSymbolTable<String, Object>() {

            @Override
            public void put(String key, Object value) {
                throw new UnsupportedOperationException();
            }

            @Override
            public Object get(String key) {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public Iterable<String> keys() {
                return Collections.emptyList();
            }
        };

        System.out.println(emptySymbolTable.get("matemaster"));
    }
}
