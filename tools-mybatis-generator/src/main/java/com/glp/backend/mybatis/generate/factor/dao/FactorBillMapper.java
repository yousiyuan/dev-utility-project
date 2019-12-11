package com.glp.backend.mybatis.generate.factor.dao;

import com.glp.backend.mybatis.generate.factor.pojo.FactorBill;
import com.glp.backend.mybatis.generate.factor.pojo.FactorBillExample;
import com.glp.backend.mybatis.generate.factor.pojo.FactorBillKey;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface FactorBillMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,factor_bill
     *
     * @param key
     */
    int deleteByPrimaryKey(FactorBillKey key);

    /**
     *  新写入数据库记录,factor_bill
     *
     * @param record
     */
    int insert(FactorBill record);

    /**
     *  动态字段,写入数据库记录,factor_bill
     *
     * @param record
     */
    int insertSelective(FactorBill record);

    /**
     * ,factor_bill
     *
     * @param example
     */
    List<FactorBill> selectByExampleWithBLOBs(FactorBillExample example);

    /**
     *  根据指定的条件查询符合条件的数据库记录,factor_bill
     *
     * @param example
     */
    List<FactorBill> selectByExample(FactorBillExample example);

    /**
     *  根据指定主键获取一条数据库记录,factor_bill
     *
     * @param key
     */
    FactorBill selectByPrimaryKey(FactorBillKey key);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,factor_bill
     *
     * @param record
     */
    int updateByPrimaryKeySelective(FactorBill record);

    /**
     * ,factor_bill
     *
     * @param record
     */
    int updateByPrimaryKeyWithBLOBs(FactorBill record);

    /**
     *  根据主键来更新符合条件的数据库记录,factor_bill
     *
     * @param record
     */
    int updateByPrimaryKey(FactorBill record);

    int insertBatchSelective(List<FactorBill> records);

    int updateBatchByPrimaryKeySelective(List<FactorBill> records);
}