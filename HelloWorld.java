import java.util.Scanner;
import java.text.MessageFormat;
public class HelloWorld {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Nhap gia tri cua a = ");
        a = input.nextInt();
        System.out.println("Hello, world!");
        String output = String.format("Gia tri cua a la %s", a);
        String output2 = MessageFormat.format("Gia tri cua a la {0, number}", a);
        System.out.println(output);
        System.out.println(output2);
        input.close();
    }
}
