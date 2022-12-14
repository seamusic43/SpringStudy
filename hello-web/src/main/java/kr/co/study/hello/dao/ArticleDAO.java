package kr.co.study.hello.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import kr.co.study.hello.vo.Article;

@Repository
public class ArticleDAO {
	
	@Autowired
	SqlSession sqlSession;
	
	public ArticleDAO() {
		
	}
	
    public void insertArticle(Article article) {
    	System.out.print(article);
    	sqlSession.insert("mappers.article-mapper.insertArticleai",article);
        System.out.println("Insert OK");
    }

	public Article selectArticleById(String articleId) {
		return sqlSession.selectOne("mappers.article-mapper.selectArticleById", articleId);
		/*
		Article article = new Article(99, "lee", "테스트 타이틀", "테스트 내용은 없다.");

		return article;
		*/
	}

}
