//Sarah Qureshi
//CSE002-111
//March 23, 2015
//Purpose:
    //Use multiple methods, overload on methods, check for correct inputs, all while creating a game 


import java.util.Scanner; //import scanner 
import java.util.Random; //import random number generator 

public class HW8{
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        Random randGenerator= new Random(); 
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println(" Hero! Have a good day!");
    }
 
    public static String getInput(Scanner scan, String string){
       String string1 = scan.next(); //declare and initialize input
        if(string1.equals("C")|| string1.equals("c") ){
            return string; //continue game 
        }
        else{
            System.out.println("Yea Right Loser"); //declare and initialize loser statement 
            System.exit(0);  //exit program
        }
    
        return string; //exit method 
    } 
    
    public static String getInput(Scanner scan, String string, int trial){
       String string2; //declare value for input 
       Random randGenerator= new Random(); //declare and initialize random number generator
       while(trial>0){
           string2=scan.next(); //initialize value for input  
           if(string2.equals("A")||string2.equals("a")){
               int randomNumber= randGenerator.nextInt(2); //get random number that is either 0 or 1 
              if(randomNumber==1){
                  trial--; //decrement trial amount when random number is 1
                  System.out.println("Critical Hit"); //indicate critical hit 
              }
              else{
                  System.out.println("Miss"); //value is 0 and is a miss 
              }
           }
           else if(string2.equals("E")||string2.equals("e")){
              if(randGenerator.nextInt(10)+1==10){
                  System.out.print("Successful Escape"); //if value is 10, escaped
                  return string;
              }
              else{
                  System.out.println("Failed to escape"); //if value is not 10, no escape 
                  
              }
               }
            else{
                System.out.println("Executed by the GIANT! Game Over!"); //incorrect input and thus lose 
                System.exit(0); //exit program
            }
           }
       
       
       
       
        return string;
    }
    
    public static String getInput(Scanner scan){
        String finalprize; 
        switch(scan.nextInt()){
            case 1: 
                finalprize= "A 4.0 GPA"; //assign prize 
                break;
            case 2:
                finalprize= "A unicorn"; //assign prize for box 2 
                break;
            case 3:
                finalprize="A cookie"; //assign prize for box 3 
                break;
            default:
                finalprize= "A Wrong Number! You get nothing! Better restart the game LOL";
                break;
            
        }
        System.out.print("Your prize is " +finalprize); //print the prize 
        return finalprize; 
        
    }
   public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    } 
}