package com.glp.data.warehouse.service;

import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompany;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompanyWithBLOBs;
import com.glp.data.warehouse.service.base.BaseMapperService;
import com.glp.data.warehouse.service.base.ExampleMapperService;

public interface GlpUserCompanyMapperService extends BaseMapperService<GlpUserCompany>, ExampleMapperService<GlpUserCompany> {

    GlpUserCompanyWithBLOBs selectByPrimaryKeyWithBLOBs(Integer id);

}
