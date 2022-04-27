package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Bumenbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Bumenbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:55:34
 */
@Mapper
public interface BumenbiaoDao extends BaseMapper<Bumenbiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param bmbh 主键
     * @return 实例对象
     */
    Bumenbiao queryById(Integer bmbh);

    /**
     * 查询指定行数据
     *
     * @param bumenbiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Bumenbiao> queryAllByLimit(Bumenbiao bumenbiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param bumenbiao 查询条件
     * @return 总行数
     */
    long count(Bumenbiao bumenbiao);

    /**
     * 新增数据
     *
     * @param bumenbiao 实例对象
     * @return 影响行数
     */
    int insert(Bumenbiao bumenbiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Bumenbiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Bumenbiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Bumenbiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Bumenbiao> entities);

    /**
     * 修改数据
     *
     * @param bumenbiao 实例对象
     * @return 影响行数
     */
    int update(Bumenbiao bumenbiao);

    /**
     * 通过主键删除数据
     *
     * @param bmbh 主键
     * @return 影响行数
     */
    int deleteById(Integer bmbh);

}

