package sg.edu.nus.iss;

import java.io.Console;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Console cons = System.console();
        String name = cons.readLine("What is your name?");

        while (name.length() < 1) {
            name = cons.readLine("You did not tell me your name!\nWhat is your name?");
        }
        System.out.printf("Hello %s. Please to meet you.\n", name);

        Integer age = 999;
        System.out.printf("%s is %d\n", name, age);

        String input = cons.readLine("What is your hobby? ");
        input = input.trim();

        if (input.equals("swim"))
            System.out.println("Nearest pool is in Clementi");
        else if (input.equals("jog"))
            System.out.println("How fast are u?");
        else if (input.equals("code"))
            System.out.println("cool");
        else
            System.out.println("What's this %s?" + input);
    
    }
}
