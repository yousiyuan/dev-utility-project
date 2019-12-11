package com.glp.backend.risk.tools.test;

import org.artemis.sparrow.dao.RiskProductBusnissTypeMapper;
import org.artemis.sparrow.entity.RiskProductBusnissType;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisTKApplicationTest {

    @Autowired
    private RiskProductBusnissTypeMapper riskProductBusnissTypeMapper;

    @Test
    public void test(){
        List<RiskProductBusnissType> list = riskProductBusnissTypeMapper.select(new RiskProductBusnissType() {{
            setModelId("555");
        }});
        System.out.println(list.size());
    }

}
