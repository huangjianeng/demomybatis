package com.example.demomybatis;


import com.example.demomybatis.dao.AreaDao;
import com.example.demomybatis.entity.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/testBoot")
public class TestController {

    @Autowired
    private AreaDao areaDao;

    @RequestMapping("getUser/{id}")
    public List<Area> GetUser(@PathVariable int id) {
        List<Area> areas = areaDao.queryArea();
        return areas;
    }
}
