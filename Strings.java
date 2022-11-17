import java.util.*;

class Strings {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str;
        System.out.print("Nhap Mot chuoi tu ban phim: ");
        str = input.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        //String methods
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        String s = "Hello World!";
        System.out.println(s.indexOf("Hello"));

        //Concat 
        String firstName = "Tran";
        String lastName = "Dung";
        System.out.println(firstName + lastName);
        System.out.println(firstName.concat(lastName));
    }
}