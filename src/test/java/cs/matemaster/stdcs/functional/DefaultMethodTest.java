package cs.matemaster.stdcs.functional;

import cs.matemaster.stdcs.functional.impl.ChildImpl;
import cs.matemaster.stdcs.functional.impl.OverridingChildImpl;
import cs.matemaster.stdcs.functional.impl.OverridingParentImpl;
import cs.matemaster.stdcs.functional.impl.ParentImpl;
import org.junit.Test;

/**
 * @author matemaster
 */
public class DefaultMethodTest {

    @Test
    public void case1() {
        new ParentImpl().welcome();
        new ChildImpl().welcome();
    }

    @Test
    public void case2() {
        new ParentImpl().welcome();
        new OverridingParentImpl().welcome();
    }

    @Test
    public void case3() {
        new OverridingChildImpl().welcome();
    }
}
