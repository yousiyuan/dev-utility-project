package com.glp.backend.mybatis.generate.dao;

import com.glp.backend.mybatis.generate.pojo.StVariableDefine;
import com.glp.backend.risk.tools.dao.BaseMapper;

import java.util.List;

public interface StVariableDefineMapper extends BaseMapper {
    /**
     * 根据主键删除数据库的记录,st_variable_define
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * 新写入数据库记录,st_variable_define
     *
     * @param record
     */
    int insert(StVariableDefine record);

    /**
     * 动态字段,写入数据库记录,st_variable_define
     *
     * @param record
     */
    int insertSelective(StVariableDefine record);

    /**
     * 根据指定主键获取一条数据库记录,st_variable_define
     *
     * @param id
     */
    StVariableDefine selectByPrimaryKey(Integer id);

    /**
     * 动态字段,根据主键来更新符合条件的数据库记录,st_variable_define
     *
     * @param record
     */
    int updateByPrimaryKeySelective(StVariableDefine record);

    /**
     * 根据主键来更新符合条件的数据库记录,st_variable_define
     *
     * @param record
     */
    int updateByPrimaryKey(StVariableDefine record);

    int insertBatchSelective(List<StVariableDefine> records);

    int updateBatchByPrimaryKeySelective(List<StVariableDefine> records);
}