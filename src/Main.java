import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        int num1;
        int num2;
        String operation;

        Scanner input = new Scanner(System.in);

        System.out.println("Voer jouw eerste nummer in.");
        num1 = input.nextInt();

        System.out.println("Voer jouw tweede nummer in.");
        num2 = input.nextInt();

        Scanner op = new Scanner(System.in);

        System.out.println("Voer hier het teken in.");
        operation = op.next();

        if (operation.equals("+")) {
            System.out.println("Jouw antwoord is " + (num1 + num2)); //hier wordt het erbij op getelt
        } else if (operation.equals("-")) {
            System.out.println("Jouw antwoord is " + (num1 - num2)); //hier wordt het er vanaf getelt
        } else if (operation.equals("*")) {
            System.out.println("Jouw antwoord is " + (num1 * num2)); //hier wordt het vermenigvuldigd
        } else if (operation.equals("/")) {
            System.out.println("Jouw antwoord is " + (num1 / num2)); //hier wordt er gedeeld
        }
    }
}