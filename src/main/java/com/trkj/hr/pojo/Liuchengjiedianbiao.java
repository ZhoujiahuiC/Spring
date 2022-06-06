package com.trkj.hr.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
public class Liuchengjiedianbiao implements Serializable {
    private Integer nodeid;
    private Integer workid;
    private String nodename;
}
