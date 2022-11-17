class Whiles {
    public static void main(String[] args) {
        int a = 10;
        int i = 0;
        while (i < a) {
            System.out.println(i);
            i++;
        }
        System.out.println("-----------------");
        int y = 10;
        int b = 5;
        do {
            System.out.println(y);
            y++;
        } while (y < b);
    }
}