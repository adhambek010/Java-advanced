package org.example;

public class Client {
   private Target target;

    public Client(){
        target = new Adapter(new Adapte());
    }

    public void request(){
       target.request();
    }
}