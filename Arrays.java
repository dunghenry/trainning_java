import java.util.Scanner;

class Arrays {
    public static void main(String[] args) {
        String[] cars = { "Volvo", "Honda", "BMW" };
        for (String car : cars) {
            System.out.println(car);
        }
        System.out.println(cars.length);
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print(String.format("Nhap gia tri thu %s = ", i));
            arr[i] = input.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        int[][] a = { { 1, 2, 3 }, { 4, 5, 6 } }; // length: 2
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.println(a[i][j]);
            }
        }
        System.out.println(a.length);
    }
}