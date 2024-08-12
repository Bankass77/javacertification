/*
Écrivez le corps de la fonction calc(array, n1, n2) array est un tableau d'entiers.
Les parametres n1 et n2 sont des entiers definis par la relation 0 <= n1 <= n2<array.length
La fonction cal doit retouner la somme des entiers de array dont l'index appartient à l'intervalle [n1; n2]
 */
function rangeSum(array, n1, n2) {
    // Vérification des indices pour s'assurer qu'ils sont dans les limites

    if(n1 <0 || n2 >= array.length || n1 > n2){
        throw new RangeError("Les indices n1 et n2 doivent respecter 0 <= n1 <= n2 < array.length");
    }
    let somme = 0;
    for (let i = n1; i <= n2; i++) {
        somme += array[i];
    }
    return somme;
}

let array = [2, 8, 9, 10, 17];
let n1= 1;
let n2= 4;
console.log(rangeSum(array, n1, n2)); // Devrait afficher 27 (8 + 9 + 10 +17)
