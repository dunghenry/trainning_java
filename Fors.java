class Fors {
    public static void main(String[] args) {
        int a = 10;
        for (int i = 0; i < a; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
        for (int i = 0; i < a; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }

        // For each
        String[] cars = { "Volvo", "Honda", "Mercedes" };
        for (String item : cars) {
            System.out.println(item);
        }
    }
}