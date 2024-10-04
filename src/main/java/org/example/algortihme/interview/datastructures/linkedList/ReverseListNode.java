package org.example.algortihme.interview.datastructures.linkedList;

/*
Write a Java function to reverse a singly linked list.
 */
public class ReverseListNode {

    /**
     * à chaque étape, tu veux inverser le lien entre le nœud courant (curr) et le nœud précédent (prev)
     *
     * @param head tête de la liste chaînée
     * @return une liste chaînée inversée.
     */
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // créer 2 pointeurs prev et curr
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // stocker le prochain noeud
            curr.next = prev;           // inverser le lien curr.next vers prev
            prev = curr;                // déplacer  prev à curr
            curr = next;                // déplacer curr à next
        }

        //prev devient la nouvelle tête de la liste inversée,
        // car il pointe sur le nœud qui était à la fin de la liste avant l'inversion
        return prev;  // le nouveau head de la liste inversée.
    }
}
