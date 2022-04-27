package com.trkj.hr.controller;

import com.trkj.hr.pojo.Mianshijilubiao;
import com.trkj.hr.service.MianshijilubiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Mianshijilubiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:53:58
 */
@RestController
@RequestMapping("mianshijilubiao")
public class MianshijilubiaoController {
    /**
     * 服务对象
     */
    @Resource
    private MianshijilubiaoService mianshijilubiaoService;

    /**
     * 分页查询
     *
     * @param mianshijilubiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Mianshijilubiao>> queryByPage(Mianshijilubiao mianshijilubiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.mianshijilubiaoService.queryByPage(mianshijilubiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Mianshijilubiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.mianshijilubiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param mianshijilubiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Mianshijilubiao> add(Mianshijilubiao mianshijilubiao) {
        return ResponseEntity.ok(this.mianshijilubiaoService.insert(mianshijilubiao));
    }

    /**
     * 编辑数据
     *
     * @param mianshijilubiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Mianshijilubiao> edit(Mianshijilubiao mianshijilubiao) {
        return ResponseEntity.ok(this.mianshijilubiaoService.update(mianshijilubiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.mianshijilubiaoService.deleteById(id));
    }

}

