class MainClass
{
	public static void main(String[] args) 
	{
		AuthorClass author1 = new AuthorClass("Muhammad Saeed", "Saeedkhan1112@gmail.com", 'M');
		AuthorClass author2 = new AuthorClass("Hiba Khan","Hibakhan1112@gmail.com",'F');
		
		System.out.println(author1.toString());
		System.out.println(author2.toString());
	}
}