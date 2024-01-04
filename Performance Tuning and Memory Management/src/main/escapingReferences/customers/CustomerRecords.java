package main.escapingReferences.customers;

import main.escapingReferences.customeImplementation.Customer;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CustomerRecords implements Iterable<Customer> {
    private Map<String, Customer> records;

    public CustomerRecords() {
        this.records = new HashMap<String, Customer>();
    }

    public void addCustomer(Customer c) {
        this.records.put(c.getName(), c);
    }

    public Map<String, Customer> getCustomers() {
        //return new HashMap<>(this.records);
        //return Collections.unmodifiableMap(records);
        return Map.copyOf(records);
    }

    @Override
    public Iterator<Customer> iterator() {
        return records.values().iterator();
    }

    public ReadOnlyCustomer findCustomer(String name){
        return new Customer(records.get(name));
    }
}
