package com.glp.backend.risk.tools.test;

import com.glp.backend.mybatis.generate.dao.GlpRuleResultMapper;
import com.glp.backend.mybatis.generate.pojo.GlpRuleResult;
import com.glp.backend.mybatis.generate.pojo.StVariableDefine;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.stream.Collectors;

@SpringBootTest
@RunWith(SpringRunner.class)
public class Java8StreamTest {

    @Autowired
    private GlpRuleResultMapper glpRuleResultMapper;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Java8 Stream 对list进行分组 、排序
     */
    @Test
    public void test1() {
        List<StVariableDefine> matchsList = new ArrayList<>();

        Map<Integer, List<StVariableDefine>> collect1 = matchsList.stream()
                .collect(Collectors.groupingBy(StVariableDefine::getCategoryId));

        TreeMap<Integer, List<StVariableDefine>> collect2 = matchsList.stream()
                .collect(Collectors.groupingBy(StVariableDefine::getGroupId, TreeMap::new, Collectors.toList()));

        TreeMap<Integer, List<StVariableDefine>> collect3 = matchsList.stream()
                .collect(Collectors.groupingBy(StVariableDefine::getCategoryId, TreeMap::new, Collectors.toList()));

        TreeMap<Date, List<StVariableDefine>> collect4 = matchsList.stream()
                .collect(Collectors.groupingBy(StVariableDefine::getCreatedAt, TreeMap::new, Collectors.toList()));

        //
        List<StVariableDefine> collect = matchsList.stream().sorted(Comparator.comparing(StVariableDefine::getCreatedAt).reversed()).collect(Collectors.toList());
    }

    /**
     * Java8 Stream 对list进行分组 、排序，取每组第一条数据
     */
    @Test
    public void test2() {
        List<GlpRuleResult> glpRuleResultList = glpRuleResultMapper.selectForList(new GlpRuleResult() {{
            setSearchCode("7d42ad068d1bda21020f15f65ef97a5b");
            setType("33530");
        }});

        Map<String, GlpRuleResult> collect1 = glpRuleResultList.stream()
                .sorted(Comparator.comparing(GlpRuleResult::getCreatedAt).reversed())
                .collect(Collectors.groupingBy(
                        GlpRuleResult::getRuleCode,
                        Collectors.collectingAndThen(Collectors.toList(), list -> list.get(0))
                ));
        for (Map.Entry<String, GlpRuleResult> entry : collect1.entrySet()) {
            System.out.println(entry.getValue());
        }

        System.out.println("\r\n===============================\r\n");

        Map<String, GlpRuleResult> collect = glpRuleResultList.parallelStream()
                .collect(
                        Collectors.groupingBy(
                                GlpRuleResult::getRuleCode,
                                Collectors.collectingAndThen(
                                        Collectors.reducing((c1, c2) -> c1.getCreatedAt().getTime() > c2.getCreatedAt().getTime() ? c1 : c2),
                                        Optional::get
                                )
                        )
                );
        for (Map.Entry<String, GlpRuleResult> entry : collect.entrySet()) {
            System.out.println(entry.getValue());
        }
    }

}
