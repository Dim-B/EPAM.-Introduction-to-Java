package module4.programmingwithclass.simplestclass.t9;

public class BookView {
    public void printBookInfo(Book book) {
        System.out.println(book.getName() +
                ", авторы: " + book.getAuthors() +
                ", издательство: " + book.getPublisher() +
                ", " + book.getYear() +
                ", количество страниц: " + book.getPagesCount() +
                ", цена: " + book.getPrice() + "руб." +
                ", переплет: " + book.getBinding());
    }

}
