package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shebaojishubiao;
import com.trkj.hr.service.ShebaojishubiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shebaojishubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("shebaojishubiao")
public class ShebaojishubiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ShebaojishubiaoService shebaojishubiaoService;

    /**
     * 分页查询
     *
     * @param shebaojishubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Shebaojishubiao>> queryByPage(Shebaojishubiao shebaojishubiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.shebaojishubiaoService.queryByPage(shebaojishubiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Shebaojishubiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.shebaojishubiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param shebaojishubiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Shebaojishubiao> add(Shebaojishubiao shebaojishubiao) {
        return ResponseEntity.ok(this.shebaojishubiaoService.insert(shebaojishubiao));
    }

    /**
     * 编辑数据
     *
     * @param shebaojishubiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Shebaojishubiao> edit(Shebaojishubiao shebaojishubiao) {
        return ResponseEntity.ok(this.shebaojishubiaoService.update(shebaojishubiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.shebaojishubiaoService.deleteById(id));
    }

}

