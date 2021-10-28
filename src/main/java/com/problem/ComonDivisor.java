package com.problem;

import lombok.extern.slf4j.Slf4j;

import java.util.Scanner;

/**
 * 题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
 *  1.程序分析：利用辗除法。
 */
@Slf4j
public class ComonDivisor {
    public static void main(String[] args) {

        log.info("%{}",165%99);


        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b  = sc.nextInt();

        int first = a;
        int second = b;

        log.info("a={}",a);
        log.info("b={}",b);

        int temp;
        if (a < b) {
            temp = a ;
            a = b ;
            b = temp;
        }
        while (b != 0){

            temp = a %b ;// %是求余数 。
            a = b ;
            b = temp;
        }

        log.info("最大公约数为{}",a);
        log.info("最小公倍数为{}",first*second/a);




    }






}
