package cs.matemaster.stdcs.stream;

import cs.matemaster.stdcs.lambda.command.Close;
import cs.matemaster.stdcs.lambda.command.EditRequestImpl;
import cs.matemaster.stdcs.lambda.command.Macro;
import cs.matemaster.stdcs.lambda.command.Open;
import cs.matemaster.stdcs.lambda.command.Save;
import org.junit.Test;

/**
 * @author matemaster
 */
public class CommandPatternTest {

    @Test
    public void client() {
        Macro macro = new Macro();

        EditRequestImpl editRequest = new EditRequestImpl();

        macro.record(new Open(editRequest));
        macro.record(new Save(editRequest));
        macro.record(new Close(editRequest));

        macro.run();
    }

    @Test
    public void client_v2() {
        Macro macro = new Macro();

        EditRequestImpl edit = new EditRequestImpl();

        macro.record(edit::open);
        macro.record(edit::save);
        macro.record(edit::close);

        macro.run();
    }
}
