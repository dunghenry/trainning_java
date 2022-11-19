public class Student {
    public int id;
    public String name;

    public Student() {
        System.out.println("Call contructor default");
    }
    // public Student(int id, String name) {
    // id = id;
    // name = name;
    // }
    // Student st = new Student(1, "Tran Van A");
    // System.out.println(st.id); // 0
    // System.out.println(st.name); // null

    public Student(int id, String name) {
        this();
        this.id = id;
        this.name = name;
    }

    // public Student(int i, String n) {
    // id = i;
    // name = n;
    // }

    void display() {
        System.out.println(id + " " + name);
    }

    public static void main(String[] args) {
        Student st = new Student(1, "Tran Van A");
        System.out.println(st.id); // 1
        System.out.println(st.name); // Tran Van A
        st.display();
    }
}
