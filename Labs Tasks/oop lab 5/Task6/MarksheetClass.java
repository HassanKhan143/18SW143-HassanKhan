import java.util.*;
class MarksheetClass
{
	 int oop; int i_s; int p_s; int total_marks = 300; int obtainedMarks;
	 double percentage = 0; String grade;


	MarksheetClass(int object_oriented_programming , int islamic_studies , int pakistan_studies )
	{
        this.oop = object_oriented_programming ;
        this.i_s = islamic_studies;
        this.p_s = pakistan_studies;
    }
	
	public int obtained_Marks()
	{
        obtainedMarks = this.oop+this.i_s+this.p_s;
        return obtainedMarks;
    }

    public double percentage()
    {
        percentage = (100 * obtainedMarks/this.total_marks);
        return percentage;
    }

    String grade()
    {
    	if (percentage>=80) 
    	{
    		grade="A";
    	}
    	
    	if (percentage>=70 && percentage<80) 
    	{
    		grade="B";
    	}
        
        if (percentage>=60 && percentage<70) 
    	{
    		grade="C";
    	}

    	if (percentage<60) 
    	{
    		grade="Fail";
    	}
        return grade;
    	
    }

    void showdata()
    	{
    		System.out.println("Total Marks = "+ this.total_marks +"\nObtained Marks = "+ obtained_Marks() +"\nPercentage = "+ percentage() +"%\nGrade = " + grade() +"");
    	}  

}