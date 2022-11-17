class IfElse {
    public static void main(String[] args) {
        int a = 10;
        if (a > 0) {
            System.out.println("A = " + a);
        } else if (a < 0) {
            System.out.println("A < 0");
        } else {
            System.out.println("Not match");
        }

        // short hand

        String b = a >= 10 ? "true" : "false";
        System.out.println(b);
    }
}