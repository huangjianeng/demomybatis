package com.example.demomybatis.controller;

import com.example.demomybatis.entity.Area;
import com.example.demomybatis.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/superadmin")
public class AreaController {
    @Autowired
    private AreaService areaService;

    @RequestMapping("/listArea")
    private Map<String,Object> listArea (){
        Map<String,Object> data = new HashMap<String,Object>();
        List<Area> list = areaService.getAreaList();
        data.put("areaList",list);
        return  data;
    }



    @RequestMapping(value = "/addArea",method = RequestMethod.POST)
    private Map<String,Object> addArea (Area area){
        Map<String,Object> data = new HashMap<String,Object>();
        data.put("success",areaService.addArea(area));
        return  data;
    }
}
