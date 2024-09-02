
package org.example.algortihme.interview.testInterviewQuestions;

import java.util.LinkedList;

public class ShalllowCopyDemo {
    public static void main(String[] args) throws CloneNotSupportedException {
        LinkedList<Player> players1 = new LinkedList<>();

        Player p1 = new Player();
        p1.setBattingAverage(46.7f);
        p1.setWorldRank(4);

        Player p2 = new Player();
        p2.setBattingAverage(56.9f);
        p2.setWorldRank(1);

        players1.add(p1);
        players1.add(p2);

        LinkedList<Player> players2 = new LinkedList<>();
        for (Player p : players1) {
            players2.add(p);
        }

        players2.get(0).setWorldRank(5);
    }
}
