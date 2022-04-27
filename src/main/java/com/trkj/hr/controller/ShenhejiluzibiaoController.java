package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shenhejiluzibiao;
import com.trkj.hr.service.ShenhejiluzibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shenhejiluzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("shenhejiluzibiao")
public class ShenhejiluzibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ShenhejiluzibiaoService shenhejiluzibiaoService;

    /**
     * 分页查询
     *
     * @param shenhejiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Shenhejiluzibiao>> queryByPage(Shenhejiluzibiao shenhejiluzibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.shenhejiluzibiaoService.queryByPage(shenhejiluzibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Shenhejiluzibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.shenhejiluzibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param shenhejiluzibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Shenhejiluzibiao> add(Shenhejiluzibiao shenhejiluzibiao) {
        return ResponseEntity.ok(this.shenhejiluzibiaoService.insert(shenhejiluzibiao));
    }

    /**
     * 编辑数据
     *
     * @param shenhejiluzibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Shenhejiluzibiao> edit(Shenhejiluzibiao shenhejiluzibiao) {
        return ResponseEntity.ok(this.shenhejiluzibiaoService.update(shenhejiluzibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.shenhejiluzibiaoService.deleteById(id));
    }

}

