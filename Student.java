public class Student 
{
	private String firstName;
	private String lastName;
	private int grade;
	private boolean richardZhang;

	public Student(String firstName, String lastName, int grade, boolean richardZhang)
	{
		this.firstName = firstName;
		this.lastName = lastName;
		this.grade = grade;
		this.richardZhang = richardZhang;
	}

	public toString()
	{
		if (richardZhang)
		{
			return "Richard Zhang!";
		}
		else
		{
			return "First Name: " + firstName + " Last Name: " + lastName + " Grade: " + grade;
		}
	}
}