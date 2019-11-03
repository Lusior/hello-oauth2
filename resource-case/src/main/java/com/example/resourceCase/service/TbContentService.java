package com.example.resourceCase.service;

import com.example.resourceCase.entity.TbContent;
import com.example.resourceCase.mapper.TbContentMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TbContentService {

    @Resource
    private TbContentMapper tbContentMapper;

    public TbContent getById(Long id) {
        return tbContentMapper.selectByPrimaryKey(id);
    }

    public List<TbContent> selectAll() {
        return tbContentMapper.selectAll();
    }

    public int insert(TbContent tbContent) {
        return tbContentMapper.insert(tbContent);
    }

    public int update(TbContent tbContent) {
        return tbContentMapper.updateByPrimaryKey(tbContent);
    }

    public int delete(Long id) {
        return tbContentMapper.deleteByPrimaryKey(id);
    }
}