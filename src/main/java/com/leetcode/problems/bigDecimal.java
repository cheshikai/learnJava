package com.leetcode.problems;

import java.math.BigDecimal;

public class bigDecimal {
    public long getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    long num;

    bigDecimal() {

    }

    public static void main(String[] args) {
        bigDecimal big=new bigDecimal();
        BigDecimal number = BigDecimal.valueOf(big.getNum());
        System.out.println(number);
        System.out.println(big.getNum());
    }
}
