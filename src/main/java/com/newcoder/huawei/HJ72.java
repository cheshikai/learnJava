package com.newcoder.huawei;

import java.util.Scanner;

/**
 * 公元前五世纪，我国古代数学家张丘建在《算经》一书中提出了“百鸡问题”：鸡翁一值钱五，鸡母一值钱三，鸡雏三值钱一。百钱买百鸡，问鸡翁、鸡母、鸡雏各几何？
 * 现要求你打印出所有花一百元买一百只鸡的方式。 7x+4y=100
 */
public class HJ72 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            in.nextInt();
            for (int i = 0; i <= 14; i++) {
                if ((100 - 7 * i) % 4 == 0) {
                    int y = (100 - 7 * i) / 4;
                    int z = 100 - i - y;
                    System.out.println(i + " " + y + " " + z);
                }
            }
        }
    }
}
