package com.trkj.hr.service.impl;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.mapper.BumenbiaoDao;
import com.trkj.hr.mapper.RencaizibiaoDao;
import com.trkj.hr.mapper.YuangongbiaoDao;
import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.BumenbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


/**
 * (Bumenbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:16
 */
@Service
public class BumenbiaoServiceImpl implements BumenbiaoService {
    @Autowired
    private BumenbiaoDao bumenbiaoDao;
    @Autowired
    private RencaizibiaoDao rencaizibiaoDao;
    @Autowired
    private YuangongbiaoDao yuangongbiaoDao;

    //分页查询部门表
    @Override
    public IPage<Bumenbiao> selectdept(int pageNum, int pageSize, String name) {
        Page<Bumenbiao> page = new Page(pageNum, pageSize);
        QueryWrapper<Bumenbiao> queryWrapper = new QueryWrapper<>();
        queryWrapper.like("bmmc", "%" + name + "%");
        IPage<Bumenbiao> iPage = bumenbiaoDao.selectPage(page, queryWrapper);
        return iPage;
    }

    //添加部门信息
    @Override
    public int adddept(Bumenbiao bumenbiao) {

        return bumenbiaoDao.insert(bumenbiao);
    }

    //根据id删除部门表
    @Override
    public int deletedept(int bmbh) {

        return bumenbiaoDao.deleteById(bmbh);
    }

    //修改部门信息
    @Override
    public int updatedept(Bumenbiao bumenbiao) {

        return bumenbiaoDao.updateById(bumenbiao);
    }

    //查询部门和所有的员工
    @Override
    public List<Bumenbiao> selBumen() {
        List<Bumenbiao> bumenbiaos = bumenbiaoDao.selectList(null);
        for ( Bumenbiao b : bumenbiaos) {
            QueryWrapper<Rencaizibiao> queryWrapper =new QueryWrapper<>();
            queryWrapper.eq("bmbh",b.getBmbh());
            List<Rencaizibiao> rencaizibiaos = rencaizibiaoDao.selectList(queryWrapper);
            b.setRzList(rencaizibiaos);
        }
        return bumenbiaos;
    }

    @Override
    public List<Bumenbiao> selDept() {
        return bumenbiaoDao.selectList(null);
    }
    //查询所有的部门名称

    @Override
    public List<Bumenbiao> selectbmmc() {
        List<Bumenbiao> bumenbiaoList = bumenbiaoDao.selectList(null);
        return bumenbiaoList;
    }

    @Override
    public List<Bumenbiao> selAll() {
        return bumenbiaoDao.selectList(null);
    }

    @Override
    public List<Bumenbiao> selBumen2() {
        List<Bumenbiao> bumenbiaos = bumenbiaoDao.selectList(null);
        QueryWrapper<Yuangongbiao> yuangongbiaoQueryWrapper = new QueryWrapper<>();
        yuangongbiaoQueryWrapper.eq("ygzt", 1).and(e -> e.eq("iscb", 0));
        List<Yuangongbiao> list = yuangongbiaoDao.selectList(yuangongbiaoQueryWrapper);
        for (Bumenbiao b : bumenbiaos) {
            List<Rencaizibiao> rencaizibiaos = new ArrayList<>();
            int i = 0;
            for (Yuangongbiao yuangongbiao : list) {
                QueryWrapper<Rencaizibiao> queryWrapper = new QueryWrapper<>();
                queryWrapper.eq("bmbh", b.getBmbh()).and(e -> e.eq("rzbh", yuangongbiao.getRzbh()));
                Rencaizibiao rencaizibiao = rencaizibiaoDao.selectOne(queryWrapper);
                rencaizibiaos.add(rencaizibiao);
                i++;
            }
            b.setRzList(rencaizibiaos);
        }
        return bumenbiaos;
    }
}