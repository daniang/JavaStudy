package com.problem;

import lombok.extern.slf4j.Slf4j;

/**
 * 兔子问题
 * 斐波那契数列求值
 *
 * @author tonylp
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 * 1.程序分析： 兔子的规律为数列1,1,2,3,5,8,13,21....
 */
@Slf4j
public class TestRabbit {


    public static int fib(int month) {
        if (month == 1 || month == 2) {
            return 1;
        } else {
            return fib(month -1 ) + fib(month -2);
        }
    }

    public static void main(String[] args) {

        log.info("第{}个月的兔子对数{}",5,fib(5));
    }


}
