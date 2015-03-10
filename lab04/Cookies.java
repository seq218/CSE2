//Sarah Qureshi
//CSE002 111
//February 13, 2015
//Purpose:
    //Create a program which takes a input from a customer which includes how many cookies they need, for how many people they need them for
    //and how many cookies per person. Then, the program should determine if the number of cookies is equally divisible among the people and if there is enough
    //for each person
    
    import java.util.Scanner; //import scanner 

//Create Class
public class Cookies{
    //create main method
    public static void main (String [] args) {
        
        Scanner myScanner; //declare variable scanner 
        myScanner= new Scanner(System.in ); //construct scanner 
        
    System.out.println("Enter number of people (as an integer >0):"); //print instructions for user to enter number of people
    
    if(myScanner.hasNextInt()){
        int numberOfPeople=myScanner.nextInt(); //declare and initialize number of people
       if(numberOfPeople>0){
           System.out.println("Enter number of cookies you are planning to purchase (as an integer >0):"); //print instructions for user to enter number of cookies
           if(myScanner.hasNextInt()){
               int numberOfCookies=myScanner.nextInt(); //declare and initialize number of cookies
               if(numberOfCookies>0){
                   System.out.println("At least, how many cookies should each person receive?:"); //print instructions for user to enter number of cookies each person should receive 
                    int cookiesPerPerson= myScanner.nextInt(); //intalize number of cookies per person")
                   if((numberOfPeople*cookiesPerPerson)<=numberOfCookies){
                       if((numberOfCookies%numberOfPeople)==0){
                           System.out.println("You will have enough cookies and they will divide evenly"); //print that will have enough cookies and will divide evenly
                       }
                       else{
                           System.out.println("You have enough cookies, but they will not divide evenly"); //print that have enough cookies but will not divide evenly
                           
                           
                       }
                   }
                   else{
                       int cookiesNeeded=(numberOfPeople*cookiesPerPerson)-numberOfCookies; //determine how many more cookies are needed
                       System.out.println("You will not have enough cookies.You will need to buy "+cookiesNeeded+" more"); //print how many more cookies needed
                   }
                   
                   
                   
               }
               else{
                   System.out.println("You did not enter an int>0"); //print that number entered is less than 0
               }
           }
           else{
               System.out.println("You did not enter an integer"); //print that number entered is not an integer
           }
       }
       else{
           System.out.println("You did not enter an int>0"); //print that number entered is less than 0
       }
    }
    else{
        System.out.println("You did not enter an integer"); //print that number entered is not an integer 
    }
    
    
    
    }
}