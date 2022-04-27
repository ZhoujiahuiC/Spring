package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shebaofananbiao;
import com.trkj.hr.service.ShebaofananbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shebaofananbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("shebaofananbiao")
public class ShebaofananbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ShebaofananbiaoService shebaofananbiaoService;

    /**
     * 分页查询
     *
     * @param shebaofananbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Shebaofananbiao>> queryByPage(Shebaofananbiao shebaofananbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.shebaofananbiaoService.queryByPage(shebaofananbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Shebaofananbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.shebaofananbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param shebaofananbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Shebaofananbiao> add(Shebaofananbiao shebaofananbiao) {
        return ResponseEntity.ok(this.shebaofananbiaoService.insert(shebaofananbiao));
    }

    /**
     * 编辑数据
     *
     * @param shebaofananbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Shebaofananbiao> edit(Shebaofananbiao shebaofananbiao) {
        return ResponseEntity.ok(this.shebaofananbiaoService.update(shebaofananbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.shebaofananbiaoService.deleteById(id));
    }

}

