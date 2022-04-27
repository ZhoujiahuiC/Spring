package com.trkj.hr.controller;

import com.trkj.hr.pojo.Tongzhibiao;
import com.trkj.hr.service.TongzhibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Tongzhibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("tongzhibiao")
public class TongzhibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private TongzhibiaoService tongzhibiaoService;

    /**
     * 分页查询
     *
     * @param tongzhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Tongzhibiao>> queryByPage(Tongzhibiao tongzhibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.tongzhibiaoService.queryByPage(tongzhibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Tongzhibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.tongzhibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param tongzhibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Tongzhibiao> add(Tongzhibiao tongzhibiao) {
        return ResponseEntity.ok(this.tongzhibiaoService.insert(tongzhibiao));
    }

    /**
     * 编辑数据
     *
     * @param tongzhibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Tongzhibiao> edit(Tongzhibiao tongzhibiao) {
        return ResponseEntity.ok(this.tongzhibiaoService.update(tongzhibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.tongzhibiaoService.deleteById(id));
    }

}

