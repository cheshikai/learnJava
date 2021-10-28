package com.newcoder.huawei;

import java.util.Scanner;

public class HJ29 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // 注意 hasNext 和 hasNextLine 的区别
        while (in.hasNextLine()) { // 注意 while 处理多个 case
            String a = in.nextLine();
            char[] chars=a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char b=chars[i];

                if (Character.isUpperCase(b)) {
                    if (b!='Z') {
                        chars[i]= (char) (Character.toLowerCase(b)+1);
                    }else {
                        chars[i]='a';
                    }
                }
                if (Character.isLowerCase(b)) {
                    if (b!='z') {
                        chars[i]= (char) (Character.toUpperCase(b)+1);
                    }else {
                        chars[i]='A';
                    }
                }
                if (Character.isDigit(b)) {
                    if (b!='9') {
                        chars[i]=(char)(b+1);
                    }else{
                        chars[i]='0';
                    }
                }
            }
            System.out.println(String.valueOf(chars));
            a = in.nextLine();
            chars=a.toCharArray();
            for (int i = 0; i < chars.length; i++) {
                char b=chars[i];

                if (Character.isUpperCase(b)) {
                    if (b!='A') {
                        chars[i]= (char) (Character.toLowerCase(b)-1);
                    }else {
                        chars[i]='z';
                    }
                }
                if (Character.isLowerCase(b)) {
                    if (b!='a') {
                        chars[i]= (char) (Character.toUpperCase(b)-1);
                    }else {
                        chars[i]='Z';
                    }
                }
                if (Character.isDigit(b)) {
                    if (b!='0') {
                        chars[i]=(char)(b-1);
                    }else{
                        chars[i]='9';
                    }
                }
            }
            System.out.println(String.valueOf(chars));
        }
    }
}
