package learningjava;

public class User implements PublicLibrary {
    private String name;
    private String surname;
    private String age;
    public static int counter;

//specific constructor that creates objects from this class
    User(String name, String surname, String age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        User.counter++;
    }
//methods
    //name getter/setter
    String getName() {
        return this.name;
    }
    void setName(User this, String name) { //setters define what you can do with name (class property)
        this.name = name; //kad definiramo instancu usera,npr user1, taj user zove ovu metodu da bi settao name,npr 'Ana'
    }

    //surname getter/setter
    String getSurname() {
        return this.surname;
    }
    void setSurname(User this, String surname) { 
        this.surname = surname; 
    }

    //age getter/setter
    String getAge() {
        return this.age;
    }
    void setAge(User this, String age) { //setters define what you can do with name (class property)
        this.age = age; //kad definiramo instancu usera,npr user1, taj user zove ovu metodu da bi settao name,npr 'Anja'
    }

    @Override
    public int borrowBook() {
        // TODO Auto-generated method stub
        return 0;
    }

    // static metode nemaju pristup this.
    static String whatever(User user) {
        return user.name;
    }
}

interface PublicLibrary {
    int borrowBook();
}





