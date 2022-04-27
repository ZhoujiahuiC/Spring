package com.trkj.hr.controller;

import com.trkj.hr.pojo.Mianshiguizhanzibiao;
import com.trkj.hr.service.MianshiguizhanzibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("mianshiguizhanzibiao")
public class MianshiguizhanzibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private MianshiguizhanzibiaoService mianshiguizhanzibiaoService;

    /**
     * 分页查询
     *
     * @param mianshiguizhanzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Mianshiguizhanzibiao>> queryByPage(Mianshiguizhanzibiao mianshiguizhanzibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.mianshiguizhanzibiaoService.queryByPage(mianshiguizhanzibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Mianshiguizhanzibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mianshiguizhanzibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mianshiguizhanzibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Mianshiguizhanzibiao> add(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        return ResponseEntity.ok(this.mianshiguizhanzibiaoService.insert(mianshiguizhanzibiao));
    }

    /**
     * 编辑数据
     *
     * @param mianshiguizhanzibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Mianshiguizhanzibiao> edit(Mianshiguizhanzibiao mianshiguizhanzibiao) {
        return ResponseEntity.ok(this.mianshiguizhanzibiaoService.update(mianshiguizhanzibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mianshiguizhanzibiaoService.deleteById(id));
    }

}

