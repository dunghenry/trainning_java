public class App {
    public static void main(String[] args) throws Exception {
        Car a = new Car("Mercedes", "white");
        System.out.println(a.color);
        System.out.println(a.name);
        a.run();
        Student s = new Student(1, "Dung");
        s.displayInformation();
        System.out.println(Student.age);
        new Caculation().fact(5);
    }
}
