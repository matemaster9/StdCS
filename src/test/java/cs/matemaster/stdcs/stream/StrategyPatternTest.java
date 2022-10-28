package cs.matemaster.stdcs.stream;

import cs.matemaster.stdcs.lambda.strategy.Compressor;
import cs.matemaster.stdcs.lambda.strategy.GzipCompressionStrategy;
import cs.matemaster.stdcs.lambda.strategy.ZipCompressionStrategy;
import org.junit.Test;

/**
 * @author matemaster
 */
public class StrategyPatternTest {

    @Test
    public void name() {
        Compressor zip = new Compressor(new ZipCompressionStrategy());
        Compressor gzip = new Compressor(new GzipCompressionStrategy());

        System.out.println(zip.compress("content"));
        System.out.println(gzip.compress("content"));
    }

    @Test
    public void name_v2() {
        Compressor zip = new Compressor(str -> "compression algorithm: " + str);
        System.out.println(zip.compress("content"));
    }
}
