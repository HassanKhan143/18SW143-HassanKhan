class MainClass
{
	public static void main(String[] args) 
	{
		StudentClass s = new StudentClass("Muhammad Saeed","Software Engineering","18-SW-123","II");
		MarksheetClass m = new MarksheetClass(75,80,70);

		CombineClass c1 = new CombineClass(s,m);

		c1.createStudentResult();
		
	}
}