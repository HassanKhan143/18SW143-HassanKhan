// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
import java.util.Scanner;
class Task1{
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
    
    int a,b,c; 
	
	System.out.println("Enter marks obtained in C++ :: ");
	a = sc.nextInt();
	System.out.println("Enter marks obtained in Data Structures :: ");
    b = sc.nextInt();
    System.out.println("Enter marks obtained in Operating Systems :: ");
    c = sc.nextInt();
    
    int total_obtained_marks = a+b+c;
    float percentage = (total_obtained_marks/300) * 100 ;
    String grade="Invalid";

    if(percentage>90){ grade = "A" ;}
    if(percentage>80 && percentage<90){ grade = "B" ;}
    if(percentage>70 && percentage<79){  grade = "C" ;}
    if(percentage>60 && percentage<69){ grade = "D" ;}
    if(percentage<60){ grade = "Fail" ;}

    System.out.println("Total obtaine marks :: " + total_obtained_marks);
    System.out.println("Percentage :: " + percentage);
    System.out.println("Grade :: " + grade);
    
	}
}