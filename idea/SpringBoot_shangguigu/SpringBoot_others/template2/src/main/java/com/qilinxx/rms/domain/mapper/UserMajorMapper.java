package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.UserMajor;
import com.qilinxx.rms.domain.model.UserMajorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserMajorMapper extends Mapper<UserMajor> {
    int countByExample(UserMajorExample example);

    int deleteByExample(UserMajorExample example);

    List<UserMajor> selectByExample(UserMajorExample example);

    int updateByExampleSelective(@Param("record") UserMajor record, @Param("example") UserMajorExample example);

    int updateByExample(@Param("record") UserMajor record, @Param("example") UserMajorExample example);
}