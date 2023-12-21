package com.java.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Data{
    private String name;

    public Data() {

    }

    public Data(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }
    @Override
    public String toString() {
        return "Data {" +
                " name= '" + name + '\'' +
                '}';
    }
}
public class IntroLambda2 {
    public static void main(String[] args) {
        List<Data> dataList = new ArrayList<>();

        dataList.add(new Data("Yunus"));
        dataList.add(new Data("Diyor"));
        dataList.add(new Data("Turabek"));
        dataList.add(new Data("Adkham"));
        dataList.add(new Data("Jamshid"));
        dataList.add(new Data("Aziz"));
        dataList.add(new Data("John"));

        dataList.sort((obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
        for (Data temp : dataList){
            System.out.println(temp);
        }

    }
}
