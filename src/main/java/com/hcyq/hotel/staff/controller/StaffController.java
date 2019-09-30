package com.hcyq.hotel.staff.controller;

import com.hcyq.hotel.common.Result;
import com.hcyq.hotel.staff.entity.StaffEntity;
import com.hcyq.hotel.staff.service.StaffService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/staff")
public class StaffController {

    @Autowired
    private StaffService staffServer;

    @PostMapping("/add")
    public String addStaff(@RequestParam("name") String name, @RequestParam("password") String password) {
        if (StringUtils.isEmpty(name))
            return Result.toError("用户名不能为空", "");
        if (StringUtils.isEmpty(password))
            return Result.toError("密码不能为空", "");
        StaffEntity staff = new StaffEntity();
        staff.setName(name);
        staff.setPassword(password);
        int result = staffServer.addStaff(staff);
        if (result > 0) {
            return Result.toSuccess("");
        }
        return Result.toError("");
    }

    @PostMapping("/getStaff")
    public String getStaff(@RequestParam("id") int id) {
        if (id <= 0) {
            return Result.toError("员工id错误", "");
        }
        Map<String, Object> staff = staffServer.getStaffById(id);
        if (staff != null) {
            return Result.toSuccess(staff);
        }
        return Result.toSuccess("查无此人", "");
    }

    @GetMapping("/getAllStaff")
    public String getStaff() {
        List<Map<String, Object>> staffs = staffServer.getStaffAll();
        return Result.toSuccess(staffs);
    }

}
