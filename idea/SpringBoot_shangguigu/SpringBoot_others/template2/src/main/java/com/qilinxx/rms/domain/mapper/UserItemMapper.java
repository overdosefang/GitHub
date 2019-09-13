package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.UserItem;
import com.qilinxx.rms.domain.model.UserItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface UserItemMapper extends Mapper<UserItem> {
    int countByExample(UserItemExample example);

    int deleteByExample(UserItemExample example);

    List<UserItem> selectByExample(UserItemExample example);

    int updateByExampleSelective(@Param("record") UserItem record, @Param("example") UserItemExample example);

    int updateByExample(@Param("record") UserItem record, @Param("example") UserItemExample example);
}