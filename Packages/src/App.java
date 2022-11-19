import mypack.*;
import math.Math;

public class App {
    public static void main(String[] args) throws Exception {
        Simple s = new Simple();
        s.sayHello();
        Math m = new Math();
        System.out.println(s.mysum(2, 3));
        System.out.println(m.sum(1, 2));
    }
}
