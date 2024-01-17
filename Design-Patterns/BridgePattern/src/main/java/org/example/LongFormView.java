package org.example;

public class LongFormView extends View{
    private Resource resourse;
    public LongFormView(Resource resource) {
        super(resource);
        this.resourse = resource;
    }

    @Override
    String show() {
        return resourse.snipped();
    }
}
