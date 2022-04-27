package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Jixiaopinfenbiao;
import com.trkj.hr.pojo.Rizhidianpingbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Jixiaopinfenbiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:47
 */
@Mapper
public interface JixiaopinfenbiaoDao extends BaseMapper<Jixiaopinfenbiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param jxbh 主键
     * @return 实例对象
     */
    Jixiaopinfenbiao queryById(Integer jxbh);

    /**
     * 查询指定行数据
     *
     * @param jixiaopinfenbiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Jixiaopinfenbiao> queryAllByLimit(Jixiaopinfenbiao jixiaopinfenbiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param jixiaopinfenbiao 查询条件
     * @return 总行数
     */
    long count(Jixiaopinfenbiao jixiaopinfenbiao);

    /**
     * 新增数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 影响行数
     */
    int insert(Jixiaopinfenbiao jixiaopinfenbiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Jixiaopinfenbiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Jixiaopinfenbiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Jixiaopinfenbiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Jixiaopinfenbiao> entities);

    /**
     * 修改数据
     *
     * @param jixiaopinfenbiao 实例对象
     * @return 影响行数
     */
    int update(Jixiaopinfenbiao jixiaopinfenbiao);

    /**
     * 通过主键删除数据
     *
     * @param jxbh 主键
     * @return 影响行数
     */
    int deleteById(Integer jxbh);

    /**
     * (Rizhidianpingbiao)表数据库访问层
     *
     * @author makejava
     * @since 2022-04-27 15:40:10
     */
    interface RizhidianpingbiaoDao {

        /**
         * 通过ID查询单条数据
         *
         * @param rzdpbh 主键
         * @return 实例对象
         */
        Rizhidianpingbiao queryById(Integer rzdpbh);

        /**
         * 查询指定行数据
         *
         * @param rizhidianpingbiao 查询条件
         * @param pageable         分页对象
         * @return 对象列表
         */
        List<Rizhidianpingbiao> queryAllByLimit(Rizhidianpingbiao rizhidianpingbiao, @Param("pageable") Pageable pageable);

        /**
         * 统计总行数
         *
         * @param rizhidianpingbiao 查询条件
         * @return 总行数
         */
        long count(Rizhidianpingbiao rizhidianpingbiao);

        /**
         * 新增数据
         *
         * @param rizhidianpingbiao 实例对象
         * @return 影响行数
         */
        int insert(Rizhidianpingbiao rizhidianpingbiao);

        /**
         * 批量新增数据（MyBatis原生foreach方法）
         *
         * @param entities List<Rizhidianpingbiao> 实例对象列表
         * @return 影响行数
         */
        int insertBatch(@Param("entities") List<Rizhidianpingbiao> entities);

        /**
         * 批量新增或按主键更新数据（MyBatis原生foreach方法）
         *
         * @param entities List<Rizhidianpingbiao> 实例对象列表
         * @return 影响行数
         * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
         */
        int insertOrUpdateBatch(@Param("entities") List<Rizhidianpingbiao> entities);

        /**
         * 修改数据
         *
         * @param rizhidianpingbiao 实例对象
         * @return 影响行数
         */
        int update(Rizhidianpingbiao rizhidianpingbiao);

        /**
         * 通过主键删除数据
         *
         * @param rzdpbh 主键
         * @return 影响行数
         */
        int deleteById(Integer rzdpbh);

    }
}

