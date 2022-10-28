package cs.matemaster.stdcs.functional;

/**
 * @author matemaster
 */
public interface Child extends Parent{

    default void welcome() {
        message("Hi Child");
    }
}
