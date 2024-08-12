package org.example.algortihme.interview.testInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

/**
 * On vous demande de reconstituer un message qui a été coupé en morceaux. Implémentez la méthode rebuildMessage(parts) qui reçoit en paramètre un tableau de
 * chaînes de caractères. Chaque élément de parts a été découpé à partir d'un seul et même message. Vous devez reconstituer le message original, à partir des
 * règles suivantes : le message original commence toujours par le caractère A et finit par le caractère Z deux parties peuvent être rattachées lorsque le
 * dernier caractère de la première partie est égal au premier caractère de la deuxième partie. lors de la combinaison de deux parties, on ne conserve qu'un
 * exemplaire du caractère de liaison (par exemple " A---b " + " b---Z " donne " A---b---Z et non " A---bb---Z ") rebuildMessage doit retourner le message
 * reconstitué. Contraintes : chaque premier caractère est unique parmi parts chaque partie contient au moins 2 caractères et au plus 1000 caractères la
 * solution existe forcément et est unique parts n'est jamais null , contient au moins un élément et au plus 100 éléments
 */
public class MesageBuilder {

    public static void main(String[] args) {

        String[] parts = { "A---b", "b---c", "c---d", "d---Z" };
        String[] parts2 = { "Ab", "bcZ" };
        String[] parts3 = { "*====#", "X-+-+-+-+-+-Z", "#______X", "A.........*" };

        MesageBuilder mesageBuilder = new MesageBuilder();
        System.out.println(mesageBuilder.rebuildMesage(parts));
        System.out.println(mesageBuilder.rebuildMesage(parts2));
        System.out.println(mesageBuilder.rebuildMesage(parts3));
    }

    public String rebuildMesage(String[] parts) {

        //Map pour stocker le début de chaque partie, et la partie correspondante
        Map<Character, String> startMap = new HashMap<>();

        //Map pour stocker la fin de chaque partie, et la partie correspondante
        Map<Character, String> endMap = new HashMap<>();
        for(String part : parts) {
            char startChar = part.charAt(0);
            char endChar = part.charAt(part.length() - 1);
            startMap.put(startChar, part);
            endMap.put(endChar, part);
        }
        // Trouver la partie qui commence par 'A'
        String currentPart = startMap.get('A');
        StringBuilder result = new StringBuilder(currentPart);

        //Construire le message
        while(result.charAt(result.length() - 1) != 'Z') {
            char lastChar = result.charAt(result.length() - 1);
            if(startMap.containsKey(lastChar)) {
                String nextPart = startMap.get(lastChar);
                result.append(nextPart.substring(1)); // On ignore le premier charactère
            } else {
                throw new IllegalArgumentException("Aucune connexion n'a été trouvée");
            }

        }
        return result.toString();
    }

}


