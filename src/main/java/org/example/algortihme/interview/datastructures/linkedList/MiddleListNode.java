package org.example.algortihme.interview.datastructures.linkedList;

/*
Implement an algorithm to delete a node in the middle (i.e., any node but
the first and last node, not necessarily the exact middle) of a singly linked list, given only access to
that node.
EXAMPLE
Input:the node c from the linked list a->b->c->d->e->f
Result: nothing is returned, but the new linked list looks like a->b->d- >e- >f
 */
public class MiddleListNode {

    /**
     * @param n noeud à supprimer
     * @return true si le noeud a été supprimé
     */
    public boolean deleteNode(ListNode n) {

        // Vérifiez si le nœud est nul ou s'il s'agit du dernier nœud
        if (n == null || n.next == null) {
            return false; // Échec de la suppression
        }

        // Référence au nœud suivant
        ListNode current = n.next;

        // Remplacez la valeur du nœud à supprimer par celle du nœud suivant
        n.val = current.val;

        // Mettez à jour le lien pour sauter le nœud suivant
        n.next = current.next;

        // Réussite de la suppression
        return true;
    }

    // Méthode pour imprimer la liste chaînée
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print((char) current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        // Créer une liste chaînée : a -> b -> c -> d -> e -> f
        ListNode head = new ListNode('a'); // Node 1
        head.next = new ListNode('b');      // Node 2
        ListNode nodeToDelete = new ListNode('c'); // Node 3 (à supprimer)
        head.next.next = nodeToDelete;      // Node 3
        head.next.next.next = new ListNode('d'); // Node 4
        head.next.next.next.next = new ListNode('e'); // Node 5
        head.next.next.next.next.next = new ListNode('f'); // Node 6

        // Imprimer la liste avant la suppression
        System.out.println("Liste avant la suppression :");
        printList(head);

        // Créer une instance de MiddleListNode
        MiddleListNode middleListNode = new MiddleListNode();

        // Appeler deleteNode sur le nœud à supprimer (nodeToDelete)
        middleListNode.deleteNode(nodeToDelete);

        // Imprimer la liste après la suppression
        System.out.println("Liste après la suppression :");
        printList(head);
    }
}
