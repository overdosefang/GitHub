package com.taotao.mapper;

import com.taotao.pojo.TbContentCategory;
import com.taotao.pojo.TbContentCategoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TbContentCategoryMapper extends Mapper<TbContentCategory> {
    int countByExample(TbContentCategoryExample example);

    int deleteByExample(TbContentCategoryExample example);

    List<TbContentCategory> selectByExample(TbContentCategoryExample example);

    int updateByExampleSelective(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);

    int updateByExample(@Param("record") TbContentCategory record, @Param("example") TbContentCategoryExample example);
}