package labproject7.writtenworks;

public class TestWrittenWork {
	public static void main(String args[])
	{
		Novel one = new Novel("Title", "Name", 2001, "Sci-fi", 5);
//String title, String author, int year, String genre, int chapters
		ShortStory two = new ShortStory("newTitle", "otherName", 2005, "poem", 5, true);
//String genre, int paragraphs, boolean hasPics
System.out.println(one);
System.out.println();
System.out.println(two);
	}


}
