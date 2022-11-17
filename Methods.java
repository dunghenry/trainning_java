class Methods {
    public static void main(String[] args) {
        sayHello();
        displayMsg("Tran Dung");
        int x = 10;
        float a = 4.3f;
        float b = 1.2f;
        System.out.println(sum(x));
        System.out.println(sum(a, b));
    }

    private static void sayHello() {
        System.out.println("Hello!");
    }

    public static void displayMsg(String msg) {
        System.out.println(msg);
    }

    // Method overloading

    static int sum(int x) {
        return x;
    }

    static float sum(float a, float b) {
        return a + b;
    }
}