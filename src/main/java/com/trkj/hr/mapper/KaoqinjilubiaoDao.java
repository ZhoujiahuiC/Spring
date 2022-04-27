package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Kaoqinjilubiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Kaoqinjilubiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:42
 */
@Mapper
public interface KaoqinjilubiaoDao extends BaseMapper<Kaoqinjilubiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param kqjlbh 主键
     * @return 实例对象
     */
    Kaoqinjilubiao queryById(Integer kqjlbh);

    /**
     * 查询指定行数据
     *
     * @param kaoqinjilubiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Kaoqinjilubiao> queryAllByLimit(Kaoqinjilubiao kaoqinjilubiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param kaoqinjilubiao 查询条件
     * @return 总行数
     */
    long count(Kaoqinjilubiao kaoqinjilubiao);

    /**
     * 新增数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 影响行数
     */
    int insert(Kaoqinjilubiao kaoqinjilubiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Kaoqinjilubiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Kaoqinjilubiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Kaoqinjilubiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Kaoqinjilubiao> entities);

    /**
     * 修改数据
     *
     * @param kaoqinjilubiao 实例对象
     * @return 影响行数
     */
    int update(Kaoqinjilubiao kaoqinjilubiao);

    /**
     * 通过主键删除数据
     *
     * @param kqjlbh 主键
     * @return 影响行数
     */
    int deleteById(Integer kqjlbh);

}

