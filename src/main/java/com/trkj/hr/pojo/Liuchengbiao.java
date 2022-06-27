package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Liuchengbiao  {
    @TableId
    private Integer workid;
    private String workname;
    private String workdesc;
    private Integer workzt;


}
