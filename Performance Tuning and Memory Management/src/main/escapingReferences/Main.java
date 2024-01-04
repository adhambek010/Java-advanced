package main.escapingReferences;

import main.escapingReferences.customeImplementation.Customer;
import main.escapingReferences.customers.CustomerRecords;
import main.escapingReferences.customers.ReadOnlyCustomer;

public class Main {

    public static void main(String[] args) {
        CustomerRecords records = new CustomerRecords();

        records.addCustomer(new Customer("John"));
        records.addCustomer(new Customer("Simon"));

        ReadOnlyCustomer cust = records.findCustomer("John");
        Customer customer = (Customer) cust;
        customer.setName("Jane");
        //records.getCustomers().clear();

        for (Customer next : records.getCustomers().values()) {
            System.out.println(next);
        }
        System.out.println(records.findCustomer("John"));
        /*

        for (Customer temp : records){
            System.out.println(temp);
        }

        Iterator<Customer> it = records.iterator();
        it.next();
        it.remove();

        System.out.println();
        for (Customer temp : records){
            System.out.println(temp);
        }*/
    }

}
