package com.glp.data.warehouse.service.impl;

import com.glp.data.warehouse.dao.glp.factor.FactorProductOrderMapper;
import com.glp.data.warehouse.entity.glp.factor.FactorProductOrder;
import com.glp.data.warehouse.service.FactorProductOrderMapperService;
import com.glp.data.warehouse.service.impl.base.BaseMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FactorProductOrderMapperServiceImpl extends BaseMapperServiceImpl<FactorProductOrder> implements FactorProductOrderMapperService {

    private FactorProductOrderMapper factorProductOrderMapper;

    @Autowired
    public FactorProductOrderMapperServiceImpl(FactorProductOrderMapper factorProductOrderMapper) {
        this.factorProductOrderMapper = factorProductOrderMapper;
    }

}
