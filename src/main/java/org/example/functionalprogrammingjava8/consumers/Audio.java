package org.example.functionalprogrammingjava8.consumers;

public class Audio {
    String title;
    String format;
    int size;

    public Audio(final String title, final String format, final int size) {
        this.title = title;
        this.format = format;
        this.size = size;
    }

    @Override
    public String toString() {

        return "Title:" + title + " , Format: " + format + " , Size: " + size;
    }
}
