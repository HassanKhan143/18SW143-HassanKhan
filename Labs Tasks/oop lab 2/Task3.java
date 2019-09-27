// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
// Task3. Write java program that Declares 5 floating numbers and print their total sum and average.
class Task3
{
 public static void main(String[] args) 
{
 	float num[] = {1.1f , 2.2f , 3.3f , 4.4f , 5.5f};
 	float sum = num[0] + num[1] + num[2] + num[3] + num[4] ;
 	float average = (num[0]+num[1]+num[2]+num[3]+num[4])/5 ;
    
    System.out.println("Sum = " + sum);
 	System.out.println("Average = " + average);
 }
}