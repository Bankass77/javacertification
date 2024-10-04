package org.example.algortihme.interview.datastructures.linkedList;

/*
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 */
public class UnsortedLinkedList2 {

    /**
     * Supprime les doublons d'une liste chaînée non triée.
     *
     * @param head tête de la liste chaînée
     * @return ListeNode sans noeud en doublon
     */
    public ListNode removeDuplicateNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode cur = head;
        while (cur.next != null) {

            /* supprime tous les futures noeuds qui ont la même valeur */
            ListNode runner = cur;
            while (runner.next != null) {
                if (runner.next.val == cur.val) {
                    runner.next = runner.next.next;  // Supprime le doublon
                } else {
                    runner = runner.next;

                }
            }
            cur = cur.next; // Passe au prochain nœud
        }

        return head;
    }


    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        UnsortedLinkedList2 list = new UnsortedLinkedList2();
        // Créer une liste  : 1 -> 2 -> 2 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // Afficher la liste avant la suppression des doublons
        System.out.println("Avant suppression de noeud en doublon: ");
        printList(head);
        System.out.println("Après suppression de noeud en doublon: ");
        ListNode runner = list.removeDuplicateNode(head);
        printList(runner);
    }
}
