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
public class TreeNode {
   private int val;
   private TreeNode left;
   private TreeNode right;
   private TreeNode parent;
   public TreeNode(int val) {
       this.val = val;
       this.left = null;
       this.right = null;
       this.parent = null;
   }

    /**
     * Cette méthode trouve le successeur en ordre d'un noeud
     * @param treeNode
     * @return le node successeur en ordre d'un noeud
     */
    public TreeNode findSuccessor( TreeNode treeNode){

        if( treeNode == null){
            return null;
        }
        //cas le node à un enfant droit
        if( treeNode.right != null){
            return findMin(treeNode.right);
        }

        // cas où le node n'a pas d'enfant droit
        TreeNode parent = treeNode.parent;
        if( parent != null && treeNode == parent.right){
            treeNode = parent;
            parent = parent.parent;
        }
        return parent;
    }

    /**
     * Cette méthode trouve le noeud ayant la plus pétite valeur(le plus à gauche) dans un sous arbre donné.
     * @param treeNode
     * @return
     */
    private TreeNode findMin( TreeNode treeNode) {
        while( treeNode.left !=null){
            treeNode = treeNode.left;
        }
        return treeNode;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        TreeNode node5 = new TreeNode(5);
        TreeNode node30 = new TreeNode(30);
        TreeNode node22 = new TreeNode(22);
        TreeNode node35 = new TreeNode(35);

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
        TreeNode successor = root.findSuccessor(root);
        if( successor != null){
            System.out.println("le successeur en ordre est : "+successor.val);
        }else {
            System.out.println("le node n'a pas de successeur en ordre est");
        }
    }
}
