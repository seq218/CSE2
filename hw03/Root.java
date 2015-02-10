//Sarah Qureshi
//CSE02-111
//February 10, 2015
//Purpose:
    //Use estimation to determine the square root of an inputted number 
    
import java.util.Scanner; //import scanner 

public class Root{
    //create main method for Root program
    public static void main(String[] args){
        Scanner myScanner; //intalize scanner 
        myScanner= new Scanner ( System.in ); //construct Scanner
    System.out.print("Enter a number (in form xx.xx:)"); //print for user to enter a number
    double number= myScanner.nextDouble(); //intalize and accept value for double 
    double guess= number/3; //"guess" estimate for determining the square root
    double estimate1= (2*guess*guess*guess+number)/(3*guess*guess); //first estimate 
    double estimate2=(2*estimate1*estimate1*estimate1+number)/(3*estimate1*estimate1); //second estimate 
    double estimate3=(2*estimate2*estimate2*estimate2+number)/(3*estimate2*estimate2); //third estimate 
    double estimate4=(2*estimate3*estimate3*estimate3+number)/(3*estimate3*estimate3); //fourth estimate 
    double estimate5=(2*estimate4*estimate4*estimate4+number)/(3*estimate4*estimate4); //fifth estimate
    double cubeOfEstimate=estimate5*estimate5*estimate5;//check estimate of cube root 
    System.out.println("The cube root is " +estimate5); //print cube root
    System.out.println(+estimate5+ "*" +estimate5+ "*" +estimate5+ "=" +cubeOfEstimate); //print check of cube root 
}

}