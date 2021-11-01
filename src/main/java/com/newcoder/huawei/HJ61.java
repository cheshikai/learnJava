package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 把m个同样的苹果放在n个同样的盘子里，允许有的盘子空着不放，问共有多少种不同的分法？（用K表示）5，1，1和1，5，1 是同一种分法。
 */
public class HJ61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int m = in.nextInt();
            int n = in.nextInt();
            System.out.println(count(m, n));
        }
    }

    public static int count(int m, int n) {
        if (m == 1 || n == 1 || m == 0) {
            return 1;
        } else if (m < 0 || n <= 0) {
            return 0;
        } else {
            return count(m - n, n) + count(m, n - 1);
        }
    }
}
