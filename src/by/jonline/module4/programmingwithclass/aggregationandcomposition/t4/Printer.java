package module4.programmingwithclass.aggregationandcomposition.t4;

import java.util.List;

public class Printer {

    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printAccountInfo(Account account) {
        System.out.println("Счет №" + account.getId() +
                " - passportID владельца: " + account.getOwnerPassportID() +
                ", баланс: " + account.getBalance() +
                ", статус: " + (account.isBlocked() ? "заблокирован" : "не заблокирован"));
    }

    public void printBase(List<Account> base) {
        for (Account a : base) {
            printAccountInfo(a);
        }
    }
}
