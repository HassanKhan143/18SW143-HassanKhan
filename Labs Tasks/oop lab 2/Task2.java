// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
/* Task2. Write java program to demonstrate the working of the following operators:
  ▪ Relational operators  
  ▪ Logical Boolean operators  */

class Task2 {
    public static void main(String[] args) {
        
        int number1 = 1, number2 = 2, number3 = 9;
        boolean result;
        
        result = (number1 > number2) || (number3 > number1);
        System.out.println(result);
                
        result = (number1 > number2) && (number3 > number1);
        System.out.println(result);
    }
}