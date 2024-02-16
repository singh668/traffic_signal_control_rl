/**
 * Simple Atm
 * Note: A static method belongs to the class. A non-static method belongs to an instance of the class.
 */

 import java.util.Scanner;
 import java.util.InputMismatchException;


public class simple_atm {
    private static Scanner sc;
    public int total_int = 25000;

    public static void introSequence() {
        String intro_question = "How can I help you?\n" + 
        "1: Deposit Amount\n" + 
        "2: Withdraw Amount\n" + 
        "3: Exit";
        System.out.println(intro_question);
        int func_answer;
        try {
            func_answer = sc.nextInt();
        } catch (InputMismatchException e ) {
            System.out.println("Improper Response. Please try again.");
            sc.nextLine();
            introSequence();
            return;
        }
        responseConfirmationIntro(func_answer);
    }

    public static void responseConfirmationIntro(int response) {
        System.out.println("Arrived here!");
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Welcome to an ATM machine!");
        introSequence();
        sc.close();
    }
}