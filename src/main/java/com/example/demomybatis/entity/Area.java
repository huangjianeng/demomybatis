package com.example.demomybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Area {

    //主键id
    private Integer areaId;
    //名称
    private String areaName;
    //权重，越大越拍前显示
    private Integer priority;
    //创建时间
    private Date createTime;
    //跟新时间
    private Date lastEditTime;
}