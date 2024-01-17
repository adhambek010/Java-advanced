package org.example;

public abstract class Record {
    public void  save(){
        this.validate();
    }

    public void validate(){

    }
    public void beforeSave(){

    }
}