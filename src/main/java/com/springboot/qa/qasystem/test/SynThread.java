/**
 * L
 * Copyright (c) 1991-2021 All Rights Reserved.
 */
package com.springboot.qa.qasystem.test;

/**
 *
 * @author L
 * @version : SynThread.java, v  2021年01月14日 23:32 L Exp $
 */
public class SynThread implements Runnable {
    @Override
    public void run() {
        synchronized (SynThread.class) {
            for (int a = 0; a < 10000; a++) {
                anInt++;
            }
        }
    }

    private static int anInt = 1;

    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++) {
            Thread thread = new Thread(new SynThread());
            thread.start();
        }
        Thread.sleep(500);
        System.out.println(anInt);
    }
}