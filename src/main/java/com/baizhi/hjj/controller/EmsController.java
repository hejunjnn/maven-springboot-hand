package com.baizhi.hjj.controller;


import com.baizhi.hjj.entity.Ems;
import com.baizhi.hjj.service.EmsService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/Ems")
public class EmsController {

    @Resource
    private EmsService emsService;

    @RequestMapping("/getAllPerson")
    public List<Ems> getAllPerson() {
        return emsService.getAllPerson();
    }

}
