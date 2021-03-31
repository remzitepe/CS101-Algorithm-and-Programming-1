public class TestLibraryBook {

  public static void main( String[] args ) {

    LibraryBook book1 = new LibraryBook( "The Great Gasby", "FitzGerald" );
    LibraryBook book2 = new LibraryBook( "IT", "Stephen King" );
    LibraryBook book3 = new LibraryBook( "The Shining", "Stephen King" );

    book1.loanBook("11.11.2019");
    book2.loanBook("12.12.2020");
    System.out.println( book1 );
    System.out.println( book2 );
    System.out.println( book3 );

  }

}