
class Task5
{
	public static void main(String[] args)
	{
		int array[]={1,4,3,2,6,5,8,7,9};
		for(int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j]>array[j+1])
				{
					array[j]=array[j]+array[j+1];
					array[j+1]=array[j]-array[j+1];
					array[j]=array[j]-array[j+1];
				}
			}
		}
		System.out.print("Largest value is: "+array[array.length-1]);
	}
}