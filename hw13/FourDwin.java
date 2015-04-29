//Sarah Qureshi
//CSE002-111
//April 29, 2015
//Purpose:
    //searching and sorting four dimensional array
    import java.util.Random; //import random number generator
    import java.util.Scanner; //import scanner 

public class FourDwin{
    public static void main(String args[]){
        Scanner myScanner= new Scanner(System.in);
         
            int x=-1;
            while(x<0){
                System.out.println("Enter an Integer X:");
            while(!myScanner.hasNextInt()){
            System.out.println("Invalid entry"); //invalid entry
             //no break so that loop continues until proper entry
             myScanner.next(); //take next integer
                }
         x=myScanner.nextInt();
            if(x>=0){
        break; //break loop once nStars is between 3 and 30
        }
        System.out.println("Invalid entry"); //invalid entry
        }
       
         
            int y=-1;
            while(y<x ||y<0){
             System.out.println("Enter an integer Y:"); //prompt for new entry 
 
         while(!myScanner.hasNextInt()){
            System.out.println("Invalid entry"); //invalid entry
            //no break so that loop continues until proper entry
            myScanner.next(); //take next integer
            }
            y=myScanner.nextInt();
        if(y>=0 && y>x){
        break; //break loop once nStars is between 3 and 30
    }
    System.out.println("Invalid entry"); //invalid entry
}
    
       
       
        double[][][][] fourArray=createArray(x,y); //create array
        System.out.println("Original Array:"); //print header
        printArray(fourArray); //send to method to print 
        statArray(fourArray); //send to method for stats 
        double[][][][] sortedArray= sort4DArray(fourArray); 
       printArray(sortedArray);
       statArray(fourArray);
    }
    
    public static double[][][][] createArray(int X, int Y){
        Random randGenerator= new Random(); //declare and initialize random number generator 
        double randomNumber=0; 
        double[][][][] myArray= new double[3][][][]; //crete new array with outer dimension as 3 
        for(int i=0; i<myArray.length;i++){
            myArray[i]= new double[randGenerator.nextInt(Y-X+1)+X][randGenerator.nextInt(Y-X+1)+(X)][randGenerator.nextInt(Y-X+1)+(X)];
        } //loop to initialize other dimensions as random length between x and y 
        for(int j=0; j<myArray.length;j++){
            for(int k=0; k<myArray[j].length; k++){
                for(int m=0; m<myArray[j][k].length; m++){
                    for(int n=0; n<myArray[j][k][m].length; n++){
                        myArray[j][k][m][n]= ((double)randGenerator.nextInt(310))/10.0; //set value as double to first decimal place 
                    }
                }
            }
        }
        return myArray;
    }
    
    public static void printArray(double[][][][] arrayToPrint){
        int q=0;
        int r=0;
        int s=0;
        int t=0;
        System.out.println("{");
        for(q=0; q<arrayToPrint.length; q++){
          System.out.println("\t");
          System.out.println("{");
          for(r=0; r<arrayToPrint[q].length; r++){
              for(s=0; s<arrayToPrint[q][r].length; s++){
                  System.out.print("{{");
              for(t=0; t<arrayToPrint[q][r][s].length; t++){
              System.out.print(arrayToPrint[q][r][s][t]+", "); //print each element
              
          }
                System.out.print("}},   ");  
              } 
              System.out.println();
          } 
          System.out.println("}"); //print new line 
      }
      System.out.println("}");
    }
 
  public static void statArray(double [][][][] array){
      double sum=0; 
      int numberOfMembers=0; 
      for(int i=0; i<array.length; i++){
          for(int j=0; j<array[i].length; j++){
              for(int k=0; k<array[i][j].length; k++){
                  for(int l=0; l<array[i][j][k].length; l++){
                      sum+=array[i][j][k][l]; //add to total sum
                      numberOfMembers++; //count member
                  }
              }
          }
      }
      double sumMultiplied=sum*10; //begin converting sum into one  decimal places
       int sumMultiplied1= (int) sumMultiplied; //convert to integer 
       sum= (double) sumMultiplied1/10.0;
       
      double mean=sum/numberOfMembers;
      double meanMultiplied=mean*10; //begin converting tax into two decimal places
       int meanMultiplied1= (int) meanMultiplied; //convert to integer 
       mean= (double) meanMultiplied1/10.0;
      //print stat data
      System.out.println("Mean:"+mean);
      System.out.println("Sum:"+sum);
      System.out.println("Number of members:"+numberOfMembers);
  } 
 public static double[][][][] sort4DArray(double[][][][] array){
     for(int x=0; x<array.length; x++){
         array[x]=sort3DArray(array[x]);
         for(int y=0; y<array[x].length; y++){
             double[][] temp=array[x][y];
             int w;
             for(w=y-1;w>=0&&temp.length<array[x][w].length;w--){
                 array[x][w+1]=array[x][w]; 
                 }
                 while(temp.length==array[x][w].length){
                   if(array[x][y][0][0]>array[x][w][0][0]){
                       //swap
                       temp=array[x][w];
                       array[x][w]=array[x][y];
                       array[x][y]=temp;
                   }
                 }
                 array[x][w+1]=temp; //swap if not equal
             }
         }
         return array;
     }
 
 
 public static double[][][] sort3DArray(double[][][] array){
     for (int a=0; a<array.length; a++){
        for(int b=0; b<array[a].length; b++){
            for(int c=0; c<array[a][b].length; c++){
                double currentMin=array[a][b][c]; //make minimum
                int index=c; //make index
                for(int d=c+1; d<array[a][b].length; d++){
                    if(currentMin>array[a][b][d]){
                        currentMin=array[a][b][d];
                        index=d; 
                    }
                }
            //swap
            if(index!=c){
                array[a][b][index]=array[a][b][c]; //swap to new position
                array[a][b][c]=currentMin;
            }
            }
        }
     }
     return array; //return array
 }
    
}


