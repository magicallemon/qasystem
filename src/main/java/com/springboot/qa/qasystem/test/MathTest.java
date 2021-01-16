/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

import java.math.BigDecimal;

/**
 *
 * @author L
 * @version : MathTest.java, v  2021年01月15日 15:31 L Exp $
 */
public class MathTest {
    public static void main(String args[]) {
        //checkNums(101, 200);
    }

    //检查范围内的质数数量
    static void checkNums(int min, int max) {
        //计数
        int count = 0;
        for (int i = min; min <= i && i <= max; i++) {
            if (new TestMath().iszhishu(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(min + "到" + max + "之间质数总数为：" + count);
    }

    //算法类
    static class TestMath {
        //质数（素数）判断
        public boolean iszhishu(int x) {
            //排除0和1
            if (x == 1 || x == 0) {
                return false;
            }
            //对小于x/2的除数进行取余运算，能整除的不是质数；
            for (int i = 2; i <= x / 2; i++) {
                if (x % i == 0) { return false; }
            }
            return true;
        }


        /**
         *  等额本息每月应还本息和
         * @param lilv 利率
         * @param month 期数
         * @param bj 本金
         * @return
         */
        public BigDecimal dbj(double lilv, int month, double bj) {
            BigDecimal bigDecimal = new BigDecimal(bj).multiply(new BigDecimal(lilv * Math.pow(1 + lilv, month))).divide(
                    new BigDecimal(Math.pow(1 + lilv, month) - 1), 2, BigDecimal.ROUND_HALF_UP);
            return bigDecimal;
        }

        /**
         * 当月应还本金及利息
         * @return
         */
        public BigDecimal thisMonthBJAndLixi(){
            return null;
        }
    }

    //大兔子
    static class Br {
        private int time;
        private int num = 1;

        public int getNum() {
            if (time < 3) {
                this.num = 1;
            }
            return num;
        }

        public void setTime(int time) {
            this.time = time;
        }
    }

    //小兔子
    static class Sr extends Br {

    }
}