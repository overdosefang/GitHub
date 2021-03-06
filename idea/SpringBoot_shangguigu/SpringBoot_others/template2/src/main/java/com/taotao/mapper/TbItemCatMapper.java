package com.taotao.mapper;

import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TbItemCatMapper extends Mapper<TbItemCat> {
    int countByExample(TbItemCatExample example);

    int deleteByExample(TbItemCatExample example);

    List<TbItemCat> selectByExample(TbItemCatExample example);

    int updateByExampleSelective(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);

    int updateByExample(@Param("record") TbItemCat record, @Param("example") TbItemCatExample example);
}