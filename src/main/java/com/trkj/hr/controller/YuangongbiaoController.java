package com.trkj.hr.controller;

import com.trkj.hr.pojo.Yuangongbiao;
import com.trkj.hr.service.YuangongbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Yuangongbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("yuangongbiao")
public class YuangongbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private YuangongbiaoService yuangongbiaoService;

    /**
     * 分页查询
     *
     * @param yuangongbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Yuangongbiao>> queryByPage(Yuangongbiao yuangongbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.yuangongbiaoService.queryByPage(yuangongbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Yuangongbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.yuangongbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param yuangongbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Yuangongbiao> add(Yuangongbiao yuangongbiao) {
        return ResponseEntity.ok(this.yuangongbiaoService.insert(yuangongbiao));
    }

    /**
     * 编辑数据
     *
     * @param yuangongbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Yuangongbiao> edit(Yuangongbiao yuangongbiao) {
        return ResponseEntity.ok(this.yuangongbiaoService.update(yuangongbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.yuangongbiaoService.deleteById(id));
    }

}

