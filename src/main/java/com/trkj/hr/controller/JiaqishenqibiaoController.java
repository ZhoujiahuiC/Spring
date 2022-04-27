package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jiaqishenqibiao;
import com.trkj.hr.service.JiaqishenqibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jiaqishenqibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jiaqishenqibiao")
public class JiaqishenqibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JiaqishenqibiaoService jiaqishenqibiaoService;

    /**
     * 分页查询
     *
     * @param jiaqishenqibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jiaqishenqibiao>> queryByPage(Jiaqishenqibiao jiaqishenqibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jiaqishenqibiaoService.queryByPage(jiaqishenqibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Jiaqishenqibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jiaqishenqibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jiaqishenqibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jiaqishenqibiao> add(Jiaqishenqibiao jiaqishenqibiao) {
        return ResponseEntity.ok(this.jiaqishenqibiaoService.insert(jiaqishenqibiao));
    }

    /**
     * 编辑数据
     *
     * @param jiaqishenqibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Jiaqishenqibiao> edit(Jiaqishenqibiao jiaqishenqibiao) {
        return ResponseEntity.ok(this.jiaqishenqibiaoService.update(jiaqishenqibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jiaqishenqibiaoService.deleteById(id));
    }

}

