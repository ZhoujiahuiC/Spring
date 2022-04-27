package com.trkj.hr.controller;

import com.trkj.hr.pojo.Shenghebiao;
import com.trkj.hr.service.ShenghebiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Shenghebiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("shenghebiao")
public class ShenghebiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ShenghebiaoService shenghebiaoService;

    /**
     * 分页查询
     *
     * @param shenghebiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Shenghebiao>> queryByPage(Shenghebiao shenghebiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.shenghebiaoService.queryByPage(shenghebiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Shenghebiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.shenghebiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param shenghebiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Shenghebiao> add(Shenghebiao shenghebiao) {
        return ResponseEntity.ok(this.shenghebiaoService.insert(shenghebiao));
    }

    /**
     * 编辑数据
     *
     * @param shenghebiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Shenghebiao> edit(Shenghebiao shenghebiao) {
        return ResponseEntity.ok(this.shenghebiaoService.update(shenghebiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.shenghebiaoService.deleteById(id));
    }

}

