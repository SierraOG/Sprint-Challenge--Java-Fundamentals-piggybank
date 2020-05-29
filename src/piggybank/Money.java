package piggybank; 

import java.math.BigDecimal;

abstract class Money {
    public int numCoins;
    private double faceValue;

    public Money(int numCoins, double faceValue){
        this.numCoins = numCoins;
        this.faceValue = faceValue;
    }

    abstract void printContents();

    public BigDecimal getTotal(){
        BigDecimal a = BigDecimal.valueOf((double)numCoins);
        BigDecimal b = BigDecimal.valueOf(faceValue);
        return a.multiply(b);
    }
}