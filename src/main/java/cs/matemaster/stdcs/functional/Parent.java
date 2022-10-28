package cs.matemaster.stdcs.functional;

/**
 * @author matemaster
 */
public interface Parent {

    void message(String body);

    default void welcome() {
        message("Hi Parent!");
    }
}
