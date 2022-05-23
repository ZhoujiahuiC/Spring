package com.trkj.hr.vo;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.trkj.hr.pojo.Menu;
import lombok.Data;

import java.util.List;

@Data

public class Yuangongbiaovo {
    @TableId
    private int ybh;
    private  String yzh;
    private  String ymm;
    @TableField("false")
    private String token;
    @TableField("false")
    private boolean isValidate;
    @TableField("false")
    private List<Menu> menus;
}