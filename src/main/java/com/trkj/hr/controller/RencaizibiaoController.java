package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rencaizibiao;
import com.trkj.hr.service.RencaizibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rencaizibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("rencaizibiao")
public class RencaizibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private RencaizibiaoService rencaizibiaoService;

    /**
     * 分页查询
     *
     * @param rencaizibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Rencaizibiao>> queryByPage(Rencaizibiao rencaizibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.rencaizibiaoService.queryByPage(rencaizibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Rencaizibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.rencaizibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param rencaizibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Rencaizibiao> add(Rencaizibiao rencaizibiao) {
        return ResponseEntity.ok(this.rencaizibiaoService.insert(rencaizibiao));
    }

    /**
     * 编辑数据
     *
     * @param rencaizibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Rencaizibiao> edit(Rencaizibiao rencaizibiao) {
        return ResponseEntity.ok(this.rencaizibiaoService.update(rencaizibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.rencaizibiaoService.deleteById(id));
    }

}

