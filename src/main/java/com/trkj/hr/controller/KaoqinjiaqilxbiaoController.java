package com.trkj.hr.controller;

import com.trkj.hr.pojo.Kaoqinjiaqilxbiao;
import com.trkj.hr.service.KaoqinjiaqilxbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Kaoqinjiaqilxbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("kaoqinjiaqilxbiao")
public class KaoqinjiaqilxbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private KaoqinjiaqilxbiaoService kaoqinjiaqilxbiaoService;

    /**
     * 分页查询
     *
     * @param kaoqinjiaqilxbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Kaoqinjiaqilxbiao>> queryByPage(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.kaoqinjiaqilxbiaoService.queryByPage(kaoqinjiaqilxbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Kaoqinjiaqilxbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.kaoqinjiaqilxbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param kaoqinjiaqilxbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Kaoqinjiaqilxbiao> add(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao) {
        return ResponseEntity.ok(this.kaoqinjiaqilxbiaoService.insert(kaoqinjiaqilxbiao));
    }

    /**
     * 编辑数据
     *
     * @param kaoqinjiaqilxbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Kaoqinjiaqilxbiao> edit(Kaoqinjiaqilxbiao kaoqinjiaqilxbiao) {
        return ResponseEntity.ok(this.kaoqinjiaqilxbiaoService.update(kaoqinjiaqilxbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.kaoqinjiaqilxbiaoService.deleteById(id));
    }

}

