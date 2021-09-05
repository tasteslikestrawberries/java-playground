package learningjava;

public class Person {
    private String name;
    private int age;

    public Person(String initialName) {
        this.age = 0;
        this.name = initialName;
    }

    public void printPerson() {
        System.out.println(this.name + ", age " + this.age + " years");
    }

    public static void main(String[] args) {
        Person Ana = new Person("Ana");
        Ana.printPerson();
    }
}
