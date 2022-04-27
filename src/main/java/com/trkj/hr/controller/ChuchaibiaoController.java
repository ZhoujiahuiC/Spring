package com.trkj.hr.controller;

import com.trkj.hr.pojo.Chuchaibiao;
import com.trkj.hr.service.ChuchaibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Chuchaibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("chuchaibiao")
public class ChuchaibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ChuchaibiaoService chuchaibiaoService;

    /**
     * 分页查询
     *
     * @param chuchaibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Chuchaibiao>> queryByPage(Chuchaibiao chuchaibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.chuchaibiaoService.queryByPage(chuchaibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Chuchaibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.chuchaibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param chuchaibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Chuchaibiao> add(Chuchaibiao chuchaibiao) {
        return ResponseEntity.ok(this.chuchaibiaoService.insert(chuchaibiao));
    }

    /**
     * 编辑数据
     *
     * @param chuchaibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Chuchaibiao> edit(Chuchaibiao chuchaibiao) {
        return ResponseEntity.ok(this.chuchaibiaoService.update(chuchaibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.chuchaibiaoService.deleteById(id));
    }

}

