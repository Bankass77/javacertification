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

    public static void main(String[] args) {
        // Créer une liste sans cycle : 1 -> 2 -> 3 -> 4 -> 5
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        head1.next.next.next.next = new ListNode(5);
        // Tester la liste sans cycle
        System.out.println("Liste sans cycle : " + new CyclicListNode().hasCycle(head1));

        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        head2.next.next.next = new ListNode(4);
        head2.next.next.next.next = new ListNode(5);
        head2.next.next.next.next.next = head2.next; // Cycle vers le noeud 2

        int counter = 0;
        int maxIterations = 1;  // Limite arbitraire pour éviter une boucle infinie
        while (head2.next != null && counter < maxIterations) {
            System.out.println("Liste avec cycle " + new CyclicListNode().hasCycle(head2));
            head2 = head2.next;
            counter++;
        }
    }
}
