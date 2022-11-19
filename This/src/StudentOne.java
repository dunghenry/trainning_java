public class StudentOne {
    public int id;
    public String name;
    public String city;
    Hi h;

    StudentOne getStudentOne() {
        return this;
    }
    public StudentOne(Hi h) {
        this.h = h;
    }

    void sayHello() {
        System.out.println("Hello!");
    }

    public StudentOne(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public StudentOne(int id, String name, String city) {
        this(id, name);
        this.city = city;
    }

    void display() {
        this.sayHello();
        // sayHello();
        System.out.println(id + " " + name + " " + city);
    }

    void displayH() {
        System.out.println(h.msg);
    }

    public static void main(String[] args) {
        StudentOne st = new StudentOne(1, "Dung", "Ninh Binh");
        StudentOne st1 = new StudentOne(new Hi());
        st.display();
        st1.displayH();
        System.out.println(st.getStudentOne().name);
    }
}

class Hi {
    public String msg = "Hi";
}