package com.trkj.hr.controller;

import com.trkj.hr.pojo.Nashuibiao;
import com.trkj.hr.service.NashuibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Nashuibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("nashuibiao")
public class NashuibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private NashuibiaoService nashuibiaoService;

    /**
     * 分页查询
     *
     * @param nashuibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Nashuibiao>> queryByPage(Nashuibiao nashuibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.nashuibiaoService.queryByPage(nashuibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Nashuibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.nashuibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param nashuibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Nashuibiao> add(Nashuibiao nashuibiao) {
        return ResponseEntity.ok(this.nashuibiaoService.insert(nashuibiao));
    }

    /**
     * 编辑数据
     *
     * @param nashuibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Nashuibiao> edit(Nashuibiao nashuibiao) {
        return ResponseEntity.ok(this.nashuibiaoService.update(nashuibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.nashuibiaoService.deleteById(id));
    }

}

