package module4.programmingwithclass.simplestclass.t9;

public class BookLogic {
    BookStore bookStore = BookStore.getInstance();
    Book[] books = bookStore.getBooks();
    BookView view = new BookView();

    public void printBooksAuthor(String author) {
        for (Book b : books) {
            if (b.getAuthors().contains(author)) {
               view.printBookInfo(b);
            }
        }
    }

    public void printBooksPublisher(String publisher) {
        for (Book b : books) {
            if (b.getPublisher().equals(publisher)) {
                view.printBookInfo(b);
            }
        }
    }

    public void printBooksAfterYear(int year) {
        for (Book b : books) {
            if (b.getYear() > year) {
                view.printBookInfo(b);
            }
        }
    }

}
