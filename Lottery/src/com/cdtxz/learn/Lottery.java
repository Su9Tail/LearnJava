package com.cdtxz.learn;

import java.util.Random;

/**
 * Created by Kals on 2016/2/24.
 */
public class Lottery {
    private int[] reds;
    private int blue;

    public int[] getReds() {
        return reds;
    }

    public void setReds(int[] reds) {
        this.reds = reds;
    }

    public int getBlue() {
        return blue;
    }

    public void setBlue(int blue) {
        this.blue = blue;
    }

    public void generate() {
        Random random = new Random();
        int[] numbers = new int[6];
        for (int i = 0; i < 6; i++) {
            numbers[i] = random.nextInt(32) + 1;
            for (int j = i - 1; j >= 0; j--) {
                if (numbers[j] == numbers[i]) {
                    i--;
                }
            }
        }
        for (int i = 0; i < 6; i++) {
            for (int j = i + 1; j < 6; j++) {
                if (numbers[i] > numbers[j]) {
                    int temp;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        setReds(numbers);
        setBlue(random.nextInt(15) + 1);
    }

    @Override
    public String toString() {
        String string = "";
        for (int i = 0; i < 6; i++) {
            string = string + getReds()[i] + "|";
        }
        string = string + getBlue();
        return string;
    }
}
