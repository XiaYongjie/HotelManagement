package com.hcyq.hotel.staff.service.imp;

import com.hcyq.hotel.staff.dao.StaffMapper;
import com.hcyq.hotel.staff.entity.StaffEntity;
import com.hcyq.hotel.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service
public class StaffServiceImp implements StaffService {

    @Autowired
    private StaffMapper staffMapper;


    @Override
    public int addStaff(StaffEntity staff) {
        return staffMapper.insert(staff);
    }

    @Override
    public Map<String, Object> getStaffById(int id) {
        return staffMapper.selectById(id);
    }

    @Override
    public List<Map<String, Object>> getStaffAll() {
        return null;
    }

}
