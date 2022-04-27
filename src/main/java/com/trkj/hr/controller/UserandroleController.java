package com.trkj.hr.controller;

import com.trkj.hr.pojo.Userandrole;
import com.trkj.hr.service.UserandroleService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Userandrole)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("userandrole")
public class UserandroleController {
    /**
     * 服务对象
     */
    @Resource
    private UserandroleService userandroleService;

    /**
     * 分页查询
     *
     * @param userandrole 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Userandrole>> queryByPage(Userandrole userandrole, PageRequest pageRequest) {
        return ResponseEntity.ok(this.userandroleService.queryByPage(userandrole, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public ResponseEntity<Userandrole> queryById(@PathVariable("id")  id) {
//        return ResponseEntity.ok(this.userandroleService.queryById(id));
//    }

    /**
     * 新增数据
     *
     * @param userandrole 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Userandrole> add(Userandrole userandrole) {
        return ResponseEntity.ok(this.userandroleService.insert(userandrole));
    }

    /**
     * 编辑数据
     *
     * @param userandrole 实体
     * @return 编辑结果
     */
//    @PutMapping
//    public ResponseEntity<Userandrole> edit(Userandrole userandrole) {
//        return ResponseEntity.ok(this.userandroleService.update(userandrole));
//    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById( id) {
//        return ResponseEntity.ok(this.userandroleService.deleteById(id));
//    }

}

