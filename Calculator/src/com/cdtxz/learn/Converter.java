package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Converter {
    public double number(String string) {
        return Double.parseDouble(string);
    }

    public char operator(String string) {
        return string.charAt(0);
    }

    public boolean flag(String string){
        if(string.equals("Y")|| string.equals("y")){
            return true;
        }
        return false;
    }
}
