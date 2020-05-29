package piggybank;

public class Nickel extends Money{
    static double faceValue = 0.05;

    public Nickel(int numCoins){
        super(numCoins, faceValue);
    }
    public Nickel(){
        super(1, faceValue);
    }
    @Override void printContents(){
        String response = (numCoins > 1) ? " Nickels" : " Nickel";
        System.out.println(numCoins + response);
    }
}