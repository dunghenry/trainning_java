class Overloading {
    public int sum(int a, int b) {
        return a + b;
    }

    public int sum(int a, int b, int c) {
        return a + b + c;
    }
}

class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Dog extends Animal {
    void eat() {
        System.out.println("eating bread...");
    }
}

class Test {
    public static void main(String[] args) {
        Overloading o = new Overloading();
        System.out.println(o.sum(1, 2));
        System.out.println(o.sum(1, 2, 3));
        Dog d = new Dog();
        d.eat();

    }
}