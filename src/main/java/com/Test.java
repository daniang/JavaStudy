package com;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Test {

    public static void main(String[] args) {
        BigDecimal b = new BigDecimal("123.455");
        log.info("b为{}",b);
        log.info("b小数点的位数是{}",b.scale());

        log.info("保留{}位，四舍五入为{}",2,b.setScale(2,BigDecimal.ROUND_HALF_UP));

        log.info("保留{}位，ROUND_UP{}",2,b.setScale(2,BigDecimal.ROUND_UP));
        log.info("保留{}位，ROUND_DOWN{}",2,b.setScale(2,BigDecimal.ROUND_DOWN));
        log.info("保留{}位，ROUND_CEILING{}",2,b.setScale(2,BigDecimal.ROUND_CEILING));
        log.info("保留{}位，ROUND_FLOOR{}",2,b.setScale(2,BigDecimal.ROUND_FLOOR));
        log.info("保留{}位，ROUND_HALF_UP{}",2,b.setScale(2,BigDecimal.ROUND_HALF_UP));
        log.info("保留{}位，ROUND_HALF_DOWN{}",2,b.setScale(2,BigDecimal.ROUND_HALF_DOWN));
        log.info("保留{}位，ROUND_HALF_EVEN{}",2,b.setScale(2,BigDecimal.ROUND_HALF_EVEN));
//        log.info("保留{}位，四舍五入为{}",2,b.setScale(2,BigDecimal.ROUND_UNNECESSARY));
    }
}
