//Sarah Qureshi
//CSE002-111
//April 24, 2015
//Purpose:
    //work with jagged arrays and sorting 

    import java.util.Random; //import random number generator 
public class Sorting{
    public static void main(String args[]){
        int[][] myArray= createArray(); //create array through other method
        System.out.println("The array before sorting:"); //print header
        printArray(myArray); //send myArray to method to print it 
        int [][] sortedMyArray=sort(myArray); //send to be sorted 
        System.out.println("The array after sorting:"); //print header
        printArray(sortedMyArray); //print sorted 
        int[][] copiedArray=copy(sortedMyArray); //send to method to copy to change size of array
        System.out.println("The array after sorted and copied:");
        printArray(copiedArray); //print sorted and copied array
    }
    
    public static int [][] createArray(){
        Random randGenerator= new Random(); //declare and initialize scanner 
        int [][] array=new int[5][]; //create two dimensional array
        for(int i=0; i<5;i++){
            array[i]= new int[(i*3)+5]; //initialize how many elements for array
        }
        for(int j=0; j<array.length; j++){
            for(int k=0; k<array[j].length; k++){
                array[j][k]= randGenerator.nextInt(40); //assign element to be a random number from 0 to 39
            }
        }    
        
        return array; //return array to main method
    }

  public static void printArray(int [][] arrayToPrint){
      for(int q=0; q<arrayToPrint.length; q++){
          System.out.print("Row"+(q+1)+":"); //print header for each row
          for(int r=0; r<arrayToPrint[q].length; r++){
              System.out.print(arrayToPrint[q][r]+" "); //print each element
          }
          System.out.println(""); //print new line 
      }
  }
    public static int[][] sort(int[][] original){
      int temp=0;
      int x=0; 
      int m=0; 
        for(x=0;x<original.length;x++) {
        for(int w=1;w<original[x].length;w++){
                 temp=original[x][w]; //set value for initial min
                int index=w; //set value for index of min
            for(m=w-1; m>=0&& original[x][m]>temp; m--){
                    original[x][m+1]=original[x][m];
                }
                //swap
                original[x][m+1]=temp; //put temp at the back if needed 
            }

                }
        
      return original;
      }
      
    public static int[][] copy(int[][] original){
        int x=0; 
        int w=0;
        for( x=0; x<original.length; x++){
            for( w=0; w<original[x].length; w++){
                
            }
        }
        int[][] copiedArray=new int[x][w]; //create size for array
        for(int s=0; s<original.length; s++){
            for(int t=0; t<original[s].length;t++){
                if(s<x && t<w){
                copiedArray[s][t]=original[s][t]; 
            }
            else{
                copiedArray[s][t]=0;
            }
        }
        }
        return copiedArray; //return array to main method
    
    }

      
  
    
    
    
}
    