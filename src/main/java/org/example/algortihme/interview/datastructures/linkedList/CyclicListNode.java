package org.example.algortihme.interview.datastructures.linkedList;

/*
Écris une fonction Java pour vérifier si une liste chaînée contient un cycle.
 */
public class CyclicListNode {

    /**
     * @param head le premier dans la liste chaînée
     * @return true si la liste chaînée contient un cycle, sinon false
     */
    public boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            // Si la liste est vide ou contient un seul élément, pas de cycle
            return false;
        }
        ListNode slow = head;  // pointeur lent (slow) qui avance d'un  noeud à chaque fois
        ListNode fast = head;   // pointeur rapide(fast) qui avance de 2 noeuds à chaque fois.
        while (fast != null && fast.next != null) {
            slow = slow.next; // avance d'un noeud
            fast = fast.next.next; // avance de 2 noeuds
            if (slow == fast) {
                return true;  // cycle detecter
            }
        }
        return false; // pas de cycle
    }
}
