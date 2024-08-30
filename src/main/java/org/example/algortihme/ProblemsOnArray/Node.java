package org.example.algortihme.ProblemsOnArray;

/**
 * Given a node in a binary search tree, return the next bigger element, also known as the inorder successor.
 *
 * For example, the inorder successor of 22 is 30.
 *
 *    10
 *   /  \
 *  5    30
 *      /  \
 *    22    35
 * You can assume each node has a parent pointer.
 */
public class Node {
   private int val;
   private Node left;
   private Node right;
   private Node parent;
   public Node(int val) {
       this.val = val;
       this.left = null;
       this.right = null;
       this.parent = null;
   }

    /**
     * Cette méthode trouve le successeur en ordre d'un noeud
     * @param node  le Node successeur
     * @return le node successeur en ordre d'un noeud
     */
    public Node findSuccessor(Node node){

        if( node == null){
            return null;
        }
        //cas le node à un enfant droit
        if( node.right != null){
            return findMin(node.right);
        }

        // cas où le node n'a pas d'enfant droit
        Node parent = node.parent;
        if( parent != null && node == parent.right){
            parent = node;
            parent = parent.parent;
        }
        return parent;
    }

    /**
     * Cette méthode trouve le noeud ayant la plus pétite valeur(le plus à gauche) dans un sous arbre donné.
     * @param node à chercher.
     * @return Node qui possède la plus petite valeur.
     */
    private Node findMin(Node node) {
        while( node.left !=null){
            node = node.left;
        }
        return node;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node node5 = new Node(5);
        Node node30 = new Node(30);
        Node node22 = new Node(22);
        Node node35 = new Node(35);

        //Construction de l'arbre
        root.left = node5;
        root.right = node30;

        // Parent des premiers nodes enfants
        node5.parent = root;
        node30.parent = root;

        // nodes enfants
        node30.left = node22;
        node30.right = node35;

        // Recherche du successeur de 22 (le résultat attendu est 30)
        Node successor = root.findSuccessor(root);
        if( successor != null){
            System.out.println("le successeur en ordre est : "+successor.val);
        }else {
            System.out.println("le node n'a pas de successeur en ordre est");
        }
    }
}
