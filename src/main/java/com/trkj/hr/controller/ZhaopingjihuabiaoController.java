package com.trkj.hr.controller;

import com.trkj.hr.pojo.Zhaopingjihuabiao;
import com.trkj.hr.service.ZhaopingjihuabiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Zhaopingjihuabiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("zhaopingjihuabiao")
public class ZhaopingjihuabiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ZhaopingjihuabiaoService zhaopingjihuabiaoService;

    /**
     * 分页查询
     *
     * @param zhaopingjihuabiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Zhaopingjihuabiao>> queryByPage(Zhaopingjihuabiao zhaopingjihuabiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.zhaopingjihuabiaoService.queryByPage(zhaopingjihuabiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Zhaopingjihuabiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.zhaopingjihuabiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param zhaopingjihuabiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Zhaopingjihuabiao> add(Zhaopingjihuabiao zhaopingjihuabiao) {
        return ResponseEntity.ok(this.zhaopingjihuabiaoService.insert(zhaopingjihuabiao));
    }

    /**
     * 编辑数据
     *
     * @param zhaopingjihuabiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Zhaopingjihuabiao> edit(Zhaopingjihuabiao zhaopingjihuabiao) {
        return ResponseEntity.ok(this.zhaopingjihuabiaoService.update(zhaopingjihuabiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.zhaopingjihuabiaoService.deleteById(id));
    }

}

