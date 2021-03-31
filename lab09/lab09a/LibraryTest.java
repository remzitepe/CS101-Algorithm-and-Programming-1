

/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__03.12.19__
 * */
import java.util.Scanner;
public class LibraryTest {

  private static void Interface() {
    
    System.out.println("\n - - - - - - - - - - - - - - - - - - - - - -"
                     + "\n                MAIN MENU"
                     + "\n"
                     + "\n   To operate, please enter following"
                     + "\n  commands:"
                     + "\n"
                     + "\n  Find and select a book : find TITLE"
                     + "\n  Show the current book  : show"
                     + "\n  Add a book             : add TITLE AUTHOR"
                     + "\n  Exit                   : exit"
                     + "\n"
                     + "\n  - - - - - - - - - - - - - - - - - - - - - -");
    
  }
  private static void bookInterface() {
    
    System.out.println("\n  - - - - - - - - - - - - - - - - - - - - - -"
                     + "\n             BOOK OPERATIONS"
                     + "\n"
                     + "\n   To operate, please enter following"
                     + "\n  commands:"
                     + "\n"
                     + "\n  Loan the book          : loan"
                     + "\n  Return the book        : return"
                     + "\n  Remove this book       : remove"
                     + "\n  Return to the menu     : menu"
                     + "\n"
                     + "\n  - - - - - - - - - - - - - - - - - - - - - -");
    
  }
  public static void main(String[] args) {
    Scanner scan = new Scanner( System.in );
    // Variables
   
    Library library;
    LibraryBook book;
    String next;
    boolean moveOn;
    
    // Initializations
    library = new Library();
    moveOn = true;
    book = null; // Told to be initially null.
    
    // The program code, denoted by a while loop:
    while( moveOn ) {
      // Prompting
      Interface();
      // Input
      next = scan.next();
      //  Finds a book from the library
      if( next.equals( "find" ) ) {
         book = library.findByTitle( scan.next() );
         if( book == null ) {
           System.out.println( "There is no such book!\n" );
         } else {
              // Book-specific interface / while-loop
              boolean bookGoOn = true;
              while( bookGoOn ) {
                 // Prompting again for book interface
                 bookInterface();
                 // New input
                 String operation = scan.next();
                 System.out.println( book );
                 if ( operation.equals( "loan" ) ){
                    book.loanBook(); 
                 }
              //  Returns the book
              else if( operation.equals( "return" ) ) {
                 book.returnBook();
              }
              //  Removes the book from the library
              else if( operation.equals( "remove" ) ) {
                 library.remove(book); // Removes from the library
                 book = null; // Deleting from this thread 
                 bookGoOn = false; // Exit the book's loop
              }
              // Returns back to the main menu 
              else if( operation.equals( "menu" ) ) {
                 bookGoOn = false;
              }
             }
         }
      }
      //  Shows data
      else if( next.equals( "show" ) ) {
         if( book == null )
            System.out.println( "There is no book selected!" );
         else
            System.out.println( book.toString() );
      }
      // Adds a new book
      else if( next.equals( "add" ) ) {
        library.add(scan.next(), scan.next());
      }
      //  Exit statement
      else if( next.equals( "exit" ) ) {
        moveOn = false;
      }
     
    }
   
  }
}