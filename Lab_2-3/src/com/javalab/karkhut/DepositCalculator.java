package com.javalab.karkhut;

import java.math.BigDecimal;


public class DepositCalculator {
    private int depositSum;
    private BigDecimal depositResultSum;
    private int depositMonths;
    private int depositInterest;


    public DepositCalculator(int depositSum, int depositMonths, int depositInterest) {
        this.depositSum = depositSum;
        this.depositMonths = depositMonths;
        this.depositInterest = depositInterest;
        this.depositResultSum =new BigDecimal("0.0");
    }

    void calculateDeposit(){
        double sum = depositSum*(depositInterest/100.0)*depositMonths;
        depositResultSum = BigDecimal.valueOf(sum);
        System.out.println("You will receive: "+depositResultSum+" $ for "+depositMonths+" Months");
    }
}
