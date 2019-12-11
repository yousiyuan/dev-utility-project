package com.glp.backend.mybatis.generate.factor.dao;

import com.glp.backend.mybatis.generate.factor.pojo.GlpCompanyBank;
import com.glp.backend.mybatis.generate.factor.pojo.GlpCompanyBankExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface GlpCompanyBankMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,glp_company_bank
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,glp_company_bank
     *
     * @param record
     */
    int insert(GlpCompanyBank record);

    /**
     *  动态字段,写入数据库记录,glp_company_bank
     *
     * @param record
     */
    int insertSelective(GlpCompanyBank record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,glp_company_bank
     *
     * @param example
     */
    List<GlpCompanyBank> selectByExample(GlpCompanyBankExample example);

    /**
     *  根据指定主键获取一条数据库记录,glp_company_bank
     *
     * @param id
     */
    GlpCompanyBank selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,glp_company_bank
     *
     * @param record
     */
    int updateByPrimaryKeySelective(GlpCompanyBank record);

    /**
     *  根据主键来更新符合条件的数据库记录,glp_company_bank
     *
     * @param record
     */
    int updateByPrimaryKey(GlpCompanyBank record);

    int insertBatchSelective(List<GlpCompanyBank> records);

    int updateBatchByPrimaryKeySelective(List<GlpCompanyBank> records);
}