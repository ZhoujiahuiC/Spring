package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jixiaobiao;
import com.trkj.hr.service.JixiaobiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jixiaobiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jixiaobiao")
public class JixiaobiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JixiaobiaoService jixiaobiaoService;

    /**
     * 分页查询
     *
     * @param jixiaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jixiaobiao>> queryByPage(Jixiaobiao jixiaobiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jixiaobiaoService.queryByPage(jixiaobiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Jixiaobiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jixiaobiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jixiaobiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jixiaobiao> add(Jixiaobiao jixiaobiao) {
        return ResponseEntity.ok(this.jixiaobiaoService.insert(jixiaobiao));
    }

    /**
     * 编辑数据
     *
     * @param jixiaobiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Jixiaobiao> edit(Jixiaobiao jixiaobiao) {
        return ResponseEntity.ok(this.jixiaobiaoService.update(jixiaobiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jixiaobiaoService.deleteById(id));
    }

}

