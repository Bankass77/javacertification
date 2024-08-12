/*Implémentez la fonction average(table) .
* La fonction doit renvoyer la valeur moyenne du tableau table donné en paramètre.
*table est toujours un tableau défini, et ne contient que des nombres.
* average doit retourner 0 si table est vide. */
function average(array) {
    // Si le tableau est vide, retourner 0
    if (array.length === 0) {
        return 0;
    }
    // Initialiser la variable pour la somme des éléments du tableau
    let somme = 0;
    // Parcourir chaque élément du tableau et ajouter sa valeur à sum
    for (let element of array) {
        somme += element;
    }
    // Calculer la moyenne en divisant la somme par le nombre d'éléments
    return somme / array.length;
}

let array = [2, 8, 9, 10, 17];
console.log(average(array));
