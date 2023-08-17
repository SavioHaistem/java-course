public class Calculate {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);

        if (args[0].equals("sum")) {
            sum(x, y);
        } else if (args[0].equals("minus")) {
            minus(y, x);
        } else {
            System.out.println("Not operator method");
        }

    }

    static void sum(int x, int y) {
        System.out.println("Plus operation: " + (x + y));
    }
    static void minus(int x, int y) {
        System.out.println("minus operation: " + (x - y));
    }
}
