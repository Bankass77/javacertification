package org.example.functionalprogrammingjava8.consumers;

public class DVD {
    String title;
    String compagny;
    int size;

    public DVD(final String title, final String compagny, final int size) {
        this.title = title;
        this.compagny = compagny;
        this.size = size;
    }

    @Override
    public String toString(){

        return  "Title: " + title + " , Compagny :" + compagny + " , Size :" + size;
    }
}
