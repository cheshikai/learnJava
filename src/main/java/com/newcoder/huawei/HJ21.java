package com.newcoder.huawei;

import java.util.*;

public class HJ21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            char[] chars=a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char b=chars[i];
                if (b=='a'||b=='b'||b=='c') {
                    chars[i]='2';
                }
                if (b=='d'||b=='e'||b=='f') {
                    chars[i]='3';
                }
                if (b=='g'||b=='h'||b=='i') {
                    chars[i]='4';
                }
                if (b=='j'||b=='k'||b=='l') {
                    chars[i]='5';
                }
                if (b=='m'||b=='n'||b=='o') {
                    chars[i]='6';
                }
                if (b=='p'||b=='q'||b=='r'||b=='s') {
                    chars[i]='7';
                }
                if (b=='t'||b=='u'||b=='v') {
                    chars[i]='8';
                }
                if (b=='w'||b=='x'||b=='y'||b=='z') {
                    chars[i]='9';
                }
                if (Character.isUpperCase(b)) {
                    if (b!='Z') {
                        chars[i]= (char) (Character.toLowerCase(b)+1);
                    }else {
                        chars[i]='a';
                    }
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
