import org.junit.Assert;
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
        //System.out.println(a);
        Assert.assertEquals("(-2/5)", a.toString());
    }

    @Test
    public void testEquals() {
        BigFractions a = BigFractions.parse("-2/5");
        BigFractions b = BigFractions.parse("-2/5");
        //System.out.println(a.equals(b));
        Assert.assertTrue(a.equals(b));
    }

    @Test
    public void testLessthan() {
        BigFractions a = BigFractions.parse("1/3");
        BigFractions b = BigFractions.parse("2/3");
        Assert.assertTrue(BigFractions2.isAllesthanB(a, b));
    }

    @Test
    public void testRelations() {
        BigFractions a = BigFractions.parse("1/3");
        BigFractions b = BigFractions.parse("2/3");

        Assert.assertTrue(BigFractions2.isAllesthanB(a, b));
        Assert.assertFalse(BigFractions2.isAgreaterthanB(a, b));
        Assert.assertFalse(BigFractions2.equals(a, b));
        Assert.assertFalse(BigFractions2.isAgreaterthanOrEqualB(a, b));
        Assert.assertTrue(BigFractions2.isAllestthanOrEqualB(a, b));
        Assert.assertTrue(BigFractions2.notEquals(a, b));
    }

}
