package com.trkj.hr.controller;

import com.trkj.hr.pojo.Mianshiguizhanbiao;
import com.trkj.hr.service.MianshiguizhanbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mianshiguizhanbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("mianshiguizhanbiao")
public class MianshiguizhanbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private MianshiguizhanbiaoService mianshiguizhanbiaoService;

    /**
     * 分页查询
     *
     * @param mianshiguizhanbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Mianshiguizhanbiao>> queryByPage(Mianshiguizhanbiao mianshiguizhanbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.mianshiguizhanbiaoService.queryByPage(mianshiguizhanbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Mianshiguizhanbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mianshiguizhanbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mianshiguizhanbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Mianshiguizhanbiao> add(Mianshiguizhanbiao mianshiguizhanbiao) {
        return ResponseEntity.ok(this.mianshiguizhanbiaoService.insert(mianshiguizhanbiao));
    }

    /**
     * 编辑数据
     *
     * @param mianshiguizhanbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Mianshiguizhanbiao> edit(Mianshiguizhanbiao mianshiguizhanbiao) {
        return ResponseEntity.ok(this.mianshiguizhanbiaoService.update(mianshiguizhanbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mianshiguizhanbiaoService.deleteById(id));
    }

}

