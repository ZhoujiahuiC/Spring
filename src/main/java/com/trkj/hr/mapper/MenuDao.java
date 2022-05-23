package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Menu;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface MenuDao extends BaseMapper<Menu> {
    List<String> findBymenu(@Param("role_name") List<String> role_name);
    List<Menu> findBymenus(@Param("role_name") List<String> role_name);
}
