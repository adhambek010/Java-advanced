package org.example.annotations;

import java.lang.reflect.Method;

public class MyClass {
    @MyCustAnnotation(value = 10)
    public void sayHello() {
        System.out.println("My custom annotation");
    }

    public static void main(String[] args) {
        MyClass h = new MyClass();
        Method methodVal = null;
        try {
            methodVal = h.getClass().getMethod("sayHello");
        } catch (NoSuchMethodException e) {

            e.printStackTrace();
        } catch (SecurityException e) {

            e.printStackTrace();
        }

        MyCustAnnotation annotation = methodVal.getAnnotation(MyCustAnnotation.class);
        System.out.println("value is : " + annotation.value());

    }
}
