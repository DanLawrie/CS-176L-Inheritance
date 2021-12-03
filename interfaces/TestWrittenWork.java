package labproject8.interfaces;
import java.util.ArrayList;
import java.util.Collections;
public class TestWrittenWork {
	public static void main(String args[])
	{

Novel oneNov = new Novel("Title", "Na67465me", 2031, "Sci-fi", 5, 6);
Novel twoNov = new Novel("Titl443e", "657Name", 2201, "Sci-fi", 4, 5);
Novel threeNov = new Novel("Tit43le", "Na435346me", 2101, "Sci-fi", 3, 7);
ShortStory oneSho = new ShortStory("nedsfwTitle", "otherdffd Name", 2222, "poem", 2, true, 10);
ShortStory twoSho = new ShortStory("nedfswTitle", "otherxcvName", 2223, "poem", 1, true, 9);

ArrayList<WrittenWork> type = new ArrayList<>();

type.add(oneNov);
type.add(twoNov);
type.add(threeNov);
type.add(oneSho);
type.add(twoSho);
System.out.println(type);
Collections.sort(type, new CompareByPageSize());
System.out.println();
System.out.println(type);
/*
 *  Create 3 Novel objects with random data.
- Create 2 ShortStory objects with random data.
- Create an ArrayList of type WrittenWork: ArrayList<WrittenWork>
- Add the 5 objects created in the first 2 steps to the array list.
- Print the array list after adding the 5 objects in the order they were created.
- Use the Collections framework and CompareByPageSize to sort the array list by page size.
- Print the array list after sorting the array list.
 */
	}


}
