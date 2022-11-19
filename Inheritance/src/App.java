public class App {
    public static void main(String[] args) throws Exception {
        Programer p = new Programer();
        Dog d = new Dog();
        BabyDog bd = new BabyDog();
        Cat c = new Cat();
        System.out.println(p.salary);
        System.out.println(p.bonus);
        d.eat();
        d.bark();
        bd.weep();
        c.meow();
    }
}
