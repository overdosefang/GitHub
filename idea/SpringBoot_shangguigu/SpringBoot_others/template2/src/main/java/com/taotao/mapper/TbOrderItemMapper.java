package com.taotao.mapper;

import com.taotao.pojo.TbOrderItem;
import com.taotao.pojo.TbOrderItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TbOrderItemMapper extends Mapper<TbOrderItem> {
    int countByExample(TbOrderItemExample example);

    int deleteByExample(TbOrderItemExample example);

    List<TbOrderItem> selectByExample(TbOrderItemExample example);

    int updateByExampleSelective(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);

    int updateByExample(@Param("record") TbOrderItem record, @Param("example") TbOrderItemExample example);
}