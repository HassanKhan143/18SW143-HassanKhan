class StudentClass
{
	private String name;
	private String department;
	private String rollno;
	private String section;
	
	StudentClass(String name , String department , String rollno , String section )
	{
		this.name = name;
		this.department = department;
		this.rollno = rollno;
        this.section  = section;  
    }

    public void showDetails()
    {
    	System.out.println("Name :: " + name + "\nDepartment :: " + department + "\nRoll Number :: " + rollno + "\nSection :: " + section);
    }

}