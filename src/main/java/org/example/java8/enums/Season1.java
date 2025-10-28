package org.example.java8.enums;

public enum Season1  implements  Weather{
    WINTER, SPRING, SUMMER, FALL;

    @Override
    public int getAverageTemperature() {
        return 30;
    }
}
