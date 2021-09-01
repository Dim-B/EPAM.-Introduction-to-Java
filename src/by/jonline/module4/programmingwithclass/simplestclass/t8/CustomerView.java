package module4.programmingwithclass.simplestclass.t8;

public class CustomerView {

    public void printCustomers(Customer[] customers){
        for (Customer c : customers) {
            printCustomerInfo(c);
        }
    }
    public void printCustomerInfo(Customer c) {
        System.out.println(
                c.getLastName() + ' ' +
                        c.getFirstName() + ' ' +
                        c.getMiddleName() + ' ' +
                        ", id=" + c.getId() +
                        ", address=" + c.getAddress() +
                        ", cardNumber=" + c.getCardNumber() +
                        ", bankAccountNumber=" + c.getBankAccountNumber());
    }

}
