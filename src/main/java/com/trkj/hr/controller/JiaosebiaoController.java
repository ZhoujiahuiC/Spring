package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jiaosebiao;
import com.trkj.hr.service.JiaosebiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jiaosebiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jiaosebiao")
public class JiaosebiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JiaosebiaoService jiaosebiaoService;

    /**
     * 分页查询
     *
     * @param jiaosebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jiaosebiao>> queryByPage(Jiaosebiao jiaosebiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jiaosebiaoService.queryByPage(jiaosebiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Jiaosebiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.jiaosebiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param jiaosebiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jiaosebiao> add(Jiaosebiao jiaosebiao) {
        return ResponseEntity.ok(this.jiaosebiaoService.insert(jiaosebiao));
    }

    /**
     * 编辑数据
     *
     * @param jiaosebiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Jiaosebiao> edit(Jiaosebiao jiaosebiao) {
        return ResponseEntity.ok(this.jiaosebiaoService.update(jiaosebiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.jiaosebiaoService.deleteById(id));
    }

}

