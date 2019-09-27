package pkg;
class Cricket extends Sports
{
	String getName()
	{
		return "Cricket ";
	}
	void getNumberOfTeamMembers()
	{
		System.out.println("Each team has 11 players in "+getName());
	}
}