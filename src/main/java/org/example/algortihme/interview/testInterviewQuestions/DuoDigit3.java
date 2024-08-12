package org.example.algortihme.interview.testInterviewQuestions;

public class DuoDigit3 {

    public static void main(String[] args) {
        DuoDigit3 duoDigit3 = new DuoDigit3() ;
        int x= 12;
        int z= 110;
        int w = -33333;
        int a = 102;
        System.out.println(duoDigit3.isDuodigit(1));
        System.out.println(duoDigit3.isDuodigit(2020));
        System.out.println(duoDigit3.isDuodigit(-2021));
        System.out.println(duoDigit3.isDuodigit(x));
        System.out.println(duoDigit3.isDuodigit(z));
        System.out.println(duoDigit3.isDuodigit(w));
        System.out.println(duoDigit3.isDuodigit(a));
    }
    private String isDuodigit(int number){

       boolean result = String.valueOf(Math.abs(number)).chars().distinct().count() <=2;
       return  result ? "y" : "n";

    }

}
