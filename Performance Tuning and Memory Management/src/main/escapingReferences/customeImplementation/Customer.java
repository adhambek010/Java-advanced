package main.escapingReferences.customeImplementation;


import main.escapingReferences.customers.ReadOnlyCustomer;

public class Customer implements ReadOnlyCustomer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    public Customer(@org.jetbrains.annotations.NotNull Customer customer){
        this.name = customer.getName();
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

}
