package org.example.algortihme.interview.testInterviewQuestions;

public class UniqueCharacter2 {

    private boolean isUnique(String str) {
        if( str.length() >128){
            return false;
        }
        boolean [] char_set = new boolean[128];
        for( int i = 0; i <str.length(); i++){
            int val = str.charAt(i);
            if( char_set[val]){
                return false;
            }
            char_set [val] = true;
        }
        return  true;
    }

    public static void main(String[] args) {

        UniqueCharacter2 uniqueCharacter2 = new UniqueCharacter2();
        System.out.println(uniqueCharacter2.isUnique("leetcode"));
    }
}
