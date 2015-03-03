//Sarah Qureshi
//CSE2-111
//February 27, 2015
//Purpose:
    //Generate smiles using different types of loops
    
    import java.util.Random; //important random generator

public class SmileGenerator{
    public static void main(String args[]){
        Random randGenerator= new Random(); //declare and initialize random generator 
    
      int x=1; //initialize x as 1 for part 1b
      int m=1; //initialize m as 1 for part 1c
      int w=1; //initialize w as 1 for part 2
      int v=1; //initialize v as 1 for part 3
      int o=1; //inititialize o as 1 for part 4 
      int z= randGenerator.nextInt(99) + 1; //produce a random integer form 1 to 100 for part 2
      int c= randGenerator.nextInt(99) + 1; //produce a random integer from 1 to 100 for part 3
      int t= randGenerator.nextInt(38) + 1; //produce a random integer from 1 to 100 for part 4
      
      System.out.println("Smiles for part 2: "+z); //print number of smiles for part 2
      System.out.println("Smiles for part 3: " +c); //print number of smiles for part 3
      System.out.println("Number of lines for part 4: " +t); //print number of smile lines 
     System.out.println("Part1:"); //primpt beginning of part 1 
     //for loop
     System.out.println("For loop:"); //indicate results from for loop
     for(int y=1; y<=5; y=y+1){ //for loop beginning where x=1 and continue to add 1 to x every time go through the loop
	    System.out.print(":)"); //print smiley face 
	        } 
    System.out.print("\n"); //space between loops
    
    //do while loop
    System.out.println("Do While Loop:"); //indicate results from do while loop
       do{
	        System.out.print(":)"); //print smiley face 
	        x++; //add one to x 
            }
        while(x<=5);  //construct loop for when x<=5
        
    System.out.print("\n"); //space between loops
   
   //while loop 
   System.out.println("While Loop:"); //indicate results from while loop
    while(m<=5){
        System.out.print(":)"); //print smiley face
        m++; //increase value for x 
    }   
    System.out.print("\n"); //print new line 
    
   //random number of smiles printed 
   System.out.println("Part2:"); //indicate beginning of part 2
   while(w<=z){ //as long as number of loop is less than the number produced
    System.out.print(":)"); //print smiley face
    w++; //increase value of w by one 
    }
    System.out.print("\n"); //print new line     
    

    //print random number of smiles but only have 30 per line
    System.out.println("Part3:"); //show beginning of part 3
    if(c>30){
        int s= c- 30; //find difference between the number and 30
        if(s>30){
            int r=s- 30; //find difference between the number and 30
            if(r>30){
                int q=r- 30; //find difference between new number and 30
                System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
                System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
                System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
                while(v<=q){
                    System.out.print(":)"); //print smiley face
                    v++; //increase value of v by one 
                    System.out.print("\n"); //produce new line 
                }
            }
            else{
                System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
                System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
                while(v<=r){
                 System.out.print(":)"); //print smiley face
                v++; //increase value of v by one 
                }
                System.out.print("\n"); //print space
            }
        }
    
        else{
            System.out.println(":):):):):):):):):):):):):):):):):):):):):):):):):):):):):):)"); //print 30 smiley faces
            while(v<=s){
                 System.out.print(":)"); //print smiley face
                v++; //increase value of v by one 
            }
            System.out.print("\n"); //print space
        }
}

    else{ //for when z is less than 30
     while(v<=c){ //as long as number of loop is less than the number produced
        System.out.print(":)"); //print smiley face
         v++; //increase value of v by one 
        }
    
        System.out.print("\n"); //print new line     
        }

    
  
  System.out.println("Part4:"); //Indicate beginning of part 4  
    //have number of smiles increase by line 
     String smiley=""; //space to create smiley face
   while(o<=t){
        smiley+=":)"; //add a smiley
        System.out.println(smiley); //print smiley line 
        o++; //increment o
      
    }  
    
    
    
    }
}