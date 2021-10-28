package com.problem;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * 题目：求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
 * 几个数相加有键盘控制。 1.程序分析：关键是计算出每一项的值。
 */
@Slf4j
public class NumAdd {

    public static void main(String[] args) {
        System.out.println("请输入数字0-9：");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("请输入数字重复次数:");
        int b = sc.nextInt();
        int s = 0;
        int result = 0;
        System.out.println("a=" + a + "; b=" + b);
        for (int i = 0; i < b; i++) {
            s += a * Math.pow(10, i);//10的i次方
            result += s;
        }
        log.info("s={}", s);
        log.info("result={}", result);

    }
}
