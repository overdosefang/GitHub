package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Meeting;
import com.qilinxx.rms.domain.model.MeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface MeetingMapper extends Mapper<Meeting> {
    int countByExample(MeetingExample example);

    int deleteByExample(MeetingExample example);

    List<Meeting> selectByExample(MeetingExample example);

    int updateByExampleSelective(@Param("record") Meeting record, @Param("example") MeetingExample example);

    int updateByExample(@Param("record") Meeting record, @Param("example") MeetingExample example);
}