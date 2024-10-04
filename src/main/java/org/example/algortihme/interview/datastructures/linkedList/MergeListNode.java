package org.example.algortihme.interview.datastructures.linkedList;

/*
Écris une fonction qui fusionne deux listes chaînées triées en une seule liste triée.
 */
public class MergeListNode {

    /**
     * @param l1 première liste chaînée
     * @param l2 deuxième liste chaînée
     * @return une liste chaînée fusionnée mergeHead
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {

        // Si l'une des listes est nulle, retourner l'autre liste
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        // Créer une nouvelle tête pour la liste fusionnée
        ListNode mergedHead;

        // Déterminer la tête de la liste fusionnée
        if (l1.val < l2.val) {
            mergedHead = l1;  // l1 est plus petit
            mergedHead.next = mergeTwoLists(l1.next, l2);
        } else {
            mergedHead = l2;  // l2 est plus petit
            mergedHead.next = mergeTwoLists(l1, l2.next);

        }
        return mergedHead;  // Retourner la tête de la liste fusionnée.
    }

    // Méthode pour imprimer la liste chaînée
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        MergeListNode mergeListNode = new MergeListNode();

        // Créer deux listes triées : 1 -> 3 -> 5 et 2 -> 4 -> 6
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        // Fusionner les deux listes
        ListNode mergedList = mergeListNode.mergeTwoLists(l1, l2);

        // Afficher la liste fusionnée
        System.out.println("Liste fusionnée : ");
        printList(mergedList);
    }

}
