package com.newcoder.huawei;

import org.junit.jupiter.api.Test;

class HJ57Test {
    public static int count(int m, int n) {
        if (m < 0 || n <= 0)
            return 0;
        //细分到苹果数为一或盘子数为一的情况返回一
        if (m == 1 || n == 1 || m == 0)
            return 1;
        //将此事件无线细分
        return count(m, n - 1) + count(m - n, n);
    }

    @Test
    public void test() {


        System.out.println(count(7, 3));


    }
}

