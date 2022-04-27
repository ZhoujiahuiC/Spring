package com.trkj.hr.controller;

import com.trkj.hr.pojo.Bumenbiao;
import com.trkj.hr.service.BumenbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Bumenbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:49
 */
@RestController
@RequestMapping("bumenbiao")
public class BumenbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private BumenbiaoService bumenbiaoService;

    /**
     * 分页查询
     *
     * @param bumenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Bumenbiao>> queryByPage(Bumenbiao bumenbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.bumenbiaoService.queryByPage(bumenbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Bumenbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.bumenbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param bumenbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Bumenbiao> add(Bumenbiao bumenbiao) {
        return ResponseEntity.ok(this.bumenbiaoService.insert(bumenbiao));
    }

    /**
     * 编辑数据
     *
     * @param bumenbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Bumenbiao> edit(Bumenbiao bumenbiao) {
        return ResponseEntity.ok(this.bumenbiaoService.update(bumenbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.bumenbiaoService.deleteById(id));
    }

}

