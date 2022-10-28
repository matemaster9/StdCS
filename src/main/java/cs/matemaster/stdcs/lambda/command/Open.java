package cs.matemaster.stdcs.lambda.command;


import cs.matemaster.stdcs.lambda.command.Action;
import cs.matemaster.stdcs.lambda.command.IEditor;

/**
 * @author matemaster
 */
public class Open implements Action {

    private final IEditor editor;

    public Open(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
