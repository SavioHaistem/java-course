//This code will convert numbers to negative
public class Negativity {
    public static void main(String[] args) {
        int currentNumber = Integer.parseInt(args[0]);

        checkAndConvertNumber(currentNumber);
    }

    static void checkAndConvertNumber(int x) {
        if (x > 0) {
            System.out.println( x - (x * 2));
        } else {
            System.out.println(x);
        }
    }
}