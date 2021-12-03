package labproject8.interfaces;


public class WrittenWork {
private int pageSize=0;
 public int getPageSize() {
	return pageSize;
}

public void setPageSize(int pageSize) {
	this.pageSize = pageSize;
}
private String title;
 private String author;
 private int    year;


 // constructors:
 public WrittenWork(String title, String author, int year, int pageSize) {

     setTitle( title );
     setAuthor( author );
     setYear( year );
     setPageSize(pageSize);
 }

 public WrittenWork() {
 }


 // accessor methods:
 public String getTitle() {
     return title;
 }

 public String getAuthor() {
     return author;
 }

 public int getyear() {
     return year;
 }

 public void setTitle(String title) {
     this.title = title;
 }

 public void setAuthor(String author) {
     this.author = author;
 }
public int getYear()
{
	return year;
}
 public void setYear(int year)
 {
     this.year = year;
 }
 public String toString()
 {
	 return "title: " + title + "\nauthor: " + author + "\nyear:" + year;
 }
 public boolean equals(WrittenWork one) {
 	if(one instanceof WrittenWork) {
 		if(one.getTitle()==title&& one.getAuthor()==author&&one.getyear()==year) {
 			return true;
 		}
 		else {
 			return false;
 		}
 	}
 	return false;
 }
}
