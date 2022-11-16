class TypeCasting {
    public static void main(String[] args) {
        
        // Widening Casting (automatically): byte -> short -> char -> int -> long ->
        // float -> double
        // Narrowing Casting (manually): double -> float -> long -> int -> char -> short
        // -> byte

        int myInt = 9;
        double myDouble = myInt;
        System.out.println(myInt); // 9
        System.out.println(myDouble); // 9.0

        double d = 9.87d;
        int i = (int) d;
        System.out.println(d); // 9.87
        System.out.println(i); // 9
    }
}