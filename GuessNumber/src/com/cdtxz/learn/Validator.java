package com.cdtxz.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kals on 2016/2/23.
 */
public class Validator {
    public boolean isNumber(String string) {
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher matcher = pattern.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }

    public boolean isLegal(NumberGenerator numberGenerator) {
        if (numberGenerator.getMin() > numberGenerator.getMax()) {
            return false;
        }
        return true;
    }
}
