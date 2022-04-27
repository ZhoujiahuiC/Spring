package com.trkj.hr.controller;

import com.trkj.hr.pojo.Jiaosequanxianbiao;
import com.trkj.hr.service.JiaosequanxianbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Jiaosequanxianbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("jiaosequanxianbiao")
public class JiaosequanxianbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private JiaosequanxianbiaoService jiaosequanxianbiaoService;

    /**
     * 分页查询
     *
     * @param jiaosequanxianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Jiaosequanxianbiao>> queryByPage(Jiaosequanxianbiao jiaosequanxianbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.jiaosequanxianbiaoService.queryByPage(jiaosequanxianbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
//    @GetMapping("{id}")
//    public ResponseEntity<Jiaosequanxianbiao> queryById(@PathVariable("id")  id) {
//        return ResponseEntity.ok(this.jiaosequanxianbiaoService.queryById(id));
//    }

    /**
     * 新增数据
     *
     * @param jiaosequanxianbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Jiaosequanxianbiao> add(Jiaosequanxianbiao jiaosequanxianbiao) {
        return ResponseEntity.ok(this.jiaosequanxianbiaoService.insert(jiaosequanxianbiao));
    }

    /**
     * 编辑数据
     *
     * @param jiaosequanxianbiao 实体
     * @return 编辑结果
     */
//    @PutMapping
//    public ResponseEntity<Jiaosequanxianbiao> edit(Jiaosequanxianbiao jiaosequanxianbiao) {
//        return ResponseEntity.ok(this.jiaosequanxianbiaoService.update(jiaosequanxianbiao));
//    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
//    @DeleteMapping
//    public ResponseEntity<Boolean> deleteById( id) {
//        return ResponseEntity.ok(this.jiaosequanxianbiaoService.deleteById(id));
//    }

}

