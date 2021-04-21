package intrestCalculator;

import java.util.Scanner;

class SBaccount extends Account {
    double SBamount , SbInterestRate, interest;
    Scanner SBScanner = new Scanner(System.in);
    
    @Override
    double calculateInterest(double amount) throws InvalidAmountException{
        this.SBamount = amount;
        if(SBamount < 0 ){
            throw new InvalidAmountException();
        }
        else {
        
           
                SbInterestRate = .04;
                
                
        }
     return amount * SbInterestRate;
   
}
}

