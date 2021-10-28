package com.problem;

import lombok.extern.slf4j.Slf4j;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；
 * 再落下，求它在第10次落地时，共经过多少米？第10次反弹多高？
 */
@Slf4j
public class TestBall {


    public static void main(String[] args) {
        double a = 100;
        double sum  = 100;

        for (int i = 2; i <=3 ; i++) {
            a = a*0.5;
            sum += a*2;
        }
        log.info("a={}",a);
        log.info("sum={}",sum);
    }


}
