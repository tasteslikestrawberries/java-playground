package learningjava;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //creating and printing a String variable
        String message = "Hello, Java!";
        System.out.println(message);

        //printing string literal
        System.out.println("Learning");

        //printing exercise
        String a = "Today ";
        String b = "is a beautiful ";
        String c ="day!";
        System.out.println(a+b+c);
  
        /* While classes are translated during compile time, objects
        are created from classes at runtime. Objects of a class are
        called instances, and we create and initialize them with
        constructors: */
        //creating variables type class User and calling constructor User()
        User user1 = new User("", "Anic", "23");
        User user2 = new User("Marko", "Markic", "12");
        User user3 = new User("Sara", "Saric", "5");
        User user4 = new User("Lino", "Linic", "46");

        user1.setName("Ana");
        System.out.println(User.counter);
        System.out.println(User.whatever(user1));

        System.out.println(Utility.useLibrary(user4));

        /* List is an interface and can't be implemented. Array list is a class
         that implements that interface. If users is of a List type then we can use any other List implementation
         I.E LinkedList class, but this prevents us from using Arraylist specific methods. Vice versa if users
         is of an Arraylist type we can use Array list methods*/
        //ArrayList<User> users = new ArrayList<User>();
        List<User> users = new ArrayList<User>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);

        /*if Playground method is not static (connected to class),
        we have to make a new instance of class (new class object) that calls Playground() constructor:
        Playground obj = new Playground();
        obj.getUppercaseWord("test");
        obj.getLowercaseWord("TEST"); */

        //if Playground method is static, we can just
        Playground.Square(7);
        Playground.Square(2.5);
        Playground.getUppercaseWord("test");
        Playground.getLowercaseWord("TEST");

        //TodoList
        Menu myMenu = new Menu(new TodoList(), new Scanner(System.in));

    }
}