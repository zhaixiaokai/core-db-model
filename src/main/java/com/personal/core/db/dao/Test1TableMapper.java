package com.personal.core.db.dao;

import com.personal.core.db.model.Test1Table;

public interface Test1TableMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Test1Table record);

    int insertSelective(Test1Table record);

    Test1Table selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Test1Table record);

    int updateByPrimaryKey(Test1Table record);
}