package piggybank;

public class Penny extends Money{
    static double faceValue = 0.01;

    public Penny(int numCoins){
        super(numCoins, faceValue);
    }
    public Penny(){
        super(1, faceValue);
    }
    @Override void printContents(){
        String response = (numCoins > 1) ? " Pennies" : " Penny";
        System.out.println(numCoins + response);
    }
}