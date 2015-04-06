//Sarah Qureshi
//CSE002-111
//April 7,2015
//Purpose:
    //Create an array and use methods to alter said arrays 
    
import java.util.Scanner;
import java.util.Random; 

public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
    int num[]=new int[10];
    int newArray1[];
    int newArray2[];
    int index,target;
	String answer="";
	do{
  	    System.out.print("Random input 10 ints [0-9]");
  	    num = randomInput();
  	    String out = "The original array is:";
  	    out += listArray(num);
  	    System.out.println(out);
 
  	    System.out.print("Enter the index ");
  	    index = scan.nextInt();
  	    newArray1 = delete(num,index);
  	    String out1="The output array is ";
    	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out1);
 
        System.out.print("Enter the target value ");
  	    target = scan.nextInt();
  	    newArray2 = remove(num,target);
  	    String out2="The output array is ";
  	    out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	    System.out.println(out2);
  	 
  	    System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
 	    answer=scan.next();
	    }
	while(answer.equals("Y") || answer.equals("y"));
 }
 
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){
     Random randGenerator= new Random(); //declare and initialize random number generator
     int [] num= new int[10]; //declare new array named num
     for(int i=0;i<10;i++){
         num[i]=randGenerator.nextInt(10); //declare and initialize each element of the array as an integer from 0 to 9
     }
     return num; //return array num to main method 
      
  }
  
  
  public static int[] delete(int[] list, int pos){
      int[] num= new int[list.length-1]; //create new array that has one less element than the original one 
      for(int l=0; l<pos; l++){
          num[l]=list[l]; //make array num have same values as list 
      }
      for (int i=pos; i<list.length-1; i++){
              num[i]=list[i+1]; //redestribute array
          }
      return num; //return out1 to main method 
  }
  
  
 public static int[] remove(int[] list, int target){
    for(int j=0; j<list.length; j++){
        if(list[j]==target){
            list=delete(list,j); //send to delete method to get rid of the element
            continue; //continue through loop
          }
         else{
             //if element is not desired number, do nothing
         }
        }
     return list; //return newNum to main method
}


}
