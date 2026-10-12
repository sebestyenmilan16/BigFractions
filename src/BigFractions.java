import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class BigFractions {

    private BigInteger numerator;
    private BigInteger denominator;

    public BigInteger getNumerator() {
        return numerator;
    }

    public void setNumerator(BigInteger numerator){
        this.numerator = numerator;
    }

    public BigInteger getDenominator() {
        return denominator;
    }

    public void setDenominator(BigInteger denominator) {
        this.denominator = denominator;
    }

    public BigFractions() {
        setNumerator(new BigInteger("0"));
        setDenominator(new BigInteger("1"));
    }
    public BigFractions(String numeratorStr, String denominatorStr) {
        setNumerator(new BigInteger(numeratorStr));
        setDenominator(new BigInteger(denominatorStr));
    }
    public BigFractions(long numerator, long denominator) {
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }
    public BigFractions(int numerator, int denominator) {
        setNumerator(BigInteger.valueOf(numerator));
        setDenominator(BigInteger.valueOf(denominator));
    }
    public BigFractions(BigInteger numerator, BigInteger denominator) {
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public static BigFractions parse(String fractionStr) {
        // "-3/5" -TODO - or (-3/5)"
        String[] split = fractionStr.split("/");
        String numeratorStr = split[0];
        String denominatorStr = split[1];
        return new BigFractions(numeratorStr, denominatorStr);
    }

    @Override
    public String toString() {
        return String.format("(%s/%s)", getNumerator().toString(), getDenominator().toString());
    }

    public BigDecimal toBigDecimal() {
        BigDecimal bigDecimalNumerator = new BigDecimal(getNumerator());
        BigDecimal bigDecimalDenominator = new BigDecimal(getDenominator());
        BigDecimal result = bigDecimalNumerator.divide(bigDecimalDenominator, RoundingMode.HALF_UP);
        return result;
    }

    // TODO - common denominator check
    // @param obj BigFractions
    // @return boolean

    @Override
    public boolean equals(Object obj) {
        BigFractions other = (BigFractions) obj;
        return this.toBigDecimal().equals(other.toBigDecimal());
    }

}
