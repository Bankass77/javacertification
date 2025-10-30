package org.example.java17.records.encapsulation;


// Pojo
public class Crane {

    // les champs ont package access level: int numbereggs, String name; puis encapsulé dans private afin de ne pas les rendre accessible à la modification
    private final int numbereggs;
    private final String name;

    public Crane(final int numbereggs, final String name) {

        if (numbereggs >= 0) {
            this.numbereggs = numbereggs;
        } else {
            throw new IllegalArgumentException();

        }
        this.name = name;
    }

    public int getNumbereggs() {
        return numbereggs;
    }

    public String getName() {
        return name;
    }
}
