/*
La technique est la suivante : On prend un point P au hasard de coordonnées (x,y) tel que 0≤x≤1 et 0≤y≤1 .
Si x2 + y2 <= 1, alors le point est à l'intérieur du quart de disque de rayon 1, sinon le point est à l'extérieur.
On sait que la probabilité que le point se situe à l'intérieur du quart de disque est égale à π/4.
Écrivez la méthode approx(pts) qui va utiliser le tableau de points pts (tirés au hasard)
pour retourner une estimation du nombre π.
Données : Chaque item de pts contient un point.
Un point est représenté par un tableau contenant exactement deux nombres,
respectivement x et y tels que 0<=x <=1 et 0<=y<=1. pts n'est jamais null et contient toujours au moins un item.
*/

function approx(pts) {
    let count = 0;
    for (const element of pts) {
        if (element[0] * element[0] + element[1] * element[1] <= 1) {
            count++;
        }
    }
    return (count / pts.length) * 4;
}

// Exemple de tableau de points
let array = [
    [0.5, 0.5],
    [0.7, 0.7],
    [0.8, 0.8],
    [0.9, 0.1]
];

console.log(approx(array));
