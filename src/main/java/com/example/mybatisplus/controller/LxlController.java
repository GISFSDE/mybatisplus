package com.example.mybatisplus.controller;


import com.example.mybatisplus.entity.Lxl;
import com.example.mybatisplus.mapper.LxlMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author lxl
 * @since 2021-05-17
 */
@RestController
@RequestMapping("/")
public class LxlController {
    @Autowired
    private LxlMapper lxlMapper;

    @RequestMapping("select")
    public List<Lxl> list() {
        List<Lxl> list = lxlMapper.selectList(null);

        for (Lxl l : list
        ) {
            System.out.println(l);
        }

        return list;

    }

}
