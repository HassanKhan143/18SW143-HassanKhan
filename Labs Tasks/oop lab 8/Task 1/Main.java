import java.util.Scanner;
class Main
{
   public static void main(String[] args) 
   {
   	 Scanner input = new Scanner(System.in);
   	 AdvancedArithmetic obj = new MyCalculator();
   	 
   	 System.out.print("Enter a Number:");
   	 int y = input.nextInt();
   	 
   	 System.out.println(obj.sumOfFactors(y));
   }
}