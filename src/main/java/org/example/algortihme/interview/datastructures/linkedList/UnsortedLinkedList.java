package org.example.algortihme.interview.datastructures.linkedList;

import java.util.HashSet;

import org.example.algortihme.Node;

/*
Write code to remove duplicates from an unsorted linked list.
FOLLOW UP
How would you solve this problem if a temporary buffer is not allowed?
 */
public class UnsortedLinkedList {

    /**
     * Supprime les doublons d'une liste chaînée non triée.
     *
     * @param head tête de la liste chaînée
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> set = new HashSet<>();
        ListNode prev = null;
        ListNode cur = head;
        while (cur != null) {
            if (!set.contains(cur.val)) {
                set.add(cur.val);
                prev = cur; // met à jour le noeud précédent
            } else {
                // Si le nœud est un doublon, le supprimer
                prev.next = cur.next;
            }
            cur = cur.next; // Déplace le pointeur actuel
        }
        return head;  // Retourne la tête de la liste
    }

    // Méthode pour imprimer la liste
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        UnsortedLinkedList list = new UnsortedLinkedList();
        // Créer une liste  : 1 -> 2 -> 2 -> 4 -> 5
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        // Afficher la liste avant la suppression des doublons
        System.out.println("Avant suppression de noeud en doublon: ");
        printList(head);

        // Supprimer les doublons
        ListNode newListNode = list.removeDuplicateNodes(head);

        // Afficher la liste après la suppression des doublons
        System.out.println("Après suppression de noeud en doublon: ");
        printList(newListNode);
    }
}
