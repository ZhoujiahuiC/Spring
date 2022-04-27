package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xingzijilubiao;
import com.trkj.hr.service.XingzijilubiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xingzijilubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("xingzijilubiao")
public class XingzijilubiaoController {
    /**
     * 服务对象
     */
    @Resource
    private XingzijilubiaoService xingzijilubiaoService;

    /**
     * 分页查询
     *
     * @param xingzijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xingzijilubiao>> queryByPage(Xingzijilubiao xingzijilubiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xingzijilubiaoService.queryByPage(xingzijilubiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Xingzijilubiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.xingzijilubiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param xingzijilubiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xingzijilubiao> add(Xingzijilubiao xingzijilubiao) {
        return ResponseEntity.ok(this.xingzijilubiaoService.insert(xingzijilubiao));
    }

    /**
     * 编辑数据
     *
     * @param xingzijilubiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Xingzijilubiao> edit(Xingzijilubiao xingzijilubiao) {
        return ResponseEntity.ok(this.xingzijilubiaoService.update(xingzijilubiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.xingzijilubiaoService.deleteById(id));
    }

}

