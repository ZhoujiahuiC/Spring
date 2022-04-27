package com.trkj.hr.controller;

import com.trkj.hr.pojo.Quanxianbiao;
import com.trkj.hr.service.QuanxianbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Quanxianbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("quanxianbiao")
public class QuanxianbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private QuanxianbiaoService quanxianbiaoService;

    /**
     * 分页查询
     *
     * @param quanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Quanxianbiao>> queryByPage(Quanxianbiao quanxianbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.quanxianbiaoService.queryByPage(quanxianbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Quanxianbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.quanxianbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param quanxianbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Quanxianbiao> add(Quanxianbiao quanxianbiao) {
        return ResponseEntity.ok(this.quanxianbiaoService.insert(quanxianbiao));
    }

    /**
     * 编辑数据
     *
     * @param quanxianbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Quanxianbiao> edit(Quanxianbiao quanxianbiao) {
        return ResponseEntity.ok(this.quanxianbiaoService.update(quanxianbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.quanxianbiaoService.deleteById(id));
    }

}

