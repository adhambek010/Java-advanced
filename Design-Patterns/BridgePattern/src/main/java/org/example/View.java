package org.example;

import lombok.Getter;

@Getter
public abstract class View {
    private Resource resourse;

    public View(Resource resourse){
        this.resourse = resourse;
    }

    abstract String show();
}