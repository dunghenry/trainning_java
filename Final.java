class Final {
    final float PI = 3.14f; // No change value
    static final int data;
    static {
        data = 10;
    }

    final void run() { // No overrides methods
        System.out.println("Running");
    }

    public int cube(final int a) {
        // a += 3; error
        return a;
    }

    // No inherit final class
    public static void main(String[] args) {
        System.out.println(new Final().PI);
        new Final().run();
        System.out.println(data);
        
    }
}