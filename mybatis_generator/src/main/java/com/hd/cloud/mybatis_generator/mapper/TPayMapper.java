package com.hd.cloud.mybatis_generator.mapper;

import com.hd.cloud.mybatis_generator.entities.TPay;
import com.hd.cloud.mybatis_generator.entities.TPayExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TPayMapper {
    int countByExample(TPayExample example);

    int deleteByExample(TPayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TPay record);

    int insertSelective(TPay record);

    List<TPay> selectByExample(TPayExample example);

    TPay selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TPay record, @Param("example") TPayExample example);

    int updateByExample(@Param("record") TPay record, @Param("example") TPayExample example);

    int updateByPrimaryKeySelective(TPay record);

    int updateByPrimaryKey(TPay record);
}
