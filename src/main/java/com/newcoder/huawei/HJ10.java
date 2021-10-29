package com.newcoder.huawei;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HJ10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            char[] chars = a.toCharArray();
            Map<Character, Integer> map = new HashMap<>();
            for (char b : chars) {
                map.put(b, map.getOrDefault(b, 0) + 1);
            }
            System.out.println(map.size());
        }
    }
}
