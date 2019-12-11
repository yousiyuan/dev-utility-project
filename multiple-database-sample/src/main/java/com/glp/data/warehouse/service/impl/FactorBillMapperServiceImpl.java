package com.glp.data.warehouse.service.impl;

import com.glp.data.warehouse.dao.glp.factor.FactorBillMapper;
import com.glp.data.warehouse.entity.glp.factor.FactorBill;
import com.glp.data.warehouse.service.FactorBillMapperService;
import com.glp.data.warehouse.service.impl.base.BaseMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactorBillMapperServiceImpl extends BaseMapperServiceImpl<FactorBill> implements FactorBillMapperService {

    private FactorBillMapper factorBillMapper;

    @Autowired
    public FactorBillMapperServiceImpl(FactorBillMapper factorBillMapper) {
        this.factorBillMapper = factorBillMapper;
    }

}
