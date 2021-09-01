package module4.programmingwithclass.aggregationandcomposition.t4;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();

        //создание счетов по номеру паспорта и начальному балансу
        bank.createAccount(89190956, 684);
        bank.createAccount(92734464, 1247);
        bank.createAccount(59909041, -20);
        bank.createAccount(17569961);
        bank.createAccount(28178063, -137);
        bank.createAccount(28178063, 1500);
        bank.createAccount(71894483, 841);
        bank.createAccount(22267512, 933);
        bank.createAccount(50492669, -393);
        bank.createAccount(65759502, 420);

        //блокировка
        bank.block(4444555566660005L);
        bank.block(4444555566660007L);
        bank.block(4444555566660008L);
        bank.unblock(4444555566660008L);

        //поиск по номеру счета
        bank.searchByID(4444555566660002L);

        //поиск по номеру пасспорта владельца
        bank.searchByOwnerPassportID(28178063);

        //сортировка по балансу
        bank.sortByBalance();

        //сортировка по номеру счета
        bank.sortByID();

        //сумма всех счетов
        bank.showSumBalance();

        //сумма счетов с положительным балансом
        bank.showSumBalancePositive();

        //сумма счетов с отрицательным балансом
        bank.showSumBalanceNegative();

    }
}
