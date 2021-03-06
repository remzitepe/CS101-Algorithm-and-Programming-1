
import java.util.ArrayList;
/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__03.12.19__
 * */
public class Library {
   private ArrayList<LibraryBook> books;
   
   public Library(){
      books = new ArrayList<>();   
   }
   
   public boolean isEmpty() {
      return books.size() == 0;
   }
   
   public String toString(){
     String ans;
     ans = "";
     if ( isEmpty() )
        return "The library is empty. ";
     for ( LibraryBook book : books) 
        ans += "Title: " + book.getTitle() + " author: " + book.getAuthor();
     return ans;
   }
   
   public boolean add( String title, String author ) {
      books.add( new LibraryBook( title, author, "", 0 ) );
      return true;
    }
   
    public boolean remove( LibraryBook book ) {
       int i = books.indexOf( book );
       if ( i < 0 )
         return false;
       else 
          books.remove( book );
    return true;
    } 
    
    public LibraryBook findByTitle( String title ) {

        for( LibraryBook book : books )
           if( book.hasSameTitle( book ) )
              return book;
    return null;
   }
}