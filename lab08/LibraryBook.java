public class LibraryBook {

  private String title;
  private String author;
  private String dueDate;
  private int timesLoaned;
  
  /**
   * Standard constructor for LibraryBook class; puts their main
   * properties, 'title' and 'author'.
   * 
   * @param title
   * @param author
   */
  public LibraryBook( String title, String author ) {

    this.title = title;
    this.author = author;
  }
  
  /**
   * Cloning constructor; as its name suggests, clones the main
   * properties of the first book object to the new one.
   * 
   * @param book
   */
  public LibraryBook( LibraryBook book ) {

    title = book.title;
    author = book.author;
  }
  
  /**
   * @return Title of the book
   */
  public String getTitle() {
    return title;
  }
  
  /**
   * @return Author of the book
   */
  public String getAuthor() {
    return author;
  }
  
  /**
   * @return Due date of the book
   */
  public String getDueDate() {
    return dueDate;
  }
  
  /**
   * @return How many times the book was loaned
   */
  public int getTimesLoaned() {
    return timesLoaned;
  }
  
  /**
   * Checks whether are these two books are identical, i.e. they have the same
   * 'title' and 'author' (the main properties).
   * 
   * @param book
   * @return Are these two equal?
   */
  public boolean equals( LibraryBook book ) {
    return ( title.equals( book.title ) ) && ( this.author.equals( book.author ) );
  }
  
  /**
   * @param book
   * @return If these books have the same title.
   */
  public boolean hasSameTitle( LibraryBook book ) {
    return title.equals( book.title );
  }
  
  /**
   * @param book
   * @return If these books have the same author.
   */
  public boolean hasSameAuthor( LibraryBook book ) {
    return author.equals( book.author );
  }
  
  /**
   * Loans the book with the condition of it not already is on loan, until a
   * given due time.
   * 
   * @param dueDate
   */
  public void loanBook( String dueDate ) {
    if( !onLoan() ) {
      this.dueDate = dueDate;
      timesLoaned++;
    } else {
      System.out.println("The book is already on loan!");
    }
  }
  
  /**
   * Returns the book.
   */
  public void returnBook() {
    dueDate = null;
  }
  
  /**
   * @return Is the book on loan?
   */
  public boolean onLoan() {
    if( dueDate == null )
      return false;
    return true;
  }
  
  /**
   * Overwrites the Object.toString() method.
   */
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
}