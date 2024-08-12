package org.example.algortihme.ProblemsOnArray;

import com.sun.tools.javac.Main;

import java.util.*;

public class MultiMap<K, V> {

    private final Map<K, Collection<V>> map = new HashMap<>();
    // ajout d'une valeur v spéficique à une clé k dans ce multiMap

    /**
     * @param key
     * @param value
     */
    public void put(K key, V value) {
        if(map.get(key) == null) {
            map.put(key, new ArrayList<>());
        }
        map.get(key).add(value);
    }

    /**
     * @param key
     * @param value
     */
    public void putIfAbsent(K key, V value) {

        // Association d'une clé spécifique K avec une valeur V si elles ne le sont pas.
        if(map.get(key) == null) {
            map.put(key, new ArrayList<>());
        }

        // Si la map ne contient la valeur, ont l'insert
        if(!map.get(key).contains(value)) {

        }
    }

    /**
     * Renvoie la collection de valeurs auxquelles la clé spécifiée est associée, ou null si cette multimap ne contient pas de mappage pour la clé.
     */
    public Collection<V> get(K key) {
        return map.get(key);
    }

    /**
     * Renvoie une vue de l'ensemble des clés contenues dans cette multimap.
     */
    public Set<K> keySet() {
        return map.keySet();
    }

    /**
     * Renvoie une vue de set des mappages contenus dans cette multimap.
     */
    public Set<Map.Entry<K, Collection<V>>> entrySet() {
        return map.entrySet();
    }

    /**
     * Renvoie une vue de Collection de Collection des valeurs présentes dans cette multimap.
     */
    public Collection<Collection<V>> values() {
        return map.values();
    }

    /**
     * Retourne vrai si cette multimap contient une correspondance pour la clé spécifiée.
     */
    public boolean containsKey(Object key) {
        return map.containsKey(key);
    }

    /**
     * Supprime le mappage pour la clé spécifiée de ce multimap s'il est présent et renvoie la collection des valeurs précédentes associées à la clé, ou null
     * s'il n'y a pas de correspondance pour la clé.
     */
    public Collection<V> remove(Object key) {
        return map.remove(key);
    }

    /**
     * Renvoie le nombre total de mappages clé-valeur dans cette multimap.
     */
    public int size() {
        int size = 0;
        for(Collection<V> values : values()) {
            size += values.size();
        }
        return size;
    }

    /**
     * Retourne true si cette multimap ne contient pas de mappings clé-valeur.
     */
    public boolean isEmpty() {
        return map.isEmpty();
    }

    /**
     * Supprime tous les mappages de cette carte multimédia.
     */
    public void clear() {
        map.clear();
    }

    /**
     * Supprime l'entrée pour la clé spécifiée uniquement si elle est actuellement mappée à la valeur spécifiée et renvoie un message vrai si elle est
     * supprimée
     */
    public boolean remove(K key, V value) {
        if(map.get(key) != null) {
            return map.get(key).remove(value);
        }
        return false;
    }

    /**
     * Replaces the entry for the specified key only if currently mapped to the specified value and return true if replaced
     */
    public boolean replace(K key, V oldValue, V newValue) {
        if(map.get(key) != null) {
            if(map.get(key).remove(oldValue)) {
                return map.get(key).add(newValue);
            }
        }
        return false;
    }

    public static void main(String[] args) {

        // Creation de multiMap avec une liste des présidents américains

        MultiMap<String, String> multiMap = new MultiMap<>();
        multiMap.put("Zachary", "Taylor");
        multiMap.put("John", "Adams");
        multiMap.put("John", "Tyler");
        multiMap.put("John", "Kennedy");
        multiMap.put("George", "Washington");
        multiMap.put("George", "Bush");
        multiMap.put("Grover", "Cleveland");

        System.out.println("-----------Affichage des keySet avec le multiMap---------\n");
        for(String lastname : multiMap.keySet()) {
            System.out.println(lastname + " : " + multiMap.get(lastname));
        }
    }
}
