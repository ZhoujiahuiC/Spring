package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Xinziyaosuxiangbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Xinziyaosuxiangbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:46
 */
@Mapper
public interface XinziyaosuxiangbiaoDao extends BaseMapper<Xinziyaosuxiangbiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param xzysbh 主键
     * @return 实例对象
     */
    Xinziyaosuxiangbiao queryById(Integer xzysbh);

    /**
     * 查询指定行数据
     *
     * @param xinziyaosuxiangbiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Xinziyaosuxiangbiao> queryAllByLimit(Xinziyaosuxiangbiao xinziyaosuxiangbiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param xinziyaosuxiangbiao 查询条件
     * @return 总行数
     */
    long count(Xinziyaosuxiangbiao xinziyaosuxiangbiao);

    /**
     * 新增数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 影响行数
     */
    int insert(Xinziyaosuxiangbiao xinziyaosuxiangbiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xinziyaosuxiangbiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Xinziyaosuxiangbiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xinziyaosuxiangbiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Xinziyaosuxiangbiao> entities);

    /**
     * 修改数据
     *
     * @param xinziyaosuxiangbiao 实例对象
     * @return 影响行数
     */
    int update(Xinziyaosuxiangbiao xinziyaosuxiangbiao);

    /**
     * 通过主键删除数据
     *
     * @param xzysbh 主键
     * @return 影响行数
     */
    int deleteById(Integer xzysbh);

}

