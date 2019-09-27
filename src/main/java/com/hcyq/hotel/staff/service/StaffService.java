package com.hcyq.hotel.staff.service;

import com.hcyq.hotel.staff.entity.StaffEntity;

import java.util.List;
import java.util.Map;

public interface StaffService {
    int addStaff(StaffEntity staff);

    Map<String, Object> getStaffById(int id);

    List<Map<String, Object>> getStaffAll();
}
