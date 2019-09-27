class MyCalculator implements AdvancedArithmetic
 { 
 	public int sumOfFactors(int x)
 	{   
 		int s = 0;
 		
 		for (int j=x ; j>0 ; j-- ) 
 		{
 			if(x%j==0)
 			{
 				
 				s+=j;
                
 			}
 		}
 		return s;
 	}
}