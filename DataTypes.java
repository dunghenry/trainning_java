class DataTypes {
    public static void main(String[] args) {
        // n bit => -2^(n - 1) -> 2^(n - 1) -1
        // byte: 1byte -128 -> 127
        // short: 2bytes -32,768 -> 32,767
        // int: 4bytes -2147483648 -> 2147483647
        // long: 8bytes -9223372036854775808 -> 9223372036854775807
        // float: 4bytes
        // double: 8bytes
        // boolean: 1 bit
        // char: 2bytes
        int i = 1;
        float f = 2.5f;
        byte b = 1;
        short s = 100;
        long l = 5000000000L;
        double d = 1.5d;
        boolean isLoading = false;
        char c = 'C';
        System.out.println(Math.pow(2, 7));
    }
}