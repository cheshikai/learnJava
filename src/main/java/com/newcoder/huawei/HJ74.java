package com.newcoder.huawei;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 解析规则：
 * <p>
 * 1.参数分隔符为空格
 * 2.对于用""包含起来的参数，如果中间有空格，不能解析为多个参数。比如在命令行输入xcopy /s "C:\\program files" "d:\"时，参数仍然是4个，第3个参数应该是字符串C:\\program files，而不是C:\\program，注意输出参数时，需要将""去掉，引号不存在嵌套情况。
 * 3.参数不定长
 * <p>
 * 4.输入由用例保证，不会出现不符合要求的输入  gqpj /lrl d:\ a:\ c:\ /nkb
 */
public class HJ74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            char[] a = in.nextLine().toCharArray();
            List<String> list = new ArrayList<>();
            StringBuilder b = new StringBuilder();
            for (int i = 0; i < a.length; i++) {
                if (a[i] == ' ') {
                    list.add(b.toString());
                    b = new StringBuilder();
                } else if (a[i] == '"') {
                    while (a[++i] != '"') {
                        b.append(a[i]);
                    }
                } else {
                    b.append(a[i]);
                }
            }
            list.add(b.toString());
            System.out.println(list.size());
            for (String c : list) {
                System.out.println(c);
            }
        }
    }
}
