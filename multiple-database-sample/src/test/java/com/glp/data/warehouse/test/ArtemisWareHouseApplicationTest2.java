package com.glp.data.warehouse.test;

import com.glp.data.warehouse.entity.dw.risk.GlpRuleResult;
import com.glp.data.warehouse.entity.glp.bluser.GlpCompanyBank;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompany;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompanyWithBLOBs;
import com.glp.data.warehouse.entity.glp.factor.FactorBill;
import com.glp.data.warehouse.entity.glp.factor.FactorProductOrder;
import com.glp.data.warehouse.service.*;
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
public class ArtemisWareHouseApplicationTest2 {

    @Autowired
    private FactorBillMapperService factorBillMapperService;

    @Autowired
    private FactorProductOrderMapperService factorProductOrderMapperService;

    @Autowired
    private GlpCompanyBankMapperService glpCompanyBankMapperService;

    @Autowired
    private GlpUserCompanyMapperService glpUserCompanyMapperService;

    @Autowired
    private GlpRuleResultMapperService glpRuleResultMapperService;

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    @Test
    public void test() {
        List<FactorBill> factorBills = factorBillMapperService.selectForList();
        System.out.println(factorBills.size());

        List<FactorProductOrder> factorProductOrders = factorProductOrderMapperService.selectForList();
        System.out.println(factorProductOrders.size());

        List<GlpCompanyBank> glpCompanyBanks = glpCompanyBankMapperService.selectForList();
        System.out.println(glpCompanyBanks.size());

        List<GlpUserCompany> glpUserCompanies = glpUserCompanyMapperService.selectForList();
        System.out.println(glpUserCompanies.size());

        GlpUserCompanyWithBLOBs glpUserCompanyWithBLOBs = glpUserCompanyMapperService.selectByPrimaryKeyWithBLOBs(993);
        System.out.println(glpUserCompanyWithBLOBs.getMicrotime());

        List<GlpRuleResult> glpRuleResults = glpRuleResultMapperService.selectForList();
        System.out.println(glpRuleResults.size());
    }

}
