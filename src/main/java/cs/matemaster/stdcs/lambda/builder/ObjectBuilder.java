package cs.matemaster.stdcs.lambda.builder;

/**
 * @author matemaster
 */
public interface ObjectBuilder<E> {

    /**
     * 构造指定类型对象
     *
     * @return
     */
    E build();
}
