package org.example.java17.chapter8.functions;

public class GpaRecord extends  Record{
    String subject;

    public GpaRecord(final String name, final String phoneNum, final int index, final String subject) {
        super(name, phoneNum, index);
        this.subject = subject;
    }

    @Override
    public String toString (){

        return   super.toString() + " , " +   " Fovoriste subject is the : "  + subject;
    }
}
