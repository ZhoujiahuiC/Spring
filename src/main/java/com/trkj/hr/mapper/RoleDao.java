package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Role;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;
@Mapper
public interface RoleDao extends BaseMapper<Role> {
    @Select("select r.role_name from role r left join yg_role yr on r.role_id=yr.role_id left join yuangongbiao y on yr.ybh=y.ybh where y.yzh=#{yzh} and r.isuse=0")
    List<String> findRoleByusername(@Param("yzh") String yzh);

}
