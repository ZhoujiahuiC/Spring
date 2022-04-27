package com.trkj.hr.controller;

import com.trkj.hr.pojo.Rizhidianpingbiao;
import com.trkj.hr.pojo.Zhiweibiao;
import com.trkj.hr.service.RizhidianpingbiaoService;
import com.trkj.hr.service.ZhiweibiaoService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Zhiweibiao)表控制层
 *
 * @author makejava
 * @since 2022-04-27 14:54:14
 */
@RestController
@RequestMapping("zhiweibiao")
public class ZhiweibiaoController {
    /**
     * 服务对象
     */
    @Resource
    private ZhiweibiaoService zhiweibiaoService;

    /**
     * 分页查询
     *
     * @param zhiweibiao 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public ResponseEntity<Page<Zhiweibiao>> queryByPage(Zhiweibiao zhiweibiao, PageRequest pageRequest) {
        return ResponseEntity.ok(this.zhiweibiaoService.queryByPage(zhiweibiao, pageRequest));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public ResponseEntity<Zhiweibiao> queryById(@PathVariable("id") Integer id) {
        return ResponseEntity.ok(this.zhiweibiaoService.queryById(id));
    }

    /**
     * 新增数据
     *
     * @param zhiweibiao 实体
     * @return 新增结果
     */
    @PostMapping
    public ResponseEntity<Zhiweibiao> add(Zhiweibiao zhiweibiao) {
        return ResponseEntity.ok(this.zhiweibiaoService.insert(zhiweibiao));
    }

    /**
     * 编辑数据
     *
     * @param zhiweibiao 实体
     * @return 编辑结果
     */
    @PutMapping
    public ResponseEntity<Zhiweibiao> edit(Zhiweibiao zhiweibiao) {
        return ResponseEntity.ok(this.zhiweibiaoService.update(zhiweibiao));
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public ResponseEntity<Boolean> deleteById(Integer id) {
        return ResponseEntity.ok(this.zhiweibiaoService.deleteById(id));
    }

    /**
     * (Rizhidianpingbiao)表控制层
     *
     * @author makejava
     * @since 2022-04-27 14:53:58
     */
    @RestController
    @RequestMapping("rizhidianpingbiao")
    public static class RizhidianpingbiaoController {
        /**
         * 服务对象
         */
        @Resource
        private RizhidianpingbiaoService rizhidianpingbiaoService;

        /**
         * 分页查询
         *
         * @param rizhidianpingbiao 筛选条件
         * @param pageRequest      分页对象
         * @return 查询结果
         */
        @GetMapping
        public ResponseEntity<Page<Rizhidianpingbiao>> queryByPage(Rizhidianpingbiao rizhidianpingbiao, PageRequest pageRequest) {
            return ResponseEntity.ok(this.rizhidianpingbiaoService.queryByPage(rizhidianpingbiao, pageRequest));
        }

        /**
         * 通过主键查询单条数据
         *
         * @param id 主键
         * @return 单条数据
         */
        @GetMapping("{id}")
        public ResponseEntity<Rizhidianpingbiao> queryById(@PathVariable("id") Integer id) {
            return ResponseEntity.ok(this.rizhidianpingbiaoService.queryById(id));
        }

        /**
         * 新增数据
         *
         * @param rizhidianpingbiao 实体
         * @return 新增结果
         */
        @PostMapping
        public ResponseEntity<Rizhidianpingbiao> add(Rizhidianpingbiao rizhidianpingbiao) {
            return ResponseEntity.ok(this.rizhidianpingbiaoService.insert(rizhidianpingbiao));
        }

        /**
         * 编辑数据
         *
         * @param rizhidianpingbiao 实体
         * @return 编辑结果
         */
        @PutMapping
        public ResponseEntity<Rizhidianpingbiao> edit(Rizhidianpingbiao rizhidianpingbiao) {
            return ResponseEntity.ok(this.rizhidianpingbiaoService.update(rizhidianpingbiao));
        }

        /**
         * 删除数据
         *
         * @param id 主键
         * @return 删除是否成功
         */
        @DeleteMapping
        public ResponseEntity<Boolean> deleteById(Integer id) {
            return ResponseEntity.ok(this.rizhidianpingbiaoService.deleteById(id));
        }

    }
}

