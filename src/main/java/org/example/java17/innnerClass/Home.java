package org.example.java17.innnerClass;

import javax.sound.midi.SysexMessage;


// déclaration  classe interne d'instance
public class Home {

    private String greeting = "Hi!";  // variable d'instance classe externe à la classe interne

    // Déclaration Classe interne
    protected class Room {
        public int repeat = 3;

        public void enter() {

            for (int i = 0; i < repeat; i++) {

                greet(greeting);
            }
        }

        private void greet(final String message) {

            System.out.println(message);
        }
    }

    // Methode d'instance de la classe externe
    public void enterRoom() {
        var room = new Room();    // création d'une instance de la classe interne
        room.enter();

    }


    public static void main(String[] args) {
        var home = new Home();  // Création d'une instance de la classe externe
        home.enterRoom();

        Room room = home.new Room();  // crée une instance de la classe imbriquée.
        room.enter();

        // on peut resumer la ligne 37-40 à:

        new Home().new Room().enter();
    }
}



