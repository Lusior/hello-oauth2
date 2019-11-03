package com.example.oauth2case.mapper;

import com.example.oauth2case.entity.TbRole;

public interface TbRoleMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    TbRole selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKey(TbRole record);

    ////*******自定义开始********/
    //***********自定义结束****////
}
