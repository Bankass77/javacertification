package org.example.java17.chapter7.records;



public sealed class Shape permits Circle, Rectangle, Square{
    public double areea(Shape shape){

        return 0;
    }
}
