package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Major;
import com.qilinxx.rms.domain.model.MajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MajorMapper extends Mapper<Major> {
    int countByExample(MajorExample example);

    int deleteByExample(MajorExample example);

    List<Major> selectByExample(MajorExample example);

    int updateByExampleSelective(@Param("record") Major record, @Param("example") MajorExample example);

    int updateByExample(@Param("record") Major record, @Param("example") MajorExample example);
}