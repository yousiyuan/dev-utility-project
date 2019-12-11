package com.glp.backend.mybatis.generate.dao;

import com.glp.backend.mybatis.generate.pojo.RiskProductBusnissType;
import com.glp.backend.mybatis.generate.pojo.RiskProductBusnissTypeExample;
import com.glp.backend.risk.tools.dao.BaseMapper;
import java.util.List;

public interface RiskProductBusnissTypeMapper extends BaseMapper {
    /**
     *  根据主键删除数据库的记录,risk_product_busniss_type
     *
     * @param id
     */
    int deleteByPrimaryKey(Long id);

    /**
     *  新写入数据库记录,risk_product_busniss_type
     *
     * @param record
     */
    int insert(RiskProductBusnissType record);

    /**
     *  动态字段,写入数据库记录,risk_product_busniss_type
     *
     * @param record
     */
    int insertSelective(RiskProductBusnissType record);

    /**
     *  根据指定的条件查询符合条件的数据库记录,risk_product_busniss_type
     *
     * @param example
     */
    List<RiskProductBusnissType> selectByExample(RiskProductBusnissTypeExample example);

    /**
     *  根据指定主键获取一条数据库记录,risk_product_busniss_type
     *
     * @param id
     */
    RiskProductBusnissType selectByPrimaryKey(Long id);

    /**
     *  动态字段,根据主键来更新符合条件的数据库记录,risk_product_busniss_type
     *
     * @param record
     */
    int updateByPrimaryKeySelective(RiskProductBusnissType record);

    /**
     *  根据主键来更新符合条件的数据库记录,risk_product_busniss_type
     *
     * @param record
     */
    int updateByPrimaryKey(RiskProductBusnissType record);

    int insertBatchSelective(List<RiskProductBusnissType> records);

    int updateBatchByPrimaryKeySelective(List<RiskProductBusnissType> records);
}