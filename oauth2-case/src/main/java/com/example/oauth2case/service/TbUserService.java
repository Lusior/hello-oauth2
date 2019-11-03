package com.example.oauth2case.service;

import com.example.oauth2case.entity.TbUser;
import com.example.oauth2case.mapper.TbUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author yongshuai
 */
@Service
public class TbUserService {

    @Resource
    private TbUserMapper tbUserMapper;

    public TbUser getByUsername(String username) {
        return tbUserMapper.selectUserByName(username);
    }
}