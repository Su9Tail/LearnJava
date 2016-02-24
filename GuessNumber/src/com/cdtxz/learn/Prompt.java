package com.cdtxz.learn;

/**
 * Created by Kals on 2016/2/23.
 */
public class Prompt {
    public void initialize() {
        System.out.println("【友情提示】\n");
        System.out.println("###############################################");
        System.out.println("1.输入以回车键结束");
        System.out.println("2.本程序只支持正整数");
        System.out.println("3.最小值默认为0，最大值默认为100");
        System.out.println("4.最大值为0时，程序将使用默认最大值");
        System.out.println("5.可以直接敲击回车键结束，程序默认为输入0");
        System.out.println("###############################################\n");
    }

    public void setup() {
        System.out.println("*****请设定生成器的初始参数*****");
    }

    public void setMin() {
        System.out.print("最小值：");
    }

    public void setMax() {
        System.out.print("最大值：");
    }

    public void illegal() {
        System.out.print("最大值必须大于最小值，请重新输入：");
    }

    public void generate() {
        System.out.println("*****已生成了一个随机正整数*****\n");
    }

    public void input() {
        System.out.print("请输入您的猜测：");
    }

    public void inputError() {
        System.out.print("输入错误，请输入一个正整数：");
    }

    public void guessError(int status) {
        System.out.println("\n###########【错误】###########");
        if (status == 0) {
            System.out.println("您猜的数字比计算机生成的数字小");
        } else {
            System.out.println("您猜的数字比计算机生成的数字大");
        }
        System.out.println("##############################\n");
        System.out.print("请重新输入您的猜测：");
    }

    public void success(int number) {
        System.out.println("\n###########【正确】###########\n");
        System.out.println("计算机生成的数字正是" + number + "\n");
    }

    public void luck(Luck luck) {
        System.out.print("您一共猜了" + luck.getTotal() + "次，");
        System.out.print("幸运值为：" + luck.getValue() + "");
    }
}
