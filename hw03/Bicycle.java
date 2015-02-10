//Sarah Qureshi
//CSE02-111
//February 10,2015 
//Purpose
    //Take user inputted values to find distance traveled and average miles
    //per hour
    
import java.util.Scanner; //import Scanner 

//create class 
public class Bicycle {
    //create main method for Bicycle program 
    public static void main(String [] args) {
        
        Scanner myScanner; //intalize scanner 
        myScanner= new Scanner (System.in); //construct scanner
        System.out.print("Enter seconds for the trip:" ); //prompt user to input trip time 
        int secsTrip= myScanner.nextInt(); //intalize and accept value for inputted integer
        System.out.print("Enter number of counts on the cyclometer:"); //prompt user to input count number
        int countsTrip= myScanner.nextInt(); //intalize and accept value for inputted integer for counts
        double diameter= 27.0; //assume diameter is 27 inches 
    
        double PI=3.14159; //value for pi
        
        //conversion factors
        double feetPerMile=5280, 
        inchesPerFoot=12, 
        secondsPerMinute=60, 
        minutesPerHour=60;
        
        //compute distance traveled and average mileage per hour
        
     //Compute values for distances 
	 double distanceTrip=countsTrip*diameter*PI/inchesPerFoot/feetPerMile;
    	//(for each count, a rotation of the wheel travels the diameter in inches times PI)
    double distanceTripMultiplied=distanceTrip*100; //begin process of truncating by multiplying by 100
    int distanceTripInteger= (int) distanceTripMultiplied; //convert from double to integer 
    double distanceTripFinal= (double) distanceTripInteger/100.0; //truncate distance by dividing by 100.0
	 // Gives distance in miles: Convert value from inches to miles 
	System.out.println("The distance of the trip is "+distanceTripFinal+ " miles"); //print value for distance in miles
	
	//compute value for mileage per hour
	double secsTripMinutes= secsTrip/secondsPerMinute; //convert trip time to minutes
	double secsTripHour= secsTripMinutes/minutesPerHour; //convert trip time to hours
	double secsTripHourMultiplied= secsTripHour*100;// begin truncating trip time
	int secsTripHourInteger= (int) secsTripHourMultiplied; //convert from double to integer
	double secsTripHourFinal= (double) secsTripHourInteger/100.0; //truncate time by dividing by 100.0
	
	double milesPerHour= distanceTrip/secsTripHour; //calculate mileage per hour
	double milesPerHourMultiplied= milesPerHour*100; //begin truncating mileage per hour by mutliplying by 100
	int milesPerHourInteger= (int) milesPerHourMultiplied; //convert from double to intger
	double milesPerHourFinal=(double) milesPerHourInteger/100.0; //finish truncating mileage per hour by dividing by 100.0
	
	System.out.println("The trip time is " +secsTripMinutes+ " minutes"); //print trip time
	System.out.println("The mileage per hour of the trip is " +milesPerHourFinal+ " minutes"); //print mileage per hour
	
	
    }
}
