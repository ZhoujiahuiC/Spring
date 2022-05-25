package com.trkj.hr.service.impl;

import com.trkj.hr.mapper.RoleDao;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.service.RoleService;
import com.trkj.hr.vo.AjaxResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Slf4j
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleDao roleDao;
    @Override
    public AjaxResponse selectRole() {
        List<Role> list = roleDao.selectList(null);
        log.debug("list:{}",roleDao.selectList(null));
        return AjaxResponse.success(list);
    }

    @Override
    public int updateIsuse(Role role) {

        return roleDao.updateById(role);
    }

    @Override
    public int insertRole(Role role) {
        return roleDao.insert(role);
    }

    @Override
    public int delectRole(int role_id) {
        return roleDao.deleteById(role_id);
    }

}
