package com.glp.data.warehouse.service.impl;

import com.glp.data.warehouse.dao.dw.risk.GlpRuleResultMapper;
import com.glp.data.warehouse.entity.dw.risk.GlpRuleResult;
import com.glp.data.warehouse.service.GlpRuleResultMapperService;
import com.glp.data.warehouse.service.impl.base.BaseMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlpRuleResultMapperServiceImpl extends BaseMapperServiceImpl<GlpRuleResult> implements GlpRuleResultMapperService {

    private GlpRuleResultMapper glpRuleResultMapper;

    @Autowired
    public GlpRuleResultMapperServiceImpl(GlpRuleResultMapper glpRuleResultMapper) {
        this.glpRuleResultMapper = glpRuleResultMapper;
    }

    // 1、执行自定义的SQL操作，请使用对象 glpRuleResultMapper 完成
    // 2、多次执行数据操作，直接使用 mapper 完成
    // 3、多个不同的服务进行交互， 当前服务的 mapper 和 对应服务的mapper 配合使用
}
