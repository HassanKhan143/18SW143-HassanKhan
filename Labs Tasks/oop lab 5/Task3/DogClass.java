class DogClass
{
	private String name;
	private String breed;
	private int age ;
	
	void setDetails(String name , String breed , int age)
	 {
	 	this.name = name ;
	 	this.breed = breed ;
	 	this.age = age ;
		
	 }
	 
	void showDetails()
	 {
	 	System.out.print("Name :: " + name + "\nBreed :: " + breed + "\nAge :: " + age);
	 }
}