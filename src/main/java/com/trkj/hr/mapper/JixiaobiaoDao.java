package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Jixiaobiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Jixiaobiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:46
 */
@Mapper
public interface JixiaobiaoDao extends BaseMapper<Jixiaobiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param jbh 主键
     * @return 实例对象
     */
    Jixiaobiao queryById(Integer jbh);

    /**
     * 查询指定行数据
     *
     * @param jixiaobiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Jixiaobiao> queryAllByLimit(Jixiaobiao jixiaobiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param jixiaobiao 查询条件
     * @return 总行数
     */
    long count(Jixiaobiao jixiaobiao);

    /**
     * 新增数据
     *
     * @param jixiaobiao 实例对象
     * @return 影响行数
     */
    int insert(Jixiaobiao jixiaobiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Jixiaobiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Jixiaobiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Jixiaobiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Jixiaobiao> entities);

    /**
     * 修改数据
     *
     * @param jixiaobiao 实例对象
     * @return 影响行数
     */
    int update(Jixiaobiao jixiaobiao);

    /**
     * 通过主键删除数据
     *
     * @param jbh 主键
     * @return 影响行数
     */
    int deleteById(Integer jbh);

}

