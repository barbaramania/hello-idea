//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);

        boolean is_running = true;
        double number = 0;

        while(is_running) {
            try {
                System.out.println("What is your favorite number? ");
                number = scanner.nextDouble();
                is_running = false;
            } catch (Exception e) {
                System.out.println(number + " is not a number");
                scanner.nextLine();
            }
        }

        System.out.printf("Your number is " + number);
        scanner.close();
    }//end constructor
}//end main
//Varvara MASLOUSKAYA

