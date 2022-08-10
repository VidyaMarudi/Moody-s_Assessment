package UnitTestCases;

import java.util.Random;
import java.util.Scanner;


	public class IdenticalRows {

	    public static void main(String[] args) {
	        Scanner KBin = new Scanner(System.in);
	        char run;
	        int ROW, COL;

	        System.out.println("Would you like to begin? (Y/N)");
	        run = KBin.next().charAt(0);
	        do {
	            if(run!='y' && run!='Y' && run!='n' && run!='N') {
	                System.out.println("Please only type 'y' or 'Y' to begin or type 'n' or 'N' to close the program.");
	                System.out.println("Would you like to begin? (Y/N)");
	                run = KBin.next().charAt(0);
	            }
	        }while(run!='y' && run!='Y' && run!='n' && run!='N');

	        do {
	            System.out.println("Please enter the number of rows:");
	            ROW = KBin.nextInt();
	            do {
	                if (ROW<=0) {
	                    System.out.println("Entry invalid; must be a positive integer greater than 0.");
	                    System.out.println("Please enter the number of rows:");
	                    ROW = KBin.nextInt();
	                }   
	            }while(ROW<=0);
	            System.out.println("Please enter the number of columns:");
	            COL = KBin.nextInt();
	            do {
	                if (COL<=0) {
	                    System.out.println("Entry invalid; must be a positive integer greater than 0.");
	                    System.out.println("Please enter the number of columns:");
	                    COL = KBin.nextInt();
	                }   
	            }while(COL<=0);

	            int[][] testDuplicates = new int[ROW][COL];
	                randArray (testDuplicates, MIN, MAX);
	            System.out.println("Thematrix is:");
	                printArray(testDuplicates);
	                    System.out.println(" ");
	            boolean presence = duplicates(testDuplicates);
	                if (presence=true) {
	                    countDuplicates(testDuplicates);
	                }
	                else if (presence=false) {
	                    System.out.println("There are no identical rows in this matrix.");
	                }
	            System.out.println("Would you like to run the program again? (Y/N)");
	            run = KBin.next().charAt(0);
	        }while(run=='y' || run=='Y');
	    }

	    public static void randArray(int[][] matrix, int low, int up) {//Establishes the values of the elements of the array
	        Random rand = new Random();
	        for (int r = 0; r < matrix.length; r++) {
	            for (int c = 0; c < matrix[r].length; c++) {
	                matrix[r][c] = rand.nextInt(up-low+1)+low;
	            }   
	        }   
	    }

	    public static void printArray(int[][] matrix) {//Prints the elements of the array in a square matrix
	        for (int r = 0; r < matrix.length; r++) {
	            for (int c = 0; c < matrix[r].length; c++) {
	                System.out.printf("%5d",matrix[r][c]);
	            }
	            System.out.println(" ");
	        }
	    }

	    public static boolean duplicates(int[][] list) {//Determines if any row(s) of elements ever repeat
	         for (int r=0; r<list.length; r++) {
	             for (int c=0; c<list[r].length; c++) {

	             }
	         } 
	         return false;
	    }

	    public static void countDuplicates(int[][] matrix) {
	        for (int r=0; r<matrix.length; r++) {
	            for (int c=0; c<matrix[r].length; c++) {

	            }
	        }
	    }

	    public static final int MAX=3;
	    public static final int MIN=1;
	}


