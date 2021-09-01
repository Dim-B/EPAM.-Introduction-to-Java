package module4.programmingwithclass.simplestclass.t8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CustomerLogic {
    CustomerBase base = CustomerBase.getBase();
    Customer[] customers = base.getCustomers();

    public Customer[] sortByName() {

        Arrays.sort(base.getCustomers());

        return customers;
    }

    public Customer[] getCustomersCardNumberInRange(long min, long max) {
        if (min > max) {
            long tmp = min;
            min = max;
            max = tmp;
        }

        List<Customer> list = new ArrayList<Customer>();
        for (Customer c : customers) {
            if (c.getCardNumber() >= min && c.getCardNumber() <= max) {
                list.add(c);
            }
        }
        return list.toArray(new Customer[0]);
    }

}
