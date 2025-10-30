package org.example.java17.chapter8;

public class CheckIfHop implements  CheckTrait{
    @Override
    public boolean test(final Animal a) {
        return a.canHop();
    }
}
