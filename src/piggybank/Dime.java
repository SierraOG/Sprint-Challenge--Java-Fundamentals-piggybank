package piggybank;

public class Dime extends Money{
    static double faceValue = 0.10;

    public Dime(int numCoins){
        super(numCoins, faceValue);
    }
    public Dime(){
        super(1, faceValue);
    }
    @Override void printContents(){
        String response = (numCoins > 1) ? " Dimes" : " Dime";
        System.out.println(numCoins + response);
    }
}