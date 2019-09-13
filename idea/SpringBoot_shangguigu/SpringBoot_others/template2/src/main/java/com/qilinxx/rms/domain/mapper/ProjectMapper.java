package com.qilinxx.rms.domain.mapper;

import com.qilinxx.rms.domain.model.Project;
import com.qilinxx.rms.domain.model.ProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import tk.mybatis.mapper.common.Mapper;

public interface ProjectMapper extends Mapper<Project> {
    int countByExample(ProjectExample example);

    int deleteByExample(ProjectExample example);

    List<Project> selectByExample(ProjectExample example);

    int updateByExampleSelective(@Param("record") Project record, @Param("example") ProjectExample example);

    int updateByExample(@Param("record") Project record, @Param("example") ProjectExample example);
}