package com.trkj.hr.controller;

import com.trkj.hr.pojo.Sbzjb;
import com.trkj.hr.service.SbzjbService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Sbzjb)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:13
 */
@RestController
@RequestMapping("sbzjb")
public class SbzjbController {
    /**
     * 服务对象
     */
    @Resource
    private SbzjbService sbzjbService;

    /**
     * 分页查询
     *
     * @param sbzjb 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Sbzjb>> queryByPage(Sbzjb sbzjb, PageRequest pageRequest) {
        return ResponseEntity.ok(this.sbzjbService.queryByPage(sbzjb, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public ResponseEntity<Sbzjb> queryById(@PathVariable("id")  id) {
//        return ResponseEntity.ok(this.sbzjbService.queryById(id));
//    }

    /**
     * 新增数据
     *
     * @param sbzjb 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Sbzjb> add(Sbzjb sbzjb) {
        return ResponseEntity.ok(this.sbzjbService.insert(sbzjb));
    }

    /**
     * 编辑数据
     *
     * @param sbzjb 实体
     * @return 编辑结果
     */
//    @PutMapping
//    public ResponseEntity<Sbzjb> edit(Sbzjb sbzjb) {
//        return ResponseEntity.ok(this.sbzjbService.update(sbzjb));
//    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById( id) {
//        return ResponseEntity.ok(this.sbzjbService.deleteById(id));
//    }

}

