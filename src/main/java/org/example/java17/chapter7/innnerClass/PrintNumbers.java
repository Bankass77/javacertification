/*
package org.example.java17.innnerClass;

public class PrintNumbers {

    private int length = 5;

    public void calculate() {

        final int width = 20;

        class Calculator {
            public void multiply() {
                System.out.println(width * length);
            }
        }
        var calculator = new Calculator();
        calculator.multiply();
    }


    public void processData(){

        final int length= 5;
        int width= 10;
        int heigh= 2;

        class VolumeCalculator{

            public int multiply(){
                return  length * width * heigh; // ne compile pas du fait que la valeur de width n'est pas final ou effectivement final
            }
        }
        width= 2;
    }
    public static void main(String[] args) {
        var printNumbers = new PrintNumbers();
        printNumbers.calculate();  // 100
    }
}
*/
