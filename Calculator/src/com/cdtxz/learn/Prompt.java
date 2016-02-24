package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Prompt {
    public void initialize() {
        System.out.println("【友情提示】\n");
        System.out.println("###############################################");
        System.out.println("1.本程序只支持简单的四则运算");
        System.out.println("2.输入以回车键结束");
        System.out.println("###############################################\n");
        firstNumber();
    }

    public void firstNumber() {
        System.out.print("请输入第一个数字：");
    }

    public void secondNumber() {
        System.out.print("请输入第二个数字：");
    }

    public void operator() {
        System.out.print("请输入运算符：");
    }

    public void error() {
        System.out.print("输入错误，请重新输入：");
    }

    public void illegal() {
        System.out.print("除数不能为零，请重新输入：");
    }

    public void calculator(Calculator calculator) {
        System.out.println("\n###############################################");
        System.out.println("计算结果为：");
        System.out.println("###############################################\n");
        System.out.print(calculator.getFirstNumber());
        System.out.print(calculator.getOperator());
        if (calculator.getSecondNumber() < 0) {
            System.out.print("(" + calculator.getSecondNumber() + ")");
        } else {
            System.out.print(calculator.getSecondNumber());
        }
        System.out.print("=");
        System.out.print(calculator.getResult());
    }

    public void moveOn() {
        System.out.print("\n\n是否继续？(Y/N)");
    }
}
