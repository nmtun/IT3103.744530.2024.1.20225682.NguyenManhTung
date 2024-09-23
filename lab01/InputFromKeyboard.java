//Nguyen Manh Tung 20225682
import java.util.Scanner;

public class InputFromKeyboard {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("What your name?");
        String name = keyboard.nextLine();

        System.out.println("How old are you");
        int age = keyboard.nextInt();

        System.out.println("How tall are you (cm)?");
        double height = keyboard.nextDouble();

        System.out.println("Mr/Mrs." + name + ", " +  age + " year old. And your height is: " + height + "cm.");

        keyboard.close();
    }
}
