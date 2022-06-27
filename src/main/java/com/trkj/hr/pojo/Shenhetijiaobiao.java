package com.trkj.hr.pojo;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

@Data
@TableName("shenhetijiao")
public class Shenhetijiaobiao {
    @TableId(type = IdType.AUTO)
    private Integer businessid;

    private Integer workid;

    private Integer ybh;

    private String ygname;

    private Date addtime;

    private Integer ybh1;

    private String yposts;

    private String xposts;

    private double ysalary;

    private double xsalary;

    private double salary;

    private Date wtime;

    private  Integer bksjd;

    private String destination;

    private Date btime;

    private Date etime;

    private double otime;

    private Date xtime;

    private String posts;

    private Integer ponum;

    private String remark;

    private Date endtime;

    private int businesszt;


}
