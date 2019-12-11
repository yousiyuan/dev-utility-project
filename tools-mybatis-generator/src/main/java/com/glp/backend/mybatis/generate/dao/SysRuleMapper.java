package com.glp.backend.mybatis.generate.dao;

import com.glp.backend.mybatis.generate.pojo.SysRule;
import com.glp.backend.mybatis.generate.pojo.SysRuleExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface SysRuleMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,sys_rule
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,sys_rule
     *
     * @param record
     */
    int insert(SysRule record);

    /**
     *  动态字段,写入数据库记录,sys_rule
     *
     * @param record
     */
    int insertSelective(SysRule record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,sys_rule
     *
     * @param example
     */
    List<SysRule> selectByExample(SysRuleExample example);

    /**
     *  根据指定主键获取一条数据库记录,sys_rule
     *
     * @param id
     */
    SysRule selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,sys_rule
     *
     * @param record
     */
    int updateByPrimaryKeySelective(SysRule record);

    /**
     *  根据主键来更新符合条件的数据库记录,sys_rule
     *
     * @param record
     */
    int updateByPrimaryKey(SysRule record);

    int insertBatchSelective(List<SysRule> records);

    int updateBatchByPrimaryKeySelective(List<SysRule> records);
}