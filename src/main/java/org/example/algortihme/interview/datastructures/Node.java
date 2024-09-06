package org.example.algortihme.interview.datastructures;

public class Node {
    private Node next;  // La référence vers le noeud suivant
    private int data; // Donnée contenue dans le noeud

    // Constructeur pour initialiser le noeud
    public Node(int d) {
        this.data = d;
        this.next= null; // Par defaut, le noeud suivant est null
    }

    /**
     * Méthode pour ajoute un nouveau noeud à la fin de la LinkedList
     * @param d valeur du node à ajouter
     */
    public void appendToTail(int d) {

        // On crée un nouveau Node
        Node end = new Node(d);
        Node n = this;   // Node actuel, Puis on parcours la liste jusqu'à trouver

        //On Parcour la liste jusqu'à la fin
        while (n.next != null) {
            n = n.next;  // Si le noeud suivant est non null, le noeud courant devient le noeud suivant
        }

        // ajout du nouveau noeud à la fin de la liste.
        n.next = end;
    }

    /**
     * Suppression de Node la LinkedList
     * @param head
     * @param d valeur du Node à supprimé
     * @return a LinkedList
     */
    public Node deleteNode(Node head, int d){
        Node n = head;
        if(n.data == d){
            return head.next;  // moved head
        }
        while(n.next != null){
            if(n.next.data == d){
                n.next = n.next.next;
                return head; //head didn't change
            }
            n = n.next;
        }
        return head;
    }
}
