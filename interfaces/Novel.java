// Novel.java: Subclass of WrittenWork
package labproject8.interfaces;
public class Novel extends WrittenWork {

    private String genre;
    private int chapters;

    // constructors:
    public Novel(String title, String author, int year, String genre, int chapters, int page) {
        /* _________Line 11_________ */
    	setAuthor(author);
    	setTitle(title);
    	setYear(year);
        setGenre( genre );
        setChapters( chapters );
        setPageSize(page);
    }

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public int getChapters() {
		return chapters;
	}

	public void setChapters(int chapters) {
		this.chapters = chapters;
	}
	 public String toString()
	 {
		 return "title: " + getTitle() + "\nauthor: " + getAuthor() + "\nyear:" + getYear() + "\ngenre: "+ getGenre() + "\nchapter: "+ getChapters();
	 }
    // accessor methods:
    /**
        Write the getGenre method.
        @return genre of Novel
    */


    /**
        Write the getChapters method.
        @return number of Novel chapters
    */



    /**
        Write the setGenre method.
        @param Novel's genre
    */



    /**
        Write the setChapters method.
        @param Number of Novel chapters
    */



}

