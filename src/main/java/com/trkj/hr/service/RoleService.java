package com.trkj.hr.service;

import com.trkj.hr.pojo.Role;
import com.trkj.hr.vo.AjaxResponse;

import java.util.List;

public interface RoleService {
    AjaxResponse selectRole();
    int updateIsuse(Role role);
    int insertRole(Role role);
    int delectRole(int role_id);
}
