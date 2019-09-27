class AuthorClass
{
	private String name;
	private String email;
	private char gender;

	AuthorClass(String name , String email , char gender)
	{
		this.name = name;
		this.email = email;
	    this.gender = gender; 
	}

	public String getName()
	{
		return name;
	}

	public String getEmail()
	{
		return email;
	}

	public void setEmail(String email)
	{
		this.email = email; 
	}

	public char getGender()
	{
		return gender;
	}

	public String toString()
			{
		       return "Author[ Name = " + name + ", Email = " + email + ", Gender = " + gender + "]";
			}

}