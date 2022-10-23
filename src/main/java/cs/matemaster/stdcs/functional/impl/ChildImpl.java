package cs.matemaster.stdcs.functional.impl;

import cn.hutool.core.lang.Console;
import cs.matemaster.stdcs.functional.Child;

/**
 * @author matemaster
 */
public class ChildImpl implements Child {

    @Override
    public void message(String body) {
        Console.log(ChildImpl.class.getName());
        Console.log(body);
    }
}
