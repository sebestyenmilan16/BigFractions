public class BigFractions2 {

    public static boolean isAllesthanB(BigFractions a, BigFractions b) {
        int result = a.toBigDecimal().compareTo(b.toBigDecimal());
        return result < 0; // TODO -
    }

}
