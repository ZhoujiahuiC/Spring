package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Liuchengxianbiao implements Serializable {
    private Integer linkid;
    private Integer workid;
    private Integer linkqiannodeid;
    private Integer linkhounodeid;
    private String linkremark;
}
