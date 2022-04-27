package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import com.trkj.hr.service.XinziyaosuxiangbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinziyaosuxiangbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("xinziyaosuxiangbiao")
public class XinziyaosuxiangbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private XinziyaosuxiangbiaoService xinziyaosuxiangbiaoService;

    /**
     * 分页查询
     *
     * @param xinziyaosuxiangbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xinziyaosuxiangbiao>> queryByPage(Xinziyaosuxiangbiao xinziyaosuxiangbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xinziyaosuxiangbiaoService.queryByPage(xinziyaosuxiangbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Xinziyaosuxiangbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.xinziyaosuxiangbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param xinziyaosuxiangbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xinziyaosuxiangbiao> add(Xinziyaosuxiangbiao xinziyaosuxiangbiao) {
        return ResponseEntity.ok(this.xinziyaosuxiangbiaoService.insert(xinziyaosuxiangbiao));
    }

    /**
     * 编辑数据
     *
     * @param xinziyaosuxiangbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Xinziyaosuxiangbiao> edit(Xinziyaosuxiangbiao xinziyaosuxiangbiao) {
        return ResponseEntity.ok(this.xinziyaosuxiangbiaoService.update(xinziyaosuxiangbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.xinziyaosuxiangbiaoService.deleteById(id));
    }

}

