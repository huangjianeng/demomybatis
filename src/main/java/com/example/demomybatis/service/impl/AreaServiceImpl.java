package com.example.demomybatis.service.impl;

import com.example.demomybatis.dao.AreaDao;
import com.example.demomybatis.entity.Area;
import com.example.demomybatis.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

//此注解意义   告诉spring容器 这也是一个bean
@Service
public class AreaServiceImpl implements AreaService {
    @Autowired
    private AreaDao areaDao;



    @Override
    public List<Area> getAreaList() {
        int a = 1/0;
        return areaDao.queryArea();
    }

    @Override
    public Area getAreaById(int areaId) {
        return areaDao.queryAreaById(areaId);
    }



    //事务回滚    默认接受这个异常  RuntimeException
    //service层 主要作用能做事务回滚
    @Transactional
    @Override
    public boolean addArea(Area area) {
        if(area.getAreaName() != null && !"".equals(area.getAreaName())){
            area.setLastEditTime(new Date());
            try{
                int num = areaDao.insertArea(area);
                if(num > 0){
                    return  true;
                }else {
                    throw new RuntimeException("跟新区域信息失败");
                }
            } catch (Exception e){
                throw new RuntimeException("跟新区域信息失败" + e.toString());
            }
        }else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean modifyArea(Area area) {
        if(area.getAreaId() != null && area.getAreaId() > 0){
            try{
                int num = areaDao.updateArea(area);
                if(num > 0){
                    return  true;
                }else {
                    throw new RuntimeException("跟新区域信息失败");
                }
            } catch (Exception e){
                throw new RuntimeException("跟新区域信息失败" + e.toString());
            }
        }else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }

    @Override
    public boolean deleteArea(int areaId) {
        if(areaId > 0){
            try{
                int num = areaDao.deleteArea(areaId);
                if(num > 0){
                    return  true;
                }else {
                    throw new RuntimeException("跟新区域信息失败");
                }
            } catch (Exception e){
                throw new RuntimeException("跟新区域信息失败" + e.toString());
            }
        }else {
            throw new RuntimeException("区域信息不能为空！");
        }
    }
}
