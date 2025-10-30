package org.example.java17.records.records;


// exemple long constructor et implementation de l'interface par le record, Attention le contructeur canonique et compact ne peuvent pas être déclaré dans le même record
public final record Crane(int numberEggs, String name) implements Bird {


    private static  int type= 10;
  /*  public  int size;  // Ne compile pas
    private boolean friendly; // ne compile pas*/
    // Constructeur canonique

    public Crane(int numberEggs, String name) {

        if (numberEggs < 0) {
            throw new IllegalArgumentException();
        }
        this.numberEggs = numberEggs;
        this.name = name;
    }

    @Override
    public int numberEggs() {
        return 10;
    }

    @Override
    public String name() {
        return "Abdoulaye";
    }

    @Override
    public String toString() {
        return name;
    }

    /*public Crane{

        if ( name == null || name.length() <1 ){
            throw  new IllegalArgumentException();

        }
        if ( numberEgges <0) throw  new IllegalArgumentException();

        name= name.substring(0, 1).toUpperCase();
        name= name.substring(1).toLowerCase();

    }
*/


    // Constructeur surchargé
  /*  public Crane(String firstName, String lastName) {
        this(0, firstName + " " + lastName);
    }*/
    // Constructeur surchargé
   /* public Crane(int numberEggs, String firstName, String lastName) {
      this(numberEggs +1, firstName + " " + lastName);
        numberEggs = 10; // pas d'effect (car au paramètre, pas au champ d'instance
        this.numberEggs= 20; // ne compile pas
    }*/

   /* public Crane(String name){
        this(1); // ne compile pas
    }
*/
  /*
    public Crane(int numberEggs){
        this(""); // ne compile pas
    }*/
}
