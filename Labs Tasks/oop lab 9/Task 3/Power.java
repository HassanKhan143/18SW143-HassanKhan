class Power
{
 static double power(int n,int p)
	{
		int k=1;
		if(n==0 && p==0)
		{
			throw new ArithmeticException("n & p can not be Zero !");
		}
		if (n<0 || p<0)
		{
		    throw new ArithmeticException("n & p can not be less than Zero !");
		}
		for (int i=1 ; i<=p ; i++) 
		{

			k*=n;
		}
		return k;
	}
	public static void main(String[] args) 
	{
		try
		{
			System.out.println(Power.power(3,5));
		}
		catch(ArithmeticException a)
		{
			System.out.println(a.getMessage());
		}
	}
}