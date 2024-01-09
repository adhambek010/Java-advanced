package main.softleaks;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Customer> customers = new ArrayList<>();
        while (true){
            Customer customer = new Customer("Matt");
            customers.add(customer);
            if (customers.size() >= 10000){
                for (int i = 0; i < 5000; i++){
                    customers.remove(0);
                }
            }
        }
    }
}
