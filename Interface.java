interface PrintTable {
    void print();
}

interface ShowTable {
    void show();
}

interface Show extends PrintTable {
    void show();
}

class Interface implements PrintTable, ShowTable {
    public void print() {
        System.out.println("Print");
    }

    public void show() {
        System.out.println("Show");
    }

    public static void main(String[] args) {
        new Interface().print();
        new Interface().show();
    }
}

class Interface1 implements Show {
    public void print() {
        System.out.println("Print 1");
    }

    public void show() {
        System.out.println("Show 1");
    }

    public static void main(String[] args) {
        new Interface1().print();
        new Interface1().show();
    }
}