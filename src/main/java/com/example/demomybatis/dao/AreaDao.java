package com.example.demomybatis.dao;

import com.example.demomybatis.entity.Area;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
@Mapper
public interface AreaDao {
    List<Area> queryArea();
    Area queryAreaById(int areaId);
    int insertArea(Area area);
    int updateArea(Area area);
    int deleteArea(int areaId);
}
