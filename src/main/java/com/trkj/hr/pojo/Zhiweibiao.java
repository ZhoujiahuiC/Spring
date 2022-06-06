package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.io.Serializable;

/**
 * (Zhiweibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Zhiweibiao implements Serializable {
    @TableId
    private Integer zwbh;

    private Integer bmbh;

    private String zwjs;

    private String zwmc;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date zwsj;
    @TableField("false")
    private Bumenbiao bumenbiao;
    @TableField("false")
    private Xinzijibengongzibiao xinzijibengongzibiao;



}

