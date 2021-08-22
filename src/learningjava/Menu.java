package learningjava;

import java.util.Scanner;

public class Menu {

    Menu(InterfaceTodoList myTodoList, Scanner scanner){

        String input;
        do {
            System.out.println("TASK MANAGER");
            String[] commands = new String[]{"1.Add Task", "2.Show Tasks", "3.Delete Task", "4.Exit"};
            for (String element : commands) {
                System.out.println(element);
            }
            ;
            System.out.println("Please press a number.");
            input = String.valueOf(scanner.nextLine());
            switch (input) {
                case "1":
                    System.out.println("Add Task: ");
                    input = String.valueOf(scanner.nextLine());
                    myTodoList.add(input);
                    break;
                case "2":
                    System.out.println("My Tasks: ");
                    myTodoList.print();
                    break;
                case "3":
                    myTodoList.print();
                    System.out.println("Press a number to remove task.");
                    input = String.valueOf(scanner.nextLine());
                    myTodoList.remove(Integer.valueOf(input));
                    break;
                case "4":
                    System.out.println("");
                    break;
                default:
                    System.out.println("Please enter numbers 1-3.");
            }
        } while(!input.equals("4"));

    }
}
