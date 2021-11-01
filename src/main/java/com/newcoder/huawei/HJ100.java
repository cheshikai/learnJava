package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 等差数列 2，5，8，11，14。。。。
 * （从 2 开始的 3 为公差的等差数列）
 * 输出求等差数列前N项和
 */
public class HJ100 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            System.out.println(2 * a + a * (a - 1) * 3 / 2);
        }
    }
}
