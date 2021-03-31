
/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__03.12.19__
 * */
public class LibraryBook {

  private String title;
  private String author;
  private String dueDate;
  private int timesLoaned;
  
  public LibraryBook( String title, String author, String dueDate, int timesLoaned) {

    this.title = title;
    this.author = author;
    this.dueDate = dueDate;
    this.timesLoaned = timesLoaned;
  }
  
  public LibraryBook( LibraryBook book ) {

    title = book.title;
    author = book.author;
  }
  
  public String getTitle() {
    return title;
  }
  
  public String getAuthor() {
    return author;
  }
  
  public String getDueDate() {
    return dueDate;
  }
  
  public int getTimesLoaned() {
    return timesLoaned;
  } 
  
  public boolean equals( LibraryBook book ) {
    return ( this.title.equals( book.title ) ) && ( this.author.equals( book.author ) );
  }
  public boolean hasSameTitle( LibraryBook book ) {
    return title.equals( book.title );
  }
  
  public boolean hasSameAuthor( LibraryBook book ) {
    return author.equals( book.author );
  }
  
  public void returnBook() {
    dueDate = "";
  }
    
  public void loanBook() {
     timesLoaned++;
    } 
  
  public boolean onLoan() {
     if( dueDate.equals("") )
        return false;
     return true;
   } 
  
  public String toString() {
    
     return "Title: " + getTitle() + " Author: " + getAuthor() + " Due Date: " + getDueDate() + " Loaned times " + getTimesLoaned();

  }
}