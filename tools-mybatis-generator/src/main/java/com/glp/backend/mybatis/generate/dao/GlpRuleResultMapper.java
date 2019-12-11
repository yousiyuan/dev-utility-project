package com.glp.backend.mybatis.generate.dao;

import com.glp.backend.mybatis.generate.pojo.GlpRuleResult;
import com.glp.backend.mybatis.generate.pojo.GlpRuleResultExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface GlpRuleResultMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,glp_rule_result
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,glp_rule_result
     *
     * @param record
     */
    int insert(GlpRuleResult record);

    /**
     *  动态字段,写入数据库记录,glp_rule_result
     *
     * @param record
     */
    int insertSelective(GlpRuleResult record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,glp_rule_result
     *
     * @param example
     */
    List<GlpRuleResult> selectByExample(GlpRuleResultExample example);

    /**
     * 查询列表
     */
    List<GlpRuleResult> selectForList(GlpRuleResult argument);

    /**
     *  根据指定主键获取一条数据库记录,glp_rule_result
     *
     * @param id
     */
    GlpRuleResult selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,glp_rule_result
     *
     * @param record
     */
    int updateByPrimaryKeySelective(GlpRuleResult record);

    /**
     *  根据主键来更新符合条件的数据库记录,glp_rule_result
     *
     * @param record
     */
    int updateByPrimaryKey(GlpRuleResult record);

    int insertBatchSelective(List<GlpRuleResult> records);

    int updateBatchByPrimaryKeySelective(List<GlpRuleResult> records);
}