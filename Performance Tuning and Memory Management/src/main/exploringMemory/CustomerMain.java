package main.exploringMemory;

public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new Customer("Sally");
        renameCustomer(customer);
        System.out.println(customer.getName());
        final Customer customer2 = new Customer("John");
        System.out.println(customer2.getName());
    }

    public static void renameCustomer(Customer cust) {
        cust.setName("Diane");
        return;
    }

    public static void renameFinal(Customer customer) {
        customer.setName("Susan");
    }
}
