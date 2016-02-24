package com.cdtxz.learn;

import java.util.Random;

/**
 * Created by Kals on 2016/2/24.
 */
public class NumberGenerator {
    private int min;
    private int max;
    private int number;
    private Random random;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public NumberGenerator() {
        setMin(0);
        setMax(100);
        random = new Random();
    }

    public void generate() {
        if (max == 0) {
            max = 100;
        }
        number = random.nextInt(max) % (max - min + 1) + min;
    }
}
