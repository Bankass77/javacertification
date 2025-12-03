package org.example.functionalprogrammingjava8.consumers;

import java.util.function.Consumer;

public class Payroll {

    public static void main(String[] args) {

        Consumer<Employee> applyProfit= x -> x.bonus += MomAndPop.profit* x.multiplier;

        MomAndPop compagny= new MomAndPop();
        MomAndPop.profit = 120000.0; // 40%PRG 30%MGR 15%VP  15%CEO
        compagny.forEach(applyProfit.andThen(x-> System.out.println(x)));

    }
}
