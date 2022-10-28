package cs.matemaster.stdcs.lambda.strategy;

/**
 * @author matemaster
 */
@FunctionalInterface
public interface CompressionStrategy {

    /**
     * 压缩
     *
     * @param tobeCompressed 待压缩内容
     * @return 压缩后内容
     */
    String compress(String tobeCompressed);
}
