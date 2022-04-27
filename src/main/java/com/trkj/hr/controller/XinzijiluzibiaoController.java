package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinzijiluzibiao;
import com.trkj.hr.service.XinzijiluzibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinzijiluzibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("xinzijiluzibiao")
public class XinzijiluzibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private XinzijiluzibiaoService xinzijiluzibiaoService;

    /**
     * 分页查询
     *
     * @param xinzijiluzibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xinzijiluzibiao>> queryByPage(Xinzijiluzibiao xinzijiluzibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xinzijiluzibiaoService.queryByPage(xinzijiluzibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public ResponseEntity<Xinzijiluzibiao> queryById(@PathVariable("id")  id) {
//        return ResponseEntity.ok(this.xinzijiluzibiaoService.queryById(id));
//    }

    /**
     * 新增数据
     *
     * @param xinzijiluzibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xinzijiluzibiao> add(Xinzijiluzibiao xinzijiluzibiao) {
        return ResponseEntity.ok(this.xinzijiluzibiaoService.insert(xinzijiluzibiao));
    }

    /**
     * 编辑数据
     *
     * @param xinzijiluzibiao 实体
     * @return 编辑结果
     */
//    @PutMapping
//    public ResponseEntity<Xinzijiluzibiao> edit(Xinzijiluzibiao xinzijiluzibiao) {
//        return ResponseEntity.ok(this.xinzijiluzibiaoService.update(xinzijiluzibiao));
//    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById( id) {
//        return ResponseEntity.ok(this.xinzijiluzibiaoService.deleteById(id));
//    }

}

