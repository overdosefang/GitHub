package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Log;
import com.qilinxx.rms.domain.model.LogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface LogMapper extends Mapper<Log> {
    int countByExample(LogExample example);

    int deleteByExample(LogExample example);

    List<Log> selectByExample(LogExample example);

    int updateByExampleSelective(@Param("record") Log record, @Param("example") LogExample example);

    int updateByExample(@Param("record") Log record, @Param("example") LogExample example);
}