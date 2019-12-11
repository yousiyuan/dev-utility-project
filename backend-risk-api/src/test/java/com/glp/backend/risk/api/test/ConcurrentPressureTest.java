package com.glp.backend.risk.api.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ConcurrentPressureTest {

    @Autowired
    private ExecutorService executorService;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() throws InterruptedException {
        RequestTest requestTest = new RequestTest();
        startNThreadsByBarrier(5, requestTest);
    }

    public void startNThreadsByBarrier(int threadNums, Runnable finishTask) throws InterruptedException {
        // 设置栅栏解除时的动作，比如初始化某些值
        CyclicBarrier barrier = new CyclicBarrier(threadNums, finishTask);
        // 启动 n 个线程，与栅栏阀值一致，即当线程准备数达到要求时，栅栏刚好开启，从而达到统一控制效果
        for (int i = 0; i < threadNums; i++) {
            Thread.sleep(100);
            new Thread(new CounterTask(barrier)).start();
        }
        System.out.println(Thread.currentThread().getName() + " out over...");
    }
}

class RequestTest implements Runnable {
    private int iCounter;

    @Override
    public void run() {
        iCounter++;
        System.out.println(System.nanoTime() + " [" + Thread.currentThread().getName() + "] iCounter = " + iCounter);
    }

}

class CounterTask implements Runnable {
    // 传入栅栏，一般考虑更优雅方式
    private CyclicBarrier barrier;

    CounterTask(final CyclicBarrier barrier) {
        this.barrier = barrier;
    }

    public void run() {
        System.out.println(Thread.currentThread().getName() + " - " + System.currentTimeMillis() + " is ready...");
        try {
            // 设置栅栏，使在此等待，到达位置的线程达到要求即可开启大门
            barrier.await();
        } catch (InterruptedException | BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " - " + System.currentTimeMillis() + " started...");
    }
}
