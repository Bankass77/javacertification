package org.example.algortihme;

import java.util.HashMap;
import java.util.Map;

public class CharacterCount {

    /**
     *
     * @param words to count the occurences of each character
     * @return a Map contains the ocuurences of each character.
     */
    public Map<Character, Long> countCharacters(String words) {


        if( words.isEmpty() ){
            return null;
        }
        Map<Character, Long> result = new HashMap<>();
        for (int i = 0; i < words.length(); i++) {
            char c = words.charAt(i);
            result.put(c, result.containsKey(c) ? result.get(c) + 1 : 1);
        }
        return result;
    }

    public static void main(String[] args) {

        CharacterCount characterCount = new CharacterCount();
        String str = "iFollowMilindMehta";
        Map<Character, Long> result = characterCount.countCharacters(str);
        System.out.println(result);
    }
}
