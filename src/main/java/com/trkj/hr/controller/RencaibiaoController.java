package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rencaibiao;
import com.trkj.hr.service.RencaibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Rencaibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("rencaibiao")
public class RencaibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private RencaibiaoService rencaibiaoService;

    /**
     * 分页查询
     *
     * @param rencaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Rencaibiao>> queryByPage(Rencaibiao rencaibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.rencaibiaoService.queryByPage(rencaibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Rencaibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.rencaibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param rencaibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Rencaibiao> add(Rencaibiao rencaibiao) {
        return ResponseEntity.ok(this.rencaibiaoService.insert(rencaibiao));
    }

    /**
     * 编辑数据
     *
     * @param rencaibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Rencaibiao> edit(Rencaibiao rencaibiao) {
        return ResponseEntity.ok(this.rencaibiaoService.update(rencaibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.rencaibiaoService.deleteById(id));
    }

}

