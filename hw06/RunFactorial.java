//Sarah Qureshi
//CSE2-111
//March 3, 2015
//Purpose:
    //Find the factorial of a number from  to 16
    import java.util.Scanner; //import scanner 

public class RunFactorial{
    public static void main(String args[]){
        Scanner myScanner= new Scanner(System.in); //declare and construct scanner 
        int i=0; //initialize counter
        System.out.println("Enter an integer between 9 and 16"); //prompt user to input number between 9 and 16
    while(i<=100){
        i++; //increment i
        double integer=myScanner.nextDouble(); //initialize integer 
        if(integer>=9 && integer<=16 && integer%1==0){
            int c=1; //initialize counter 
            long factorial=1; //initialize factorial
            while(c<=integer){
                factorial=factorial*c; //factorial 
                c++; //increment c
                
            }
            System.out.println((int) integer+"!="+factorial); //print results
            break; //break 
            
        }
        else{
            System.out.println("Invalid input, Try again"); //print invalid input
        }
    }
        
    }
}