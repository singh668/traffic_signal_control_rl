package src;
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
        String intro_q = "How can I help you today?\n" + 
        "1: Login to your account.\n" + 
        "2: Create an account.\n" + 
        "3: Change your password.\n" + 
        "4: Exit."; 
        System.out.println(intro_q);
        int func_answer;
        try {
            func_answer = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e ) {
            System.out.println("Improper Response. Please try again.");
            sc.nextLine();
            introSequence();
            return;
        }
        processIntroResponse(func_answer);
    }

    public static void processIntroResponse(int response) {
        switch (response) {
            case 1:
                loginSequence();
                break;
            case 2:
                createAccount();
            default:
                break;
        }
    }

    public static void loginSequence() {

    }

    public static void createAccount () {

    }


    public static void depositAndWithdrawSequence() {
        String service = "How can I help you?\n" + 
        "1: Deposit Amount\n" + 
        "2: Withdraw Amount\n" + 
        "3: Exit";
        System.out.println(service);
        int func_answer;
        try {
            func_answer = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException e ) {
            System.out.println("Improper Response. Please try again.");
            sc.nextLine();
            depositAndWithdrawSequence();
            return;
        }
        responseConfirmationIntro(func_answer);
    }

    public static void responseConfirmationIntro(int response) {
        String r1 = "You have chosen: ";
        String r2 = "Is this correct? [Y] or [N]";
        String conf;
        switch (response) {
            case 1:
                System.out.println(r1 + "Deposit Amount. " + r2);
                conf = sc.nextLine();
                taskChoiceConfirmation("Deposit", conf);
                break;
            case 2:
                System.out.println(r1 + "Withdraw Amount. " + r2);
                conf = sc.nextLine();
                taskChoiceConfirmation("Withdraw", conf);
                break;
            case 3:
                System.out.println("You have successfully exited the ATM. Please come again.");
                break;
            default:
                System.out.println("Incorrect response. Please try again");
                depositAndWithdrawSequence();
                break;
        }
    }

    public static void taskChoiceConfirmation(String task, String confirmation) {
        if (confirmation.toLowerCase().equals("y")) {
            System.out.println("You have confirmed your choice of: " + task + ". Lets continue");
        }
        else {
            System.out.println("Please try again");
            depositAndWithdrawSequence();
        }
    }
    public static void main(String[] args) {
        sc = new Scanner(System.in);
        System.out.println("Welcome to Global Bank!");
        depositAndWithdrawSequence();
        sc.close();
    }
}