package org.example.algortihme.interview.testInterviewQuestions;

public class UniqueCharacter3 {

    private boolean isUnique(String str) {
        int checker = 0;
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i) -'a';
            if( (checker & (1<<val))>0){
                return false;
            }
            checker |= (1<<val);
        }
        return true;
    }
}
