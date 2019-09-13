package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Document;
import com.qilinxx.rms.domain.model.DocumentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface DocumentMapper extends Mapper<Document> {
    int countByExample(DocumentExample example);

    int deleteByExample(DocumentExample example);

    List<Document> selectByExample(DocumentExample example);

    int updateByExampleSelective(@Param("record") Document record, @Param("example") DocumentExample example);

    int updateByExample(@Param("record") Document record, @Param("example") DocumentExample example);
}