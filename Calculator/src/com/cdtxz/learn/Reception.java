package com.cdtxz.learn;

import java.util.Scanner;

/**
 * Created by Kals on 2016/2/23.
 */
public class Reception {
    private Scanner scanner;

    public Reception() {
        scanner = new Scanner(System.in);
    }

    public String receive() {
        return scanner.nextLine();
    }
}
