package cs.matemaster.stdcs.lambda;

/**
 * @author matemaster
 */
public class Close implements Action {

    private final IEditor editor;

    public Close(IEditor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
