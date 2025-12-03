package org.example.functionalprogrammingjava8.collections.problem;

import java.time.LocalDate;
import java.util.ArrayList;

public class Licence {
    LocalDate expdate;
    String insurance;
    STATUS status;

    ArrayList<Vehicule> vehicules;

    public Licence( LocalDate expdate, String insurance, Vehicule...v) {
        this.expdate = expdate;
        this.insurance = insurance;
        status= STATUS.ACTIVE;
        this.vehicules =  new ArrayList<>();

        for (Vehicule r : v){

            vehicules.add(r);
        }
    }

    public Licence(LocalDate expdate, String insurance, STATUS status, ArrayList<Vehicule> vehicules) {
        this.expdate = expdate;
        this.insurance = insurance;
        this.status = status;
        this.vehicules = new ArrayList<>( vehicules);
    }

    public Licence( Licence l) {
        expdate= l.expdate;
        insurance= l.insurance;
        status= l.status;
        vehicules= new ArrayList<>(l.vehicules);
    }

    @Override
    public  String toString(){
        return  expdate + " " + insurance + " " + status  +  " " + vehicules;
    }
}
