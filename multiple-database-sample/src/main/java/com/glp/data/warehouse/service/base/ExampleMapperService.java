package com.glp.data.warehouse.service.base;

import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public interface ExampleMapperService<T extends Serializable> {
    int deleteByExample(Example example);

    List<T> selectByExample(Example example);

    int selectCountByExample(Example example);

    int updateByExample(T record, Example example);

    int updateByExampleSelective(T record, Example example);
}
