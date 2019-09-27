// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
class Task4
{
	public static void main(String[] args)
	{
		int [][] a = {{1,2,1},{4,5,4},{2,6,2}};     //array1=a
		int [][] b = {{1,2,7},{1,3,1},{1,3,0}};    //array2=b
		int [][] c = new int[3][3];               //array3=c                                                                                                                                                                                                                                                                                                                                                                                                              
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length ; j++)
			{
				c[i][j] = a[i][j]+b[i][j];
				System.out.print(c[i][j] + "   ");
			}
			
			System.out.println();
		}
								 	
	}
}	//end
