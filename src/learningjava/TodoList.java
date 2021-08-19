package learningjava;

import java.util.ArrayList;
import java.util.Scanner;


public class TodoList {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
//create array list
//entry String equals ""
//do this loop
//   get input from user
//   put it into entry String
//   add entry String into array list
//while entry String doesn't equal "quit"
//for each item in array list
//   println each item
//end for loop
        //creating empty array list with initial capacity of 5
        ArrayList<String>list = new ArrayList<>(5);
        int choice = Integer.valueOf(myScanner.nextLine());


        //String deleteTask = input.nextLine();
        //list.remove(deleteTask);

        //String listTasks = input.nextLine();
        //System.out.println(list);

        System.out.println("MENU:");
        System.out.println("(1) Add a task");
        System.out.println("(2) Remove a task");
        System.out.println("(3) List tasks");
        System.out.println("(4) Exit");
        System.out.println("Press a number:");

            do {
            System.out.println("Add a task:");
            String addTask = myScanner.nextLine();
            list.add(addTask);
            } while (choice == 1);

        do {
            System.out.println(list);
        } while (choice == 3);


    }
}
