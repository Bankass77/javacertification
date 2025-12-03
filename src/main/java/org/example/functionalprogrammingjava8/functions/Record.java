package org.example.functionalprogrammingjava8.functions;

public abstract class Record {

    String name;
    String phoneNum;
    int index;

    public Record(final String name, final String phoneNum, final int index) {
        this.name = name;
        this.phoneNum = phoneNum;
        this.index = index;
    }

    @Override
    public String toString() {

        return  "name: " + name + " , " +  "phone number :" + phoneNum ;
    }
}
