package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Textbook;
import com.qilinxx.rms.domain.model.TextbookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface TextbookMapper extends Mapper<Textbook> {
    int countByExample(TextbookExample example);

    int deleteByExample(TextbookExample example);

    List<Textbook> selectByExample(TextbookExample example);

    int updateByExampleSelective(@Param("record") Textbook record, @Param("example") TextbookExample example);

    int updateByExample(@Param("record") Textbook record, @Param("example") TextbookExample example);
}