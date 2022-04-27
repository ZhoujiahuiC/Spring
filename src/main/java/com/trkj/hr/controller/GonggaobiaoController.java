package com.trkj.hr.controller;

import com.trkj.hr.pojo.Gonggaobiao;
import com.trkj.hr.service.GonggaobiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Gonggaobiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("gonggaobiao")
public class GonggaobiaoController {
    /**
     * 服务对象
     */
    @Resource
    private GonggaobiaoService gonggaobiaoService;

    /**
     * 分页查询
     *
     * @param gonggaobiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Gonggaobiao>> queryByPage(Gonggaobiao gonggaobiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.gonggaobiaoService.queryByPage(gonggaobiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Gonggaobiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.gonggaobiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param gonggaobiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Gonggaobiao> add(Gonggaobiao gonggaobiao) {
        return ResponseEntity.ok(this.gonggaobiaoService.insert(gonggaobiao));
    }

    /**
     * 编辑数据
     *
     * @param gonggaobiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Gonggaobiao> edit(Gonggaobiao gonggaobiao) {
        return ResponseEntity.ok(this.gonggaobiaoService.update(gonggaobiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.gonggaobiaoService.deleteById(id));
    }

}

