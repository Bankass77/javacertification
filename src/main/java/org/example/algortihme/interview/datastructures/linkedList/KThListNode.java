package org.example.algortihme.interview.datastructures.linkedList;

/*
Return Kth to Last: Implement an algorithm to find the kth to last element of a singly linked list.
 */
public class KThListNode {


    /**
     * Retourne le kème nœud depuis la fin d'une liste chaînée.
     *
     * @param head Tête de la liste chaînée
     * @param k Position à partir de la fin
     * @return Le kème ListNode depuis la fin
     */
    public ListNode printKthToLast(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode p1 = head;
        ListNode p2 = head;

        //Fais avancer le premier pointeur (p1) de k nœuds.
      for (int i = 1; i < k; i++ ) {
          if (p1 == null) {
              return null; //Si k est plus grand que la longueur de la liste
          }
          p1 = p1.next;
      }

      //Ensuite, fais avancer les deux pointeurs (p1 et p2) ensemble jusqu'à ce que p1 atteigne la fin de la liste.
      //Quand p1 atteint la fin, p2 sera positionné sur le kème élément à partir de la fin.
        while (p1 != null) {
          p1 = p1.next;
          p2 = p2.next;
      }
        // p2 est maintenant au kème nœud depuis la fin
      return p2;
    }

    public static void main(String[] args) {
        KThListNode kthListNode = new KThListNode();
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        // Chercher le 2ème nœud à partir de la fin
        ListNode result = kthListNode.printKthToLast(head, 2);
        if (result != null) {
            System.out.println("Le 2ème nœud depuis la fin a la valeur : " + result.val);
        } else {
            System.out.println("Le nœud n'existe pas.");
        }
    }
}
