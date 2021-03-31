public class Library {
   private LibraryBook b1;
   private LibraryBook b2;
   private LibraryBook b3;
   private LibraryBook b4;
   
   public Library(){
      b1 = null;
      b2 = null;
      b3 = null;
      b4 = null;
   }
   public boolean isEmpty() {
      return ( b1 == null) && ( b2 == null) && ( b3 == null) && ( b4 == null);
   }
   public String toString(){
     if ( b1 != null)
     { 
        return "Title: " + b1.getTitle() + " author: " + b1.getAuthor();
     }
      if ( b2 != null)
     { 
        return "Title: " + b2.getTitle() + " author: " + b2.getAuthor();
     }
      if ( b3 != null)
     { 
        return "Title: " + b3.getTitle() + " author: " + b3.getAuthor();
     }
      if ( b4 != null)
     { 
        return "Title: " + b4.getTitle() + " author: " + b4.getAuthor();
     }
     else 
        return "The library is empty. ";
   }
   public boolean add( String title, String author ) {
      if( b1 != null ) {
         if( b2 != null ) {
            if( b3 != null ) {
               if( b4 != null ) {
                  System.out.println("Library is full!");
               return false;
               }
               else
                  b4 = new LibraryBook( title, author );
            }
            else
               b3 = new LibraryBook( title, author );
            }
            else
               b2 = new LibraryBook( title, author );
         }
         else
            b1 = new LibraryBook( title, author );
      return true;
    }
    public boolean remove( LibraryBook book ) {
    
       if( b1.equals(book) )
          b1 = null;
       else if( b2.equals(book) )
          b2 = null;
       else if( b3.equals(book) )
          b3 = null;
       else if( b4.equals(book) )
          b4 = null;
       else
          return false;
    return true;
    } 
    public LibraryBook findByTitle( String title ) {

       if( b1 != null && b1.getTitle().equals(title) )
          return b1;
       else if( b2 != null && b2.getTitle().equals(title) )
          return b2;
       else if( b3 != null && b3.getTitle().equals(title) )
          return b3;
       else if( b4 != null && b4.getTitle().equals(title) )
          return b4;
       else
          return null;
    }
}