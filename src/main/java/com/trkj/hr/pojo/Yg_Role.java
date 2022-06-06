package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.List;

@Data
@TableName("yg_role")
public class Yg_Role {
    @TableId
    private int yg_role_id;
    private int ybh;
    private int role_id;

}
