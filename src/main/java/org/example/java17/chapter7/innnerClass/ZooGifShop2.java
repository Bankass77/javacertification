package org.example.java17.chapter7.innnerClass;

public class ZooGifShop2 {

    interface SaleTodayOff {
        int dolarsOff();
    }

    public int admission(int basePrice) {

        SaleTodayOff saleToDayOnly = new SaleTodayOff() {

            @Override
            public int dolarsOff() {
                return 3;
            }
        };
        return basePrice - saleToDayOnly.dolarsOff();
    }
}
