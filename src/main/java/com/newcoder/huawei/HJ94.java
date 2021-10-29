package com.newcoder.huawei;

import java.util.*;

/**
 * 输入描述：
 * 输入候选人的人数n，第二行输入n个候选人的名字（均为大写字母的字符串），第三行输入投票人的人数，第四行输入投票。
 * <p>
 * 输出描述：
 * 按照输入的顺序，每行输出候选人的名字和得票数量，最后一行输出不合法的票数。
 */
public class HJ94 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            String b = in.nextLine();
            String c = in.nextLine();
            String d = in.nextLine();
            List<String> list = Arrays.asList(b.split(" "));
            String[] strings = d.split(" ");
            Map<String, Integer> map = new TreeMap<>();
            Map<String, Integer> map1 = new TreeMap<>();

            for (int i = 0; i < strings.length; i++) {
                if (list.contains(strings[i])) {
                    map.put(strings[i], map.getOrDefault(strings[i], 0) + 1);
                } else {
                    map1.put("Invalid", map1.getOrDefault("Invalid", 0) + 1);
                }
            }
            for (String t : list) {
                System.out.println(t + " : " + map.getOrDefault(t, 0));
            }

            if (map1 == null || map1.size() == 0) {
                map1.put("Invalid", map1.getOrDefault("Invalid", 0));
            }
            for (String t : map1.keySet()) {
                System.out.println(t + " : " + map1.getOrDefault(t, 0));
            }
        }
    }
}
