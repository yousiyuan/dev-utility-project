package com.glp.data.warehouse.service.impl.base;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.glp.data.warehouse.service.base.BaseMapperService;
import com.glp.data.warehouse.service.base.ExampleMapperService;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.entity.Example;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public abstract class BaseMapperServiceImpl<T extends Serializable> implements BaseMapperService<T>, ExampleMapperService<T> {

    @Autowired
    protected Mapper<T> mapper;

    @Override
    public List<T> selectForList() {
        return mapper.selectAll();
    }

    @Override
    public List<T> selectForList(T record) {
        return mapper.select(record);
    }

    @Override
    public PageInfo<T> selectForPageList(Integer pageNum, Integer pageSize, String orderBy, T record) {
        PageHelper.startPage(pageNum, pageSize).setOrderBy(orderBy);
        return new PageInfo<>(this.selectForList(record));
    }

    @Override
    public T selectForObject(Object primaryKey) {
        return mapper.selectByPrimaryKey(primaryKey);
    }

    @Override
    public T selectForObject(T record) {
        return mapper.selectOne(record);
    }

    @Override
    public Integer selectCount(T record) {
        return mapper.selectCount(record);
    }

    @Override
    public Integer insert(T record) {
        return mapper.insert(record);
    }

    @Override
    public Integer insertSelective(T record) {
        return mapper.insertSelective(record);
    }

    @Override
    public Integer updateByPrimaryKey(T record) {
        return mapper.updateByPrimaryKey(record);
    }

    @Override
    public Integer updateByPrimaryKeySelective(T record) {
        return mapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public Integer delete(T record) {
        return mapper.delete(record);
    }

    @Override
    public Integer deleteByPrimaryKey(Object primaryKey) {
        return mapper.deleteByPrimaryKey(primaryKey);
    }

    @Override
    public int deleteByExample(Example example) {
        return mapper.deleteByExample(example);
    }

    @Override
    public List<T> selectByExample(Example example) {
        return mapper.selectByExample(example);
    }

    @Override
    public int selectCountByExample(Example example) {
        return mapper.selectCountByExample(example);
    }

    @Override
    public int updateByExample(T record, Example example) {
        return mapper.updateByExample(record, example);
    }

    @Override
    public int updateByExampleSelective(T record, Example example) {
        return mapper.updateByExampleSelective(record, example);
    }

}
