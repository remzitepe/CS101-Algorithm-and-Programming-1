public class LibraryBook {

  String title;
  String author;
  String dueDate;
  int timesLoaned;
  
  public LibraryBook( String title, String author ) {

    this.title = title;
    this.author = author;

  }

  public String toString() {
    
    String ans;
    ans = "This book is named " + title + ", written by " + author + ".";
    
    if( onLoan() )
       ans += " Its due date is " + dueDate + ".";
    else
       ans += " The book is not on loan.";

    if( timesLoaned == 0 )
       ans += " The book was never loaned.";
    else
       ans += " The book was loaned " + timesLoaned + " times.";
    return ans;

  }

  public void loanBook( String dueDate ) {
     this.dueDate = dueDate;
     timesLoaned++;
  }
  
  public void returnBook() {
     dueDate = null;
  }

  public int getTimesLoaned() {
     return timesLoaned;
  }
  
  public boolean onLoan() {
     if( dueDate == null )
        return false;
     return true;
  }
}