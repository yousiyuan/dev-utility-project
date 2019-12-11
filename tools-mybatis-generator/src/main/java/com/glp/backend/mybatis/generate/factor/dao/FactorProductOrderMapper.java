package com.glp.backend.mybatis.generate.factor.dao;

import com.glp.backend.mybatis.generate.factor.pojo.FactorProductOrder;
import com.glp.backend.mybatis.generate.factor.pojo.FactorProductOrderExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface FactorProductOrderMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,factor_product_order
     *
     * @param id
     */
    int deleteByPrimaryKey(Integer id);

    /**
     *  新写入数据库记录,factor_product_order
     *
     * @param record
     */
    int insert(FactorProductOrder record);

    /**
     *  动态字段,写入数据库记录,factor_product_order
     *
     * @param record
     */
    int insertSelective(FactorProductOrder record);

    /**
     * ,factor_product_order
     *
     * @param example
     */
    List<FactorProductOrder> selectByExampleWithBLOBs(FactorProductOrderExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,factor_product_order
     *
     * @param example
     */
    List<FactorProductOrder> selectByExample(FactorProductOrderExample example);

    /**
     *  根据指定主键获取一条数据库记录,factor_product_order
     *
     * @param id
     */
    FactorProductOrder selectByPrimaryKey(Integer id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,factor_product_order
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FactorProductOrder record);

    /**
     * ,factor_product_order
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(FactorProductOrder record);

    /**
     *  根据主键来更新符合条件的数据库记录,factor_product_order
     *
     * @param record
     */
    int updateByPrimaryKey(FactorProductOrder record);

    int insertBatchSelective(List<FactorProductOrder> records);

    int updateBatchByPrimaryKeySelective(List<FactorProductOrder> records);
}