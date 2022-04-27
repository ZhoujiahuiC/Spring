package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Shenhejilubiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Shenhejilubiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:45
 */
@Mapper
public interface ShenhejilubiaoDao extends BaseMapper<Shenhejilubiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param shjlbh 主键
     * @return 实例对象
     */
    Shenhejilubiao queryById(Integer shjlbh);

    /**
     * 查询指定行数据
     *
     * @param shenhejilubiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Shenhejilubiao> queryAllByLimit(Shenhejilubiao shenhejilubiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param shenhejilubiao 查询条件
     * @return 总行数
     */
    long count(Shenhejilubiao shenhejilubiao);

    /**
     * 新增数据
     *
     * @param shenhejilubiao 实例对象
     * @return 影响行数
     */
    int insert(Shenhejilubiao shenhejilubiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shenhejilubiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Shenhejilubiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Shenhejilubiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Shenhejilubiao> entities);

    /**
     * 修改数据
     *
     * @param shenhejilubiao 实例对象
     * @return 影响行数
     */
    int update(Shenhejilubiao shenhejilubiao);

    /**
     * 通过主键删除数据
     *
     * @param shjlbh 主键
     * @return 影响行数
     */
    int deleteById(Integer shjlbh);

}

