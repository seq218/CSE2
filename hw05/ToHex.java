//Sarah Qureshi
//February 24, 2015
//CSE02-111
//Purpose:
    //Convert three numbers associated with Red, Green, and Blue pixels into hexidemicals 

import java.util.Scanner; //import scanner

//create class
public class ToHex{
    //create main method
    public static void main(String args[]){
    Scanner myScanner= new Scanner(System.in); //declare and construct scanner 
    System.out.println("Enter three numerical values representing RGB values:"); //Ask user to input three numbers representing RGB values
    int red=myScanner.nextInt(); //declare and intalize value for red
    int green=myScanner.nextInt(); //declare and intalize value for green
    int blue=myScanner.nextInt(); //declare and intalize value for blue
    String redDivided;
    String redRemainder;
    String greenDivided;
    String greenRemainder;
    String blueDivided;
    String blueRemainder; //initialize redDivided, redRemainder, greenDivided, greenRemainder, blueDivided, blueRemainder
   System.out.println("The decimal numbers R:"+red+" G:"+green+" B:"+blue+" is represented in hexidecimal as: "); //print statement of results
    
    
    if( red>= 0 && red<=250 ){    
        int redDividedInteger= red/16; //divide value inputted for red by 16
        redDivided= Integer.toString(redDividedInteger); //convert to string
        int redRemainderInteger= red%16; //find remainder when divided by 16
        redRemainder= Integer.toString(redRemainderInteger); //convert to string
      
        switch(redDivided){ //convert to hexidecimal for tens place
            case "10":
                redDivided= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                redDivided= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                redDivided= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                redDivided= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                redDivided= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                redDivided= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        }
        switch(redRemainder){ //convert to hexidecimal for ones place
            case "10":
                redRemainder= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                redRemainder= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                redRemainder= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                redRemainder= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                redRemainder= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                redRemainder= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        }
     System.out.print(redDivided+redRemainder); //print values for red in hexidecimal       
    }
    else{
        System.out.println(" Value entered for red is invalid"); //print that value entered by user is cannot be used
        return;
    }
    if( green>=0 && green<=250 ){
        int greenDividedInteger=  green/16; //divide value inputted for red by 16
        greenDivided= Integer.toString(greenDividedInteger); //convert to string
        int greenRemainderInteger=  green%16; //find remainder when divided by 16
        greenRemainder= Integer.toString(greenRemainderInteger); //convert to string
    
    switch(greenDivided){ //convert to hexidecimal for tens place
            case "10":
                greenDivided= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                greenDivided= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                greenDivided= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                greenDivided= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                greenDivided= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                greenDivided= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        }
        switch(greenRemainder){ //convert to hexidecimal for ones place
            case "10":
                greenRemainder= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                greenRemainder= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                greenRemainder= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                greenRemainder= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                greenRemainder= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                greenRemainder= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            case "16":
                greenRemainder= "G"; //change the value of 16 to the hexidecimal value of G
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        } 
        System.out.print(greenDivided+greenRemainder); //print values for green in hexidecimal 
    }
    else{
        System.out.println(" Value entered for green is invalid"); //print that the value entered by the user cannot be used
    }
    if( blue>=0 && blue<=250 ){
        int blueDividedInteger=blue/16; //divide value inputted for red by 16
        blueDivided= Integer.toString(blueDividedInteger); //convert from integer to string
        int blueRemainderInteger= blue%16; //find remainder when divided by 16
        blueRemainder= Integer.toString(blueRemainderInteger); //convert from integer to string
    switch(blueDivided){ //convert to hexidecimal for tens place
            case "10":
                blueDivided= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                blueDivided= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                blueDivided= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                blueDivided= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                blueDivided= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                blueDivided= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            case "16":
                blueDivided= "G"; //change the value of 16 to the hexidecimal value of G
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        }
        switch(blueRemainder){ //convert to hexidecimal for ones place
            case "10":
                blueRemainder= "A"; //change the value of 10 to the hexidecimal value of A
                break;
            case "11":
                blueRemainder= "B"; //change the value of 11 to the hexidecimal value of B
                break;
            case "12":
                blueRemainder= "C"; //change the value of 12 to the hexidecimal value of C
                break;
            case "13":
                blueRemainder= "D"; //change the value of 13 to the hexidecimal value of D
                break;
            case "14":
                blueRemainder= "E"; //change the value of 14 to the hexidecimal value of E
                break;
            case "15":
                blueRemainder= "F"; //change the value of 15 to the hexidecimal value of F
                break;
            case "16":
                blueRemainder= "G"; //change the value of 16 to the hexidecimal value of G
                break;
            default:
                //nothing since 0-9 remain as decimals 
                break;
        } 
        System.out.println(blueDivided+blueRemainder); //print values for blue in hexidecimal 
       
    }
    else{
        System.out.println(" Value entered for blue is invalid"); //print that value entered by user cannot be used 
    }
  
    }
}