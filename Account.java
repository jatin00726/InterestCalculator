package intrestCalculator;

public abstract class Account  {
	double interestRate;
    double amount; 
    abstract double calculateInterest(double amount)
    throws InvalidMonthsException,InvalidAgeException,InvalidAmountException ,InvalidDaysException;
    
    public class InvalidAgeException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        
    }
    public class InvalidAmountException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        
    }
    
    public class InvalidDaysException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        
    }
    public class InvalidMonthsException extends Exception{

		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
        
    }
}
	


