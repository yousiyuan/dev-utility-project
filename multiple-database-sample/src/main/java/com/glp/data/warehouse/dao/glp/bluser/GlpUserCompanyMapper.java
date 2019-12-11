package com.glp.data.warehouse.dao.glp.bluser;

import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompany;
import com.glp.data.warehouse.entity.glp.bluser.GlpUserCompanyWithBLOBs;
import tk.mybatis.mapper.common.Mapper;

public interface GlpUserCompanyMapper extends Mapper<GlpUserCompany> {

    GlpUserCompanyWithBLOBs selectByPrimaryKeyWithBLOBs(Integer id);

}
