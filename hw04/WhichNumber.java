//Sarah Qureshi
//CSE002-111
//February 17, 2015
//Purpose:
    //Create a program which can guess the number (1-10) inputted by a user 


    import java.util.Scanner; //import Scanner

//create class
public class WhichNumber{
    //create main method 
    public static void main(String args []){
        
        Scanner myScanner; //declare variable scanner 
        myScanner= new Scanner(System.in); //construct scanner 
        
        
    System.out.println("Think of an Integer between 1 and 10"); //instruct user to think of an integer from 1 to 10
    System.out.println("Is the number even? (Answer Y or y for Yes and N or n for No)"); //Ask user if the number is even
    String even= myScanner.nextLine(); //declare variable for answer to if the number is even 
    
    if(even.equals("Y") || even.equals("y")){
        System.out.println("Is the number divisible by 3?"); //Ask user if the number is divisible by thre
        String divisibleBy3= myScanner.nextLine(); //declare variable for answer to if the number is divisible by 3
        
        if (divisibleBy3.equals("Y")|| divisibleBy3.equals("y")){
            System.out.println("The number is 6"); //Guess that the number the user is thinking of is 6
        }
        else if(divisibleBy3.equals("N") || divisibleBy3.equals("n")){
            System.out.println("Is the number divisible by 4?"); //Ask user if the number is divisible by 4 
            String divisibleBy4=myScanner.nextLine(); //declare variable for answer to if the number is divisble by 3
                if(divisibleBy4.equals("Y")|| divisibleBy4.equals("y")){
                    System.out.println("If the number is divided by 4, is it bigger than 1?"); //ask user if when the number is divided by 4 if it is bigger than 1
                    String resultWhenDividedBy4= myScanner.nextLine(); //declare variable for answer if the result when number is divided by 4 if it is bigger than 1
                    if(resultWhenDividedBy4.equals("Y") ||resultWhenDividedBy4.equals("y")){
                        System.out.println("The number is 8"); //Guess that the number is 8
                    } 
                    else if(resultWhenDividedBy4.equals("N") || resultWhenDividedBy4.equals("n")){
                        System.out.println("The number is 4"); //Guess that the number is 4
                    }
                    else{
                        System.out.println("Input not valid"); //prompt user that input invalid 
                    }
                }
                else if(divisibleBy4.equals("N")|| divisibleBy4.equals("n")){
                    System.out.println("Is the number divisible by 5?"); //Ask user if the number is divisible by 5 
                    String divisibleBy5= myScanner.nextLine(); //declare variable for answer to if the number is divisible by 5
                    if(divisibleBy5.equals("Y")|| divisibleBy5.equals("y")){
                        System.out.println("The number is 10"); //Guess that the number is 10
                    }
                    else if(divisibleBy5.equals("N") || divisibleBy5.equals("n")){
                        System.out.println("The number is 2"); //Guess that the number is 2
                    }
                    else{
                        System.out.println("Input not valid"); //prompt user that input invalid 
                    }
                }
                else{
        System.out.println("Input not valid"); //prompt user that input invalid 
        return;
                }
        }
       else{
        System.out.println("Input not valid"); //prompt user that input invalid 
        return;
            }     
    }
    else if(even.equals("N")|| even.equals("n")){
        System.out.println("Is the number divisible by 3?"); //Ask the user if the number is divisible by 3
            String divisibleBy3odd= myScanner.nextLine();  //declare variable for answer to if the number is divisble by 3
            if(divisibleBy3odd.equals("Y") || divisibleBy3odd.equals("y")){
                System.out.println("When the number is divided by 3 is the result greater than 1?"); //ask user if when the number is divided by 4 if it is bigger than 1
                String resultWhenDividedBy3= myScanner.nextLine(); //declare variable for answer if the result when number is divided by 3
                if(resultWhenDividedBy3.equals("Y") || resultWhenDividedBy3.equals("y")){
                    System.out.println("The number is 9"); //Guess that the number is 9
                }
                else if(resultWhenDividedBy3.equals("N") || resultWhenDividedBy3.equals("n") ){
                    System.out.println("The number is 3"); //Guess that the number is 3
                }
                else{
                    System.out.println("Input not valid"); //prompt user that input invalid 
                }
            }
            else if (divisibleBy3odd.equals("N")|| divisibleBy3odd.equals("n")){
                System.out.println("Is the number greater than 6?"); //Ask user if number is larger than 6
                String greaterThan6= myScanner.nextLine(); //declare variable for answer if the result is larger than 6 
                if(greaterThan6.equals("Y") || greaterThan6.equals("y")){
                    System.out.println("The number is 7"); //Guess that the number is 7
                }
                else if (greaterThan6.equals("N")|| greaterThan6.equals("n")){
                    System.out.println("Is the number less than 3?"); //ask user if the answer is less than 3
                    String lessThan3= myScanner.nextLine(); //declare variable for answer if the result is greater than 3 
                    if(lessThan3.equals("Y")||lessThan3.equals("y")){
                        System.out.println("The number is 1");  //Guess that number is 1
                    }
                    else if (lessThan3.equals("N")||lessThan3.equals("n")){
                        System.out.println("The number is 5"); //Guess that the number is 5 
                    }
                    else{
                        System.out.println("Input not valid"); //prompt user that input invalid 
                    }
                }
            
                else{
                    System.out.println("Input not valid"); //prompt user that input invalid 
                    
                }
            }
            
            else{
                System.out.println("Input not valid"); //prompt user that input invalid 
            }
        
    }
    else{
        System.out.println("Input not valid"); //prompt user that input invalid 
        return;
            }
        
        
    }
}