package piggybank; 

import java.util.List;
import java.util.ArrayList;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class Main{
    public static void main(String[] args){

        ArrayList<Money> piggyBank = new ArrayList<Money>();
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));
        
        BigDecimal total = BigDecimal.valueOf(0.00);

        for (Money coin : piggyBank){
            coin.printContents();
            total = total.add(coin.getTotal());
        }

        total = total.setScale(2, RoundingMode.HALF_UP);

        System.out.println("The piggy bank holds $" + total);
    }
}