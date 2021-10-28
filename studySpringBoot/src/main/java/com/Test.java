package com;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {

    public static void main(String[] args) {
//        BigDecimal b = new BigDecimal("123.455");
//        log.info("b为{}",b);
//        log.info("b小数点的位数是{}",b.scale());
//
//        log.info("保留{}位，四舍五入为{}",2,b.setScale(2,BigDecimal.ROUND_HALF_UP));
//
//        log.info("保留{}位，ROUND_UP{}",2,b.setScale(2,BigDecimal.ROUND_UP));
//        log.info("保留{}位，ROUND_DOWN{}",2,b.setScale(2,BigDecimal.ROUND_DOWN));
//        log.info("保留{}位，ROUND_CEILING{}",2,b.setScale(2,BigDecimal.ROUND_CEILING));
//        log.info("保留{}位，ROUND_FLOOR{}",2,b.setScale(2,BigDecimal.ROUND_FLOOR));
//        log.info("保留{}位，ROUND_HALF_UP{}",2,b.setScale(2,BigDecimal.ROUND_HALF_UP));
//        log.info("保留{}位，ROUND_HALF_DOWN{}",2,b.setScale(2,BigDecimal.ROUND_HALF_DOWN));
//        log.info("保留{}位，ROUND_HALF_EVEN{}",2,b.setScale(2,BigDecimal.ROUND_HALF_EVEN));
//
//        System.out.println((0.2 + 0.1));
//        BigDecimal intStr = new BigDecimal("22");
//        BigDecimal doubleStr =  BigDecimal.valueOf(3.6666666666666666666);
//        BigDecimal doubleStr1 =  new BigDecimal(Double.toString(3.6666666666666));
//        System.out.println(intStr);
//        System.out.println(doubleStr);
//        System.out.println(doubleStr1);

        BigDecimal first = new BigDecimal("36");
        BigDecimal second = new BigDecimal("12");
        log.info("a+b = {}", first.add(second));
        log.info("a-b = {}", first.subtract(second));
        log.info("a*b={}", first.multiply(second));
        log.info("a/b={}", first.divide(second));

        double a = 1.2333;
        float b = 3.3f;
        BigDecimal firsts = new BigDecimal(Double.toString(a));

        BigDecimal seconds = new BigDecimal(Float.toString(b));

        log.info("a*b = {}",a*b);
        log.info("乘法{}",firsts.multiply(seconds));

        log.info("进行四舍五入,保留2位小数:{}",firsts.divide(seconds,2, BigDecimal.ROUND_HALF_UP));

    }
}
