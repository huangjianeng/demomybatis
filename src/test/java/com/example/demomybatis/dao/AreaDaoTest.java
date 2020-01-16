package com.example.demomybatis.dao;

import com.example.demomybatis.entity.Area;
import org.junit.Ignore;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import javax.xml.crypto.Data;
import java.util.Date;
import java.util.List;
import java.util.Map;


@RunWith(SpringRunner.class)
@SpringBootTest
class AreaDaoTest {

    @Autowired
    private AreaDao areaDao;

    @Test
    void queryArea() {
        List<Area> areaList = areaDao.queryArea();
        areaList.forEach(v->{
            System.out.println(v.getAreaName());
        });
//        areaList.forEach((k,v)->System.out.println("Item : " + k + " Count : " + v));
//        assertEquals(2,areaList.size());
    }

    @Test
    void queryAreaById() {
        Area area = areaDao.queryAreaById(1);
        System.out.println(area);
    }

    @Test
    void insertArea() {
        Area area = new Area();
        area.setPriority(1);
        area.setAreaName("桂林");
        int num = areaDao.insertArea(area);
        System.out.println(num);
    }

    @Test
    void updateArea() {
        Area area = new Area();
        area.setAreaId(3);
        area.setPriority(11);
        area.setLastEditTime(new Date());
        area.setAreaName("西北玄天1111");
        System.out.println(area);
        int num = areaDao.updateArea(area);
        System.out.println(num);
    }

    @Test
    void deleteArea() {
        int id = 3;
        areaDao.deleteArea(id);
    }
}