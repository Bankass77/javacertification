package org.example.algortihme.interview.testInterviewQuestions;

/**
 * Un arbre est composé de noeuds qui respectent les règles suivantes :
 * Un noeud tient une valeur correspondant à un entier. Hormis le noeud à la racine de l’arbre,
 * un noeud a toujours un seul autre noeud qui le référence. Un noeud n’a pas plus de deux enfants,
 * appelés noeud à gauche et noeud à droite. Si un noeud n’a pas d’enfant à droite ou à gauche,
 * alors la référence correspondante est null . La valeur tenue par tout enfant du sous arbre à gauche
 * est inférieure à la valeur de son parent et la valeur tenue par tout enfant du sous arbre à droite
 * est supérieure à la valeur de son parent. Voici un exemple d’arbre qui respecte ces règles (la racine vaut 9) :  Fig. 1
 *
 * Pour simplifier le code, tout est combiné dans une simple classe nommée Node . La hauteur de l’ arbre (la distance entre le noeud le plus éloigné et la racine) est comprise entre 0 et 100 000 noeuds. Question : Implémentez une nouvelle méthode de Node v tenant la valeur . Si ce noeud n’existe pas alors find nommée find(int v) devra retourner .  qui retourne le noeud null Important : privilégier un faible usage de la mémoire RAM. Pour tester votre algorithme, vous pouvez vous exercer à partir de deux exemples d’arbres : L’arbre présenté ci-dessus (Fig. 1) : la variable Essayez de small noeud racine. Un arbre d’une hauteur de 100 000 noeuds :
 * la variable large correspond au  correspond au noeud racine, sachant que le noeud le plus éloigné tient la valeur .
 */
public class Node2 {

    int value;

    Node2 left;

    Node2 right;

    public Node2(int value) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Node2 find(int v) {
        // Si la valeur du nœud actuel est égale à v, retourner ce nœud
        if(this.value == v) {
            return this;
        }

        // Si v est inférieur à la valeur du nœud actuel, chercher dans le sous-arbre gauche
        if(v < this.value && this.left != null) {
            return this.left.find(v);
        }

        // Si v est supérieur à la valeur du nœud actuel, chercher dans le sous-arbre droit
        if(v > this.value && this.right != null) {
            return this.right.find(v);
        }

        // Si le nœud n'a pas été trouvé dans l'arbre, retourner null
        return null;
    }

    public static void main(String[] args) {
        // Exemple d'utilisation
        // Construction de l'arbre de l'exemple (Fig. 1)
        Node2 root = new Node2(9);
        root.left = new Node2(5);
        root.right = new Node2(12);
        root.left.left = new Node2(3);
        root.left.right = new Node2(7);
        root.right.left = new Node2(10);
        root.right.right = new Node2(15);

        // Test de la méthode find sur l'arbre small
        System.out.println(root.find(7) != null ? root.find(7).value : "Node not found"); // Devrait imprimer 7
        System.out.println(root.find(14) != null ? root.find(14).value : "Node not found"); // Devrait imprimer "Node not found"

        // Construction d'un arbre large (hauteur 100 000)
        Node2 large = new Node2(0);
        Node2 current = large;
        for(int i = 1; i <= 100000; i++) {
            current.right = new Node2(i);
            current = current.right;
        }

        // Test de la méthode find sur l'arbre large
        System.out.println(large.find(100000) != null ? large.find(100000).value : "Node not found"); // Devrait imprimer 100000
        System.out.println(large.find(100001) != null ? large.find(100001).value : "Node not found"); // Devrait imprimer "Node not found"
    }

}
