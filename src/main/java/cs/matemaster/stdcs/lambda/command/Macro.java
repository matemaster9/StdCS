package cs.matemaster.stdcs.lambda.command;

import cs.matemaster.stdcs.lambda.command.Action;

import java.util.ArrayList;
import java.util.List;

/**
 * @author matemaster
 */
public class Macro {

    private final List<Action> actions;


    public Macro() {
        this.actions = new ArrayList<>();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
