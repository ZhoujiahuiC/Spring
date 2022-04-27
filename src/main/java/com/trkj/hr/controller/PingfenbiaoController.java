package com.trkj.hr.controller;

import com.trkj.hr.pojo.Pingfenbiao;
import com.trkj.hr.service.PingfenbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Pingfenbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("pingfenbiao")
public class PingfenbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private PingfenbiaoService pingfenbiaoService;

    /**
     * 分页查询
     *
     * @param pingfenbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Pingfenbiao>> queryByPage(Pingfenbiao pingfenbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.pingfenbiaoService.queryByPage(pingfenbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Pingfenbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.pingfenbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param pingfenbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Pingfenbiao> add(Pingfenbiao pingfenbiao) {
        return ResponseEntity.ok(this.pingfenbiaoService.insert(pingfenbiao));
    }

    /**
     * 编辑数据
     *
     * @param pingfenbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Pingfenbiao> edit(Pingfenbiao pingfenbiao) {
        return ResponseEntity.ok(this.pingfenbiaoService.update(pingfenbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.pingfenbiaoService.deleteById(id));
    }

}

