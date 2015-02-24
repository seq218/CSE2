//Sarah Qureshi
//CSE2-111
//Purpose:
    //randomly generate a year from 2000 to 2010 and then list all space events that happened in that year 

import java.util.Random; //construct random number generator 

public class SpaceExploration{
    public static void main(String args []){
        Random randGenerator= new Random(); //declare and initialize scanner
        
        int year= randGenerator.nextInt(10) + 2000; //produce random number to be a year from 2000 to 2010
    System.out.println("Here is the timeline of space exploration events from "+year+ " to 2000"); //print statement saying this is the time line from the randomly produced year and 2000
    switch(year){
        case 2010:
            System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back"); //print year 2010 and its fact
        case 2009:
            System.out.println("2009: N/A"); //print year 2009 and that there is no fact 
        case 2008:
            System.out.println("2008: Kepler launched to study deep space"); //print year 2008 and its fact 
        case 2007:
            System.out.println("2007: N/A"); //print year 2007 and that it has no fact
        case 2006:
            System.out.println("2006: Spacecraft returns with collections from a comet"); //print year 2006 and its fact 
        case 2005:
            System.out.println("2005: Spacecraft collies with comet"); //print year 2005 and its fact 
        case 2004:
            System.out.println("2004: N/A"); //print year 2004 and that it has no fact
        case 2003:
            System.out.println("2003: Largest infrared telescope released"); //print year 2003 and its fact
        case 2002:
            System.out.println("2002: N/A"); //print year 2002 and that it has no fact 
        case 2001:
            System.out.println("2001: First spacecraft lands on asteroid"); //print year 2001 and its fact 
        case 2000:
            System.out.println("2000: First spacecraft orbits an asteroid"); //print year 2000 and its fact 
         
        
    }
    }
}