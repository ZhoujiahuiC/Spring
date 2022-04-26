package com.trkj.hr.pojo;

import java.io.Serializable;

/**
 * (Kaoqinjiaqilxbiao)实体类
 *
 * @author makejava
 * @since 2022-04-26 19:40:43
 */
public class Kaoqinjiaqilxbiao implements Serializable {
    private static final long serialVersionUID = -21440431022071091L;
    
    private Integer kqjqbh;
    
    private Integer kqjqlx;
    
    private String kqjqmc;


    public Integer getKqjqbh() {
        return kqjqbh;
    }

    public void setKqjqbh(Integer kqjqbh) {
        this.kqjqbh = kqjqbh;
    }

    public Integer getKqjqlx() {
        return kqjqlx;
    }

    public void setKqjqlx(Integer kqjqlx) {
        this.kqjqlx = kqjqlx;
    }

    public String getKqjqmc() {
        return kqjqmc;
    }

    public void setKqjqmc(String kqjqmc) {
        this.kqjqmc = kqjqmc;
    }

}

