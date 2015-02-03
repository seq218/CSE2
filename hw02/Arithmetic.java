//Sarah Qureshi
//CSE02-111
//February 3, 2015
//Purpose: find complete cost of a purchase including tax 

//define class Arithmetic
public class Arithmetic{
    
    public static void main(String[] args) {
        
        //Number of pairs of socks
        int nSocks=3;
        
        //Cost per pair of socks (‘$’ is part of the variable name)
        double sockCost$=2.58;

        //Number of drinking glasses
        int nGlasses=6;
        
        //Cost per glass
        double glassCost$=2.29;

        //Number of boxes of envelopes
        int nEnvelopes=1;
        
        //cost per box of envelopes
        double envelopeCost$=3.25;
        
        //multiplier due to tax 
        double taxPercent=0.06;   
        
        System.out.println("Socks: "+nSocks + " pairs of socks were purchased and each pair cost " +sockCost$+ " dollars"); //print number of socks purchased and their prices
        System.out.println("Glasses:" +nGlasses+ " glasses were purchased and each cost " +glassCost$+ " dollars"); //print number of glasses purchased
        System.out.println("Envelopes: " +nEnvelopes+  " boxes of Envelopes were purchased and each box cost "  +envelopeCost$+  " dollars"); //print number of boxes of envelopes purchased and price
        
       //Cost for socks 
       double costSocks=nSocks*sockCost$;
       
       //Tax for socks 
       double taxSocks=costSocks*taxPercent;
       double taxSocksMultiplied=taxSocks*100; //begin converting tax into two decimal places
       int taxSocksMultiplied1= (int) taxSocksMultiplied; //convert to integer 
       double taxSocksFinal= (double) taxSocksMultiplied1/100.0; //divide by 100.0 to get to two decimal places
       
       //Total cost for Socks (tax included)
       double taxedCostSocks=costSocks+taxSocks; 
       
       
       System.out.println("The cost for socks is " +costSocks+ " dollars and the tax for these items is " +taxSocksFinal+ " dollars"); //print total cost for socks and their price
       
       //Cost for Glasses
       double costGlasses=nGlasses*glassCost$;
       
       //Tax for glasses
       double taxGlasses=costGlasses*taxPercent;
       double taxGlassesMultiplied=taxGlasses*100; //begin converting tax into two decimal places
       int taxGlassesMultiplied1= (int) taxGlassesMultiplied; //convert to integer
       double taxGlassesFinal= (double) taxGlassesMultiplied1/100.0; //divide by 100.0 to get to two decimal places 
       
       System.out.println("The cost for glasses is " +costGlasses+ " dollars and the tax for these items is" +taxGlassesFinal+ " dollars"); //print total cost for glasses and their price
       
       
       //Cost for Envelopes
       double costEnvelopes=nEnvelopes*envelopeCost$;
       
       //Tax for Envelopes
       double taxEnvelopes=costEnvelopes*taxPercent;
       double taxEnvelopesMultiplied=taxEnvelopes*100; //multiply by 100. Begins steps to convert tax into two decimal places
       int taxEnvelopesMultiplied1= (int) taxEnvelopesMultiplied; //convert to integer
       double taxEnvelopesFinal= (double) taxEnvelopesMultiplied1/100.0; //divide by 100.0 to get to two decimal places
       
   
       //Total cost for Envelopes (tax included)
       double taxedCostEnvelopes=costEnvelopes+taxEnvelopesFinal;
       
       System.out.println("The cost for Envelopes is " +costEnvelopes+ " dollars and the tax for these items is " +taxEnvelopesFinal+ " dollars"); //print cost for envelope and the tax for them
       
       //Total Cost for the purchase (without tax)
       double totalCost=costSocks+costGlasses+costEnvelopes;
       
       //Total purchase tax 
       double totalTax=taxSocksFinal+taxGlassesFinal+taxEnvelopesFinal;
       
       //Total purchase cost including tax
       double taxedTotal=totalCost+totalTax;
       
       System.out.println("The total cost for the Socks, Glasses and Envelopes is " +totalCost+ " dollars"); //print total cost of socks and evelopes
       System.out.println("The total tax for the Socks, Glasses and Envelopes is " +totalTax+ " dollars"); //print total tax cost 
       System.out.println("The purchase total including tax is " +taxedTotal+ " dollars"); //print total cost including tax
        
    }
}


