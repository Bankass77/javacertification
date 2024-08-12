/*
La fonction factorial suivante, écrite par votre collègue Frédéric est cassée.
 Réparez la afin qu'elle renvoie la factorielle du nombre donné en paramètre. 
 */
function factoriel(n) {
    if (n <= 1) {
        return 1;
    } else {
        return n * factoriel(n - 1);
    }

}
// Appels de test à l'extérieur de la fonction
console.log(factoriel(0)); // 1
console.log(factoriel(1)); // 1
console.log(factoriel(5)); // 120
console.log(factoriel(7)); // 5040
