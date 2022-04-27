package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Gonggaobiao;
import com.trkj.hr.pojo.Rizhidianpingbiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Gonggaobiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:55:39
 */
@Mapper
public interface GonggaobiaoDao extends BaseMapper<Gonggaobiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param ggbh 主键
     * @return 实例对象
     */
    Gonggaobiao queryById(Integer ggbh);

    /**
     * 查询指定行数据
     *
     * @param gonggaobiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Gonggaobiao> queryAllByLimit(Gonggaobiao gonggaobiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param gonggaobiao 查询条件
     * @return 总行数
     */
    long count(Gonggaobiao gonggaobiao);

    /**
     * 新增数据
     *
     * @param gonggaobiao 实例对象
     * @return 影响行数
     */
    int insert(Gonggaobiao gonggaobiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Gonggaobiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Gonggaobiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Gonggaobiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Gonggaobiao> entities);

    /**
     * 修改数据
     *
     * @param gonggaobiao 实例对象
     * @return 影响行数
     */
    int update(Gonggaobiao gonggaobiao);

    /**
     * 通过主键删除数据
     *
     * @param ggbh 主键
     * @return 影响行数
     */
    int deleteById(Integer ggbh);

    /**
     * (Rizhidianpingbiao)表数据库访问层
     *
     * @author makejava
     * @since 2022-04-27 15:36:08
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

