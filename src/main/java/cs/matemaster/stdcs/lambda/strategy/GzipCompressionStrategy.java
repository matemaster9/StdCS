package cs.matemaster.stdcs.lambda.strategy;

/**
 * @author matemaster
 */
public class GzipCompressionStrategy implements CompressionStrategy {
    @Override
    public String compress(String tobeCompressed) {
        return "gzip: " + tobeCompressed;
    }
}
