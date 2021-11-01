package com.newcoder.huawei;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * 输入n个整数，输出其中最小的k个整数并按升序输出
 */
public class HJ58 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            String[] c = a.split(" ");
            String[] d = b.split(" ");
            List<String> list = Arrays.stream(d).sorted(Comparator.comparingInt(Integer::parseInt)).
                    collect(Collectors.toList());
            for (int i = 0; i < Integer.parseInt(c[1]); i++) {
                System.out.print(list.get(i) + " ");
            }
            System.out.println();
        }
    }
}
