package com.xujunqi.cms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xujunqi.cms.pojo.Article;

public interface ArticleDao extends BaseDao<Article> {
	@Select("SELECT id from cms_article")
	List<Integer> selectIdList();

}
