
package mini_project;
import java.util.*;
public class ATM_Complete_Project {
	public static void main(String[] args) {
	
      int Pin =1234;
      int Balance =10000;
      
      int AddAmount=0;
      int TakeAmount=0;
      
      String Name;
      Scanner scan = new Scanner(System.in);
                  System.out.println("Enter Your Pin Number");
      int Password = scan.nextInt(); 
           if(Password==Pin) {
    	          System.out.println("Enter Your Name");
    	  Name =scan.next();
    	          System.out.println("Wellcome"+ Name);
      
    	   while(true) {
    		      System.out.println("Press 1 to Check your balance");
    		      System.out.println("Press 2 to Add Amount");
    		      System.out.println("Press 3 to Take Amount");
                  System.out.println("press 4 to Take Resipt");
                  System.out.println("Press 5 to EXIT");
              
              int opt = scan.nextInt();
           switch(opt) {
           case 1:
            	  System.out.println("Your current Balance is "+ Balance);
                  break;
           case 2:
            	  System.out.println("How much amount did you want to add your Account");
                      AddAmount=scan.nextInt(); 
                  System.out.println("Succesfully Credited");
                      Balance = AddAmount+Balance ;
                   break;
           case 3:
            	  System.out.println("How much did you want to Take");
                      TakeAmount = scan.nextInt();
              if(TakeAmount>Balance) {
                  System.out.println("Your Balance is Insufficient");
                  System.out.println("try less then your Available Balace");
                  }
              else {
                  System.out.println("Succesfully Debited");
                	  Balance=Balance-TakeAmount;  
                  }
                  break;
           case 4:
            	  System.out.println("Wellcome to All in one MINI ATM");
            	  System.out.println("Available Balance is"+ Balance);
                  System.out.println("Amount Deposited"+AddAmount);
                  System.out.println("Amount Taken"+TakeAmount);
                  System.out.println("Thanks For Comming");
			      break;
				}
              if(opt==5) {
            	  System.out.println("Thank You");
            	  break;
              }
              }
    	      }
              else {
    	          System.out.println("Wrong PIN NUMBER");
      }
      }     
}