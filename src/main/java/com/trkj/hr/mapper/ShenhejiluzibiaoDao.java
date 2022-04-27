package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Shenhejiluzibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Shenhejiluzibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:47
 */
@Mapper
public interface ShenhejiluzibiaoDao extends BaseMapper<Shenhejiluzibiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param shjlzbbh 主键
     * @return 实例对象
     */
    Shenhejiluzibiao queryById(Integer shjlzbbh);

    /**
     * 查询指定行数据
     *
     * @param shenhejiluzibiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Shenhejiluzibiao> queryAllByLimit(Shenhejiluzibiao shenhejiluzibiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param shenhejiluzibiao 查询条件
     * @return 总行数
     */
    long count(Shenhejiluzibiao shenhejiluzibiao);

    /**
     * 新增数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 影响行数
     */
    int insert(Shenhejiluzibiao shenhejiluzibiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shenhejiluzibiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Shenhejiluzibiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shenhejiluzibiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Shenhejiluzibiao> entities);

    /**
     * 修改数据
     *
     * @param shenhejiluzibiao 实例对象
     * @return 影响行数
     */
    int update(Shenhejiluzibiao shenhejiluzibiao);

    /**
     * 通过主键删除数据
     *
     * @param shjlzbbh 主键
     * @return 影响行数
     */
    int deleteById(Integer shjlzbbh);

}

