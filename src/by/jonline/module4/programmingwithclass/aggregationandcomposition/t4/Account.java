package module4.programmingwithclass.aggregationandcomposition.t4;

import java.util.Objects;

/*
4. Счета. Клиент может иметь несколько счетов в банке. Учитывать возможность блокировки/разблокировки
счета. Реализовать поиск и сортировку счетов. Вычисление общей суммы по счетам. Вычисление суммы по
всем счетам, имеющим положительный и отрицательный балансы отдельно.
 */
public class Account {

    private long id;
    private int ownerPassportID;
    private long balance;
    private boolean blocked;

    public Account(long id, int ownerPassportID, long balance) {
        this.id = id;
        this.ownerPassportID = ownerPassportID;
        this.balance = balance;
        this.blocked = false;
    }

    public Account(long id, int ownerPassportID) {
        this.id = id;
        this.ownerPassportID = ownerPassportID;
        this.balance = 0;
        this.blocked = false;
    }

    public long getId() {
        return id;
    }

    public int getOwnerPassportID() {
        return ownerPassportID;
    }

    public void setOwnerPassportID(int ownerPassportID) {
        this.ownerPassportID = ownerPassportID;
    }

    public long getBalance() {
        return balance;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", ownerPassportID=" + ownerPassportID +
                ", balance=" + balance +
                ", blocked=" + blocked +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return id == account.id &&
                ownerPassportID == account.ownerPassportID &&
                balance == account.balance &&
                blocked == account.blocked;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, ownerPassportID, balance, blocked);
    }
}
