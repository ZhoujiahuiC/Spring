package com.trkj.hr.controller;

import com.trkj.hr.pojo.Gongzuorizhibiao;
import com.trkj.hr.service.GongzuorizhibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Gongzuorizhibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("gongzuorizhibiao")
public class GongzuorizhibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private GongzuorizhibiaoService gongzuorizhibiaoService;

    /**
     * 分页查询
     *
     * @param gongzuorizhibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Gongzuorizhibiao>> queryByPage(Gongzuorizhibiao gongzuorizhibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.gongzuorizhibiaoService.queryByPage(gongzuorizhibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Gongzuorizhibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.gongzuorizhibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param gongzuorizhibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Gongzuorizhibiao> add(Gongzuorizhibiao gongzuorizhibiao) {
        return ResponseEntity.ok(this.gongzuorizhibiaoService.insert(gongzuorizhibiao));
    }

    /**
     * 编辑数据
     *
     * @param gongzuorizhibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Gongzuorizhibiao> edit(Gongzuorizhibiao gongzuorizhibiao) {
        return ResponseEntity.ok(this.gongzuorizhibiaoService.update(gongzuorizhibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.gongzuorizhibiaoService.deleteById(id));
    }

}

