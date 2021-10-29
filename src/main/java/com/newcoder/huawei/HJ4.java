package com.newcoder.huawei;

import java.util.Scanner;

public class HJ4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            while (!a.equals("")) {
                if (a.length() >= 8) {
                    System.out.println(a.substring(0, 8));
                    a = a.substring(8);
                } else {
                    char[] chars = new char[8 - a.length()];
                    for (int i = 0; i < chars.length; i++) {
                        chars[i] = '0';
                    }
                    System.out.println(a + new String(chars));
                    a = "";
                }
            }
        }
    }
}
