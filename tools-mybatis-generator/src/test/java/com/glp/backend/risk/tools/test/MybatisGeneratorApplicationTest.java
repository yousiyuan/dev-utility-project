package com.glp.backend.risk.tools.test;

import com.glp.backend.mybatis.generate.dao.GlpRuleResultMapper;
import com.glp.backend.mybatis.generate.pojo.GlpRuleResult;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@SpringBootTest
@RunWith(SpringRunner.class)
public class MybatisGeneratorApplicationTest {

    @Autowired
    private GlpRuleResultMapper glpRuleResultMapper;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        List<GlpRuleResult> glpRuleResultList = glpRuleResultMapper.selectForList(new GlpRuleResult(){{
            setSearchCode("7d42ad068d1bda21020f15f65ef97a5b");
            setType("33530");
        }});
        System.out.println(glpRuleResultList.size());
    }

}
