package com.trkj.hr.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.core.toolkit.Constants;
import com.trkj.hr.pojo.Kaoqinjilubiao;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;


/**
 * (Kaoqinjilubiao)表服务接口
 *
 * @author makejava
 * @since 2022-04-27 14:56:18
 */
public interface KaoqinjilubiaoService {
    //添加上班打卡记录
    int addkq(Kaoqinjilubiao kaoqinjilubiao);
    //根据当前的特殊字段查询
    Kaoqinjilubiao selectkaoqin(String s);
    //提前下班打卡修改
    int updatekq( String kqcx);
    //正常下班打卡修改
    int updatekq1( String kqcx);
    //查询所有的考勤记录
    List<Kaoqinjilubiao> selectkq();
}
