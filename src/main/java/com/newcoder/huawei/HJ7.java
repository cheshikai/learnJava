package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 写出一个程序，接受一个正浮点数值，输出该数值的近似整数值。如果小数点后数值大于等于 0.5 ,向上取整；小于 0.5 ，则向下取整。
 * <p>
 * 数据范围：保证输入的数字在 32 位浮点数范围内
 */
public class HJ7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextFloat()) { // 注意 while 处理多个 case
            float a = in.nextFloat();
            float b = a % 1;
            if (b >= 0.5) {
                b = 1;
            } else {
                b = 0;
            }
            System.out.println((int)((int)a + b));
        }
    }
}
