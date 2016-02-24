package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        Reception reception = new Reception();
        Validator validator = new Validator();
        Converter converter = new Converter();
        Calculator calculator = new Calculator();
        String string;
        boolean flag = true;
        while(flag){
            prompt.initialize();
            string = reception.receive();
            while (!validator.isNumber(string)) {
                prompt.error();
                string = reception.receive();
            }
            calculator.setFirstNumber(converter.number(string));
            prompt.operator();
            string = reception.receive();
            while (!validator.isOperator(string)) {
                prompt.error();
                string = reception.receive();
            }
            calculator.setOperator(converter.operator(string));
            prompt.secondNumber();
            string = reception.receive();
            while (!validator.isNumber(string)) {
                prompt.error();
                string = reception.receive();
            }
            calculator.setSecondNumber(converter.number(string));
            while(!validator.isLegal(calculator)){
                prompt.illegal();
                string = reception.receive();
                calculator.setSecondNumber(converter.number(string));
            }
            calculator.calculate();
            prompt.calculator(calculator);
            prompt.moveOn();
            string = reception.receive();
            flag = converter.flag(string);
        }
    }
}
