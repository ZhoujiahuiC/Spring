package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shenhejilubiao;
import com.trkj.hr.service.ShenhejilubiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shenhejilubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("shenhejilubiao")
public class ShenhejilubiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ShenhejilubiaoService shenhejilubiaoService;

    /**
     * 分页查询
     *
     * @param shenhejilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Shenhejilubiao>> queryByPage(Shenhejilubiao shenhejilubiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.shenhejilubiaoService.queryByPage(shenhejilubiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Shenhejilubiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.shenhejilubiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param shenhejilubiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Shenhejilubiao> add(Shenhejilubiao shenhejilubiao) {
        return ResponseEntity.ok(this.shenhejilubiaoService.insert(shenhejilubiao));
    }

    /**
     * 编辑数据
     *
     * @param shenhejilubiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Shenhejilubiao> edit(Shenhejilubiao shenhejilubiao) {
        return ResponseEntity.ok(this.shenhejilubiaoService.update(shenhejilubiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.shenhejilubiaoService.deleteById(id));
    }

}

