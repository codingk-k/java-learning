package cn.lnlwf.base.thread;

import java.util.concurrent.TimeUnit;

/**
 * NEW：初始化态，线程新建创建状态未执行start
 * RUNNABLE：运行态
 *      就绪态：线程调用完start等待系统调用就绪态
 *      运行态：线程正在执行running状态
 * BLOCKED：阻塞态
 *      
 * WAITING：
 * TIMED_WAITING：
 * TERMINATED：结束态
 */
public class ThreadState {

    public static void main(String[] args) {
        System.out.println("---------new--------");
        threadNew();
        System.out.println("---------runnable--------");
        threadRunnable();
        System.out.println("---------terminated--------");
        threadTerminated();
    }

    public static void threadNew(){
        Thread t1 = new Thread();
        System.out.println(t1.getState());
    }

    public static void threadRunnable() {
        Thread t1 = new Thread(() -> System.out.println("t1 is running"));
        t1.start();
        System.out.println(t1.getState());
    }

    public static void threadTerminated(){
        Thread t1 = new Thread(() -> {
            System.out.println("t1 is started");
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t1.getState());
    }
}
