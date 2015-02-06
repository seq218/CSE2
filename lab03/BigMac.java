//Sarah Qureshi
//February 6, 2015
// CSE02-111
//Purpose:
    //Determine the cost to purchase a certain number of Big Macs using 
    //user inputted values for number of Big Macs, price per Big Mac, and sales tax
    
import java.util.Scanner; //import scanner

//Create class 
public class BigMac{
    //main method created for BigMac program
    public static void main (String[] args) {
        
        Scanner myScanner; //declare variable for scanner 
        myScanner= new Scanner( System.in ); //construct scanner
        System.out.print("Enter the number of Big Macs (as an integer >0):"); //prompt user for input value for number of Big Macs
        int nBigMacs= myScanner.nextInt(); //intalize and accept value inputed integer
        System.out.print( "Enter the cost of a Big Mac as" + " a double (in the form xx.xx):" ); //prompt user to input price of Big Mac
        double bigMac$ = myScanner.nextDouble(); //intalize the price as a double 
	    System.out.print("Enter the percent tax as a whole number (xx): "); //promp user to enter percent tax as a whole number 
        double taxRate = myScanner.nextDouble(); //intalize tax as a double
        taxRate/=100; //user enters percent, but need a proportion so convert 
        double cost$;  //intalize variable for cost as a double 
        int dollars,  //whole dollar amount of cost, intalize as an integer
            dimes, pennies; //continue intalizing for storing digits
          //to the right of the decimal point 
          //for the cost$ 
        cost$ = nBigMacs*bigMac$*(1+taxRate); //get the whole amount, dropping decimal fraction
        dollars=(int)cost$; //intalize cost in full numbers 
        
        //get dimes amount, e.g., 
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        //  where the % (mod) operator returns the remainder
        //  after the division:   583%100 -> 83, 27%5 -> 2 
        dimes=(int)(cost$*10)%10; //intalize cost and find value for dimes/tenths place
        pennies=(int)(cost$*100)%10; //intalize cost and find value for pennies/ hundreths place 
        System.out.println("The total cost of " +nBigMacs+" BigMacs, at $"+bigMac$ +" per bigMac, with a" + " sales tax of "+ (int)(taxRate*100) +
        "%, is $"+dollars+ "." +dimes+pennies);

       
        
        
    } //end of main method
} //end of class 