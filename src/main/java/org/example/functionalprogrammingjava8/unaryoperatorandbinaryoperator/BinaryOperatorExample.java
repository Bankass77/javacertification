package org.example.functionalprogrammingjava8.unaryoperatorandbinaryoperator;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    public static void main(String[] args) {

        BinaryOperator<A> operator = (x, y) -> new A(x.x + y.x, x.y - y.y);

        A a = new A(10, 5.5);
        A a1 = new A(7, 2.2);
        System.out.println(operator.apply(a, a1));
    }
}
