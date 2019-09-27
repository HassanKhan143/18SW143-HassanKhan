import java.util.*;
class ScannerClass
{
	private int x;
	Scanner input = new Scanner(System.in);
	int scanner()
	{
       System.out.print("Enter a Number :: ");
       x = input.nextInt();
       return x;
	}
}