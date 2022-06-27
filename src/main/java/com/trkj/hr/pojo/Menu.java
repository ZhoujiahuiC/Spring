package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {
    @TableId
    private int menu_id;
    private int menu_z_id;
    private String menu_name;
    private String url;
    private String component_name;
    private String component_path;
    @TableField(exist = false)
    private List<Menu> asideChildren = new ArrayList<Menu>();
    @TableField(exist = false)
    private List<String> list=new ArrayList<>();
    @TableField(exist = false)
    private  boolean disabled;
}
