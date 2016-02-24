package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Converter {
    public int number(String string) {
        if(string.equals("")){
            return 0;
        }
        return Integer.parseInt(string);
    }

    public boolean flag(String string) {
        if (string.equals("Y") || string.equals("y")) {
            return true;
        }
        return false;
    }
}
