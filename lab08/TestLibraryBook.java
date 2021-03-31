/*
 * OOP
 * @author__Remzi_Tepe__
 * Qversion__26.11.19__
 * */
public class TestLibraryBook {

  public static void main( String[] args ) {

    LibraryBook book1 = new LibraryBook( "The Great Gasby", "FitzGerald");
    LibraryBook book2 = new LibraryBook( "IT", "Stephen King" );
    LibraryBook book3 = new LibraryBook( "The Shining", "Stephen King");
    
    LibraryBook book4 = book1;
    LibraryBook book5 = new LibraryBook( "Lost Symbole", "Dan Brown" );
    LibraryBook book6 = new LibraryBook( "The Great Gasby", "FitzGerald" );
    
    book1.loanBook("11.12.2019");
    
    System.out.println( book1 );
    System.out.println( book2 );
    System.out.println( book3 );
    System.out.println();
    System.out.println( book1 == book4 );
    System.out.println( book1 == book5 );
    System.out.println( book1 == book6 );
    System.out.println();
    System.out.println( book1.equals( book4 ) );
    System.out.println( book1.equals( book5 ) );
    System.out.println( book1.equals( book6 ) );
    System.out.println();
    System.out.println( book1.hasSameTitle( book5 ) );
    System.out.println( book1.hasSameAuthor( book5 ) );
    System.out.println( book1.hasSameTitle( book6 ) );
    System.out.println( book1.hasSameAuthor( book6 ) );
    System.out.println();

  }

}