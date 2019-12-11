package com.glp.data.warehouse.service.impl;

import com.glp.data.warehouse.dao.glp.bluser.GlpUserCompanyMapper;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompany;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompanyWithBLOBs;
import com.glp.data.warehouse.service.GlpUserCompanyMapperService;
import com.glp.data.warehouse.service.impl.base.BaseMapperServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GlpUserCompanyMapperServiceImpl extends BaseMapperServiceImpl<GlpUserCompany> implements GlpUserCompanyMapperService {

    private GlpUserCompanyMapper glpUserCompanyMapper;

    @Autowired
    public GlpUserCompanyMapperServiceImpl(GlpUserCompanyMapper glpUserCompanyMapper) {
        this.glpUserCompanyMapper = glpUserCompanyMapper;
    }

    @Override
    public GlpUserCompanyWithBLOBs selectByPrimaryKeyWithBLOBs(Integer id) {
        return glpUserCompanyMapper.selectByPrimaryKeyWithBLOBs(id);
    }

}
