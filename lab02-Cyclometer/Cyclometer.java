//Sarah Qureshi
//January 30,2015
//CSE002-111
//Purpose:
    //Display Data about time elapsed and number of rotations of front wheel of a bike 
    
//first compile program Clyclometer.java
    
//run the program Clyclometer

//defining class Cyclometer
public class Cyclometer{
    
public static void main(String[] args) {
    
        int secsTrip1=480;  //seconds elapsed for Trip 1 as an integer 
       	int secsTrip2=3220;  //seconds elapsed for Trip 2 as an integer 
		int countsTrip1=1561;  //number of front wheel rotations for Trip 1 as an integer
		int countsTrip2=9037; //number of front wheel rotations for Trip 2 as an integer 
		double wheelDiameter=27.0,  //diameter of wheel cast as a double
  	    PI=3.14159, // numerical value of pi cast as a double 
    	feetPerMile=5280,  //conversion of number of feet per mile cast as a double
  	    inchesPerFoot=12,   //conversion of number of inches in a foot cast as a double
  	    secondsPerMinute=60;  //conversion of number of seconds per minute cast as a double
    	double distanceTrip1, distanceTrip2, totalDistance; //convert integer values for distance of Trip 1, Trip 2, and Trip 1 &2 to be cast as a double
    	
    	
        System.out.println("Trip 1 took "+ (secsTrip1/secondsPerMinute)+" minutes and had "+ countsTrip1+" counts."); 
    	        //print how long Trip 1 took and how many rotations it had
	    System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts."); 
	            //print how long Trip 2 took and how many rotations it had 
	 
	 
	 //Compute values for distances 
	 distanceTrip1=countsTrip1*wheelDiameter*PI;
    	// Above gives distance in inches
    	//(for each count, a rotation of the wheel travels the diameter in inches times PI)
	distanceTrip1/=inchesPerFoot*feetPerMile; // Gives distance in miles: Convert value from inches to miles 
	distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile;  //repeats process of finding distance but for Trip 2 
	totalDistance=distanceTrip1+distanceTrip2; //total distance given in miles
	
	//Print out the distance in miles 
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
	    System.out.println("Trip 2 was "+distanceTrip2+" miles");
	    System.out.println("The total distance was "+totalDistance+" miles");

    }
}