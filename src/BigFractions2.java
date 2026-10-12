import org.junit.Test;

public class BigFractions2 {

    public static boolean isAllesthanB(BigFractions a, BigFractions b) {
        int result = a.toBigDecimal().compareTo(b.toBigDecimal());
        return result < 0; // TODO - common denominatior check
    }

    public static boolean equals(BigFractions a, BigFractions b) {
        return a.equals(b);
    }

    public static boolean isAllestthanOrEqualB(BigFractions a, BigFractions b) {
        return equals(a, b) || isAllesthanB(a, b);
    }

    public static boolean isAgreaterthanB(BigFractions a, BigFractions b) {
        return !isAllestthanOrEqualB(a, b);
    }

    public static boolean isAgreaterthanOrEqualB(BigFractions a, BigFractions b) {
        return equals(a, b) || isAgreaterthanB(a, b);
    }

    public static boolean notEquals(BigFractions a, BigFractions b) {
        return !equals(a, b);
    }



}
