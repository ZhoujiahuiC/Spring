package com.trkj.hr.controller;

import com.trkj.hr.pojo.Xinzizhongjianbiao;
import com.trkj.hr.service.XinzizhongjianbiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Xinzizhongjianbiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("xinzizhongjianbiao")
public class XinzizhongjianbiaoController {
    /**
     * 服务对象
     */
    @Resource
    private XinzizhongjianbiaoService xinzizhongjianbiaoService;

    /**
     * 分页查询
     *
     * @param xinzizhongjianbiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Xinzizhongjianbiao>> queryByPage(Xinzizhongjianbiao xinzizhongjianbiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.xinzizhongjianbiaoService.queryByPage(xinzizhongjianbiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Xinzizhongjianbiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.xinzizhongjianbiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param xinzizhongjianbiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Xinzizhongjianbiao> add(Xinzizhongjianbiao xinzizhongjianbiao) {
        return ResponseEntity.ok(this.xinzizhongjianbiaoService.insert(xinzizhongjianbiao));
    }

    /**
     * 编辑数据
     *
     * @param xinzizhongjianbiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Xinzizhongjianbiao> edit(Xinzizhongjianbiao xinzizhongjianbiao) {
        return ResponseEntity.ok(this.xinzizhongjianbiaoService.update(xinzizhongjianbiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.xinzizhongjianbiaoService.deleteById(id));
    }

}

