package org.example.algortihme;

import java.util.HashSet;
import java.util.Set;

/**
 * Cette classe fait parcours InOrder des nodes
 */
public class Node {
    private int value;
    private Node left;
    private Node right;

    // Set pour garder la trace des nœuds visités
    private Set<Node> visitedNode= new HashSet<>();

    public void inOrderTraversal( Node node){
        if( node !=null){
            inOrderTraversal(node.left);
            visit(node);
            inOrderTraversal(node.right);
        }
    }

    private void visit(final Node node) {
        if(!visitedNode.contains(node)){
            visitedNode.add(node); // Marquer comme visité

        }
    }
}
