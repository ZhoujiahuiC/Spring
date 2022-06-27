package com.trkj.hr.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import org.springframework.security.core.parameters.P;

@Data
public class Khz {
    @TableId
    private Integer zkhid;
    private Integer khid;
    private String khname;
    private Integer khnum;
    private String remark;
    private Integer khnuma;
    private Integer khnumb;
}
