package com.newcoder.huawei;

import java.util.*;

/**
 * 完全数（Perfect number），又称完美数或完备数，是一些特殊的自然数。
 *
 * 它所有的真因子（即除了自身以外的约数）的和（即因子函数），恰好等于它本身。
 *
 * 例如：28，它有约数1、2、4、7、14、28，除去它本身28外，其余5个数相加，1+2+4+7+14=28。
 *
 * 输入n，请输出n以内(含n)完全数的个数。
 */
public class HJ56 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextInt()) { // 注意 while 处理多个 case
            int a = in.nextInt();
            int num=0;
            for (int i = 1; i < a; i++) {
                int b=0;
                for (int j = 1; j < i; j++) {
                    if (i%j==0) {
                       b+=j;
                    }
                }
                if(b==i){
                    num++;
                }
            }
            System.out.println(num);
        }
    }
}
