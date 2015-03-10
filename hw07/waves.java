//Sarah Qureshi
//CSE002-111
//March 17, 2015
//Purpose:
    //have user enter a number between 1 and 30 and 
    
    import java.util.Scanner; //import scanner

public class waves{
    public static void main(String args[]){
        
        Scanner myScanner= new Scanner(System.in); //declare and initialize Scanner 
        int integer=-1; //declare and initialize integer as -1 so that it runs loop to test 
        
    while(integer>30|| integer<1){
        System.out.println("Enter an integer between 1 and 30"); //prompt user to input number
        while(!myScanner.hasNextInt()){
            System.out.println("Invalid Entry, Try Again"); //prompt user to try again
            myScanner.next(); //take new entry
        }
        integer=myScanner.nextInt(); //initialize integer as next input
        if(integer>=1 && integer<=30){
            break;}
        
        System.out.println("Invalid Entry, Try Again"); //prompt user to enter different value
        }    
    System.out.println("number="+integer); //print
  
 System.out.println("For Loop"); //indicate beginning of for loop code   

    for(int r=1; r<=integer; r++){ //initialize r as one, run loop as long as r is equal or greater to integer, after run loop once increase value of r by 1
        
        if(r%2==0){ //if r is even make forward pyramid
            
             for(int z=1; z<=r; z++){
                for(int s=1; s<=z; s++){
                    System.out.print(r); //print value of r
                    }
                     System.out.print("\n"); //print new line at end of numbers printed
                    }
             }
            
        else{ //if r is odd make backward pyramid
            for(int t=r; t>0; t--){ //declare and initiaize t to equal r, as long as t is greater than 0 run the loop, decrement t by one after each loop
                for(int o=1; o<=t; o++){ //declare o to have value of 1, run loop as long as o is less than t, increment o by 1
                    System.out.print(r); //print number/value of r 
                }
                System.out.println(""); //print new line 
            }
        }
        
       }   
    
    
    
    
    
    
     
 System.out.println("While loop");
    int w=1; //declare and initialize w for counter
    while(w<=integer){ //run loop if w is less than or equal to integer
        
        if(w%2==0){ //make forward pyramid if w is even
            int y=1; //declare initialize y as counter
             while(y<=w){ //if y is less than or equal to w
                int s=1; //declare and initialize s as counter
                
                while(s<=y){ //if s is less than  or equal to y
                    System.out.print(w); //print value of w
                    s++; //incrmeent s 
                    
                    }
                     y++; //increment y
                     System.out.print("\n"); //print new line to separate values
                    }
            
            
        }
            
        else{ //make backward pyramid if w is odd
            int q=w; //declare and initialize q as counter
            while(q>0){
                int u=1; //declare and initialize u as counter 
                while(u<=q){
                    System.out.print(w); //print number
                    u++; //decrement u
                }
                System.out.println(""); //print new line to separate numbers
                q--; //decrement q
            }
            
          
        }
        w++; //increment w 
       }
      
 System.out.println("Do While Loop"); //print title 
        int f=1; //declare and initialize f for counter
    do{    
        if(f%2==0){
            int l=1; //declare initialize y as counter
            do{
                int k=1; //declare and initialize k as counter
                do{
                    System.out.print(f); //print value of f
                    k++; //incrmeent k
                    }
                while(k<=l); //run as long as k is greater than l
                
                     l++; //increment l
                     System.out.print("\n");
                    }
            while(l<=f); //run loop as long as l is creater than f 
            
            
        }
            
        else{
            int h=f; //declare and initialize h as counter and equal to f 
            do{
                int p=1; //declare and initialize p as counter 
                do{
                    System.out.print(f); //print number
                    p++; //decrement p
                }
                while(p<=h); //run loop as long as p is less than h
                System.out.println(""); //print new line to separate integer 
                h--; //decrement h
            }
            while(h>0); //condition to run as long as h is greater than 9
            
          
        }
        f++; //increment f 
       }
       while(f<=integer); //condition to run as long as f is less than integer inputted 
      
      
      
      
        
    }
}