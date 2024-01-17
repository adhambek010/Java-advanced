package org.example;

public class LazyBookParserProxy implements IBookParser{
    private BookParser parser;
    private String book;

    @Override
    public int getNumOfPages() {
        if(this.parser == null){
            parser = new BookParser(book);
            return this.parser.getNumOfPages();
        }else{
            return this.parser.getNumOfPages();
        }
    }
}
