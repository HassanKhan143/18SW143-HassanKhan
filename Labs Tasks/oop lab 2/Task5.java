// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
// 5. Write java program to demonstrate the working of the Bitwise operators. 
class Task5{
	public static void main(String[] args) {
		 
       int a = 9; //1001
       int b = 7; //0111
                  //1111  
       int bitwise_AND = a & b; // & 0001=1
       int bitwise_OR = a | b; // | 1111=15
       int bitwise_XOR = a ^ b; // ~ 1110 = 114
         
       System.out.println("Bitwise AND = "+ bitwise_AND);
       System.out.println("Bitwise OR = " + bitwise_OR);
       System.out.println("Bitwise XOR = " + bitwise_XOR);

	}
}
