package com.trkj.hr.pojo;

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
    private List<Menu> asideChildren = new ArrayList<Menu>();
    private List<String> list=new ArrayList<>();
}
