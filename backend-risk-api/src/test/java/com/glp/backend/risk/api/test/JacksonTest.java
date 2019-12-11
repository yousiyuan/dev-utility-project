package com.glp.backend.risk.api.test;

import com.glp.backend.risk.api.entity.YxReqMsg;
import com.glp.backend.risk.api.utility.JacksonUtil;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@SpringBootTest
@RunWith(SpringRunner.class)
public class JacksonTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        String jsonString="{\"tid\":\"2e502799-6823-465d-999a-835cf5fe4e76\",\"data_source\":\"xd\",\"business_name\":\"xd_basic_debt\",\"create_time\":\"2019-11-18 10:48:52\",\"size\":1,\"business_type\":\"glp_factor\",\"data\":[{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_0228680\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_1814251\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_7369073\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_4962465\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_0205544\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_1089455\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"},{\"source_id\":\"xd\",\"depart_car_id\":\"\\u8c6bA8172U_4885740\",\"basic_debt_amt\":7600.4,\"recive_time\":\"2019-11-13 17:19:43\",\"number_plate\":\"\\u8c6bA8172U\",\"origin_province\":\"\\u6d59\\u6c5f\",\"origin_city\":\"\\u6e56\\u5dde\",\"origin_district\":\"330502\",\"driving_time\":\"2019-09-28 01:54:39\",\"destination_province\":\"\\u6cb3\\u5357\",\"destination_city\":\"\\u90d1\\u5dde\",\"destination_district\":\"410102\",\"arrival_time\":\"2019-09-28 20:18:22\",\"buyer\":\"\\u6e56\\u5dde\\u946b\\u8fbe\\u56fd\\u9645\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\",\"seller\":\"\\u6e56\\u5dde\\u5357\\u6d54\\u6d54\\u5e38\\u7269\\u6d41\\u6709\\u9650\\u516c\\u53f8\"}]}";
//        YxReqMsg deserialize = JsonHelper.deserialize(jsonString, new TypeReference<YxReqMsg>() {
//        });
        //YxReqMsg yxReqMsg = JacksonUtil.obj2pojo(jsonString, YxReqMsg.class);

        //JacksonUtil
        YxReqMsg from = JacksonUtil.from(jsonString, YxReqMsg.class);
        System.out.println(from);
    }

}
