package org.example.algortihme.interview.testInterviewQuestions;

public class X {
    static  int i = 1111;
    static {
        i = i-- - --i;  //L1
    }
    {
        i = i++ + ++i;  //L2
    }
}
