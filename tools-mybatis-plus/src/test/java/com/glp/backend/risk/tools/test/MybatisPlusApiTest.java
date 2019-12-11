package com.glp.backend.risk.tools.test;

import org.artemis.sparrow.mybatis.plus.generator.entity.RiskProductBusnissType;
import org.artemis.sparrow.mybatis.plus.generator.entity.StVariableDefine;
import org.artemis.sparrow.mybatis.plus.generator.mapper.RiskProductBusnissTypeMapper;
import org.artemis.sparrow.mybatis.plus.generator.service.IRiskProductBusnissTypeService;
import org.artemis.sparrow.mybatis.plus.generator.service.IStVariableDefineService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.HashMap;
import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisPlusApiTest {

    @Autowired
    private IRiskProductBusnissTypeService riskProductBusnissTypeService;

    @Autowired
    private RiskProductBusnissTypeMapper riskProductBusnissTypeMapper;

    @Autowired
    private IStVariableDefineService stVariableDefineServiceImpl;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        RiskProductBusnissType riskProductBusnissType = riskProductBusnissTypeService.getById(12);
        System.out.println(riskProductBusnissType);
    }

    @Test
    public void test222() {
        List<StVariableDefine> list = stVariableDefineServiceImpl.list();
        System.out.println(list.size());
    }

    @Test
    public void test666(){
        riskProductBusnissTypeMapper.selectByMap(new HashMap<String,Object>(){{put("model_id","555");}});

    }

}
