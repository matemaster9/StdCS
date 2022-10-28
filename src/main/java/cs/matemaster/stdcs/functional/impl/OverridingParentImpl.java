package cs.matemaster.stdcs.functional.impl;

import cn.hutool.core.lang.Console;

/**
 * @author matemaster
 */
public class OverridingParentImpl extends ParentImpl {

    @Override
    public void welcome() {
        Console.log(OverridingParentImpl.class.getName());
        Console.log("override welcome parent");
    }
}
