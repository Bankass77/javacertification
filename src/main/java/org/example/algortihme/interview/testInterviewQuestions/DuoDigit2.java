package org.example.algortihme.interview.testInterviewQuestions;

public class DuoDigit2 {

    public static void main(String[] args) {

        DuoDigit2 duoDigit2 = new DuoDigit2() ;
        int x= 12;
        int z= 110;
        int w = -33333;
        int a = 102;
        System.out.println(duoDigit2.isDuodigit(x));
        System.out.println(duoDigit2.isDuodigit(z));
        System.out.println(duoDigit2.isDuodigit(w));
        System.out.println(duoDigit2.isDuodigit(a));
        System.out.println(duoDigit2.isDuodigit(1));
        System.out.println(duoDigit2.isDuodigit(2020));
        System.out.println(duoDigit2.isDuodigit(-2021));
    }
    private String isDuodigit(int number){
        boolean result = Integer.toString(Math.abs(number)).chars().distinct().count()  <= 2;
        return result ? "y" : "n";
    }

}
