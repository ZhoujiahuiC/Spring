package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Menu {
    private int menu_id;
    private int menu_z_id;
    private String menu_name;
    private String url;
    private String component_name;
    private String component_path;
    @TableField("false")
    private List<Menu> asideChildren = new ArrayList<Menu>();
    @TableField("false")
    private List<String> list=new ArrayList<>();
    @TableField("false")
    private  boolean disabled;
}
