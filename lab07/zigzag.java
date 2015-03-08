//Sarah Qureshi
//CSE002-111
//March 6, 2015
//Purpose:
    //use nested while loops to print stars 
    
        import java.util.Scanner; //import Scanner
public class zigzag{
    public static void main(String args[]){
        
    //Part3:
    Scanner myScanner= new Scanner(System.in); //declare and initialize scanner
    //System.out.println("Enter an integer between 3 and 33"); //prompt user to input value between 3 and 33

    String cont; 


 do{  
     int nStars=-1;
while(nStars>33 ||nStars<3){

    System.out.println("Enter an integer between 3 and 33"); //prompt for new entry 
 
    while(!myScanner.hasNextInt()){
        System.out.println("Invalid entry"); //invalid entry
        //no break so that loop continues until proper entry
        myScanner.next(); //take next integer
    }
    nStars=myScanner.nextInt();
    if(nStars>=3 && nStars<=33){
        break; //break loop once nStars is between 3 and 30
    }
    System.out.println("Invalid entry"); //invalid entry
}
    
 
        int i=1; //declare and initialize i as a counter
        while(i<=nStars){
            System.out.print("*"); //print star
            i++; //increment i 
             }
            System.out.print("\n"); //print new line

        int n=1; //initialize value for counter
        while(n<=nStars){
            System.out.print("*"); //print star
            
            int j=1; //initialize a counter
            System.out.print("\n"); //separate into new line
            while(j<=n){
                System.out.print(" "); //print space
                j++; //increment j
            }

            n++; //increment n
            }
            System.out.print("\n"); //print new line
        int x=1; //declare and initialize x as counter 
        while(x<=nStars){
            System.out.print("*"); //print star
            x++; //increment i 
             }
            System.out.print("\n"); //print new line

 System.out.print("Enter Y or y to go again"); //prompt user if want to continue       
         cont=myScanner.next(); //take value to decide whether to continue
}
while(cont.equals("Y") ||cont.equals("y")); //test if Y or y
    
    
    
    
    }

        
        
        
    
}