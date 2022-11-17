class Recursion {
    public static void main(String[] args) {
        int x = 10;
        System.out.println(sum(x));
    }

    public static int sum(int x) {
        if (x > 0) {
            return x + sum(x - 1);
        } else {
            return 0;
        }
    }

}