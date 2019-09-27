// Roll No. = 18SW123 Section-II , Name = Muhammad Saeed
class Task1
{
	public static void main(String[] args) 
	{
	//(Part-i)
		
	System.out.println("Part-i");
	   for (int a=1 ; a<=5 ; a++ )
	     { 
		  for (int j=1 ; j<=a ; j++ ) 
		      {
			   
			   System.out.print("*");
		      
		      }
		      
		       System.out.println();	
		}  //(End of Part-i) 	
	//(Par-ii)
	      
	      System.out.println("Part-ii");
	       for (int x=1 ; x<=5 ; x++ ) 
	        {  
	      	  for (int y=1 ; y<=(5-x) ; y++) 
	      	    {
	      		  System.out.print(" ");  
	      	    }
	      	  for (int z=1 ; z<=(2*x-1); z++) 
	      	    {
	      	  	  System.out.print("*");
	      	    }
                 System.out.println();
            }      //(End of Part-ii)
    //(Part-iii)
            
          System.out.println("Part-iii");
          for (int b=5 ; b>=1 ; b--) 
             {
           	   for (int c=1 ; c<=b ; c++ ) 
           	   {
           	   	 System.out.print("*");
           	   }
               System.out.println();
             } //(End of Part-iii)
     }
}