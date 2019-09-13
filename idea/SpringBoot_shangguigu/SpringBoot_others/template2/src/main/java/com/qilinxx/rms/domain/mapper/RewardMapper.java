package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Reward;
import com.qilinxx.rms.domain.model.RewardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface RewardMapper extends Mapper<Reward> {
    int countByExample(RewardExample example);

    int deleteByExample(RewardExample example);

    List<Reward> selectByExample(RewardExample example);

    int updateByExampleSelective(@Param("record") Reward record, @Param("example") RewardExample example);

    int updateByExample(@Param("record") Reward record, @Param("example") RewardExample example);
}