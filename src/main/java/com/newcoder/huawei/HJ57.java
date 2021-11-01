package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 输入两个用字符串 str 表示的整数，求它们所表示的数之和。
 */
public class HJ57 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            StringBuilder a = new StringBuilder(in.nextLine());
            StringBuilder b = new StringBuilder(in.nextLine());
            char[] c = String.valueOf(a.reverse()).toCharArray();
            char[] d = String.valueOf(b.reverse()).toCharArray();
            int num = Math.max(c.length, d.length);
            StringBuilder e = new StringBuilder();
            int n = 0;
            for (int i = 0; i < num; i++) {
                int j;
                if (i < c.length) {
                    j = Integer.parseInt(String.valueOf(c[i]));
                } else {
                    j = 0;
                }
                int k;
                if (i < d.length) {
                    k = Integer.parseInt(String.valueOf(d[i]));
                } else {
                    k = 0;
                }
                int m = j + k + n;
                n = m / 10;
                int h = m % 10;

                e.append(h);

            }
            if (n > 0) {
                e.append(n);
            }
            System.out.println(e.reverse());
        }
    }
}
