package com.example.oauth2case.mapper;

import com.example.oauth2case.entity.TbPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TbPermissionMapper {

    int deleteByPrimaryKey(Long id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);

    ////*******自定义开始********/

    List<TbPermission> selectByUserId(@Param("userId") Long userId);

    //***********自定义结束****////
}
