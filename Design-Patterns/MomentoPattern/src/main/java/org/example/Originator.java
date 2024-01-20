package org.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Originator {
    private String article;

    public void setArticle(String article) {
        System.out.println("From originator : Current Version of Article\n"+article+"\n");
        this.article = article;
    }

    public Memento storeInMemento() {
        System.out.println("From Originator : Saving to Memento");
        return new Memento(article);
    }
    public String restoreFromMemento(Memento memento){
        article = memento.getArticle();
        System.out.println("From Originator : Previous Article Saved in Memento\n"+article+"\n");
        return article;
    }
}
