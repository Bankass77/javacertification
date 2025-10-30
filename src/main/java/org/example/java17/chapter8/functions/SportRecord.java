package org.example.java17.chapter8.functions;

public class SportRecord extends  Record{

    String team;

    public SportRecord(final String name, final String phoneNum, final int index, final String team) {
        super(name, phoneNum, index);
        this.team = team;
    }

    @Override
    public String toString (){

        return   super.toString() + " , " +  " Fovoriste team is the : " + team;
    }
}
