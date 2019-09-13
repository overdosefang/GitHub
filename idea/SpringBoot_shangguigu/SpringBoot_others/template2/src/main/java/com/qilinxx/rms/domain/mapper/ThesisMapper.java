package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Thesis;
import com.qilinxx.rms.domain.model.ThesisExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ThesisMapper extends Mapper<Thesis> {
    int countByExample(ThesisExample example);

    int deleteByExample(ThesisExample example);

    List<Thesis> selectByExample(ThesisExample example);

    int updateByExampleSelective(@Param("record") Thesis record, @Param("example") ThesisExample example);

    int updateByExample(@Param("record") Thesis record, @Param("example") ThesisExample example);
}