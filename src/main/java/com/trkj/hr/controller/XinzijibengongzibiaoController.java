package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinzijibengongzibiao;
import com.trkj.hr.service.XinzijibengongzibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinzijibengongzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("xinzijibengongzibiao")
public class XinzijibengongzibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private XinzijibengongzibiaoService xinzijibengongzibiaoService;

    /**
     * 分页查询
     *
     * @param xinzijibengongzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xinzijibengongzibiao>> queryByPage(Xinzijibengongzibiao xinzijibengongzibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xinzijibengongzibiaoService.queryByPage(xinzijibengongzibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Xinzijibengongzibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.xinzijibengongzibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param xinzijibengongzibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xinzijibengongzibiao> add(Xinzijibengongzibiao xinzijibengongzibiao) {
        return ResponseEntity.ok(this.xinzijibengongzibiaoService.insert(xinzijibengongzibiao));
    }

    /**
     * 编辑数据
     *
     * @param xinzijibengongzibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Xinzijibengongzibiao> edit(Xinzijibengongzibiao xinzijibengongzibiao) {
        return ResponseEntity.ok(this.xinzijibengongzibiaoService.update(xinzijibengongzibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.xinzijibengongzibiaoService.deleteById(id));
    }

}

