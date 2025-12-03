package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;

public class Calculator {

    public static double getOp() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an operand: ");
        return Double.parseDouble(scanner.nextLine());
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        final String[] ops = {"+", "-", "*", "/", "POW", "ABS", "LOG", "EXP", "SIN", "COS", "TAN", "QUI"};

        DoubleBinaryOperator sum = (x, y) -> x + y;
        DoubleBinaryOperator diff = (x, y) -> x - y;
        DoubleBinaryOperator mul = (x, y) -> x * y;
        DoubleBinaryOperator div = (x, y) -> x / y;
        DoubleBinaryOperator pow = (x, y) -> Math.pow(x, y);

        DoubleUnaryOperator abs = x -> Math.abs(x);
        DoubleUnaryOperator log = x -> Math.log(x);
        DoubleUnaryOperator exp = x -> Math.exp(x);
        DoubleUnaryOperator sin = x -> Math.sin(x);
        DoubleUnaryOperator cos = x -> Math.cos(x);
        DoubleUnaryOperator tan = x -> Math.tan(x);
        boolean done = false;

        while (!done){
            System.out.println("Select an operation " + " (Select QUI to quit):");

            for (String s : ops){

                System.out.println(s);
                String op = scan.nextLine();

                switch (op){

                    case "+": System.out.println(sum.applyAsDouble(getOp(), getOp()));
                                break;
                    case  "-": System.out.println(diff.applyAsDouble(getOp(),getOp()));
                            break;
                    case "*" : System.out.println(mul.applyAsDouble(getOp(), getOp()));
                             break;
                    case "/" : System.out.println(div.applyAsDouble(getOp(), getOp()));
                            break;
                    case "POW" : System.out.println(pow.applyAsDouble(getOp(),getOp()));
                               break;
                    case "ABS": System.out.println(abs.applyAsDouble(getOp()));
                               break;
                    case "LOG": System.out.println(log.applyAsDouble(getOp()));
                            break;
                    case "EXP": System.out.println(exp.applyAsDouble(getOp()));
                             break;
                    case "SIN" : System.out.println(sin.applyAsDouble(getOp()));
                            break;
                    case "COS": System.out.println(cos.applyAsDouble(getOp()));
                           break;
                    case "TAN": System.out.println(tan.applyAsDouble(getOp()));
                               break;
                    case "QUI": done =true;
                          break;
                    default: System.out.println("Invalid operation ");

                }
            }
        }
    }
}
