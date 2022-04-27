package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jixiaodinjibiao;
import com.trkj.hr.service.JixiaodinjibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jixiaodinjibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jixiaodinjibiao")
public class JixiaodinjibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JixiaodinjibiaoService jixiaodinjibiaoService;

    /**
     * 分页查询
     *
     * @param jixiaodinjibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jixiaodinjibiao>> queryByPage(Jixiaodinjibiao jixiaodinjibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jixiaodinjibiaoService.queryByPage(jixiaodinjibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Jixiaodinjibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jixiaodinjibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jixiaodinjibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jixiaodinjibiao> add(Jixiaodinjibiao jixiaodinjibiao) {
        return ResponseEntity.ok(this.jixiaodinjibiaoService.insert(jixiaodinjibiao));
    }

    /**
     * 编辑数据
     *
     * @param jixiaodinjibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Jixiaodinjibiao> edit(Jixiaodinjibiao jixiaodinjibiao) {
        return ResponseEntity.ok(this.jixiaodinjibiaoService.update(jixiaodinjibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jixiaodinjibiaoService.deleteById(id));
    }

}

