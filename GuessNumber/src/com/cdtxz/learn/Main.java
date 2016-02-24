package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/24.
 */
public class Main {
    public static void main(String[] args) {
        Prompt prompt = new Prompt();
        Reception reception = new Reception();
        Validator validator = new Validator();
        Converter converter = new Converter();
        NumberGenerator numberGenerator = new NumberGenerator();
        Luck luck = new Luck();
        String string;
        int guess;
        int count = 1;
        prompt.initialize();
        prompt.setup();
        prompt.setMin();
        string = reception.receive();
        while (!validator.isNumber(string)) {
            prompt.inputError();
            string = reception.receive();
        }
        numberGenerator.setMin(converter.number(string));
        prompt.setMax();
        string = reception.receive();
        while (!validator.isNumber(string)) {
            prompt.inputError();
            string = reception.receive();
        }
        numberGenerator.setMax(converter.number(string));
        while (!validator.isLegal(numberGenerator)) {
            prompt.illegal();
            string = reception.receive();
            while (!validator.isNumber(string)) {
                prompt.inputError();
                string = reception.receive();
            }
            numberGenerator.setMax(converter.number(string));
        }
        numberGenerator.generate();
        prompt.generate();
        prompt.input();
        string = reception.receive();
        while (!validator.isNumber(string)) {
            prompt.inputError();
            string = reception.receive();
        }
        guess = converter.number(string);
        luck.setTotal(count);
        while (guess != numberGenerator.getNumber()) {
            if (guess < numberGenerator.getNumber()) {
                prompt.guessError(0);
            } else {
                prompt.guessError(1);
            }
            string = reception.receive();
            while (!validator.isNumber(string)) {
                prompt.inputError();
                string = reception.receive();
            }
            guess = converter.number(string);
            count = count + 1;
            luck.setTotal(count);
        }
        prompt.success(numberGenerator.getNumber());
        luck.luck();
        prompt.luck(luck);
    }
}
