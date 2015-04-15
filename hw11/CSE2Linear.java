//Sarah Qureshi
//CSE002-111
//April 14, 2015
//Purpose:
    //Searching arrays

import java.util.Scanner; //import scanner
import java.util.Random; //import random number generator 

public class CSE2Linear{
    public static void main(String args[]){
        Scanner myScanner= new Scanner(System.in); //declare and initialize scanner
        int [] scores= new int[15];  //declare and initialize scores 
        System.out.println("Enter 15 student's scores"); //print to have 
            
          int  firstScore=-1;
    while(!(firstScore>=0 && firstScore<=100)){
        while(!myScanner.hasNextInt()){
         System.out.println("Invalid entry, not an integer"); //invalid entry
        }
        firstScore=myScanner.nextInt();
        if (!(firstScore>=0 && firstScore<=100)){
        System.out.println("Not an Int from 0 to 100"); //invalid entry
        }
    }
        scores[0]=firstScore; //initialize first element as entered sore 
        

        
        
        for(int i=1; i<15; i++){
            scores[i]= checkScore(scores[i-1]);
        }
        
        
    System.out.println("The Scores are:"); 
    for(int k=0; k<scores.length;k++){
        
            System.out.print(scores[k]+" "); //print elements of array
        }
    System.out.println(""); 
    //Sort Scores:
    //since loop ensured the entered integer was larger than the previous one, it is already sorted
    System.out.println("The Sorted Scores are:"); //print sorted scores
    for(int h=0; h<scores.length;h++){
        
            System.out.print(scores[h]+" "); //print elements of array
        }
       System.out.println("");  
    //binary search for a specific score 
    System.out.print("Enter grade to search for:"); //prompt user to search for score
    int searchScore=myScanner.nextInt(); //declare and initialize search score as entered grade

    int searchResult=binarySearch(scores, searchScore); //run binary search
    if(searchResult>0){
        System.out.println(searchScore+" was found and it took"+searchResult+"iterations");
    }
    else{
        System.out.println(searchScore+" was not found in the list with"+searchResult+" iterations"); 
    }
    
    //scramble and linear search
    int linearResults= scramble(scores); //run scramble method, then have a return value if it is not found 
    if(linearResults<0){
        System.out.print("The grade was not found after 15 iterations"); //report the number was not found
    }
        

    
    
    
}


public static int checkScore(int previousScore){
    Scanner myScanner= new Scanner(System.in);
        
         int   studentScore=-1;
    while(studentScore>0 ||studentScore<100){
        while(!myScanner.hasNextInt()){
         System.out.println("Invalid entry, not an integer"); //invalid entry
                //no break so that loop continues until proper entry
        myScanner.next(); //take next integer
        }
        studentScore=myScanner.nextInt();
        if(studentScore>=0 && studentScore<=100){
            if(studentScore<previousScore){
                System.out.println("Score must be larger than previous one");
            }
            else{
            break; //break loop once nStars is between 3 and 30}
                }
        }
        else{
    System.out.println("Not an Int from 0 to 100"); //invalid entry
        }
        
    }
    return studentScore; 


}

public static int binarySearch(int[] scoresSearch, int key){
    int low=0; 
    int high=scoresSearch.length-1; 
    int c=0; 
    while(high>= low){
        c++; 
    int mid=(low+high)/2; 
    if(key<scoresSearch[mid]){
        high=mid-1; }
    else if(key==scoresSearch[mid]){
        return c; 
    }
    else{
        low=mid+1;}
        
    }
    return -c;

}
    
public static int scramble(int[] original){
    Random randGenerator= new Random(); 
    Scanner myScanner= new Scanner(System.in); 
    for(int a=original.length-1; a>0; a--){
        int q=randGenerator.nextInt(a+1); //generate random number that is no more than one greater than numbers already
        int r= original[q]; 
        original[q]=original[a]; 
        original[a]= r; //swap positions
    }
    for(int x=0; x<original.length;x++){
        
            System.out.print(original[x]+" "); //print elements of array
        }
    System.out.println("");
    //linear search
    System.out.print("Enter a grade to search for:"); 
    int linearGrade= myScanner.nextInt();
    for(int s=0; s<original.length; s++){
            if(original[s]==linearGrade){
                System.out.println(linearGrade+" was found in the list with "+s+" iterations");
                return s; 
            }
    }
        return -1; 



            
    
    
}        






}
    
    



