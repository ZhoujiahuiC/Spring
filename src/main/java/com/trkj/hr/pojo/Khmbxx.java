package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class Khmbxx {
    @TableId
    private Integer khmbxid;
    private Integer khmbid;
    private String khname;
    private Integer khnum;
    private String remark;

}
