package com.hcyq.hotel.staff.dao;

import com.hcyq.hotel.staff.entity.StaffEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;


@Mapper
public interface StaffMapper {
    int deleteByPrimaryKey(int id);

    int insert(StaffEntity record);

    int insertSelective(StaffEntity record);

    StaffEntity selectByPrimaryKey(int id);

    int updateByPrimaryKeySelective(StaffEntity record);

    int updateByPrimaryKey(StaffEntity record);

    Map<String,Object> selectById(int id);

    List<Map<String,Object>> selectAll();
}