/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mario;
import java.util.*;
/**
 *
 * @author Gaming
 */
public class Mario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        int height;
        do
        {
            System.out.println("Enter Height of Pyramid: ");
            height = inputScanner.nextInt();
        }while(height >23 || height < 0);
        //start printing the pyramid
        //start with the first row. Number Spaces is (height - 1) - (row + 2)
        // Cont.  Number Hashes is (row + 2)
        for(int row = 0; row < height; row++)
        {
            for(int spaces = 0 ;spaces <= height - (row + 2); spaces++)
            {
                System.out.print(" ");    
            }
            for(int hashes = 1; hashes <= row + 2; hashes++)
            {
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
