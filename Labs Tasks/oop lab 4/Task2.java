// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
import java.util.*;
class Task2
{
 public static void main(String[] args) 
 {
 	Scanner input = new Scanner(System.in);
 	int x,y,z;
 	
 	System.out.print("Enter Table Number: ");
 	x = input.nextInt();
 	System.out.println();
 	
 	System.out.print("Enter Starting Point: ");
 	y = input.nextInt();
 	System.out.println();
 	
 	System.out.print("Enter Ending point: ");
    z = input.nextInt();
 	System.out.println();

 	for (int i=y ; i<=z ; i++ ) 
 	{ 
 		  int m=x*y;
 		  System.out.print(x + "X" + y + " = " + m );
 		  System.out.println();
 	      y++;
 	}
  }

}