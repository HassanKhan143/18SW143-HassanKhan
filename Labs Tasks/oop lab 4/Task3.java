// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
import java.util.*;
class Task3
{
	public static void main(String[] args) 
	{
	  	int x,sum=0;
	  	
	  	Scanner input = new Scanner(System.in);
	  	System.out.print("Enter Number : ");
	  	x = input.nextInt();
	  	
	  	for (int y=1 ; y<=x ; y++) 
	  	{
	  	   	sum+=y;
	  	}
	  	System.out.print("Sum= " + sum);

	}
}