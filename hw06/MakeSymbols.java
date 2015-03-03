//Sarah Qureshi
//CSE002-111
//March 3, 2015
//Purpose:
    //Generate a number form 1 to 100, then if even print that number in * and if it is odd that number in &

    import java.util.Random; //import Scanner 
public class MakeSymbols{
    public static void main(String args[]){
       Random randGenerator; //declare variable number generator
        randGenerator= new Random(); //construct number generator; 
    int number= randGenerator.nextInt(100); //declare and initialize number as a random number from 0 to 100
    int i=0; 
    System.out.println("The number is "+number); //print number
    do{
        if(number%2==0){
            System.out.print("*"); //print star
            i++; //increment i
        }
        else{
            System.out.print("&"); //print & character
            i++; //increment i
        }
    }
    while(i<number); //not less than or equal to because do while loop will print first smiley before running conditions 
    System.out.print("\n"); //print new line   
    
        
        
        
        
    }
}