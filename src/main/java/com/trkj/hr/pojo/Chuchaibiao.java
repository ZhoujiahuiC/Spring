package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import java.util.Date;

/**
 * (Chuchaibiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
@Data
public class Chuchaibiao   {
    @TableId(type = IdType.AUTO)
    private Integer cbh;

    private Integer shbid;

    private Integer shjlbh;

    private Integer ybh;

    private String ccfd;

    private String cmdd;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date ckssj;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date cyjsj;
    @JsonFormat(pattern="yyyy-MM-dd",timezone = "GMT+8")
    private Date csjsj;

    private Integer czt;

    private String cccnr;

}

