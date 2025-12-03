package org.example.functionalprogrammingjava8.functions;

public class FunctionToLamba {

    public static void main(String[] args) {
        Function<String, Integer> f = new Function<String, Integer>() {
            @Override
            public Integer apply(final String s) {
                return 0;
            }
        };


        // Lambda expression of function interface
        f = x -> Integer.parseInt(x);


        Integer i = f.apply("100");
        System.out.println(i);

    }
}
