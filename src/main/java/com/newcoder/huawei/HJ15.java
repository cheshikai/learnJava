package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 输入一个 int 型的正整数，计算出该 int 型数据在内存中存储时 1 的个数。
 */
public class HJ15 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            String b=Integer.toBinaryString(a);
            String c=b.replaceAll("1","");
            System.out.println(b.length()-c.length());
        }
    }
}
