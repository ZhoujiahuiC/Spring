package com.trkj.hr.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import com.trkj.hr.mapper.XinziyaosuxiangbiaoDao;
import com.trkj.hr.service.XinziyaosuxiangbiaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Xinziyaosuxiangbiao)表服务实现类
 *
 * @author makejava
 * @since 2022-04-27 14:56:37
 */
@Service("xinziyaosuxiangbiaoService")
public class XinziyaosuxiangbiaoServiceImpl implements XinziyaosuxiangbiaoService {
    @Autowired
    private XinziyaosuxiangbiaoDao xinziyaosuxiangbiaoDao;
//    @Override
//    public List<Xinziyaosuxiangbiao> selAllxzys() {
//        return xinziyaosuxiangbiaoDao.selectList(null);
//    }

    @Override
    public IPage<Xinziyaosuxiangbiao> selAllxzys(int pageNum, int pageSize, String xzysmc) {
        Page<Xinziyaosuxiangbiao> page=new Page(pageNum,pageSize);
        QueryWrapper<Xinziyaosuxiangbiao> queryWrapper=new QueryWrapper<>();
        queryWrapper.like("xzysmc",xzysmc);
        IPage<Xinziyaosuxiangbiao> iPage=xinziyaosuxiangbiaoDao.selectPage(page,queryWrapper);
        return iPage;
    }

    @Override
    public int upxzysje(List<Xinziyaosuxiangbiao> list) {
        int i=0;
        for (Xinziyaosuxiangbiao x:list) {
            if (x.getXzysje()!=null){
                x.setXzysje(x.getXzysje());
                i=xinziyaosuxiangbiaoDao.updateById(x);
            }
        }
        return i;
    }

    @Override
    public int addxzysx(Xinziyaosuxiangbiao xzysx) {
        return xinziyaosuxiangbiaoDao.insert(xzysx);
    }

    @Override
    public int upxzysxje2(Xinziyaosuxiangbiao xinziyaosuxiangbiao) {
        return xinziyaosuxiangbiaoDao.updateById(xinziyaosuxiangbiao);
    }
//删除薪资要素项
    @Override
    public int delxzysx(int xzysbh) {
        return xinziyaosuxiangbiaoDao.deleteById(xzysbh);
    }
}
