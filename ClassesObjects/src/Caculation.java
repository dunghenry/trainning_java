public class Caculation {
    void fact(int n) {
        int gt = 1;
        for (int i = 1; i <= n; i++) {
            gt *= i;
        }
        System.out.println(gt);
    }
}
