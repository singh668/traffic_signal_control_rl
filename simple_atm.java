/**
 * Simple Atm
 */

 import java.util.Scanner;


public class simple_atm {
    public int total_int = 25000;
    public static void main(String[] args) {
        String intro_question = "Welcome to an ATM machine! How can I help you?" + 
        "1: Deposit Amount" + 
        "2: Withdraw Amount";
        System.out.println(intro_question);
        Scanner sc = new Scanner(System.in);
        int func_answer = sc.nextInt();
        switch (func_answer) {
            case 1:
                System.out.println("You have chosen: Deposit.");
                break;
            case 2:
                System.out.println("You have chosen: Withdraw");
                break;
            default:
                break;
        }
    }
}