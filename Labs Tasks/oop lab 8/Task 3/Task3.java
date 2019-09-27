class Test
{
  public final void test()
  {
    System.out.println("print Method A");
  }
}
 

class Example extends Test 
{
  void test()
  {
     System.out.println("Error");
  } 
}

class Lab_8_3
{
 public static void main(String [] args)
  {
    Example obj = new Example();
    obj.test();
  }
}