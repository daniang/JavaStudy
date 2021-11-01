package com.javaStudy;

import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.util.Random;

@Slf4j
public class GetRandomMoney {
    private static double allMoney = 0;

    public static void getRandomMoney(Redpackage _redPackage, Integer num) {
        //remainSize 剩余的红包数量
        //remainMoney 剩余的钱
        // int num = _redPackage.getRemainSize();
        Integer remainSize = _redPackage.getRemainSize();
        double remainMoney = _redPackage.getRemainMoney();
        if (remainSize == 1) {
            remainSize--;
            log.info("第{}个红包的金额是{}", num, remainMoney);
            return;
        }
        Random r = new Random();
        double min = 0.01;
        double max = remainMoney / remainSize * 2;
        double money = r.nextDouble() * max;
        money = money <= min ? 0.01 : money;
        money = new BigDecimal(money).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        remainSize--;
        remainMoney -= money;
        allMoney += money;
        log.info("第{}个红包的金额是{}", num - remainSize, money);
        log.info("总的钱是{}", new BigDecimal(allMoney).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        _redPackage.setRemainSize(remainSize);
        _redPackage.setRemainMoney(new BigDecimal(remainMoney).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue());
        getRandomMoney(_redPackage, num);
    }

    public static void main(String[] args) {
        Redpackage redpackage = new Redpackage(10, 100);
        getRandomMoney(redpackage, 10);

    }


}
