package com.glp.backend.mybatis.generate.dao;

import com.glp.backend.mybatis.generate.pojo.ruleItem;
import com.glp.backend.mybatis.generate.pojo.ruleItemExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface ruleItemMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,rule_item
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,rule_item
     *
     * @param record
     */
    int insert(ruleItem record);

    /**
     *  动态字段,写入数据库记录,rule_item
     *
     * @param record
     */
    int insertSelective(ruleItem record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,rule_item
     *
     * @param example
     */
    List<ruleItem> selectByExample(ruleItemExample example);

    /**
     *  根据指定主键获取一条数据库记录,rule_item
     *
     * @param id
     */
    ruleItem selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,rule_item
     *
     * @param record
     */
    int updateByPrimaryKeySelective(ruleItem record);

    /**
     *  根据主键来更新符合条件的数据库记录,rule_item
     *
     * @param record
     */
    int updateByPrimaryKey(ruleItem record);

    int insertBatchSelective(List<ruleItem> records);

    int updateBatchByPrimaryKeySelective(List<ruleItem> records);
}