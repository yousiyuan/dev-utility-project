package com.glp.backend.engine.script.test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.glp.backend.engine.script.entity.YxReqMsg;
import com.glp.backend.engine.script.utility.JacksonUtil;
import com.glp.backend.engine.script.utility.NashornEngineUtility;
import com.glp.backend.engine.script.utility.NashornEngineUtility.ScriptCondition;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.DigestUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
@RunWith(SpringRunner.class)
public class ArtemisScriptEngineApplicationTest {

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * 执行常量表达式
     */
    @Test
    public void test1() {
        Object o = NashornEngineUtility.executeScriptConstantExpression(" 1 + 2 ");
        System.out.println(o);
    }

    /**
     * 执行常量表达式
     */
    @Test
    public void test2() {
        Object o = NashornEngineUtility.executeScriptConstantExpression(" 1 > 2 ");
        System.out.println(o);

        o = NashornEngineUtility.executeScriptConstantExpression(" 1 < 2 ");
        System.out.println(o);
    }

    /**
     * 执行变量表达式
     */
    @Test
    public void test3() {
        Map<String, Object> params = new HashMap<>();
        params.put("index", 10);
        Object o = NashornEngineUtility.executeScriptString("index >= 12", params);
        System.out.println(o);
    }

    /**
     * 执行条件表达式
     */
    @Test
    public void test4() {
        List<ScriptCondition> expressionList = new ArrayList<>();
        expressionList.add(new ScriptCondition() {{
            setExpressionContent("x + y < x * y");
        }});
        Map<String, Object> params = new HashMap<>();
        params.put("x", 12);
        params.put("y", 6);
        Object conditionResult = NashornEngineUtility.executeScriptFunction("executeCondition", expressionList, params);
        JacksonUtil.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        String result = JacksonUtil.to(conditionResult);
        System.out.println(result);
    }

    @Test
    public void test5() {
        String jsonStr = "{\"tid\":\"a426785e-0f1f-4035-9465-1185da22a789\",\"data_source\":\"yy\",\"business_name\":\"yy_data_active\",\"create_time\":\"2019-12-02 19:46:19\",\"size\":\"1\",\"business_type\":\"glp_factor\",\"data\":[{\"source_id\":\"yy\",\"departure_id\":\"川ABE891_0000010\",\"freight_amount\":\"16300\",\"reptile_create_time\":\"2019-12-02 19:28:53\",\"reptile_invalid_time\":\"2020-03-01 19:28:53\",\"carnum\":\"川ABE891\",\"originating_province\":\"山西\",\"originating_market\":\"太原\",\"originating_area\":\"迎泽区\",\"start_time_origin\":\"2019-08-14 08:27:41\",\"destination_province\":\"广东\",\"destination_city\":\"佛山\",\"destination_region\":\"南海区\",\"destination_arrival_time\":\"2019-08-16 17:55:51\",\"buyer\":\"上海壹米滴答快运有限公司\",\"seller\":\"云柚物流\",\"project_code\":\"91510104MA6C9DJN26\",\"certificate_id\":\"91510104MA6C9DJN26\",\"waybill_id\":\"\",\"driver_telephone\":\"15208883508\",\"dw_active_flag\":\"N\"}]}";
        YxReqMsg yxReqMsg = JacksonUtil.from(jsonStr, YxReqMsg.class);
        System.out.println(yxReqMsg);
    }

    @Test
    public void test44() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = dateFormat.parse("2019-09-29");
        long time = date.getTime();
        System.out.println(time);
    }

    @Test
    public void test33() {
        //c957935b6b6603fe8e88198bf0752237
        String sdf = "GLP_TRANSPORT|913305037405432112|91330503MA2B69YA6U|T421909-20191110|062de93e-c253-4843-a449-3a580a5b948a";
        String s = DigestUtils.md5DigestAsHex(sdf.getBytes());
        System.out.println(s);
    }


    @Test
    public void test22(){
        System.out.println("SELECT sum(quantity * pledge_amount)\n" +
                "FROM(\n" +
                "SELECT delivery.goods_code, pledge.pledge_amount, delivery.quantity\n" +
                "FROM glp_fsw.delivery_apply_detail delivery, glp_gms.pledge_apply_info_detail pledge, glp_gms.gms_item_basic goods\n" +
                "WHERE delivery.goods_code = pledge.item_code AND delivery.goods_code = goods.item_code AND delivery.delivery_apply_no = #{outBoundCode} AND pledge.apply_no in (select apply_no from glp_gms.pledge_apply_info where floating_apply_no = #{orderCode})\n" +
                ") d");
    }
}
