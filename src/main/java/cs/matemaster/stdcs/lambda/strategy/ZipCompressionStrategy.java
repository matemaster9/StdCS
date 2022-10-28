package cs.matemaster.stdcs.lambda.strategy;

/**
 * @author matemaster
 */
public class ZipCompressionStrategy implements CompressionStrategy {
    @Override
    public String compress(String tobeCompressed) {
        return "zip: " + tobeCompressed;
    }
}
