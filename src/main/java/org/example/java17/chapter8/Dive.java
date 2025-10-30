package org.example.java17.chapter8;

/**
 * interface fonctionnelle
 * La méthode dive() est la seule méthode abstraite,
 * les autres n'étant pas prises en compte puisqu' il s'agit de méthodes publiques définies dans la classe Object.
 */
public interface Dive {

    String toString();

    public boolean equals(Object o);

    public abstract int hashCode();

    public void dive();
}
