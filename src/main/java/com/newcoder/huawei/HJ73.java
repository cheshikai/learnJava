package com.newcoder.huawei;

import java.time.LocalDate;
import java.util.Scanner;

/**
 * 根据输入的日期，计算是这一年的第几天。
 * 保证年份为4位数且日期合法。
 * 进阶：时间复杂度：，空间复杂度：
 */
public class HJ73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String[] a = in.nextLine().split(" ");
            LocalDate date = LocalDate.of(Integer.parseInt(a[0]), Integer.parseInt(a[1]), Integer.parseInt(a[2]));
            System.out.println(date.getDayOfYear());
        }
    }
}
