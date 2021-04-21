package intrestCalculator;

import java.util.Scanner;

import intrestCalculator.Account.InvalidAgeException;
import intrestCalculator.Account.InvalidAmountException;
import intrestCalculator.Account.InvalidDaysException;
import intrestCalculator.Account.InvalidMonthsException;

public class InterestCalculator {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println(".....MAIN MENU....." + "\n1." + " Interest Calculator For SB" + " \n2." + " Interest Calculator For FD"
                + "\n3." + " InterestCalculator For RD" + "\n4 " + " Exit");
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                SBaccount sb = new SBaccount();
                try {
                    System.out.println("Enter the Average SB amount ");
                    double amount = sc.nextDouble();
                    System.out.println("Interest gained on Amount is : Rs " + sb.calculateInterest(amount));

                } catch (InvalidAmountException e) {
                    System.out.println("Exception : Invalid amount");
                }
                break;

            case 2:
                try {
                    FDaccount fd = new FDaccount();
                    System.out.println("Enter the FD Amount");
                    double fAmount = sc.nextDouble();
                    System.out.println("Interest gained  on Amount is: Rs " + fd.calculateInterest(fAmount));
                } catch (InvalidAgeException e) {
                    System.out.println("Invalid Age Entered");
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount Entered");

                } catch (InvalidDaysException e) {
                    System.out.println("Invalid Days Entered");

                }

                break;
            case 3:
                try {
                    RDaccount rd = new RDaccount();
                    System.out.println("Enter the RD amount");
                    double Ramount = sc.nextDouble();
                    System.out.println("Interest gained on Amount is is: Rs " + rd.calculateInterest(Ramount));
                } catch (InvalidAgeException e) {
                    System.out.println("Invalid Age Entered");
                } catch (InvalidAmountException e) {
                    System.out.println("Invalid Amount Entered");

                } catch (InvalidMonthsException e) {
                    System.out.println("Invalid Days Entered");
                }

                break;

            case 4:
                System.out.println("DO YOU WANT TO CALCULATE AGAIN ????" + " "
                        );
            default:
                System.out.println("Wrong choice");

        }
    }

}
