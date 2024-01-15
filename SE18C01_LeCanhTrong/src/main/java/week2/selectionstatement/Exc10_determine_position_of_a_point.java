/*
Task
Given two integers x and y where x and y are not equal to 0. Determine in which quadrant the point (x, y) lies.
Example:
For x = 4 and y = 6, the output should be "This point lies in the First quadrant"
Because according to the illustration above, point(4, 6) lies in the first quadrant.
For x = -4 and y = 6, the output should be "This point lies in the Second quadrant"
Because according to the illustration above, point (-4, 6) lies in the second quadrant.
Similarly, the program will display 
"This point lies in the Third quadrant" or "This point lies in the Fourth quadrant" if point (x, y) lies in the third or fourth quadrant.
 */
package week2.selectionstatement;
import java.util.Scanner;
public class Exc10_determine_position_of_a_point {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        if (x > 0 && y > 0) 
            System.out.println("This point lies in the First quadrant"); 
  
        else if (x < 0 && y > 0) 
            System.out.println("This point lies in the Second quadrant"); 
  
        else if (x < 0 && y < 0) 
            System.out.println("This point lies in the Third quadrant"); 
  
        else if (x > 0 && y < 0) 
            System.out.println("This point lies in the Fourth quadrant"); 
  
        else if (x == 0 && y > 0) 
            System.out.println("lies at positive y axis"); 
  
        else if (x == 0 && y < 0) 
            System.out.println("lies at negative y axis"); 
  
        else if (y == 0 && x < 0) 
            System.out.println("lies at negative x axis"); 
  
        else if (y == 0 && x > 0) 
            System.out.println("lies at positive x axis"); 
  
        else
            System.out.println("lies at origin"); 
     
    }
}
