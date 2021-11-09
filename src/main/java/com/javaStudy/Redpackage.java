package com.javaStudy;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Redpackage {
    private Integer remainSize;

    private double remainMoney;


    public Redpackage(Integer remainSize, double remainMoney) {
        this.remainSize = remainSize;
        this.remainMoney = remainMoney;
    }


}
