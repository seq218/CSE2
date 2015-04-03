//Sarah Qureshi
//CSE02-111
//April 3, 2015
//Ask user to enter size of one dimensional array, ask the user to enter integers for array, write method to check if input is a positive array, and print array


import java.util.Scanner; //import scanner

public class ArrayInputs{
    public static void main( String args[]){
        Scanner myScanner= new Scanner(System.in); //declare and initialize scanner
        System.out.println("Enter integer to be size of array"); //prompt user to enter size of array
        int size=myScanner.nextInt(); //initialize and declare size of array
        int []array= new int[size]; //declare and initialize 
        for(int i=0; i<array.length; i++){
            array[i]=checkInput(); //declare array; run check input method 

            
        }
        System.out.println("Array:"); //print array
        for(int k=0; k<array.length;k++){
            System.out.println(array[k]); //print elements of array
        }
    }

    
    
    
    
   public static int checkInput(){
       Scanner myScanner= new Scanner(System.in); //declare and initialize scanner
      System.out.println("Enter a positive integer"); //prompt for new entry 
       int integer=-1;
while(integer<0){
 
    while(!myScanner.hasNextInt()){
        System.out.println("Invalid entry"); //invalid entry
        //no break so that loop continues until proper entry
        myScanner.next(); //take next integer
    }
    integer=myScanner.nextInt(); //initialize value for integer 
    if(integer>=0){
        break; //break loop once integer is positive 
    }
    System.out.println("Invalid entry"); //invalid entry
}

return integer; //return integer to main method 
       
}


}
