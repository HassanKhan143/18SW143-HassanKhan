import java.util.*;
class ArrayClass
{

    int size_Of_Array = 10;
    int num[] = new int[size_Of_Array];
    
    void  populateArray()
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter An Array. ");
        
        for(int i=0 ; i<size_Of_Array ; i++)
         {
            num[i] = input.nextInt(); 
            
         }
    }

    int even=0; int odd=0; int j=0;

    void printArray()
    {
        while(j<size_Of_Array)
        {
            if(num[j]%2 == 0)
            {
                even++;
                
            }
            else
            {
                odd++;
            
            }
            j++;
        }
        
        System.out.println("Number of even numbers: "+even);
        System.out.print("Number of odd numbers: "+odd);
    }
}