package com.trkj.hr.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Rencaibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Rencaibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:42
 */
@Mapper
public interface RencaibiaoDao extends BaseMapper<Rencaibiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param rid 主键
     * @return 实例对象
     */
    Rencaibiao queryById(Integer rid);

    /**
     * 查询指定行数据
     *
     * @param rencaibiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Rencaibiao> queryAllByLimit(Rencaibiao rencaibiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param rencaibiao 查询条件
     * @return 总行数
     */
    long count(Rencaibiao rencaibiao);

    /**
     * 新增数据
     *
     * @param rencaibiao 实例对象
     * @return 影响行数
     */
    int insert(Rencaibiao rencaibiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Rencaibiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Rencaibiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Rencaibiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Rencaibiao> entities);

    /**
     * 修改数据
     *
     * @param rencaibiao 实例对象
     * @return 影响行数
     */
    int update(Rencaibiao rencaibiao);

    /**
     * 通过主键删除数据
     *
     * @param rid 主键
     * @return 影响行数
     */
    int deleteById(Integer rid);

}

