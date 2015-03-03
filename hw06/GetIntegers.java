//Sarah Qureshi
//CSE02-111
//March 3, 2015
//Purpose:
    //Find the sum of five integers 

import java.util.Scanner; //import scanner 

public class GetIntegers{
    public static void main(String args []){
        Scanner myScanner; //declare scanner variable 
        myScanner= new Scanner(System.in); //construct scanner 
        System.out.println("Enter 5 non-negative integers"); //prompt user to input five integers

        double number1=myScanner.nextDouble(); //initialize and take input for first number
        for(int i=0;i<=50; i++){ //create for loop to test for first number
            if(number1%1==0 && number1>=0){
                break; //continue to next for loop
            }
            else{
                System.out.println("Input invalid, try again"); //print to try again
                number1=myScanner.nextDouble(); //take new input for first number
            }
        }
        double number2=myScanner.nextDouble(); //initialize and take input for first number
        for(int n=0;n<=50; n++){ //create for loop to test for first number
            if(number2%1==0 && number2>=0){
                break; //continue to next for loop
            }
            else{
                System.out.println("Input invalid, try again"); //print to try again
                number2=myScanner.nextDouble(); //take new input for first number
            }
        }
        double number3=myScanner.nextDouble(); //initialize and take input for first number
        for(int m=0;m<=50; m++){ //create for loop to test for first number
            if(number3%1==0 && number3>=0){
                break; //continue to next for loop
            }
            else{
                System.out.println("Input invalid, try again"); //print to try again
                number3=myScanner.nextDouble(); //take new input for first number
            }
        }
        double number4=myScanner.nextDouble(); //initialize and take input for first number
        for(int y=0;y<=50; y++){ //create for loop to test for first number
            if(number4%1==0 && number4>=0){
                break; //continue to next for loop
            }
            else{
                System.out.println("Input invalid, try again"); //print to try again
                number4=myScanner.nextDouble(); //take new input for first number
            }
        }
        double number5=myScanner.nextDouble(); //initialize and take input for first number
        for(int w=0;w<=50; w++){ //create for loop to test for first number
            if(number5%1==0 && number5>=0){
                break; //continue to next for loop
            }
            else{
                System.out.println("Input invalid, try again"); //print to try again
                number5=myScanner.nextDouble(); //take new input for first number
            }
        }
        
        int sum= (int)(number1+number2+number3+number4+number5); //find sum of five numbers
        System.out.println("The sum of the 5 integers is "+sum); //print results
      } 
        
    }
