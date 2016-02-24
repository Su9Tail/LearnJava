package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/24.
 */
public class Luck {
    private int total;
    private int value;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void luck() {
        setValue(100 / getTotal());
    }
}
