package org.example.algortihme.interview.greedyalgorithm;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AcitivitySelection {
    /**
     * @param activities liste d'activités
     * @return le nombre maximum d'activités non conflictuelle qui peuvent  être effectuées Spar une seulepersonne
     */
    public static int findNonConflictingActivitiesLength(List<Activity> activities) {

        //On trie les activités par ordre croissant de leur heure de début
        Collections.sort(activities, Comparator.comparingInt(activity -> activity.start));

        // L[i] stocke le nombre maximum d'activités non conflictuelles se terminant à la ième activité.

        int[] L = new int[activities.size()];
        for (int i = 0; i < activities.size(); i++) {
            //considérons que chaque j est plus pétit que i
            for (int j = 0; j < i; j++) {
                //L[i]= Math.max(L[j]), où activities[j].finish est plus pétit que activities[i].start
                if (activities.get(j).finish < activities.get(i).start && L[i] < L[j]) {
                    L[i] = L[j];
                }
            }
            // incrémente L[i] puisqu'il se termine à la ième activité
            L[i]++;
        }

        //Return le maximun d'activités dans la liste
        return Arrays.stream(L).max().getAsInt();
    }
}
