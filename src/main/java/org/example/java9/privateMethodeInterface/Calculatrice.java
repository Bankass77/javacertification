package org.example.java9.privateMethodeInterface;

/**
 * Les méthodes privées dans les interfaces doivent généralement être testées de manière indirecte en testant les méthodes publiques ou default qui les
 * utilisent. Cependant, si vous avez besoin de tester directement la logique encapsulée, vous pouvez refactoriser votre code pour déplacer cette logique dans
 * des classes utilitaires publiques. Cela rend la logique testable sans exposer les détails d'implémentation de l'interface
 */
public interface Calculatrice {

    /**
     * @param a
     * @param b
     * @return le resultat de la somme de a et b
     */
    default int addition(int a, int b) {
        return operationCommune(a, b);
    }

    /**
     * @param a
     * @param b
     * @return le resultat de la soustraction de a  et b
     */
    default int subtraction(int a, int b) {

        return operationCommune(a, -b);
    }

    /**
     * @param a
     * @param b
     * @return le resultat du produit de a et b
     */
    default int multiplication(int a, int b) {

        return operationMultiplication(a, b);
    }

    // Méthode privée pour encapsuler la logique commune

    /**
     * @param a
     * @param b
     * @return la somme de a et b;
     */
    private int operationCommune(int a, int b) {

        return a + b;
    }

    /**
     * @param a
     * @param b
     * @return un int correspondant à la multiplication de a x b.
     */
    private int operationMultiplication(int a, int b) {
        return a * b;
    }

}
