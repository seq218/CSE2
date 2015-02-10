//Sarah Qureshi
//CSE02-111
//February 10, 2015
//Purpose:
    //take a double and print the first four digits to the right of the decimal place 
    
import java.util.Scanner; //import scanner 

//create class
public class FourDigits {
    //create main method
    public static void main (String [] args) {
        
        Scanner myScanner; //intalize scanner 
        myScanner= new Scanner( System.in);
        System.out.print("Enter a number (in format xx.xxxxxx....):"); //print for user to enter a number 
        double number= myScanner.nextDouble() + .00005; //intalize number from inputted value, add in .00005 to fix problem with integers
    
    int numberInteger= (int) number; //convert inputted number into an integer
    double numberRemainder= number % numberInteger; //gives remainder of dividing the number by the integer
    int numberFinal= (int) (numberRemainder*10000); //make decimal into a whole number 
    int numberFinal1= (numberFinal/1000); //separate the right most digit
    numberFinal = numberFinal - (numberFinal1*1000); //remove tenths digit
    int numberFinal2= (numberFinal/100); //separate the second right most digit
    numberFinal= numberFinal-(numberFinal2*100); //remove hundredths digit
    int numberFinal3= (numberFinal/10); //separate the third rightmost digit
    numberFinal= numberFinal- (numberFinal3*10); //remove thousandths digit 
    int numberFinal4= numberFinal; //separate the fourth digit 
    
    
  
     
    System.out.println("The four digits to the right of the decimal place are " +numberFinal1+numberFinal2+numberFinal3+numberFinal4); //print the four digits to the right of the decimal place
    
    }
    
}