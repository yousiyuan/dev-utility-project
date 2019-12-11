package com.glp.data.warehouse.service.impl;

import com.glp.data.warehouse.dao.glp.bluser.GlpCompanyBankMapper;
import com.glp.data.warehouse.entity.glp.bluser.GlpCompanyBank;
import com.glp.data.warehouse.service.GlpCompanyBankMapperService;
import com.glp.data.warehouse.service.impl.base.BaseMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlpCompanyBankMapperServiceImpl extends BaseMapperServiceImpl<GlpCompanyBank> implements GlpCompanyBankMapperService {

    private GlpCompanyBankMapper glpCompanyBankMapper;

    @Autowired
    public GlpCompanyBankMapperServiceImpl(GlpCompanyBankMapper glpCompanyBankMapper) {
        this.glpCompanyBankMapper = glpCompanyBankMapper;
    }

}
