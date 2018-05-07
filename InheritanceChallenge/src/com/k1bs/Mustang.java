package com.k1bs;

public class Mustang extends Car {
    private int fastback;

    public Mustang(int gears, boolean isManual, int fastback) {
        super("Mustang", "Coupe", 4, 2, gears, isManual);
        this.fastback = fastback;
    }

    public void accelerate(int rate) {
        int newVel = getCurrentVelocity() + rate;
        if (newVel == 0) {
            stop();
        } else if (newVel > 0 && newVel <= 10) {
            changeGear(1);
        } else if (newVel > 10 && newVel <= 20) {
            changeGear(2);
        } else {
            changeGear(3);
        }

        if (newVel > 0) {
            changeVelocity(newVel, getCurrentDirection());
        }
    }
}
