package com.core.siawetLibrary.util.threadPool;

import android.util.Log;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 1. newCachedThreadPool 创建一个可缓存线程池，如果线程池长度超过处理需要，可灵活回收空闲线程，若无可回收，则新建线程。
 * 2. newFixedThreadPool 创建一个定长线程池，可控制线程最大并发数，超出的线程会在队列中等待。
 * 3. newScheduledThreadPool 创建一个定长线程池，支持定时及周期性任务执行。
 * 4. newSingleThreadExecutor 创建一个单线程化的线程池，它只会用唯一的工作线程来执行任务，保证所有任务按照指定顺序(FIFO, LIFO, 优先级)执行。
 * Create by lundao
 * on 2021.9.3
 * use for: 线程池
 */
public class LocalThreadPools {
    private static ExecutorService executorService;

    public static synchronized ExecutorService getExectuorService() {
        if (executorService == null) {
            executorService = Executors.newFixedThreadPool(2);
        }
        return executorService;
    }

    public static void ShutdownLocalThreadPools() {
        if (!executorService.isShutdown()) {
            executorService.shutdownNow();
            Log.i("ThreadPool", "Thread Shut Down!");
        }
    }
/*
*     public void insertCustomer(Customer... customers) {
       //executorService为getExectuorService获取的对象
       //具体命名请按照自身习惯进行
        executorService.execute(new Runnable() {
            @Override
            public void run() {
            //耗时操作
                customerDao.insertCustomer(customers);
            }
        });
//        new InsertAsyncTask(customerDao).execute(customers);
    }*/

}
