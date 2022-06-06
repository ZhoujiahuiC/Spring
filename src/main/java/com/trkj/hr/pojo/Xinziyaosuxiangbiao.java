package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.io.Serializable;

/**
 * (Xinziyaosuxiangbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Xinziyaosuxiangbiao implements Serializable {
    @TableId
    private Integer xzysbh;

    private String xzysmc;

    private Float xzysje;


}

