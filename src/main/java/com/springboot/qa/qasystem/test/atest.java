/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

/**
 *
 * @author L
 * @version : atest.java, v  2021年01月05日 16:36 L Exp $
 */
public class atest {

    public static void main(String[] args) {
        //System.out.println(Color.RED);
        //Color.RED.colorInfo();
        //int a = 1;
        //a++;
        //System.out.println(a++);
        int a = (int) 2.2;
        System.out.println(a);
    }

    // 泛型方法 printArray
    public static < E > void printArray( E[] inputArray )
    {
        // 输出数组元素
        for ( E element : inputArray ){
            System.out.printf( "%s ", element );
        }
        //System.out.println();
    }

    enum Color {
        RED("红色"),
        GREEN("绿色"),
        BLUE("蓝色");

        Color(String dec) {
            System.out.println("ccf：" + this.name()+dec);
            this.dec = dec;
            System.out.println(this.dec);
        }
        private String dec;

        public String getDec() {
            return dec;
        }

        public void setDec(String dec) {
            this.dec = dec;
        }

        public void colorInfo() {
            System.out.println("end");
        }
    }

    public abstract class A {
        private String a;

        public abstract void tt();
    }

    public abstract class B extends A {
        private String b;
    }

    public class C extends B {

        @Override
        public void tt() {

        }
    }

    public interface AA {
        void eat();
    }

    interface BB {}

    interface CC extends AA, BB {
        @Override
        void eat();

        void ta();
    }

    public class DD implements CC {

        @Override
        public void eat() {

        }

        @Override
        public void ta() {

        }
    }
}