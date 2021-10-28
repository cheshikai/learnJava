package com.leetcode.problems;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            Map<Character, Integer> map = new HashMap<>();
            for (char b : a.toCharArray()) {
                map.put(b, map.getOrDefault(b, 0) + 1);
            }
            Integer integer = map.entrySet().stream().min(Comparator.comparingInt(Map.Entry::getValue)).get().getValue();

            for (char b : a.toCharArray()) {
                if (map.get(b) == integer) {
                    a = a.replaceAll(String.valueOf(b), "");
                }
            }
            System.out.println(a);
        }
    }

}
