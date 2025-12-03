package org.example.functionalprogrammingjava8.consumers;

public class Ebook {
    String title;
    int pages;
    int size;

    public Ebook(final String title, final int pages, final int size) {
        this.title = title;
        this.pages = pages;
        this.size = size;
    }

    @Override
    public String toString() {

        return "Title: " + title + " , Pages: " + pages + " , Size: " + size;
    }
}
