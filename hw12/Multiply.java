//Sarah Qureshi
//CSE002-111
//April 21, 2015
//Purpose:
    //implement matrix multiplication on random matrices
    
    import java.util.Scanner; //import scanner 
    import java.util.Random; //import random number generator

public class Multiply{
    
public static void main(String args[]){
    Scanner myScanner= new Scanner(System.in); //declare and initialize scanner
    int inputWidth1=-1; //declare test input width
    int inputHeight1=-2; //declare test input height 
    int inputWidth2=-2;
    int inputHeight2=-1;
    //run cheks 
        while (inputWidth1!=inputWidth2){
            System.out.println("Enter width for first matrix:"); //instruct user to enter width
            while(!myScanner.hasNextInt()){
                System.out.println("Not an Integer, Try Again"); //print error message
                myScanner.hasNext(); //take in next integer 
            }
            inputWidth1=myScanner.nextInt(); //initialize inputwidth1
            while(inputWidth1<=0){
                if(inputWidth1>0){
                   
                }
                else{
                    System.out.println("Not a positive Integer, Try Again");
                    inputWidth1=myScanner.nextInt();
                    
                }
            }
            System.out.println("Enter width for second matrix:"); //instruct user to enter width
            while(!myScanner.hasNextInt()){
                System.out.println("Not an integer, Try Again"); //print error message
                myScanner.hasNext(); //take in next integer 
            }
            inputWidth2=myScanner.nextInt(); //initialize second width
            if(inputWidth2>0){
                }
                else{
                    System.out.println("Not a positive Integer, Try Again");
                    inputWidth2=myScanner.nextInt(); 
                }
            if(inputWidth1==inputWidth2){
                break; //break loop
            }
            else{
                System.out.println("Width dimensions are not equal, try again"); //print error method
            }
        }
     while (inputHeight1!=inputHeight2){
            System.out.println("Enter height for first matrix:"); //instruct user to enter height
            while(!myScanner.hasNextInt()){
                System.out.println("Not an Integer, Try Again"); //print error message
                myScanner.hasNext(); //take in next integer 
            }
            inputHeight1=myScanner.nextInt(); //initialize inputheight1 
            if(inputHeight1>0){
                }
                else{
                    System.out.println("Not a positive Integer, Try Again");
                    inputHeight1=myScanner.nextInt(); 
                }
            System.out.println("Enter height for second matrix:"); //instruct user to enter width
            while(!myScanner.hasNextInt()){
                System.out.println("Not an integer, Try Again"); //print error message
                myScanner.hasNext(); //take in next integer 
            }
            inputHeight2=myScanner.nextInt(); //initialize inputHeight2
            if(inputHeight2>0){
                }
                else{
                    System.out.println("Not a positive Integer, Try Again");
                    inputHeight2=myScanner.nextInt(); 
                }
            if(inputHeight1==inputHeight2){
                break; //break loop
            }
            else{
                System.out.println("Height dimensions are not equal, try again"); //print error method
            }
        }
     
     
     int[][] matrixArray1=randomMatrix(inputWidth1, inputHeight1); //produce first array
     int[][] matrixArray2=randomMatrix(inputWidth2, inputHeight2); //produce second array
        
        System.out.println("");
        System.out.println("Array 1:"); //print title for array 1 
        printMatrix(matrixArray1); //run method to print first array
        System.out.println("Array 2:"); //print title for array
        printMatrix(matrixArray2); //run method to print second array 
        int[][] multipliedArrayFinal= matrixMultiply(matrixArray1, matrixArray2); //run method to multiplce matrices 1 and 2 
        System.out.println("Multiplied Matrix:"); //print title for multiplied matrix
        printMatrix(multipliedArrayFinal); //run method to print multipled matrix 
        }
    




    public static int[][] randomMatrix(int width, int height){
        Random randGenerator= new Random();  //declare and initialize random number generator
        int[][] matrix= new int[width][height]; //initialize matrix of inputted width and height
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                matrix[i][j]= randGenerator.nextInt(21)-10; //make each element a random number from -10 to 10
            } 
        }
        return matrix; //return produced matrix
    }
    
    public static void printMatrix(int[][] array){
        for(int q=0; q<array.length;q++){
            for(int r=0; r<array[q].length;r++){
            System.out.print(array[q][r]+" "); //print elements of array
        }
        System.out.println("");
        }
    }

    public static int[][] matrixMultiply(int[][] array1, int[][] array2){
        
       int o=0; //initialize and declare counters
       int d=0;
       int g=0;
       int h=0;
       //count dimensions to see if equal
       while(o<array2.length){
        while( d<=o){
            d++; //count height
                }
            o++; //count width
        }
        while(g<array1.length){
           while(h<=g){
               h++; //count height 
             }
             g++; //count width
       }
    int[][] multipliedArray;
    if(o!=g||d!=h){
        System.out.println("The matrixes cannot be multiplied because of their dimensions"); //print error statement 
        return null; //return nothing since cannot run multiplication
    }   
    else{
        multipliedArray= new int [o][g];
       // multipliedArray[0][0]=0;
        for(int t=0; t<multipliedArray.length; t++){
            for(int s=0; s<multipliedArray[t].length; s++){
                for(int f=0; f<multipliedArray[t].length;f++){
                    multipliedArray[t][s]+=array1[t][f]*array2[f][s]; //multiply array 1 and 2 
                }
            }
        }
        return multipliedArray; //return multiplied array
    }
    }
    
}