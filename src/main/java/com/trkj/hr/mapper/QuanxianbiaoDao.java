package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Quanxianbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Quanxianbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:47
 */
@Mapper
public interface QuanxianbiaoDao extends BaseMapper<Quanxianbiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param qxbh 主键
     * @return 实例对象
     */
    Quanxianbiao queryById(Integer qxbh);

    /**
     * 查询指定行数据
     *
     * @param quanxianbiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Quanxianbiao> queryAllByLimit(Quanxianbiao quanxianbiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param quanxianbiao 查询条件
     * @return 总行数
     */
    long count(Quanxianbiao quanxianbiao);

    /**
     * 新增数据
     *
     * @param quanxianbiao 实例对象
     * @return 影响行数
     */
    int insert(Quanxianbiao quanxianbiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Quanxianbiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Quanxianbiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Quanxianbiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Quanxianbiao> entities);

    /**
     * 修改数据
     *
     * @param quanxianbiao 实例对象
     * @return 影响行数
     */
    int update(Quanxianbiao quanxianbiao);

    /**
     * 通过主键删除数据
     *
     * @param qxbh 主键
     * @return 影响行数
     */
    int deleteById(Integer qxbh);

}

