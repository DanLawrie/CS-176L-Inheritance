package labproject6.persons;

public class Faculty extends Employee{

	String rank = "";

	public String getRank() {
		return rank;
	}

	public void setRank(String rank) {
		this.rank = rank;
	}
	public String toString()
	{
		return getClass() + "\nname: " + name + "\nOffice Number : "+ officeNumber + "\nSalary: " + salary + "\nRank: " + rank;
	}

}
