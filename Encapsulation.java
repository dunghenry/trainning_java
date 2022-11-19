class Encapsulation {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Encapsulation st = new Encapsulation();
        st.setName("Dung");
        System.out.println(st.getName());
    }
}