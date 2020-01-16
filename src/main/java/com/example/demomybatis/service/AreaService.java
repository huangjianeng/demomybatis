package com.example.demomybatis.service;

import com.example.demomybatis.entity.Area;

import java.util.List;

public interface AreaService {
    List<Area> getAreaList();
    Area getAreaById(int areaId);
    boolean addArea(Area area);
    boolean modifyArea(Area area);
    boolean deleteArea(int areaId);
}
