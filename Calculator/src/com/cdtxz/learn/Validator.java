package com.cdtxz.learn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Kals on 2016/2/23.
 */
public class Validator {
    public boolean isNumber(String string) {
        Pattern pattern = Pattern.compile("^(-?\\d+)(\\.\\d+)?$");
        Matcher matcher = pattern.matcher(string);
        if (!matcher.matches()) {
            return false;
        }
        return true;
    }

    public boolean isOperator(String string) {
        if (string.length() > 1) {
            return false;
        }
        char operator = string.charAt(0);
        if (operator == '+' || operator == '-' || operator == '*' || operator == '/') {
            return true;
        }
        return false;
    }

    public boolean isLegal(Calculator calculator) {
        if (calculator.getOperator() == '/' && calculator.getSecondNumber() == 0) {
            return false;
        }
        return true;
    }
}
