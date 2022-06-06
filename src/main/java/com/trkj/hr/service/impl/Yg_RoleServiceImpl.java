package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.trkj.hr.mapper.Yg_RoleDao;
import com.trkj.hr.pojo.Role;
import com.trkj.hr.pojo.Yg_Role;
import com.trkj.hr.service.Yg_RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class Yg_RoleServiceImpl implements Yg_RoleService {
    @Autowired
    private Yg_RoleDao yg_roleDao;

    @Override
    public int updateRoleYg(Role role) {
        int insert=0;
        QueryWrapper<Yg_Role> queryWrapper=new QueryWrapper<>();
        queryWrapper.eq("role_id",role.getRole_id());
        int delete = yg_roleDao.delete(queryWrapper);
        log.debug("yg_role:{}",yg_roleDao.selectList(queryWrapper));
        Yg_Role yg_role = new Yg_Role();
        yg_role.setRole_id(role.getRole_id());
        for (int i: role.getYbh()) {
            yg_role.setYbh(i);
            insert = yg_roleDao.insert(yg_role);
        }
        return insert;
    }
}
