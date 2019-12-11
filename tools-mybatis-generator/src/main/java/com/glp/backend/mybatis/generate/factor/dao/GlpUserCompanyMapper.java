package com.glp.backend.mybatis.generate.factor.dao;

import com.glp.backend.mybatis.generate.factor.pojo.GlpUserCompany;
import com.glp.backend.mybatis.generate.factor.pojo.GlpUserCompanyExample;
import com.glp.backend.mybatis.generate.factor.pojo.GlpUserCompanyWithBLOBs;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface GlpUserCompanyMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,glp_user_company
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,glp_user_company
     *
     * @param record
     */
    int insert(GlpUserCompanyWithBLOBs record);

    /**
     *  动态字段,写入数据库记录,glp_user_company
     *
     * @param record
     */
    int insertSelective(GlpUserCompanyWithBLOBs record);

    /**
     * ,glp_user_company
     *
     * @param example
     */
    List<GlpUserCompanyWithBLOBs> selectByExampleWithBLOBs(GlpUserCompanyExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,glp_user_company
     *
     * @param example
     */
    List<GlpUserCompany> selectByExample(GlpUserCompanyExample example);

    /**
     *  根据指定主键获取一条数据库记录,glp_user_company
     *
     * @param id
     */
    GlpUserCompanyWithBLOBs selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,glp_user_company
     *
     * @param record
     */
    int updateByPrimaryKeySelective(GlpUserCompanyWithBLOBs record);

    /**
     * ,glp_user_company
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(GlpUserCompanyWithBLOBs record);

    /**
     *  根据主键来更新符合条件的数据库记录,glp_user_company
     *
     * @param record
     */
    int updateByPrimaryKey(GlpUserCompany record);

    int insertBatchSelective(List<GlpUserCompany> records);

    int updateBatchByPrimaryKeySelective(List<GlpUserCompany> records);
}