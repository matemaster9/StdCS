package cs.matemaster.stdcs.lambda.command;

import cs.matemaster.stdcs.lambda.command.Action;
import cs.matemaster.stdcs.lambda.command.IEditor;

/**
 * @author matemaster
 */
public class Save implements Action {

    private final IEditor editor;

    public Save(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.save();
    }
}
