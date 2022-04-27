package com.trkj.hr.controller;

import com.trkj.hr.pojo.Yuangonggzjlbiao;
import com.trkj.hr.service.YuangonggzjlbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Yuangonggzjlbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("yuangonggzjlbiao")
public class YuangonggzjlbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private YuangonggzjlbiaoService yuangonggzjlbiaoService;

    /**
     * 分页查询
     *
     * @param yuangonggzjlbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Yuangonggzjlbiao>> queryByPage(Yuangonggzjlbiao yuangonggzjlbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.yuangonggzjlbiaoService.queryByPage(yuangonggzjlbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Yuangonggzjlbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.yuangonggzjlbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param yuangonggzjlbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Yuangonggzjlbiao> add(Yuangonggzjlbiao yuangonggzjlbiao) {
        return ResponseEntity.ok(this.yuangonggzjlbiaoService.insert(yuangonggzjlbiao));
    }

    /**
     * 编辑数据
     *
     * @param yuangonggzjlbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Yuangonggzjlbiao> edit(Yuangonggzjlbiao yuangonggzjlbiao) {
        return ResponseEntity.ok(this.yuangonggzjlbiaoService.update(yuangonggzjlbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.yuangonggzjlbiaoService.deleteById(id));
    }

}

