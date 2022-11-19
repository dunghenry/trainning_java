class Constructor {
    public int id;
    public String name;

    // Default constructor
    public Constructor() {
    };

    public Constructor(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        Constructor c = new Constructor();
        System.out.println(c.id); // 0
        System.out.println(c.name); // null
        Constructor a = new Constructor(1, "Dung");
        System.out.println(a.id); // 1
        System.out.println(a.name); // Dung
    }
}