package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jixiaopinfenbiao;
import com.trkj.hr.service.JixiaopinfenbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jixiaopinfenbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jixiaopinfenbiao")
public class JixiaopinfenbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JixiaopinfenbiaoService jixiaopinfenbiaoService;

    /**
     * 分页查询
     *
     * @param jixiaopinfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jixiaopinfenbiao>> queryByPage(Jixiaopinfenbiao jixiaopinfenbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jixiaopinfenbiaoService.queryByPage(jixiaopinfenbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Jixiaopinfenbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jixiaopinfenbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jixiaopinfenbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jixiaopinfenbiao> add(Jixiaopinfenbiao jixiaopinfenbiao) {
        return ResponseEntity.ok(this.jixiaopinfenbiaoService.insert(jixiaopinfenbiao));
    }

    /**
     * 编辑数据
     *
     * @param jixiaopinfenbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Jixiaopinfenbiao> edit(Jixiaopinfenbiao jixiaopinfenbiao) {
        return ResponseEntity.ok(this.jixiaopinfenbiaoService.update(jixiaopinfenbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jixiaopinfenbiaoService.deleteById(id));
    }

}

