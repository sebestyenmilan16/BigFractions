import org.junit.Test;

import java.math.BigInteger;

public class BigFractionTest {

    @Test
    public void testBigFraction() {
        BigFractions a = new BigFractions(); // (0/1) = 0.0
        BigFractions b = new BigFractions("2","3");
        BigFractions c = new BigFractions(-4L, 5L);
        BigFractions d = new BigFractions(-3, 8);
        BigFractions e = new BigFractions(new BigInteger("1"), new BigInteger("2"));
    }

    @Test
    public void testParse() {
        BigFractions a = BigFractions.parse("-2/5");
        System.out.println(a);
    }
}
