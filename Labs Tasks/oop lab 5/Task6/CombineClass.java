class CombineClass
{
	StudentClass s;
	MarksheetClass m;

	CombineClass(StudentClass s , MarksheetClass m)
	{
		this.s=s;
		this.m=m;
	}

	void createStudentResult() 
	{
		s.showDetails();
		m.showdata();
	}
}