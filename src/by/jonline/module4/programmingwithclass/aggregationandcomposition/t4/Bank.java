package module4.programmingwithclass.aggregationandcomposition.t4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Bank {
    private static long nextID = 4444555566660000L;
    private Printer printer = new Printer();

    private List<Account> base;

    private final Comparator<Account> comparatorBalance = (o1, o2) -> {
        if (o1.getBalance() > o2.getBalance()) {
            return 1;
        } else if (o1.getBalance() < o2.getBalance()) {
            return -1;
        }
        return 0;
    };

    private final Comparator<Account> comparatorID = (o1, o2) -> {
        if (o1.getId() > o2.getId()) {
            return 1;
        } else if (o1.getId() < o2.getId()) {
            return -1;
        }
        return 0;
    };


    public Bank(List<Account> base) {
        this.base = base;
    }

    public Bank() {
        this.base = new ArrayList<>();
    }

    public void createAccount(int passportID, long balance) {
        base.add(new Account(generateID(), passportID, balance));
        printer.printMessage("Счет создан");
    }

    public void createAccount(int passportID) {
        base.add(new Account(generateID(), passportID));
        printer.printMessage("Счет создан");
    }

    private long generateID() {
        return nextID++;
    }

    public void block(long id) {
        Account account = getAccByID(id);

        if (account == null) {
            printer.printMessage("Указанный счет не существует");
            return;
        }

        account.setBlocked(true);
        printer.printMessage("Счет заблокирован");
    }

    public void unblock(long id) {
        Account account = getAccByID(id);

        if (account == null) {
            printer.printMessage("Указанный счет не существует");
            return;
        }

        account.setBlocked(false);
        printer.printMessage("Счет разблокирован");
    }

    private Account getAccByID(long id) {
        for (Account account : base) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void searchByID(long id) {
        Account account = getAccByID(id);
        if (account == null) {
            printer.printMessage("Указанного счета нет в нашем банке");
        } else {
            printer.printAccountInfo(account);
        }
    }

    public void searchByOwnerPassportID(int passportID) {
        printer.printMessage("Счета клиента " + passportID + ":");
        List<Account> accounts = getAccByOwnerPassportID(passportID);
        if (accounts.isEmpty()) {
            printer.printMessage("У данного клиента отсутствуют счета в нашем банке");
            return;
        }

        for (Account a : accounts) {
            printer.printAccountInfo(a);
        }
    }

    private List<Account> getAccByOwnerPassportID(int passportID) {
        List<Account> accounts = new ArrayList<>();

        for (Account a : base) {
            if (a.getOwnerPassportID() == passportID) {
                accounts.add(a);
            }
        }
        return accounts;
    }

    public void sortByID() {

        base.sort(comparatorID);

        printer.printMessage("База отсортирована по номерам счетов.");
        printer.printBase(base);
    }

    public void sortByBalance() {

        base.sort(comparatorBalance);

        printer.printMessage("База отсортирована по балансам счетов.");
        printer.printBase(base);
    }

    public void showSumBalance() {
        long result = 0;
        for (Account a : base) {
            result += a.getBalance();
        }

        printer.printMessage("Общая сумма по счетам: " + result);
    }

    public void showSumBalancePositive() {
        long result = 0;
        for (Account a : base) {
            if (a.getBalance() > 0) {
                result += a.getBalance();
            }
        }

        printer.printMessage("Общая сумма по счетам c положительным балансом: " + result);
    }

    public void showSumBalanceNegative() {
        long result = 0;
        for (Account a : base) {
            if (a.getBalance() < 0) {
                result += a.getBalance();
            }
        }

        printer.printMessage("Общая сумма по счетам c отрицательным балансом: " + result);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "printer=" + printer +
                ", base=" + base +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Bank bank = (Bank) o;
        return Objects.equals(printer, bank.printer) &&
                Objects.equals(base, bank.base);
    }

    @Override
    public int hashCode() {
        return Objects.hash(printer, base);
    }
}
