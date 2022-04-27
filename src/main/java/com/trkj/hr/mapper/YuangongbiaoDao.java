package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Yuangongbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Yuangongbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:33
 */
@Mapper
public interface YuangongbiaoDao extends BaseMapper<Yuangongbiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param ybh 主键
     * @return 实例对象
     */
    Yuangongbiao queryById(Integer ybh);

    /**
     * 查询指定行数据
     *
     * @param yuangongbiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Yuangongbiao> queryAllByLimit(Yuangongbiao yuangongbiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param yuangongbiao 查询条件
     * @return 总行数
     */
    long count(Yuangongbiao yuangongbiao);

    /**
     * 新增数据
     *
     * @param yuangongbiao 实例对象
     * @return 影响行数
     */
    int insert(Yuangongbiao yuangongbiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Yuangongbiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Yuangongbiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Yuangongbiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Yuangongbiao> entities);

    /**
     * 修改数据
     *
     * @param yuangongbiao 实例对象
     * @return 影响行数
     */
    int update(Yuangongbiao yuangongbiao);

    /**
     * 通过主键删除数据
     *
     * @param ybh 主键
     * @return 影响行数
     */
    int deleteById(Integer ybh);

}

