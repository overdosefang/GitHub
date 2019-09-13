package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Userinfo;
import com.qilinxx.rms.domain.model.UserinfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserinfoMapper extends Mapper<Userinfo> {
    int countByExample(UserinfoExample example);

    int deleteByExample(UserinfoExample example);

    List<Userinfo> selectByExample(UserinfoExample example);

    int updateByExampleSelective(@Param("record") Userinfo record, @Param("example") UserinfoExample example);

    int updateByExample(@Param("record") Userinfo record, @Param("example") UserinfoExample example);
}