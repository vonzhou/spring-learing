/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2021 All Rights Reserved.
 */
package com.vonzhou.learning.spring.utillib.guava.base;

import com.google.common.base.Stopwatch;

import java.util.concurrent.TimeUnit;

/**
 * @author vonzhou
 * @version : StopwatchDemo.java, v 0.1 2021年03月23日 4:30 下午 vonzhou Exp $
 */
public class StopwatchDemo {
    public static void main(String[] args) throws InterruptedException {
        //long start = System.currentTimeMillis();
        Stopwatch sw = Stopwatch.createStarted();

        Thread.sleep(1000L);
        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS));

        Thread.sleep(2000L);
        System.out.println(sw.elapsed(TimeUnit.MILLISECONDS));

    }
}