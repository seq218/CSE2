//Sarah Qureshi
//CSE002-111
//February 17, 2015
//Purpose:
    //Allow user to process banking transactions 

    import java.util.Random;
    import java.util.Scanner; //import Scanner

//create class   
public class Banking{
    //create main method
    public static void main(String args[]){
        
        Scanner myScanner; //declare variable scanner
        myScanner= new Scanner(System.in); //construct scanner 
        
        Random randGenerator; //declare variable number generator
        randGenerator= new Random(); //construct number generator
        int amountInAccount = randGenerator.nextInt(4000) + 1000; //produce random numbers from 0 to 4000, then add 1000 so that they are from 1000 to 5000
        
        String withdraw; 
        String deposit; 
        String view; 
        
        System.out.println("Your balance is " +amountInAccount); //print amount in account
       System.out.println("Do you want to deposit, withdraw, or view your balance? (Enter deposit, withdraw, or view)"); //Ask user whether they want to depost, withdraw, or view their balance
       String choice= myScanner.nextLine(); //declare variable of user's input
       
      
       switch(choice){
           case "deposit":
                System.out.println("How much would you like to deposit?"); //ask user how much they would like to deposit
                double depositAmount=myScanner.nextDouble(); //declare variable for deposit amount
                    if(depositAmount>0){
                        double newBalance= amountInAccount+depositAmount; //add deposit amount to existing amount
                        System.out.println("Your new balance is " +newBalance); //print new Balance 
                    }
                    else{
                        System.out.println("Deposit amount must be positive"); //prompt user that value entered is negative
                    }
            break;
            
            case "withdraw":
                System.out.println("How much would you like to withdraw?"); //ask user how much they would like to withdraw
                double withdrawAmount=myScanner.nextDouble(); //declare variable for withdrawal amount
                if(withdrawAmount>0 && withdrawAmount<=amountInAccount){
                    double newBalance=amountInAccount-withdrawAmount; //declare variable for new account amount
                    System.out.println("Your new balance is " +newBalance); //print new balance 
                }
                else{
                    System.out.println("Withdrawl amount invalid"); //prompt user that value entered is either negative or larger than amount in account
                }
            break;
            
            case "view":
                System.out.println("Your balance is " +amountInAccount); //print amount in account
            break;
            
            default:
            System.out.println("Option not valid"); //tell user that option is not valid 
            break; 
            
       }
        
        
    }
}