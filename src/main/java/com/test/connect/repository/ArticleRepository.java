package com.test.connect.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.test.connect.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
	
	@Query(value="call getArticleByTitle(?1)", nativeQuery = true)
	public List<Article> findByTitle(@Param("name") String name);
	

}
