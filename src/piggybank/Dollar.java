package piggybank;

public class Dollar extends Money{
    static double faceValue = 1.00;

    public Dollar(int numCoins){
        super(numCoins, faceValue);
    }
    public Dollar(){
        super(1, faceValue);
    }
    @Override void printContents(){
        System.out.println("$" + numCoins);
    }
}