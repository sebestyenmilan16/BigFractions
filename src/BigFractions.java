import java.math.BigInteger;

public class BigFractions {

    private BigInteger numerator;
    private BigInteger denominator;

    public BigInteger getNumerator(BigInteger numerator) {
        return numerator;
    }

    public void setNumerator(BigInteger numerator){
        this.numerator = numerator;
    }

    public BigInteger getDenominator(BigInteger denominator) {
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

}
