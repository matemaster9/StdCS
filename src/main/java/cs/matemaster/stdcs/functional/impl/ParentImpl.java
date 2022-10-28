package cs.matemaster.stdcs.functional.impl;

import cn.hutool.core.lang.Console;
import cs.matemaster.stdcs.functional.Parent;

/**
 * @author matemaster
 */
public class ParentImpl implements Parent {

    @Override
    public void message(String body) {
        Console.log(ParentImpl.class.getName());
        Console.log(body);
    }
}
