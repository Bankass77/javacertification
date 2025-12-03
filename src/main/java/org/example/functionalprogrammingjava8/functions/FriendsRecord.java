package org.example.functionalprogrammingjava8.functions;

public class FriendsRecord extends  Record{

    String friends;

    public FriendsRecord(final String name, final String phoneNum, final int index, final String friends) {
        super(name, phoneNum, index);
        this.friends = friends;
    }
    @Override
    public String toString (){

        return   super.toString() + " , " + " Friends are :" + friends;
    }
}
