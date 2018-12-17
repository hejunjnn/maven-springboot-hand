package com.baizhi.hjj.service;


import com.baizhi.hjj.entity.Ems;
import com.baizhi.hjj.mapper.EmsMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class EmsServiceImpl implements EmsService {

    @Resource
    private EmsMapper emsMapper;

    public List<Ems> getAllPerson() {
        List<Ems> list = emsMapper.getAllPerson();
        return list;
    }

}
