package com.example.oauth2case.service;

import com.example.oauth2case.entity.TbPermission;
import com.example.oauth2case.mapper.TbPermissionMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yongshuai
 */
@Service
public class TbPermissionService {

    @Resource
    private TbPermissionMapper tbPermissionMapper;

    public List<TbPermission> selectByUserId(Long userId) {
        return tbPermissionMapper.selectByUserId(userId);
    }
}
