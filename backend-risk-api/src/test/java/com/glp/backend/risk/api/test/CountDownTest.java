package com.glp.backend.risk.api.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class CountDownTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Autowired
    private ExecutorService executorService;

    @Test
    public void test() throws InterruptedException {
        List<Integer> list = new ArrayList<>();
        CountDownLatch counter = new CountDownLatch(10);
        AtomicInteger atomicInteger = new AtomicInteger();
        for (int i = 1; i <= 10; i++) {
            executorService.execute(() -> {
                try {
                    int i1 = atomicInteger.incrementAndGet();
                    System.out.println(Thread.currentThread().getName() + " ===>> " + "开始处理");
                    Thread.sleep(500 * i1);
                    list.add(500 * i1);
                    System.out.println(Thread.currentThread().getName() + " ===>> " + "处理完毕");
                } catch (InterruptedException ignored) {
                } finally {
                    counter.countDown();
                }
            });
        }

        counter.await();
        System.out.println("所有线程任务已处理完毕 " + list.toString());
    }

}
