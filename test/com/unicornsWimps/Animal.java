package com.unicornsWimps;

import java.math.BigDecimal;

public abstract class Animal {
    private int position = BigDecimal.ONE.intValue();

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }
}
