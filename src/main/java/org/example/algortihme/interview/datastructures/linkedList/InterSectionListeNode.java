package org.example.algortihme.interview.datastructures.linkedList;

/*
Écris une fonction en Java pour trouver le nœud où deux listes chaînées se croisent. Si les deux listes ne se croisent
pas, retourne null
 */
public class InterSectionListeNode {

    /**
     * ne méthode pour trouver le nœud d’intersection en synchronisant les deux parcours de listes :
     * <p>
     * Utiliser deux pointeurs (p1 pour la liste A et p2 pour la liste B).
     * Lorsque l’un des pointeurs atteint la fin de sa liste, il commence à parcourir l’autre liste.
     * Cela permet aux deux pointeurs de "s'aligner" en termes de distance et de rencontrer le nœud d'intersection
     * (ou d'atteindre tous les deux null si les listes ne se croisent pas).
     *
     * @param headA tête de première liste chaînée
     * @param headB tête de la deuxième liste chaînée
     * @return le noeud d'intersection entre les 2 listes chaînées
     */
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) {
            return null;
        }
        ListNode p1 = headA;
        ListNode p2 = headB;

        while (p1 != p2) {

            // si p1 atteint la fin de la première liste chaînée , on le reinitialise à headB
            p1 = (p1 == null) ? headB : p1.next;

            // si p2 atteint la fin de la deuxième liste chaînée , on le reinitialise à headA
            p2 = (p2 == null) ? headA : p2.next;

        }
        //Explication :
        //Pointeurs p1 et p2 : Les deux commencent à parcourir respectivement headA et headB.
        //Synchronisation : Si p1 atteint la fin de la liste A, il se réinitialise à la tête de la liste B,
        // et vice versa pour p2.
        //Intersection : Si les listes se croisent, les deux pointeurs se rencontreront au nœud d'intersection. Sinon,
        // les deux finiront par devenir null après avoir parcouru les deux listes en entier.


        // On retourne soit le noeud d'intersection ou soit null s'il n' y a pas d'intersection.
        return p1;
    }

    public static void main(String[] args) {
        InterSectionListeNode interSectionListeNode = new InterSectionListeNode();
        // Créer la liste A : 1 -> 2 -> 3 -> 4 -> 5
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);
        headA.next.next.next = new ListNode(4);
        headA.next.next.next.next = new ListNode(5);
        // Créer la liste B : 6 -> 4 -> 5 (intersection à partir du nœud 4)

        ListNode headB = new ListNode(6);
        headB.next = headA.next.next.next; // Intersection au nœud avec la valeur 4
        ListNode intersection = interSectionListeNode.getIntersectionNode(headA, headB);
        if (intersection != null) {
            System.out.println("Intersection trouvée au nœud avec la valeur : " + intersection.val);
        } else {
            System.out.println("Pas d'intersection.");
        }
    }
}
