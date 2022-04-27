package com.trkj.hr.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.trkj.hr.pojo.Xinzijibengongzibiao;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.data.domain.Pageable;
import java.util.List;

/**
 * (Xinzijibengongzibiao)表数据库访问层
 *
 * @author makejava
 * @since 2022-04-27 10:54:42
 */
@Mapper
public interface XinzijibengongzibiaoDao extends BaseMapper<Xinzijibengongzibiao> {

    /**
     * 通过ID查询单条数据
     *
     * @param xzjbbh 主键
     * @return 实例对象
     */
    Xinzijibengongzibiao queryById(Integer xzjbbh);

    /**
     * 查询指定行数据
     *
     * @param xinzijibengongzibiao 查询条件
     * @param pageable         分页对象
     * @return 对象列表
     */
    List<Xinzijibengongzibiao> queryAllByLimit(Xinzijibengongzibiao xinzijibengongzibiao, @Param("pageable") Pageable pageable);

    /**
     * 统计总行数
     *
     * @param xinzijibengongzibiao 查询条件
     * @return 总行数
     */
    long count(Xinzijibengongzibiao xinzijibengongzibiao);

    /**
     * 新增数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 影响行数
     */
    int insert(Xinzijibengongzibiao xinzijibengongzibiao);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xinzijibengongzibiao> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Xinzijibengongzibiao> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Xinzijibengongzibiao> 实例对象列表
     * @return 影响行数
     * @throws org.springframework.jdbc.BadSqlGrammarException 入参是空List的时候会抛SQL语句错误的异常，请自行校验入参
     */
    int insertOrUpdateBatch(@Param("entities") List<Xinzijibengongzibiao> entities);

    /**
     * 修改数据
     *
     * @param xinzijibengongzibiao 实例对象
     * @return 影响行数
     */
    int update(Xinzijibengongzibiao xinzijibengongzibiao);

    /**
     * 通过主键删除数据
     *
     * @param xzjbbh 主键
     * @return 影响行数
     */
    int deleteById(Integer xzjbbh);

}
