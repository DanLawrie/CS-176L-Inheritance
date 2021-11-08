package labproject6.persons;

public class Staff extends Employee{

	String title = "";

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ officeNumber + "\nSalary: " + salary + "\nTitle: " + title;
	}
}
