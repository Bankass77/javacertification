package org.example.java17.chapter8.functions;

@FunctionalInterface
public interface Function <T, R>{

    R apply(T t);

  default  <V> Function<T,V> andThen(Function< ? super  R, ? extends V> after){

      return (T t) -> after.apply(this.apply(t));
  }

  default <V> Function<V,R> compose(Function<? super V, ? extends  T> before){
     // return  t ->  this.apply (before.apply(t)); ouu

      return (V v) -> this.apply(before.apply(v));
  }
}
