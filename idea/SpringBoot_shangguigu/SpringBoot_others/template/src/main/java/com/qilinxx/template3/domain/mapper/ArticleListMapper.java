package com.qilinxx.template3.domain.mapper;

import com.qilinxx.template3.domain.model.ArticleList;
import com.qilinxx.template3.domain.model.ArticleListExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ArticleListMapper {
    int countByExample(ArticleListExample example);

    int deleteByExample(ArticleListExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ArticleList record);

    int insertSelective(ArticleList record);

    List<ArticleList> selectByExample(ArticleListExample example);

    ArticleList selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ArticleList record, @Param("example") ArticleListExample example);

    int updateByExample(@Param("record") ArticleList record, @Param("example") ArticleListExample example);

    int updateByPrimaryKeySelective(ArticleList record);

    int updateByPrimaryKey(ArticleList record);
}