//Sarah Qureshi
//CSE002-111
//Purpose:
    //randomly generate a sentence 
    
    import java.util.Random; //import random number generator
    import java.util.Scanner; //impor scanner

public class Methods{
    public static void main(String args[]){
        Scanner myScanner= new Scanner(System.in); //declare and initialize scanner 
       String answer=""; //declare answer for when continue 
       do{
           System.out.println("The "+Adjectives()+" "+Adjectives()+" "+SubjectNoun()+" "+Verb()+" the "+Adjectives()+" "+ObjectNoun()+"."); //print sentence 
           System.out.print("Go again? Enter 'y' or 'Y', else enter anything else to quit"); //ask for user input of whether or not to conitue 
 	       answer=myScanner.next(); //declare and initialize input
       } 
       while(answer.equals("Y") || answer.equals("y")); 
        
    }
    
    public static String Adjectives(){
        Random randGenerator= new Random(); //declare and initialize random number generator 
        int adjNumber=randGenerator.nextInt(10); //generate random number to have correspond to an adjective 
        String randomAdjective=""; //declare random adjective 
        switch (adjNumber){
            case 0: randomAdjective= "kind"; //if number is 0 produce this adjective 
            break;
            case 1: randomAdjective= "honest";
            break;
            case 2: randomAdjective="virtuous";
            break;
            case 3: randomAdjective= "gentle";
            break;
            case 4: randomAdjective= "dear";
            break;
            case 5: randomAdjective="saucy";
            break;
            case 6: randomAdjective="lovely";
            break;
            case 7: randomAdjective="sweet";
            break;
            case 8: randomAdjective="happy";
            break;
            case 9: randomAdjective="reliable"; 
            break;
            //ensure breaks 
                
        }
        return randomAdjective; //return randomAdj as a string to the main method 
        
    }
    
    public static String SubjectNoun(){
        Random randGenerator= new Random(); //declare and initialize random number generator  
        int subNumber=randGenerator.nextInt(10); //generate random number to have correspond to a subject 
        String randomSubject=""; //declare random adjective 
        switch (subNumber){
            case 0: randomSubject= "Romeo"; //if number is 0 use this word
            break;
            case 1: randomSubject= "Juliet";  //if number is 1 use this word
            break;
            case 2: randomSubject= "Montague"; //if number is 2 use this word
            break;
            case 3: randomSubject= "Capulet";  //if number is 3 use this word
            break;
            case 4: randomSubject= "Friar";  //if number is 4 use this word
            break;
            case 5: randomSubject= "Prince";  //if number is 5 use this word
            break;
            case 6: randomSubject= "Christopher"; //if number is 6 use this word
            break;
            case 7: randomSubject= "Nurse"; //if number is 7 use this word
            break;
            case 8: randomSubject= "Peeta"; //if number is 8 use this word
            break;
            case 9: randomSubject= "Gregory"; //if number is 9 use this word
            break;
            //ensure breaks after each case 
                
        }
        return randomSubject; //return randomSubject as a string to the main method 
        
    }
    
    public static String Verb(){
        Random randGenerator= new Random(); //declare and initialize random number generator 
        int verbNumber=randGenerator.nextInt(10); //generate random number to have correspond to a verb
        String randomVerb=""; //declare random adjective 
        switch (verbNumber){
            case 0: randomVerb= "hit"; //if number is 0 use this word
            break;
            case 1: randomVerb= "smiled at"; //if number is 1 use this word
            break;
            case 2: randomVerb= "runs into"; //if number is 2 use this word
            break;
            case 3: randomVerb= "sat on"; //if number is 3 use this word
            break;
            case 4: randomVerb= "fell asleep on"; //if number is 4 use this word
            break;
            case 5: randomVerb= "talked to";//if number is 5 use this word
            break;
            case 6: randomVerb= "ran away from"; //if number is 6 use this word
            break;
            case 7: randomVerb= "passed";//if number is 7 use this word
            break;
            case 8: randomVerb= "disliked";//if number is 8 use this word
            break;
            case 9: randomVerb= "loved";//if number is 9 use this word
            break;
            //ensure breaks after each case 
                
        }
        return randomVerb; //return randomSubject as a string to the main method 
    }
    
    public static String ObjectNoun(){
        Random randGenerator= new Random(); //declare and initialize random number generator
        int objNumber= randGenerator.nextInt(10); //generate radom number to have corresond to a verb 
        String randomObject=""; //declare random adjective 
        switch (objNumber){
            case 0: randomObject= "Mercutio"; //if number is 0 use this word
            break;
            case 1: randomObject= "Benvolio"; //if number is 1 use this word
            break;
            case 2: randomObject= "Sampson"; //if number is 2 use this word
            break;
            case 3: randomObject= "Abraham"; //if number is 3 use this word
            break;
            case 4: randomObject= "puppy"; //if number is 4 use this word
            break;
            case 5: randomObject= "mouse";//if number is 5 use this word
            break;
            case 6: randomObject= "lady"; //if number is 6 use this word
            break;
            case 7: randomObject= "chincilla";//if number is 7 use this word
            break;
            case 8: randomObject= "hedgehog";//if number is 8 use this word
            break;
            case 9: randomObject = "bunny";//if number is 9 use this word
            break;
            //ensure breaks after each case 
                
        }
        return randomObject ; //return randomSubject as a string to the main method  
    }
}