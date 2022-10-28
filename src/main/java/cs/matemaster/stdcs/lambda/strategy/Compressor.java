package cs.matemaster.stdcs.lambda.strategy;

/**
 * @author matemaster
 */
public class Compressor {

    private final CompressionStrategy strategy;

    public Compressor(CompressionStrategy strategy) {
        this.strategy = strategy;
    }

    public String compress(String tobeCompressed) {
        return strategy.compress(tobeCompressed);
    }
}
