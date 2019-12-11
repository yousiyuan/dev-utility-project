package com.glp.data.warehouse.test;

import com.glp.data.warehouse.dao.dw.risk.GlpRuleResultMapper;
import com.glp.data.warehouse.dao.glp.bluser.GlpCompanyBankMapper;
import com.glp.data.warehouse.dao.glp.bluser.GlpUserCompanyMapper;
import com.glp.data.warehouse.dao.glp.factor.FactorBillMapper;
import com.glp.data.warehouse.dao.glp.factor.FactorProductOrderMapper;
import com.glp.data.warehouse.entity.dw.risk.GlpRuleResult;
import com.glp.data.warehouse.entity.glp.bluser.GlpCompanyBank;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompany;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompanyWithBLOBs;
import com.glp.data.warehouse.entity.glp.factor.FactorBill;
import com.glp.data.warehouse.entity.glp.factor.FactorBillKey;
import com.glp.data.warehouse.entity.glp.factor.FactorProductOrder;
import com.glp.data.warehouse.service.GlpRuleResultMapperService;
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
public class ArtemisWareHouseApplicationTest {

    @Autowired
    private GlpRuleResultMapper glpRuleResultMapper;

    @Autowired
    private FactorBillMapper factorBillMapper;

    @Autowired
    private FactorProductOrderMapper factorProductOrderMapper;

    @Autowired
    private GlpCompanyBankMapper glpCompanyBankMapper;

    @Autowired
    private GlpUserCompanyMapper glpUserCompanyMapper;

    @Autowired
    private GlpRuleResultMapperService glpRuleResultMapperService;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test1() {
        List<GlpRuleResult> glpRuleResultList = glpRuleResultMapper.select(new GlpRuleResult() {{
            setSearchCode("7d42ad068d1bda21020f15f65ef97a5b");
            setType("33530");
        }});
        System.out.println(glpRuleResultList.size());
    }

    @Test
    public void test2() {
        FactorBillKey factorBillKey = new FactorBillKey();
        factorBillKey.setId(1671);
        factorBillKey.setFactorOrderId(101405);
        FactorBill factorBill = factorBillMapper.selectByPrimaryKey(factorBillKey);
        System.out.println(factorBill);
        System.out.println(factorBill.getBuyerName());
    }

    @Test
    public void test3() {
        FactorProductOrder factorProductOrder = factorProductOrderMapper.selectByPrimaryKey(101385);
        System.out.println(factorProductOrder);
        System.out.println(factorProductOrder.getBuyerApplyAmount());
    }

    @Test
    public void test4() {
        GlpCompanyBank glpCompanyBank = glpCompanyBankMapper.selectByPrimaryKey(507);
        System.out.println(glpCompanyBank);
        System.out.println(glpCompanyBank.getCityname());
    }

    @Test
    public void test5() {
        GlpUserCompany glpUserCompany = glpUserCompanyMapper.selectByPrimaryKey(991);
        System.out.println(glpUserCompany);
        System.out.println(glpUserCompany.getName());

        GlpUserCompanyWithBLOBs glpUserCompanyWithBLOBs = glpUserCompanyMapper.selectByPrimaryKeyWithBLOBs(991);
        System.out.println(glpUserCompanyWithBLOBs);
        System.out.println(glpUserCompanyWithBLOBs.getName());
        System.out.println(glpUserCompanyWithBLOBs.getScope());
        System.out.println(glpUserCompanyWithBLOBs.getMicrotime());
    }

    @Test
    public void test6() {
        List<GlpRuleResult> glpRuleResults = glpRuleResultMapperService.selectForList(new GlpRuleResult() {{
            setSearchCode("7d42ad068d1bda21020f15f65ef97a5b");
            setType("33530");
        }});
        System.out.println(glpRuleResults);
        System.out.println(glpRuleResults.size());
    }
}
