//Sarah Qureshi
//CSE002-111
//Purpose: produce two arrays with 50 elements and use linear search on one to find the min and max values and use binary search on the other 

import java.util.Random; //import random number generator 
import java.util.Scanner; //import Scanner 

public class Arrays{
    public static void main(String args[]){
        Scanner myScanner= new Scanner(System.in); //declare in initialize scanner 
        int array1[]= new int[50]; //declare and initialize array 1 to have 50 elements 
        int array2[]= new int[50]; //declare and initialize array 2 to have 50 elements 
        Random randGenerator= new Random(); //declare and initialize random number generator 
        for(int i=0; i<array1.length; i++){
            array1[i]= randGenerator.nextInt(101); //declare array element as a random number from 0 to 100 
        }
        array2[0]=randGenerator.nextInt(101); //initialize value for first element in array 2 
        for(int j=1; j<array2.length; j++){
            array2[j]=array2[j-1]+randGenerator.nextInt(101); //initialize value for next elements  
        }
        
        //linear min and max 
        int min1=array1[0]; //declare and initialize  starting point for minimum of array 1 
        int max1=array1[0]; //declare and initialize starting point for maximum of array 1
        for(int k=0; k<array1.length; k++){
            if(array1[k]<min1){
                min1=array1[k]; 
            }
            else if(array1[k]>max1){
                max1=array1[k];
            }
            else{
                
            }
        }
        System.out.println("The minimum of array1 is "+min1); //print results 
        System.out.println("The maximum of array1 is "+max1); //print results 
   
        
        //min and max of array 2
        System.out.println("The minimum of array2 is "+array2[0]); //print array2 min
        System.out.println("The maximum of array2 is "+array2[array2.length-1]); //print array2 max 

       //check for integer 
        System.out.print("Enter a positive integer to continue "); //prompt user to enter an integer
        if(myScanner.hasNextInt()){
            int inputNumber=myScanner.nextInt();
            if(inputNumber>=0){
            binarySearch(array2, inputNumber); //run binary search method 
            }
            else{
                System.out.println("You did not enter a positive integer");
            }
                
            }
        else{
            System.out.println("You did not enter an integer"); 
        }
        
        }
        


public static void binarySearch(int[] original, int key){
    int low=0; //initialize and declare low bound as 0
    int high=original.length-1; //initialize high bound as last element 
    while(high>= low){
    int mid=(low+high)/2; //initialize and declare middle point 
    if(key<original[mid]){
        high=mid-1; }
    else if(key==original[mid]){
        System.out.println(key+" was found in the list"); //if key is found 
    }
    else{
        low=mid+1;}
        
    }
    System.out.println(key+" was not found in the list");
    System.out.println("The number above the key was "+original[high]);
    System.out.println("The number below the key was "+original[low]); 
    

}

}
