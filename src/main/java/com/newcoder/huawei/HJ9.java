package com.newcoder.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 输入一个 int 型整数，按照从右向左的阅读顺序，返回一个不含重复数字的新的整数。
 * 保证输入的整数最后一位不是 0 。
 */
public class HJ9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            List<Integer> list = new ArrayList<>();
            char[] chars = new String(new StringBuilder(a).reverse()).toCharArray();
            for (int i = 0; i < chars.length; i++) {
                int key = Integer.parseInt(String.valueOf(chars[i]));
                if (!list.contains(key)) {
                    list.add(key);
                }
            }
            for (Integer t : list) {
                System.out.print(t);
            }
            System.out.println();
        }
    }
}
