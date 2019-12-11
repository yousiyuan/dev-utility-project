package com.glp.backend.risk.api.test;

import com.glp.backend.risk.api.utility.HttpUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

@SpringBootTest
@RunWith(SpringRunner.class)
public class RemoteRequestTest {

    @Autowired
    private ThreadPoolTaskExecutor asyncExecutor;

    public RemoteRequestTest() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() throws InterruptedException {
        // cmmDepart参数
        Map<String, Object> cmmDepartParam = new HashMap<>();
        cmmDepartParam.put("custNo", "91330106MA2AXPD27H");
        cmmDepartParam.put("channel", "03");
        cmmDepartParam.put("clientId", "127");
        // departByFcd参数
        Map<String, Object> departParam = new HashMap<>();
        departParam.put("fcdid", "50100011900159378");
        departParam.put("channel", "03");
        // 请求
        CountDownLatch countDownLatch = new CountDownLatch(5000);
        for (int i = 1; i <= 5000; i++) {
            // /v1/glpData/hbase/cmmDepart
            Future<?> cmmDepartFuture = asyncExecutor.submit(() -> {
                return HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/cmmDepart", cmmDepartParam);
            });
            // /v1/glpData/hbase/departByFcd
            Future<?> departFuture = asyncExecutor.submit(() -> {
                return HttpUtils.doGet("http://127.0.0.1:9023/v1/glpData/hbase/departByFcd", departParam);
            });
            asyncExecutor.execute(() -> {
                try {
                    HttpUtils.ResponseData cmmDepartResult = (HttpUtils.ResponseData) cmmDepartFuture.get();
                    HttpUtils.ResponseData departResult = (HttpUtils.ResponseData) departFuture.get();
                    System.out.println(countDownLatch.getCount() + " ===>> cmmDepartResult ===>> " + cmmDepartResult.getStatusCode());
                    System.out.println(countDownLatch.getCount() + " ===>> departResult ===>> " + departResult.getStatusCode());
                } catch (InterruptedException | ExecutionException e) {
                    e.printStackTrace();
                } finally {
                    countDownLatch.countDown();
                }
            });
        }
        countDownLatch.await();
        System.out.println("所有请求执行结束！！！");
    }

}
