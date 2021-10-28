package com.newcoder.huawei;

import java.lang.reflect.Array;
import java.util.*;

public class HJ14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String[] list = new String[Integer.parseInt(a)];
            for (int i = 0; i < Integer.parseInt(a); i++) {
                list[i]=in.nextLine();
            }
            Arrays.sort(list);
            Arrays.stream(list).forEach(System.out::println);
        }
    }
}
