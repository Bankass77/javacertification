package org.example.functionalprogrammingjava8.functions;

public class Transformer {

    private static <T, R> R transform(T t, Function<T, R> f) {

        return f.apply(t);
    }

    public static void main(String[] args) {
        Function<String, Integer> fsi = x -> Integer.parseInt(x);
        Function<Integer, String> fis = x -> Integer.toString(x);
        Integer i = transform("100", fsi);
        System.out.println(i);

        String s = transform(200, fis);

        System.out.println(s);
    }
}
