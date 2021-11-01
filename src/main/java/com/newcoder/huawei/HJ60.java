package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 任意一个偶数（大于2）都可以由2个素数组成，组成偶数的2个素数有很多种情况，本题目要求输出组成指定偶数的两个素数差值最小的素数对。
 */
public class HJ60 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            k:
            for (int i = a / 2; i > 0; i--) {
                for (int j = 2; j < i; j++) {
                    if (i % j == 0) {
                        continue k;
                    }
                }

                for (int j = 2; j < a - i; j++) {
                    if ((a - i) % j == 0) {
                        continue k;
                    }
                }
                System.out.println(i);
                System.out.println(a - i);
                break;
            }
        }
    }
}
