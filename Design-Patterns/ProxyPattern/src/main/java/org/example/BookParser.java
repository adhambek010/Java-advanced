package org.example;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BookParser implements IBookParser{

    private int numberOfPages;
    private String book;

    public BookParser(String book) {
        this.book = book;
    }

    @Override
    public int getNumOfPages() {
        return numberOfPages;
    }
}