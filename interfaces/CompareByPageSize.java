package labproject8.interfaces;
import java.util.Comparator;
public class CompareByPageSize implements Comparator<WrittenWork> {
int difference;

	public int compare(WrittenWork w1, WrittenWork w2)
	{
		if(w1.getPageSize()>w2.getPageSize())
		{
			return 1;
		}
		else if(w1.getPageSize()<w2.getPageSize())
		{
			return -1;
		}
		return 0;
		
	}

}
