//Sarah Qureshi
//CSE002-111
//March 20, 2014
//Purpose:
    //Find the super factorial of a number using three methods
    
    import java.util.Scanner; //import scanner 
    
public class Factorials{ //create class
     public static void main(String[] args) {
         //create main method
        Scanner myScanner= new Scanner(System.in); //declare and initialize input
        System.out.print("Enter an integer to find the super factorial of: "); //instruct user to input value
        int integer=myScanner.nextInt(); //initialize and take input for integer to find super factorial of
        int num = 0; //initialize value for sum
        for(int i = 1; i <= integer; i++){ 
            //create for loop with counter and run until runs as many times as inputted value
            num += factorial(i); //run factorial method for each value of i as it goes through the loop and add together
        }
        
        print(integer,num); //run print method using integer as input and num as sum
  }
  
    public static int factorial(int number){ //create method namaed factorial that uses inputs named number to create output factorial 
        int fact = 1; //initialize factorial
        for (int x = 1; x <= number; x++){
            //create for loop with counter x and run until x is as large as number then increment x 
            fact=fact*x; //find factorial 
        }

        return fact; //exit method with factorial value
    }
    public static void print(int input, int sum){ //create method named print with no output, and two integer inputs which are the initial input and the sum of the factorials
      System.out.println("The super factorial of "+input+" is equal to " + sum);
            //print results
    }
    
    
}

