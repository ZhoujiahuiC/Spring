package com.trkj.hr.pojo;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.List;

@Data
public class Role {
    @TableId
    private  int role_id;
    private  String role_name;
    private  int isuse;
    private  String role_z_name;
    @TableField("false")
    private List<Integer> menu_id;
    @TableField("false")
    private List<Integer> ybh;

}
