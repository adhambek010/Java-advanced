package org.example.generics;

public class DualGenericHolder<T,U> {
    T obj1;
    U obj2;

    public DualGenericHolder(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void display(){
        System.out.println(this.obj1);
        System.out.println(this.obj2);
    }

    public static void main(String[] args) {
        DualGenericHolder<Integer, String> dualGenericHolder = new DualGenericHolder<>(5, "Demo Code");
        dualGenericHolder.display();
    }
}
