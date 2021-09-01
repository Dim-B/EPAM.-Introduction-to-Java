package module4.programmingwithclass.simplestclass.t9;

/*
9. Создать класс Book, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы и
метод toString(). Создать второй класс, агрегирующий массив типа Book, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Book: id, название, автор(ы), издательство, год издания, количество страниц, цена, тип переплета.
Найти и вывести:
a) список книг заданного автора;
b) список книг, выпущенных заданным издательством;
c) список книг, выпущенных после заданного года.
 */
public class T9Main {
    public static void main(String[] args) {
        BookLogic logic = new BookLogic();

        System.out.println("Книги автора: Борис Стругацкий");
        logic.printBooksAuthor("Борис Стругацкий");
        System.out.println();

        System.out.println("Книги издательства: Азбука");
        logic.printBooksPublisher("Азбука");
        System.out.println();

        System.out.println("Книги изданные после 2018 года ");
        logic.printBooksAfterYear(2018);

    }
}
