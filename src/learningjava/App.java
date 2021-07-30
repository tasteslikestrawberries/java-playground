package learningjava;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
  
        /* While classes are translated during compile time, objects
        are created from classes at runtime. Objects of a class are
        called instances, and we create and initialize them with
        constructors: */
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

        for (User user: users) {
            System.out.println(user.getName());
        }
    }
}