package module4.programmingwithclass.simplestclass.t8;

/*
8. Создать класс Customer, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Customer, с подходящими конструкторами
и методами. Задать критерии выбора данных и вывести эти данные на консоль.
Класс Customer: id, фамилия, имя, отчество, адрес, номер кредитной карточки, номер банковского счета.
Найти и вывести:
a) список покупателей в алфавитном порядке;
b) список покупателей, у которых номер кредитной карточки находится в заданном интервале
 */
public class T8Main {
    public static void main(String[] args) {
        CustomerLogic logic = new CustomerLogic();
        CustomerView view = new CustomerView();

        System.out.println("Список клиентов в алфавитном порядке");
        view.printCustomers(logic.sortByName());
        System.out.println();

        System.out.println("Списко клиентов с номерами карт в диапазоне 5404361407833040 - 5404366150218480");
        view.printCustomers(logic.getCustomersCardNumberInRange(5404361407833040L, 5404366150218480L));
    }
}
