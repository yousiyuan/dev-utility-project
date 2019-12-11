package com.glp.backend.risk.api.test;

import com.glp.backend.risk.api.utility.HttpUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

@SpringBootTest
@RunWith(SpringRunner.class)
public class PressureTest {

    @Autowired
    private ExecutorService executorService;

    /**
     * 请求总数
     */
    private static final int CLIENT_TOTAL = 5000;
    /**
     * 并发数
     */
    private static final int THREAD_TOTAL = 20;

    private static AtomicInteger COUNT = new AtomicInteger();

    @Test
    public void test() throws InterruptedException {
        final Semaphore semaphore = new Semaphore(THREAD_TOTAL);
        final CountDownLatch countDownLatch = new CountDownLatch(CLIENT_TOTAL);
        for (int i = 1; i <= CLIENT_TOTAL; i++) {
            executorService.execute(() -> {
                        try {
                            semaphore.acquire();
                            requestTest(COUNT.get());
                            COUNT.incrementAndGet();
                            semaphore.release();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        } finally {
                            countDownLatch.countDown();
                        }
                    }
            );
        }
        countDownLatch.await();
        executorService.shutdown();
        System.out.println("所有请求执行完毕：" + COUNT.get());
    }

    private void requestTest(int index) {
        // cmmDepart参数
        Map<String, Object> cmmDepartParam = new HashMap<>();
        cmmDepartParam.put("custNo", "91330106MA2AXPD27H");
        cmmDepartParam.put("channel", "03");
        cmmDepartParam.put("clientId", "127");
        // departByFcd参数
        Map<String, Object> departParam = new HashMap<>();
        departParam.put("fcdid", "50100011900159378");
        departParam.put("channel", "03");

        HttpUtils.ResponseData cmmDepartResult = HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/cmmDepart", cmmDepartParam);
        HttpUtils.ResponseData departResult = HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/departByFcd", departParam);
        System.out.println(index + " ===>> cmmDepartResult ===>> " + cmmDepartResult.getStatusCode());
        System.out.println(index + " ===>> departResult ===>> " + departResult.getStatusCode());

        /*
        // /v1/glpData/hbase/cmmDepart
        Future<?> cmmDepartFuture = executorService.submit(() -> {
            return HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/cmmDepart", cmmDepartParam);
        });
        // /v1/glpData/hbase/departByFcd
        Future<?> departFuture = executorService.submit(() -> {
            return HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/departByFcd", departParam);
        });

        executorService.execute(() -> {
            try {
                HttpUtils.ResponseData cmmDepartResult = (HttpUtils.ResponseData) cmmDepartFuture.get();
                HttpUtils.ResponseData departResult = (HttpUtils.ResponseData) departFuture.get();
                System.out.println(index + " ===>> cmmDepartResult ===>> " + cmmDepartResult.getStatusCode());
                System.out.println(index + " ===>> departResult ===>> " + departResult.getStatusCode());
            } catch (InterruptedException | ExecutionException e) {
                e.printStackTrace();
            }
        });*/
    }

}
