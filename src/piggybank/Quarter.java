package piggybank;

public class Quarter extends Money{
    static double faceValue = 0.25;

    public Quarter(int numCoins){
        super(numCoins, faceValue);
    }
    public Quarter(){
        super(1, faceValue);
    }
    @Override void printContents(){
        String response = (numCoins > 1) ? " Quarters" : " Quarter";
        System.out.println(numCoins + response);
    }
}