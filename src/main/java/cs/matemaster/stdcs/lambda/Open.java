package cs.matemaster.stdcs.lambda;


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
