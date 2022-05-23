package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (Jixiaodinjibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */

@Data
@TableName(value = "jixiaodinjibiao")
public class Jixiaodinjibiao{

    @TableId
    private int jdbh;
    private String jdjb;
    private int jdfs;

}

