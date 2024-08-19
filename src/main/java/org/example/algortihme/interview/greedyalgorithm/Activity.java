package org.example.algortihme.interview.greedyalgorithm;


import java.util.Arrays;
import java.util.List;

import static org.example.algortihme.interview.greedyalgorithm.AcitivitySelection.findNonConflictingActivitiesLength;

//cette classe stock le debut et la fin d'une activité
public class Activity {
    public final int start;  // la propriété start, heure de début de l'activité
    public final int finish; // la propriété finish, heure de fin de l'activité

    // Construit une nouvelle activité avec les valeurs spécifiées
    private Activity(int start, int finish) {
        this.start = start;
        this.finish = finish;
    }

    //Méthode factory, créant une instance immutable d'Activity
    public static Activity of(int a, int b) {
        //appel du constructeur privé
        return new Activity(a, b);
    }

    public static void main(String[] args) {
        // Each pair stores the start and the finish time of a activity
        List<Activity> activities = Arrays.asList(
                Activity.of(1, 4), Activity.of(3, 5), Activity.of(0, 6),
                Activity.of(5, 7), Activity.of(3, 8), Activity.of(5, 9),
                Activity.of(6, 10), Activity.of(8, 11), Activity.of(8, 12),
                Activity.of(2, 13), Activity.of(12, 14)
        );

        System.out.println("The maximum number of non-conflicting activities is "
                + findNonConflictingActivitiesLength(activities));
    }
}
