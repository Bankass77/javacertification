package org.example.algortihme.ProblemsOnArray;

/*
 • Approach 2: Using Array Indices.
 • Nous pouvons résoudre ce problème avec un espace constant.
  Puisque le tableau contient tous les éléments distincts sauf un
  et tous les éléments se situent dans la plage de 1 à n-1,
  nous pouvons vérifier la présence d'un élément en double en marquant
  les éléments du tableau comme négatifs en utilisant l'index du tableau comme clé.
 • Pour chaque élément du tableau nums[i], nous inversons le signe de l'élément présent à l'index nums[i].
  Enfin, parcourez à nouveau le tableau, et si un nombre positif est trouvé à l'index i, alors l'élément en double est i.
  L'approche ci-dessus nécessite deux parcours du tableau. Nous pouvons obtenir le même résultat en un seul parcours.
  • Pour chaque élément du tableau nums[i], inversez le signe de l'élément présent à l'index nums[i] s'il est positif ;
  sinon, si l'élément est déjà négatif, c'est qu'il est en double.
 */
public class FindDuplicateElementArrayII {

    public static int findDuplicate(int[] array) {
        int duplicate = -1;
        for(int value: array){
            int val = value <0 ? -value : value;

            // Rendre négatif l'élément à l'index `val` s'il est positif
            if( array[val] >=0){
                array[val] = - array[val];
            }else {
                duplicate = val;
                break;
            }
        }
        // Restaurer le tableau original avant de retourner
        for( int i=0; i<array.length; i++){

            // Rendre positifs les éléments négatifs
            if(array[i] <0){
                array[i] = -array[i];
            }
        }

        return duplicate;
    }

    public static void main(String[] args) {
        int [] nums= { 1, 2, 3, 4, 2 };
       System.out.println("L'élément en double est: "+findDuplicate(nums));
    }
}
