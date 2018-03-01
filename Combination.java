package h4;

import java.util.Scanner;
import java.io.*;

public class Combination {
	
	public static void PrintLine(char[][] array){
		
		System.out.printf(" Combination of Output Is:");
		
        for(int r=0;r<array[0].length;r++){
            for (int colum = 0; colum < array.length; colum++)
            //	https://www.geeksforgeeks.org/print-all-possible-combinations-of-r-elements-in-a-given-array-of-size-n/
                System.out.printf("%c", array[colum][r]);
            System.out.printf("\n");
        }
    }
	
	
	
	
	 public static void main(String[] args) throws IOException {
    	
    	File file =new File("char.txt");
        Scanner keyboad= new Scanner(file);

        int r;
        int c=0;
        int count=1;

System.out.println("Enter rows");

        r=keyboad.nextInt();
        char[][] character= new char[r][];
        //http://www.sanfoundry.com/java-program-generate-all-possible-combinations-out-a-b-c-d-e/
        for( int x =0;keyboad.hasNext();x++){

            c=keyboad.nextInt();
            character[x]=new char[c];
            count= count*c;

            for (int a=0;a<c;a++){
            	character[x][a]=keyboad.next().charAt(0);
            }

        }

       
        char [] [] combination = new char[r][count];

        int h=0;
        int pt=count;
        int Counter=0;

        for(int x=0; x<r;x++){
            pt/=character[r].length;
           
            Counter=0;
            for (int y=0;y<c;y++){
            	combination[x][y]=character[x][h];
                Counter++;
                if(h+1==character[r].length){
                    h=0;
                }
                else{
                    h++;
                }
               Counter=0;

            }
        }



       



    }
	// https://stackoverflow.com/questions/15868914/how-to-get-2d-array-possible-combinations

}

