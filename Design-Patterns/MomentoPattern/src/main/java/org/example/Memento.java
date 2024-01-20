package org.example;

import lombok.Getter;

@Getter
public class Memento {
    private String article;

    public Memento(String article) {
        this.article = article;
    }
}