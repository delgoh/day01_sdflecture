package sg.edu.nus.iss;

import java.io.Console;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        // Slide 14
        Console cons = System.console();
        String name = cons.readLine("What is your name?");

        while (name.length() < 1) {
            name = cons.readLine("You did not tell me your name!\nWhat is your name?");
        }
        System.out.printf("Hello %s. Please to meet you.\n", name);

        Integer age = 999;
        System.out.printf("%s is %d\n", name, age);

        // Slide 17
        String input = cons.readLine("What is your hobby? ");
        input = input.trim();
        if (input.equals("swim"))
            System.out.println("Nearest pool is in Clementi");
        else if (input.equals("jog"))
            System.out.println("How fast are you?");
        else if (input.equals("code"))
            System.out.println("Cool");
        else
            System.out.println("What's this %s?" + input);

        // Slide 18
        switch (input.trim().toLowerCase()) {
            case "swim":
                System.out.println("Nearest pool is in Clementi");
                break;
            case "jog":
                System.out.println("How fast are you?");
                break;
            case "code":
                System.out.println("Cool");
                break;
            default:
                System.out.println("What's this %s?" + input);
        }

        // Slide 19
        String ageStr = cons.readLine("What is your age?");
        Integer ageInt = Integer.parseInt(ageStr);
        
        if (ageInt < 0)
            System.out.println("You are from the future");
        else if (ageInt < 2)
            System.out.println("You are a baby");
        else if (ageInt < 4)
            System.out.println("You are a toddler");
        else if (ageInt < 12)
            System.out.println("You are a child");
        else if (ageInt < 19)
            System.out.println("You are a teen");
        else if (ageInt < 120)
            System.out.println("You are an adult");
        else
            System.out.println("Are you a ghost/AI?");

    }
}
