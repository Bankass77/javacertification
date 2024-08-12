package org.example.algortihme.interview.divideConquer;

/*
Trouver le nombre de rotations dans un tableau trié circulairement
Étant donné un tableau d'entiers trié circulairement, trouvez le nombre total de rotations du tableau. Supposons qu'il n'y ait pas de doublons dans le tableau et que la rotation se fasse dans le sens inverse des aiguilles d'une montre.

Par exemple,

Entrée : nums = [8, 9, 10, 2, 5, 6]
Sortie : Le tableau est tourné 3 fois

Entrée : nums = [2, 5, 6, 8, 9, 10]
Sortie : Le tableau est tourné 0 fois

Analysons attentivement le problème, nous pouvons voir que le nombre total de rotations
est égal au nombre total d'éléments avant l'élément minimum, ou à l'index de l'élément minimum.

Une solution simple serait d'exécuter une recherche linéaire dans le tableau et de trouver l'index de l'élément minimum.
 Le problème avec cette approche est que sa complexité temporelle dans le pire des cas est O(n), où n est la taille de l'entrée.
Cette solution ne tire pas non plus parti du fait que l'entrée est triée circulairement.

Nous pouvons facilement résoudre ce problème en O(log(n)) en modifiant l'algorithme de recherche binaire.
Nous avons déjà réduit le problème pour trouver le premier élément de la séquence triée.
Le premier élément (Pivot) a une propriété spéciale (appelons cela la propriété du pivot) :
les éléments suivant et précédent du pivot sont tous les deux plus grands que lui.
 Aucun autre élément du tableau n'aura cette propriété à l'exception de l'élément pivot.
 Puisque le tableau est trié circulairement,

Si le pivot est le dernier élément, alors le premier élément sera considéré comme son élément suivant.
Si le pivot est le premier élément, alors le dernier élément sera considéré comme son élément précédent.
Nous savons que l'élément du milieu divise toujours le tableau en deux sous-tableaux,
et l'élément pivot ne peut se trouver que dans une de ces moitiés.
Il est important de noter qu'au moins un de ces sous-tableaux sera toujours trié.
Si l'élément du milieu se trouve être le point de rotation (l'élément minimum),
 alors les sous-tableaux gauche et droit sont triés. Cependant, dans tous les cas,
 une moitié (sous-tableau) doit être triée, et nous utiliserons cette propriété
 pour écarter la moitié gauche ou droite à chaque itération de la recherche binaire.
 */
public class findRotationCountSolution {

    // Fonction pour trouver le nombre total de fois que le tableau est tourné
    public static int findRotationCount(int[] arr) {

        // l'espace de recherche est arr[left...right]
        int left =0;
        int right = arr.length - 1;

        // boucle jusqu'à ce que l'espace de recherche soit épuisé
        while (left <= right){

            // si l'espace de recherche est déjà trié, nous avons
            // trouvé l'élément minimum (à l'index `left`)
            // Si le sous-tableau est déjà trié, retourner l'index le plus à gauche
            if( arr[left] <= arr[right]){
                return left;
            }

            int mid = (left + right)/2;

            // Trouver l'élément suivant et l'élément précédent de l'élément `mid`.
            // (de manière circulaire)
            int next = (mid +1) % arr.length;
            int prev= (mid - 1 + arr.length) % arr.length;

            /*
            int next = (mid + 1) % arr.length;
            Cela calcule l'index suivant après mid. Si mid est à la fin du tableau, c'est-à-dire mid = arr.length - 1,
            alors (mid + 1) serait égal à nums.length. En utilisant le modulo %, cela ramène l'index à 0, donc next sera 0,
            ce qui correspond au premier élément du tableau.
            int prev = (mid - 1 + arr.length) % arr.length;

            Cela calcule l'index précédent avant mid. Si mid est au début du tableau, c'est-à-dire mid = 0,
            alors (mid - 1) serait égal à -1. Pour éviter un index négatif, nous ajoutons arr.length avant d'appliquer le modulo.
            Ainsi, (-1 + arr.length) % arr.length ramène l'index à arr.length - 1, ce qui correspond au dernier élément du tableau.
             */

            // Vérifier si le mid est le pivot
            // si l'élément `mid` est inférieur à son voisin et à son voisin précédent, il est l'élément minimum du tableau.
            // voisin, il s'agit de l'élément minimum du tableau
            if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
                return mid;
            }
            // Décider de chercher dans la moitié gauche ou droite
            // si nums[mid...right] est trié et que `mid` n'est pas l'élément minimum,
            // alors l'élément pivot ne peut pas être présent dans nums[mid...right],
            // écarter nums[mid...right] et chercher dans la moitié gauche
            else if( arr[mid] <= arr[right]) {
                right = mid - 1;
                
            }// si nums[left...mid] est trié, alors l'élément pivot ne peut pas être présent
            // dans celui-ci ; écarter nums[left...mid] et chercher dans la moitié droite
            else {
                left = mid +1;
            }
        }
        return -1;// Cela ne devrait jamais arriver si le tableau est correctement circulairement trié
    }

    public static void main(String[] args) {
        int[] nums = { 8, 9, 10, 1, 2, 3, 4, 5, 6, 7 };

        System.out.println("Le tableau est tourné " + findRotationCount(nums) + " fois");
    }
}
