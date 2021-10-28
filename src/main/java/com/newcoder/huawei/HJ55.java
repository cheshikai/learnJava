package com.newcoder.huawei;

import java.util.*;
import java.util.stream.Collectors;

public class HJ55 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            List<String> list = new ArrayList<>();
            String a = in.nextLine();
            for (int i = 0; i < Integer.parseInt(a); i++) {
                list.add(in.nextLine());
            }
            Map<Integer, Integer> map = new TreeMap<>();
            for (String b : list) {
                String[] strings = b.split(" ");
                Integer c = Integer.parseInt(strings[0]);
                Integer d = Integer.parseInt(strings[1]);
                if (map.containsKey(c)) {
                    map.put(c, map.get(c) + d);
                } else {
                    map.put(c, d);
                }
            }

            for (Integer t : map.keySet()) {
                System.out.println(t + " " + map.get(t));
            }
        }
    }
}
