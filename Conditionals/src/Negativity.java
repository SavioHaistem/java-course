//This code will convert numbers to negative
public class Negativity {
    public static void main(String[] args) {
        int currentNumber = Integer.parseInt(args[0]);

        System.out.println(checkAndConvertNumber(currentNumber));
    }

    static int checkAndConvertNumber(int x) {
        return (x > 0) ? -x : x;
    }
}