package cs.matemaster.stdcs.lambda;

/**
 * @author matemaster
 */
public class EditRequestImpl implements IEditor{
    @Override
    public void open() {
        System.out.println("open");
    }

    @Override
    public void save() {
        System.out.println("save");
    }

    @Override
    public void close() {
        System.out.println("close");
    }
}
