package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/24.
 */
public class Main {
    public static void main(String[] args) {
        Lottery lottery = new Lottery();
        lottery.generate();
        System.out.print(lottery.toString());
    }
}
