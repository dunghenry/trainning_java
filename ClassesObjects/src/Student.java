public class Student {
    public int id;
    public String name;
    static public int age = 21;

    public Student(int id, String name) { // contructor
        this.id = id;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void displayInformation() {
        System.out.println(id + "-" + name);
    }
}
